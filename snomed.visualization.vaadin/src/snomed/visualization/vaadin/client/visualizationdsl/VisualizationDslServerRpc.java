package snomed.visualization.vaadin.client.visualizationdsl;

import com.vaadin.shared.communication.ServerRpc;

public interface VisualizationDslServerRpc extends ServerRpc {

	void handleModify(String dsl);
}
