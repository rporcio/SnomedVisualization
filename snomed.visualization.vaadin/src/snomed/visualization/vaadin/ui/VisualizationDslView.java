package snomed.visualization.vaadin.ui;

import java.util.Iterator;

import org.apache.commons.lang.StringUtils;
import org.eclipse.xtext.nodemodel.INode;

import snomed.visualization.vaadin.util.VisualizationDslUtil;

import com.vaadin.server.Page;
import com.vaadin.shared.Position;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Notification.Type;
import com.vaadin.ui.RichTextArea;

/**
 * Represents a {@link RichTextArea} which contains the dsl of the expression.
 * 
 * @author rporcio
 */
public class VisualizationDslView extends RichTextArea {

	private static final long serialVersionUID = -3033591980219753855L;
	
	private VisualizationView visualizationView;
	private Notification warningNotification;
	private VisualizationDslUtil dslUtil;
	private boolean containsErrors;
	
	private ValueChangeListener valueChangeListener = new ValueChangeListener() {

		private static final long serialVersionUID = 3987421243182063521L;

		@Override
		public void valueChange(com.vaadin.data.Property.ValueChangeEvent event) {
			handleValueChange(true);
		}
	};

	public VisualizationDslView(VisualizationView visualizationView) {
		this.visualizationView = visualizationView;
		this.dslUtil = new VisualizationDslUtil();
		this.warningNotification = new Notification("Errors in the grammar", "", Type.ERROR_MESSAGE);
		this.warningNotification.setPosition(Position.BOTTOM_RIGHT);
		this.containsErrors = false;
		
		setImmediate(true);
		setDescription("The grammar of the expression.");
		setSizeFull();
	}

	/**
	 * Visualize the grammar in text format.
	 */
	public void visualizeGrammar() {
		removeValueChangeListener(valueChangeListener);
		setValue(dslUtil.convertToPresentation(visualizationView.getExpression()));
		handleValueChange(false);
		addValueChangeListener(valueChangeListener);
	}

	/**
	 * Tells if the grammar contains errors or not.
	 * 
	 * @return <code>true</code> if there are errors in the grammar.
	 */
	public boolean isContainsErrors() {
		return containsErrors;
	}
	
	private void handleValueChange(final boolean updateDiagram) {
		String dsl = dslUtil.removeHtmlFormatters(getValue());
		
		if (dslUtil.isValid(dsl)) {
			containsErrors = false;
			warningNotification.setDelayMsec(0);
			
			if (updateDiagram) {
				visualizationView.updateDiagram(dslUtil.updatePreviousExpression(visualizationView.getExpression(), dsl));
			}
			
			removeValueChangeListener(valueChangeListener);
			setValue(dslUtil.addHtmlFormatters(dsl));
			addValueChangeListener(valueChangeListener);
		} else {
			containsErrors = true;
			
			String errorMarkedDsl = "";
			final String errorMarkerOpen = "<font color=\"red\"><u>";
			final String errorMarkerClose = "</u></font>";
			final StringBuilder builder = new StringBuilder();
			
			int start = 0;
			Iterator<INode> syntaxErrors = dslUtil.getSyntaxErrors(dsl).iterator();
			
			while (syntaxErrors.hasNext()) {
				INode syntaxError = syntaxErrors.next();
				int startOffset = syntaxError.getTotalOffset();
				int endOffset = syntaxError.getTotalEndOffset();
				
				errorMarkedDsl = errorMarkedDsl.concat(dsl.substring(start, startOffset));
				String errorPart = dsl.substring(startOffset, endOffset);
				errorMarkedDsl = errorMarkedDsl.concat(errorMarkerOpen).concat(errorPart).concat(errorMarkerClose);
				
				start = endOffset;
				
				builder.append("\n").append(StringUtils.capitalize(syntaxError.getSyntaxErrorMessage().getMessage())).append(".");
				
				if (!syntaxErrors.hasNext()) {
					errorMarkedDsl = errorMarkedDsl.concat(dsl.substring(endOffset));
				}
			}
			
			removeValueChangeListener(valueChangeListener);
			setValue(dslUtil.addHtmlFormatters(errorMarkedDsl));
			addValueChangeListener(valueChangeListener);
			
			warningNotification.setDescription(builder.toString());
			warningNotification.setDelayMsec(5000);
			warningNotification.show(Page.getCurrent());
		}
	}

}
