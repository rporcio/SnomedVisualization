package snomed.visualization.vaadin.client.diagramconnection;

import snomed.visualization.vaadin.VisualizationDiagramConnection;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.Widget;
import com.vaadin.client.communication.RpcProxy;
import com.vaadin.client.communication.StateChangeEvent;
import com.vaadin.client.ui.AbstractComponentConnector;
import com.vaadin.shared.ui.Connect;

@Connect(VisualizationDiagramConnection.class)
public class VisualizationDiagramConnectionConnector extends AbstractComponentConnector {

	private static final long serialVersionUID = -6605205437287264541L;

	VisualizationDiagramConnectionServerRpc rpc = RpcProxy.create(VisualizationDiagramConnectionServerRpc.class, this);
	
	public VisualizationDiagramConnectionConnector() {
		registerRpc(VisualizationDiagramConnectionClientRpc.class, new VisualizationDiagramConnectionClientRpc() {
			private static final long serialVersionUID = -1553007295884717174L;
		});

	}

	@Override
	protected Widget createWidget() {
		return GWT.create(VisualizationDiagramConnectionWidget.class);
	}

	@Override
	public VisualizationDiagramConnectionWidget getWidget() {
		return (VisualizationDiagramConnectionWidget) super.getWidget();
	}

	@Override
	public VisualizationDiagramConnectionState getState() {
		return (VisualizationDiagramConnectionState) super.getState();
	}

	@Override
	public void onStateChanged(StateChangeEvent stateChangeEvent) {
		super.onStateChanged(stateChangeEvent);

		getWidget().visualize(getState());
	}

}

