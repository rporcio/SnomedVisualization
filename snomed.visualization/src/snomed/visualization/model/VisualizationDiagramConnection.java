package snomed.visualization.model;

import java.util.List;

import org.eclipse.draw2d.geometry.Rectangle;

/**
 * Container class to contain all the connections of the diagram.
 * 
 * @author rporcio
 */
public class VisualizationDiagramConnection {
	
	private final Rectangle constraint;
	private final List<VisualizationConnection> diagramConnections;
	private final int zoom;

	public VisualizationDiagramConnection(int zoom, Rectangle constraint, List<VisualizationConnection> diagramConnections) {
		this.zoom = zoom;
		this.constraint = constraint;
		this.diagramConnections = diagramConnections;
	}

	public Rectangle getConstraint() {
		return constraint;
	}

	public List<VisualizationConnection> getDiagramConnections() {
		return diagramConnections;
	}

	public int getZoom() {
		return zoom;
	}
}
