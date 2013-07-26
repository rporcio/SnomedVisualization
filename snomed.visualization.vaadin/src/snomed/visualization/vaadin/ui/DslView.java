package snomed.visualization.vaadin.ui;

import snomed.visualization.dsl.visualizationDsl.Expression;
import snomed.visualization.vaadin.util.VisualizationDslConverter;
import snomed.visualization.vaadin.util.VisualizationValidator;

import com.vaadin.event.FieldEvents.TextChangeEvent;
import com.vaadin.event.FieldEvents.TextChangeListener;
import com.vaadin.ui.TextArea;

/**
 * 
 * @author rporcio
 */
public class DslView extends TextArea {

	private static final long serialVersionUID = -3033591980219753855L;
	
	private TextChangeListener textChangeListener = new TextChangeListener() {
		private static final long serialVersionUID = 6579424942507304321L;

		@Override
		public void textChange(TextChangeEvent event) {
			if (!getValue().equals(event.getText())) {
				setValue(event.getText());
			}
		}
	};
	
	private ValueChangeListener valueChangeListener = new ValueChangeListener() {

		private static final long serialVersionUID = 3987421243182063521L;

		@Override
		public void valueChange(com.vaadin.data.Property.ValueChangeEvent event) {
			if (isValid()) {
				visualizationView.setExpression(dslConverter.convertToModel(getValue(), null, null));
				visualizationView.refreshDiagram();
			}
		}
	};

	private VisualizationView visualizationView;
	private VisualizationDslConverter dslConverter;
	
	public DslView(VisualizationView visualizationView) {
		this.visualizationView = visualizationView;
		setSizeFull();
		addValidator(new VisualizationValidator());
		setImmediate(true);
		setCaption("Expression grammar");
		setDescription("The domain specific language of the expression in text format.");
		
		addTextChangeListener(textChangeListener);
		addValueChangeListener(valueChangeListener);
		
		this.dslConverter = new VisualizationDslConverter();
	}

	public void visualizeGrammar(Expression expression) {
		setValue(dslConverter.convertToPresentation(expression, null, null));
	}

}
