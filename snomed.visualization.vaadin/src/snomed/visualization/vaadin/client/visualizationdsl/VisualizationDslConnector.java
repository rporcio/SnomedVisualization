package snomed.visualization.vaadin.client.visualizationdsl;

import snomed.visualization.vaadin.VisualizationDsl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.Widget;
import com.vaadin.client.communication.RpcProxy;
import com.vaadin.client.communication.StateChangeEvent;
import com.vaadin.client.ui.AbstractComponentConnector;
import com.vaadin.shared.ui.Connect;

@Connect(VisualizationDsl.class)
public class VisualizationDslConnector extends AbstractComponentConnector {

	private static final long serialVersionUID = -2754092247933967802L;

	VisualizationDslServerRpc rpc = RpcProxy.create(VisualizationDslServerRpc.class, this);
	
	public VisualizationDslConnector() {
		registerRpc(VisualizationDslClientRpc.class, new VisualizationDslClientRpc() {
			private static final long serialVersionUID = -1477388687708112359L;
		});
	}

	@Override
	protected Widget createWidget() {
		VisualizationDslWidget widget = GWT.create(VisualizationDslWidget.class);
		widget.setRpc(rpc);
		return widget;
	}

	@Override
	public VisualizationDslWidget getWidget() {
		return (VisualizationDslWidget) super.getWidget();
	}

	@Override
	public VisualizationDslState getState() {
		return (VisualizationDslState) super.getState();
	}

	@Override
	public void onStateChanged(StateChangeEvent stateChangeEvent) {
		super.onStateChanged(stateChangeEvent);
		getWidget().setText(getState());
	}

}

