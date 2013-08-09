package snomed.visualization.model;

import java.util.List;

import org.eclipse.draw2d.geometry.Rectangle;

public class VisualizationDiagramConnection {
	
	private Rectangle constraint;
	private List<VisualizationConnectionCoordinate> connectionCoordinates;
	private int zoom;

	public VisualizationDiagramConnection(int zoom, Rectangle constraint, List<VisualizationConnectionCoordinate> connectionCoordinates) {
		this.zoom = zoom;
		this.constraint = constraint;
		this.connectionCoordinates = connectionCoordinates;
	}

	public Rectangle getConstraint() {
		return constraint;
	}

	public void setConstraint(Rectangle constraint) {
		this.constraint = constraint;
	}

	public List<VisualizationConnectionCoordinate> getConnectionCoordinates() {
		return connectionCoordinates;
	}

	public void setConnectionCoordinates(List<VisualizationConnectionCoordinate> connectionCoordinates) {
		this.connectionCoordinates = connectionCoordinates;
	}

	public int getZoom() {
		return zoom;
	}

	public void setZoom(int zoom) {
		this.zoom = zoom;
	}
}
