package snomed.visualization.vaadin;

import com.vaadin.shared.communication.URLReference;

import snomed.visualization.vaadin.client.diagramelement.VisualizationDiagramElementServerRpc;
import snomed.visualization.vaadin.client.diagramelement.VisualizationDiagramElementState;
import snomed.visualization.vaadin.client.model.VisualizationModifyType;
import snomed.visualization.vaadin.client.model.VisualizationDiagramElementModel;
import snomed.visualization.vaadin.client.model.VisualizationDiagramElementModel.VisualizationComponentType;
import snomed.visualization.vaadin.listener.IVisualizationDiagramModifyListener;

/**
 * Custom UI component for the diagram elements.
 * 
 * @author rporcio
 */
public class VisualizationDiagramElement extends com.vaadin.ui.AbstractComponent {

	private static final long serialVersionUID = -3943891804120919075L;

	private VisualizationDiagramElementServerRpc rpc = new VisualizationDiagramElementServerRpc() {

		private static final long serialVersionUID = -357770076983519244L;

		@Override
		public void handleModify(VisualizationComponentType componentType, VisualizationModifyType modifyType, String conceptId) {
			fireEvent(new VisualizationDiagramModifyEvent(VisualizationDiagramElement.this, componentType, modifyType,conceptId));
		}
	};  

	public VisualizationDiagramElement() {
		registerRpc(rpc);
	}

	@Override
	public VisualizationDiagramElementState getState() {
		return (VisualizationDiagramElementState) super.getState();
	}
	
	public void setState(VisualizationDiagramElementModel visualizationComponentModel, URLReference characteristicIcon, URLReference deletionIcon) {
		getState().setComponentModel(visualizationComponentModel);
		getState().setCharacteristicIcon(characteristicIcon);
		getState().setDeletionIcon(deletionIcon);
		
		markAsDirty();
	}
	
	public void addModifyListener(IVisualizationDiagramModifyListener listener) {
		super.addListener(VisualizationDiagramModifyEvent.class, listener, IVisualizationDiagramModifyListener.METHOD);
	}
	
	public void removeModifyListener(IVisualizationDiagramModifyListener listener) {
		super.removeListener(VisualizationDiagramModifyEvent.class, listener, IVisualizationDiagramModifyListener.METHOD);
	}
}
