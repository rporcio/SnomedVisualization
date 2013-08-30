package snomed.visualization.vaadin.ui;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EContentAdapter;

import snomed.visualization.dsl.visualizationDsl.Concept;
import snomed.visualization.dsl.visualizationDsl.Expression;
import snomed.visualization.dsl.visualizationDsl.RelationshipGroup;
import snomed.visualization.vaadin.client.model.VisualizationDiagramPrinter.PrintUI;
import snomed.visualization.vaadin.wizard.VisualizationRelationshipWizard;

import com.vaadin.server.BrowserWindowOpener;
import com.vaadin.server.ThemeResource;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.VerticalSplitPanel;
import com.vaadin.ui.themes.BaseTheme;

/**
 * Visualization view that contains the diagram and the dsl view.
 * 
 * @author rporcio
 */
public class VisualizationView extends VerticalLayout {
	
	private static final long serialVersionUID = -4649786377322008264L;
	
	private EContentAdapter adapter = new EContentAdapter() {
		public void notifyChanged(Notification notification) {
			super.notifyChanged(notification);
			diagramView.visualizeDiagram();
			dslView.visualizeGrammar();
		}
	};
	
	com.vaadin.ui.Button.ClickListener clickListener = new Button.ClickListener() {
		private static final long serialVersionUID = -4187681077603713464L;

		@Override
		public void buttonClick(ClickEvent event) {
			if (event.getSource().equals(zoomInButton)) {
				if (zoom < 150) {
					zoom += 5;
					diagramView.zoomDiagram(zoom);
				}
			} else if (event.getSource().equals(zoomOutButton)) {
				if (zoom > 70) {
					zoom -= 5;
					diagramView.zoomDiagram(zoom);
				}
			} else if (event.getSource().equals(newRelationshipButton)) {
				visualizationUI.addWindow(new VisualizationRelationshipWizard(VisualizationView.this));
			} else if (event.getSource().equals(changeDiagramTypeButton)) {
				diagramView.changeDiagramTpye();
				diagramView.visualizeDiagram();
			} else if (event.getSource().equals(printButton)) {
				PrintUI.setDiagramView(diagramView);
			}
		}
	};
	
	private final VisualizationUI visualizationUI;
	private final VerticalSplitPanel visualizationPanel;
	private final HorizontalSplitPanel expressionPanel;
	private VisualizationDiagramView diagramView;
//	private final VisualizationDslViewOld dslView;
	private VisualizationDslView dslView;
	
	private Button zoomInButton;
	private Button zoomOutButton;
	private Button newRelationshipButton;
	private Button changeDiagramTypeButton;
	private Button printButton;
	
	private int zoom = 100;
	private Expression expression;
	private Label titleLabel;
	
	public VisualizationView(final VisualizationUI visualizationUI) {
		setSizeFull();
		
		this.visualizationUI = visualizationUI;
		visualizationPanel = new VerticalSplitPanel();
		expressionPanel = new HorizontalSplitPanel();
		diagramView = new VisualizationDiagramView(this);
//		dslView = new VisualizationDslViewOld(this);
		dslView = new VisualizationDslView(this);
		
		expressionPanel.setFirstComponent(dslView);
		expressionPanel.setSecondComponent(diagramView);
		expressionPanel.setSplitPosition(45.0f);
		
		expressionPanel.setFirstComponent(dslView);
		
		visualizationPanel.setFirstComponent(createToolBar());
		visualizationPanel.setSecondComponent(expressionPanel);
		visualizationPanel.setSplitPosition(2f);
		visualizationPanel.setLocked(true);
		
		createPrinter();
		
		addComponent(visualizationPanel);
	}
	
	public Expression getExpression() {
		return expression;
	}

	public void setExpression(Expression expression) {
		this.expression = expression;
	}

	public VisualizationUI getVisualizationUI() {
		return visualizationUI;
	}
	
	public int getDiagramZoom() {
		return zoom;
	}

	/**
	 * Visualize the given expression in both diagram and dsl format.
	 * 
	 * @param expression the expression to be visualized.
	 */
	public void visualize(Expression expression) {
		this.expression = expression;
		
		diagramView.visualizeDiagram();
		dslView.visualizeGrammar();
		addContentAdapter();
		
		Concept concept = expression.getConcept();
		String title = concept.getId() + "|" + concept.getTerm() + "|";
		titleLabel.setCaption(title);
	}

	/**
	 * Updates the diagram to the new expression.
	 * 
	 * @param expression the expression with the diagram is updated.
	 */
	public void updateDiagram(Expression expression) {
		setExpression(expression);
		diagramView.visualizeDiagram();
		addContentAdapter();
	}
	
	/**
	 * Tells if the expression grammar contains errors or not.
	 * 
	 * @return <code>true</code> if the grammar is editable.
	 */
	public boolean canEdit() {
		return !dslView.isContainsErrors();
	}
	
	private Component createToolBar() {
		HorizontalLayout layout = new HorizontalLayout();
		layout.setSpacing(true);
		layout.setSizeFull();
		layout.setStyleName("disable-scroll");
		
		zoomInButton = createToolbarButton("icons/zoom-in.png", "Zoom in", "Zoom in to the diagram");
		zoomOutButton = createToolbarButton("icons/zoom-out.png", "Zoom out", "Zoom out from the diagram");
		newRelationshipButton = createToolbarButton("icons/new-relationship.png", "New relationship", "Add a new relationship to the expression");
		changeDiagramTypeButton = createToolbarButton("icons/change-diagram-type.png", "Change diagram type", "Change the type of the diagram");
		printButton = createToolbarButton("icons/printer.png", "Print diagram", "Print the diagram");
		
		titleLabel = new Label();
		titleLabel.setSizeFull();

		layout.addComponents(titleLabel, zoomInButton, zoomOutButton, newRelationshipButton, changeDiagramTypeButton, printButton);
		layout.setExpandRatio(titleLabel, 1.0f);
		layout.setComponentAlignment(zoomInButton, Alignment.TOP_RIGHT);
		layout.setComponentAlignment(zoomOutButton, Alignment.TOP_RIGHT);
		layout.setComponentAlignment(newRelationshipButton, Alignment.TOP_RIGHT);
		layout.setComponentAlignment(changeDiagramTypeButton, Alignment.TOP_RIGHT);
		layout.setComponentAlignment(printButton, Alignment.TOP_RIGHT);

		return layout;
	}
	
	private void createPrinter() {
		BrowserWindowOpener opener = new BrowserWindowOpener(PrintUI.class);
		opener.setFeatures("height=600,width=800,resizable");
		opener.setWindowName("print");
		opener.extend(printButton);
	}
	
	private Button createToolbarButton(String resourcePath, String altText, String description) {
		Button button = new Button();
		button.setIcon(new ThemeResource(resourcePath), altText);
		button.setDescription(description);
		button.setStyleName(BaseTheme.BUTTON_LINK);
		button.addClickListener(clickListener);
		
		return button;
	}

	private void addContentAdapter() {
		// TODO
		expression.eAdapters().add(adapter);
		expression.getConcept().eAdapters().add(adapter);
		expression.getIsaRelationships().eAdapters().add(adapter);
		if (null != expression.getUngroupedRelationships()) {
			expression.getUngroupedRelationships().eAdapters().add(adapter);
		}
		for (RelationshipGroup relationshipGroup : expression.getGroupedRelationships()) {
			relationshipGroup.eAdapters().add(adapter);
		}
	}

}
