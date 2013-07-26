package snomed.visualization.vaadin.client.visualizationcomponent;

import snomed.visualization.vaadin.VisualizationComponent;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.Widget;
import com.vaadin.client.communication.RpcProxy;
import com.vaadin.client.communication.StateChangeEvent;
import com.vaadin.client.ui.AbstractComponentConnector;
import com.vaadin.shared.ui.Connect;

@Connect(VisualizationComponent.class)
public class VisualizationComponentConnector extends AbstractComponentConnector {

	private static final long serialVersionUID = 7900577332043380252L;

	VisualizationComponentServerRpc rpc = RpcProxy.create(VisualizationComponentServerRpc.class, this);
	
	public VisualizationComponentConnector() {
		registerRpc(VisualizationComponentClientRpc.class, new VisualizationComponentClientRpc() {
			private static final long serialVersionUID = 7559937572012663708L;
		});
	}

	@Override
	protected Widget createWidget() {
		VisualizationComponentWidget widget = GWT.create(VisualizationComponentWidget.class);
		widget.setRpc(rpc);
		return widget;
	}

	@Override
	public VisualizationComponentWidget getWidget() {
		return (VisualizationComponentWidget) super.getWidget();
	}

	@Override
	public VisualizationComponentState getState() {
		return (VisualizationComponentState) super.getState();
	}

	@Override
	public void onStateChanged(StateChangeEvent stateChangeEvent) {
		super.onStateChanged(stateChangeEvent);
		
		getWidget().visualize(getState());
	}

}

