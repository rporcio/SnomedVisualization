package snomed.visualization.vaadin;

import java.util.List;

import snomed.visualization.vaadin.client.connectionscomponent.ConnectionsComponentServerRpc;
import snomed.visualization.vaadin.client.connectionscomponent.ConnectionsComponentState;
import snomed.visualization.vaadin.client.model.ConnectionCoordinate;

public class ConnectionComponent extends com.vaadin.ui.AbstractComponent {

	private static final long serialVersionUID = 826987393759885295L;

	private ConnectionsComponentServerRpc rpc = new ConnectionsComponentServerRpc() {
		private static final long serialVersionUID = 8179957884715059447L;
	};  

	public ConnectionComponent() {
		registerRpc(rpc);
	}

	@Override
	public ConnectionsComponentState getState() {
		return (ConnectionsComponentState) super.getState();
	}
	
	public void setState(int zoom, int canvasHeight, int canvasWidth, List<ConnectionCoordinate> connectionCoordinates) {
		getState().setSize(zoom);
		getState().setCanvasWidth(canvasWidth);
		getState().setCanvasHeight(canvasHeight);
		getState().setConnectionCoordinates(connectionCoordinates);
		
		markAsDirty();
	}
}
