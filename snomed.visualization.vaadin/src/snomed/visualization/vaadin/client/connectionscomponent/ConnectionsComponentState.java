package snomed.visualization.vaadin.client.connectionscomponent;

import java.util.List;

import snomed.visualization.vaadin.client.model.ConnectionCoordinate;

public class ConnectionsComponentState extends com.vaadin.shared.AbstractComponentState {

	private static final long serialVersionUID = -5835216322543307207L;
	
	private int size;
	private int canvasHeight;
	private int canvasWidth;
	private List<ConnectionCoordinate> connectionCoordinates;

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

	public List<ConnectionCoordinate> getConnectionCoordinates() {
		return connectionCoordinates;
	}
	
	public void setConnectionCoordinates(List<ConnectionCoordinate> connectionCoordinates) {
		this.connectionCoordinates = connectionCoordinates;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
}