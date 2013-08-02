package snomed.visualization.vaadin.client.diagramelement;

import snomed.visualization.vaadin.VisualizationDiagramElement;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.Widget;
import com.vaadin.client.communication.RpcProxy;
import com.vaadin.client.communication.StateChangeEvent;
import com.vaadin.client.ui.AbstractComponentConnector;
import com.vaadin.shared.ui.Connect;

@Connect(VisualizationDiagramElement.class)
public class VisualizationDiagramElementConnector extends AbstractComponentConnector {

	private static final long serialVersionUID = -4799817844799916237L;

	VisualizationDiagramElementServerRpc rpc = RpcProxy.create(VisualizationDiagramElementServerRpc.class, this);
	
	public VisualizationDiagramElementConnector() {
		registerRpc(VisualizationDiagramElementClientRpc.class, new VisualizationDiagramElementClientRpc() {
			private static final long serialVersionUID = -4288292155768181875L;
		});
	}

	@Override
	protected Widget createWidget() {
		VisualizationDiagramElementWidget widget = GWT.create(VisualizationDiagramElementWidget.class);
		widget.setRpc(rpc);
		return widget;
	}

	@Override
	public VisualizationDiagramElementWidget getWidget() {
		return (VisualizationDiagramElementWidget) super.getWidget();
	}

	@Override
	public VisualizationDiagramElementState getState() {
		return (VisualizationDiagramElementState) super.getState();
	}

	@Override
	public void onStateChanged(StateChangeEvent stateChangeEvent) {
		super.onStateChanged(stateChangeEvent);
		
		getWidget().visualize(getState());
	}

}

