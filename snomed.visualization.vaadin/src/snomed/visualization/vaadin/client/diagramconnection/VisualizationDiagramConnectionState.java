package snomed.visualization.vaadin.client.diagramconnection;

import java.util.List;

import snomed.visualization.vaadin.client.model.VisualizationConnectionCoordinate;

/**
 * State class for the diagram connections.
 * 
 * @author rporcio
 */
public class VisualizationDiagramConnectionState extends com.vaadin.shared.AbstractComponentState {

	private static final long serialVersionUID = 906420722565265417L;
	
	private int size;
	private int canvasHeight;
	private int canvasWidth;
	private List<VisualizationConnectionCoordinate> connectionCoordinates;

	public int getCanvasHeight() {
		return canvasHeight;
	}

	public void setCanvasHeight(int canvasHeight) {
		this.canvasHeight = canvasHeight;
	}

	public int getCanvasWidth() {
		return canvasWidth;
	}

	public void setCanvasWidth(int canvasWidth) {
		this.canvasWidth = canvasWidth;
	}

	public List<VisualizationConnectionCoordinate> getConnectionCoordinates() {
		return connectionCoordinates;
	}
	
	public void setConnectionCoordinates(List<VisualizationConnectionCoordinate> connectionCoordinates) {
		this.connectionCoordinates = connectionCoordinates;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}