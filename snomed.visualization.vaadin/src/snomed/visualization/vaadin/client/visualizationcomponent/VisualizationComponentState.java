package snomed.visualization.vaadin.client.visualizationcomponent;

import snomed.visualization.vaadin.client.model.VisualizationComponentModel;


public class VisualizationComponentState extends com.vaadin.shared.AbstractComponentState {

	private static final long serialVersionUID = 6500818785724009508L;
	
	private VisualizationComponentModel componentModel;

	public VisualizationComponentModel getComponentModel() {
		return componentModel;
	}

	public void setComponentModel(VisualizationComponentModel componentModel) {
		this.componentModel = componentModel;
	}
}