package snomed.visualization.vaadin.client.diagramelement;

import snomed.visualization.vaadin.client.model.VisualizationDiagramElementModel;

import com.vaadin.shared.communication.URLReference;

/**
 * State class for the diagram elements.
 * 
 * @author rporcio
 */
public class VisualizationDiagramElementState extends com.vaadin.shared.AbstractComponentState {

	private static final long serialVersionUID = -558532425400561338L;

	private VisualizationDiagramElementModel componentModel;
	private URLReference characteristicIcon;
	private URLReference deletionIcon;

	public VisualizationDiagramElementModel getComponentModel() {
		return componentModel;
	}

	public void setComponentModel(VisualizationDiagramElementModel componentModel) {
		this.componentModel = componentModel;
	}

	public URLReference getCharacteristicIcon() {
		return characteristicIcon;
	}

	public void setCharacteristicIcon(URLReference characteristicIcon) {
		this.characteristicIcon = characteristicIcon;
	}

	public URLReference getDeletionIcon() {
		return deletionIcon;
	}

	public void setDeletionIcon(URLReference deletionIcon) {
		this.deletionIcon = deletionIcon;
	}

}