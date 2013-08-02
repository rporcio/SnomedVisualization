package snomed.visualization.vaadin.client.diagramelement;

import snomed.visualization.vaadin.client.model.VisualizationModifyType;
import snomed.visualization.vaadin.client.model.VisualizationDiagramElementModel.VisualizationComponentType;

import com.vaadin.shared.communication.ServerRpc;

public interface VisualizationDiagramElementServerRpc extends ServerRpc {
	void handleModify(VisualizationComponentType componentType, VisualizationModifyType modifyType, String conceptId);
}
