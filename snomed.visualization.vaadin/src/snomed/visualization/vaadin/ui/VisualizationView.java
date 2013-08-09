package snomed.visualization.vaadin.ui;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EContentAdapter;

import snomed.visualization.dsl.visualizationDsl.Expression;
import snomed.visualization.dsl.visualizationDsl.RelationshipGroup;
import snomed.visualization.vaadin.wizard.VisualizationRelationshipWizard;

import com.vaadin.event.MouseEvents;
import com.vaadin.event.MouseEvents.ClickListener;
import com.vaadin.server.ThemeResource;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.Image;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.VerticalSplitPanel;

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
	
	ClickListener clickListener = new MouseEvents.ClickListener() {
		
		private static final long serialVersionUID = -2673250217901428705L;

		@Override
		public void click(com.vaadin.event.MouseEvents.ClickEvent event) {
			if (event.getSource().equals(zoomInImage)) {
				if (size < 150) {
					size += 5;
					diagramView.zoomDiagram(size);
				}
			} else if (event.getSource().equals(zoomOutImage)) {
				if (size > 70) {
					size -= 5;
					diagramView.zoomDiagram(size);
				}
			} else if (event.getSource().equals(newRelationshipImage)) {
				visualizationUI.addWindow(new VisualizationRelationshipWizard(VisualizationView.this));
			} else if (event.getSource().equals(changeDiagramTypeImage)) {
				diagramView.changeDiagramTpye();
				diagramView.visualizeDiagram();
			}
		}
	};
	
	private final VisualizationUI visualizationUI;
	private final VerticalSplitPanel visualizationPanel;
	private final HorizontalSplitPanel expressionPanel;
	private final VisualizationDiagramView diagramView;
	private final VisualizationDslView dslView;
	
	private Image zoomInImage;
	private Image zoomOutImage;
	private Image newRelationshipImage;
	private Image changeDiagramTypeImage;

	private int size = 100;
	
	private Expression expression;
	
	public VisualizationView(final VisualizationUI visualizationUI) {
		setSizeFull();
		
		this.visualizationUI = visualizationUI;
		this.visualizationPanel = new VerticalSplitPanel();
		this.expressionPanel = new HorizontalSplitPanel();
		diagramView = new VisualizationDiagramView(this);
		dslView = new VisualizationDslView(this);
		
		expressionPanel.setFirstComponent(diagramView);
		expressionPanel.setSecondComponent(dslView);
		expressionPanel.setSplitPosition(67.5f);
		
		visualizationPanel.setFirstComponent(createToolBar());
		visualizationPanel.setSecondComponent(expressionPanel);
		visualizationPanel.setSplitPosition(2f);
		visualizationPanel.setLocked(true);
		
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
		
		zoomInImage = new Image(null, new ThemeResource("icons/zoom-in.png"));
		zoomInImage.addClickListener(clickListener);
		zoomInImage.setDescription("Zoom in to the diagram");
		zoomOutImage = new Image(null, new ThemeResource("icons/zoom-out.png"));
		zoomOutImage.addClickListener(clickListener);
		zoomOutImage.setDescription("Zoom out from the diagram");
		newRelationshipImage = new Image(null, new ThemeResource("icons/new-relationship.png"));
		newRelationshipImage.addClickListener(clickListener);
		newRelationshipImage.setDescription("Add a new relationship to the expression");
		changeDiagramTypeImage = new Image(null, new ThemeResource("icons/change-diagram-type.png"));
		changeDiagramTypeImage.addClickListener(clickListener);
		changeDiagramTypeImage.setDescription("Change the type of the diagram");
		
		layout.addComponent(zoomInImage);
		layout.addComponent(zoomOutImage);
		layout.addComponent(newRelationshipImage);
		layout.addComponent(changeDiagramTypeImage);
		
		return layout;
	}
	
	private void addContentAdapter() {
		// TODO
		expression.eAdapters().add(adapter);
		expression.getConcept().eAdapters().add(adapter);
		expression.getIsaRelationships().eAdapters().add(adapter);
		if (null != expression.getStandaloneRelationships()) {
			expression.getStandaloneRelationships().eAdapters().add(adapter);
		}
		for (RelationshipGroup relationshipGroup : expression.getRelationshipGroups()) {
			relationshipGroup.eAdapters().add(adapter);
		}
	}

}
