package snomed.visualization.vaadin.ui;

import snomed.visualization.dsl.visualizationDsl.Expression;

import com.vaadin.event.MouseEvents;
import com.vaadin.event.MouseEvents.ClickListener;
import com.vaadin.server.ThemeResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.Image;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.VerticalSplitPanel;

/**
 * 
 * @author rporcio
 */
public class VisualizationView extends VerticalLayout {

	private static final long serialVersionUID = -4649786377322008264L;
	
	ClickListener clickListener = new MouseEvents.ClickListener() {
		
		private static final long serialVersionUID = -2673250217901428705L;

		@Override
		public void click(com.vaadin.event.MouseEvents.ClickEvent event) {
			if (event.getSource().equals(zoomInImage)) {
				if (size < 150) {
					size += 10;
					diagramView.zoomDiagram(size);
				}
			} else if (event.getSource().equals(zoomOutImage)) {
				if (size > 50) {
					size -= 10;
					diagramView.zoomDiagram(size);
				}
			}
		}
	};
	
	com.vaadin.ui.Button.ClickListener newWizardListener = new Button.ClickListener() {
		
		private static final long serialVersionUID = -4187681077603713464L;

		@Override
		public void buttonClick(ClickEvent event) {
			// TODO
			visualizationUI.addWindow(new VisualizationRelationshipWizard((VisualizationView) event.getButton().getParent().getParent().getParent()));
		}
	};
	
	private final VisualizationUI visualizationUI;
	private final VerticalSplitPanel visualizationPanel;
	private final HorizontalSplitPanel expressionPanel;
	private final DiagramView diagramView;
	private final DslView dslView;
	
	private Image zoomInImage;
	private Image zoomOutImage;

	private Button newRelationshipButton;
	
	private int size = 100;
	
	private Expression expression;
	
	public VisualizationView(final VisualizationUI visualizationUI) {
		setSizeFull();
		
		this.visualizationUI = visualizationUI;
		this.visualizationPanel = new VerticalSplitPanel();
		this.expressionPanel = new HorizontalSplitPanel();
		diagramView = new DiagramView(this);
		dslView = new DslView(this);
		
		expressionPanel.setFirstComponent(diagramView);
		
		VerticalLayout layout = new VerticalLayout();
		layout.setSizeFull();
		layout.addComponent(dslView);
		layout.setExpandRatio(dslView, 1f);
		
		expressionPanel.setSecondComponent(layout);
		expressionPanel.setSplitPosition(75f);
		
		visualizationPanel.setFirstComponent(createToolBar());
		visualizationPanel.setSecondComponent(expressionPanel);
		visualizationPanel.setSplitPosition(2.5f);
		visualizationPanel.setLocked(true);
		
		addComponent(visualizationPanel);
	}
	
	public void showExpression() {
		diagramView.visualizeDiagram(expression);
		dslView.visualizeGrammar(expression);
		
	}
	
	public void refreshDiagram() {
		diagramView.visualizeDiagram(expression);
	}

	private Component createToolBar() {
		HorizontalLayout layout = new HorizontalLayout();
		layout.setSpacing(true);
		
		zoomInImage = new Image(null, new ThemeResource("icons/zoom-in.png"));
		zoomInImage.addClickListener(clickListener);
		zoomOutImage = new Image(null, new ThemeResource("icons/zoom-out.png"));
		zoomOutImage.addClickListener(clickListener);
		
		newRelationshipButton = new Button("New Relationship");
		newRelationshipButton.addClickListener(newWizardListener);
		
		layout.addComponent(zoomInImage);
		layout.addComponent(zoomOutImage);
		layout.addComponent(newRelationshipButton);
		
		return layout;
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
}
