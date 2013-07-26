package snomed.visualization.vaadin.client.visualizationcomponent;

import com.vaadin.shared.communication.ServerRpc;

public interface VisualizationComponentServerRpc extends ServerRpc {
	void changeCharacteristicType(String conceptId);
}
