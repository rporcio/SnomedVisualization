package snomed.visualization.vaadin.ui;

import snomed.visualization.dsl.visualizationDsl.Expression;
import snomed.visualization.vaadin.util.VisualizationPositioner;

import com.vaadin.ui.AbsoluteLayout;

/**
 * 
 * @author rporcio
 */
public class DiagramView extends AbsoluteLayout {

	private static final long serialVersionUID = 6094847127344543759L;
	
	private final VisualizationView visualizationView;
	private final VisualizationPositioner positioner;
	
	public DiagramView(VisualizationView visualizationView) {
		this.visualizationView = visualizationView;
		this.positioner = new VisualizationPositioner(this);
		addStyleName(".my-scroll");
	}

	public void visualizeDiagram(Expression expression) {
		removeAllComponents();
		
		positioner.setExpression(expression);
		positioner.positionVisualizationComponents();
	}
	
	public void zoomDiagram(int zoom) {
		removeAllComponents();
		
		positioner.setDiagramZoom(zoom);
		positioner.positionVisualizationComponents();
	}

}
