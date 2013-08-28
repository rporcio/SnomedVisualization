package snomed.visualization.vaadin;

import java.util.List;

import snomed.visualization.vaadin.client.diagramconnection.VisualizationDiagramConnectionServerRpc;
import snomed.visualization.vaadin.client.diagramconnection.VisualizationDiagramConnectionState;
import snomed.visualization.vaadin.client.model.VisualizationConnectionCoordinate;

/**
 * Custom UI component for the diagram connections.
 * 
 * @author rporcio
 */
public class VisualizationDiagramConnection extends com.vaadin.ui.AbstractComponent {

	private static final long serialVersionUID = 2950352399861196384L;

	private VisualizationDiagramConnectionServerRpc rpc = new VisualizationDiagramConnectionServerRpc() {
		private static final long serialVersionUID = -2823273516415647236L;
	};  

	public VisualizationDiagramConnection() {
		registerRpc(rpc);
	}

	@Override
	public VisualizationDiagramConnectionState getState() {
		return (VisualizationDiagramConnectionState) super.getState();
	}
	
	public void setState(int zoom, int canvasHeight, int canvasWidth, List<VisualizationConnectionCoordinate> connectionCoordinates) {
		getState().setSize(zoom);
		getState().setCanvasWidth(canvasWidth);
		getState().setCanvasHeight(canvasHeight);
		getState().setConnectionCoordinates(connectionCoordinates);
		
		markAsDirty();
	}
}
