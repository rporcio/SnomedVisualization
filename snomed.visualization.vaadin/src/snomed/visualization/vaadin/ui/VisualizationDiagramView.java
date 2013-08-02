package snomed.visualization.vaadin.ui;

import snomed.visualization.dsl.visualizationDsl.Expression;
import snomed.visualization.vaadin.util.VisualizationDiagramUtil;

import com.vaadin.ui.AbsoluteLayout;

/**
 * View that show the diagram format of the expression.
 * 
 * @author rporcio
 */
public class VisualizationDiagramView extends AbsoluteLayout {

	private static final long serialVersionUID = 6094847127344543759L;
	
	private final VisualizationView visualizationView;
	private final VisualizationDiagramUtil diagramUtil;
	private DiagramType diagramType;
	
	public enum DiagramType {
		EXPRESSION,
		DEFINITION
	}
	
	public VisualizationDiagramView(VisualizationView visualizationView) {
		this.visualizationView = visualizationView;
		this.diagramUtil = new VisualizationDiagramUtil(this);
		this.diagramType = DiagramType.DEFINITION;
		addStyleName(".my-scroll");
		setCaption("Diagram");
	}

	/**
	 * Visualize the expression with a diagram.
	 */
	public void visualizeDiagram() {
		removeAllComponents();
		
		diagramUtil.visualizeDiagram();
	}
	
	/**
	 * Changes the zoom rate of the diagram.
	 * 
	 * @param zoom the new rate for zooming in- or out.
	 */
	public void zoomDiagram(int zoom) {
		removeAllComponents();
		
		diagramUtil.setDiagramZoom(zoom);
		diagramUtil.visualizeDiagram();
	}

	public VisualizationView getVisualizationView() {
		return visualizationView;
	}
	
	public Expression getExpression() {
		return visualizationView.getExpression();
	}

	/**
	 * Changes the type of the diagram.
	 */
	public void changeDiagramTpye() {
		switch (diagramType) {
		case EXPRESSION:
			diagramType = DiagramType.DEFINITION;
			break;
		case DEFINITION:
			diagramType = DiagramType.EXPRESSION;
			break;
		}
	}

	public DiagramType getDiagramType() {
		return diagramType;
	}

	/**
	 * Tells if the expression grammar contains errors or not.
	 * 
	 * @return <code>true</code> if the grammar is editable.
	 */
	public boolean canEdit() {
		return visualizationView.canEdit();
	}
}
