package snomed.visualization.vaadin.client.connectionscomponent;

import snomed.visualization.vaadin.ConnectionComponent;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.Widget;
import com.vaadin.client.communication.RpcProxy;
import com.vaadin.client.communication.StateChangeEvent;
import com.vaadin.client.ui.AbstractComponentConnector;
import com.vaadin.shared.ui.Connect;

@Connect(ConnectionComponent.class)
public class ConnectionsComponentConnector extends AbstractComponentConnector {

	private static final long serialVersionUID = 549602157457817140L;

	ConnectionsComponentServerRpc rpc = RpcProxy.create(ConnectionsComponentServerRpc.class, this);
	
	public ConnectionsComponentConnector() {
		registerRpc(ConnectionsComponentClientRpc.class, new ConnectionsComponentClientRpc() {
			private static final long serialVersionUID = -7817067186025392350L;

			public void alert(String message) {
			}
		});

	}

	@Override
	protected Widget createWidget() {
		return GWT.create(ConnectionsComponentWidget.class);
	}

	@Override
	public ConnectionsComponentWidget getWidget() {
		return (ConnectionsComponentWidget) super.getWidget();
	}

	@Override
	public ConnectionsComponentState getState() {
		return (ConnectionsComponentState) super.getState();
	}

	@Override
	public void onStateChanged(StateChangeEvent stateChangeEvent) {
		super.onStateChanged(stateChangeEvent);
		
		getWidget().visualize(getState());
	}

}

