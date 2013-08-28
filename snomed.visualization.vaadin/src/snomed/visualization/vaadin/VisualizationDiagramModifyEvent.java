package snomed.visualization.vaadin;

import snomed.visualization.vaadin.client.model.VisualizationModifyType;
import snomed.visualization.vaadin.client.model.VisualizationDiagramElementModel.VisualizationComponentType;

import com.vaadin.ui.Component;
import com.vaadin.ui.Component.Event;

public class VisualizationDiagramModifyEvent extends Event {

	private static final long serialVersionUID = 477159734457000106L;
	
	private final String id;
	private final VisualizationComponentType componentType;
	private final VisualizationModifyType modifyType;
	
	public VisualizationDiagramModifyEvent(Component component, VisualizationComponentType componentType, VisualizationModifyType modifyType, String id) {
		super(component);
		this.componentType = componentType;
		this.modifyType = modifyType;
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public VisualizationComponentType getComponentType() {
		return componentType;
	}

	public VisualizationModifyType getModifyType() {
		return modifyType;
	}


}
