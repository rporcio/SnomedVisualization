package snomed.visualization.vaadin;

import snomed.visualization.vaadin.client.model.VisualizationComponentModel;
import snomed.visualization.vaadin.client.visualizationcomponent.VisualizationComponentServerRpc;
import snomed.visualization.vaadin.client.visualizationcomponent.VisualizationComponentState;

public class VisualizationComponent extends com.vaadin.ui.AbstractComponent {

	private static final long serialVersionUID = -4391006807342541317L;

	private VisualizationComponentServerRpc rpc = new VisualizationComponentServerRpc() {
		private static final long serialVersionUID = -53922511052511409L;

		@Override
		public void changeCharacteristicType(String conceptId) {
		}
	};  

	public VisualizationComponent() {
		registerRpc(rpc);
	}

	@Override
	public VisualizationComponentState getState() {
		return (VisualizationComponentState) super.getState();
	}
	
	public void setState(VisualizationComponentModel visualizationComponentModel) {
		getState().setComponentModel(visualizationComponentModel);
		markAsDirty();
	}
}
