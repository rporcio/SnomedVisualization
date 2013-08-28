package snomed.visualization.vaadin;

import snomed.visualization.vaadin.client.visualizationdsl.VisualizationDslServerRpc;
import snomed.visualization.vaadin.client.visualizationdsl.VisualizationDslState;
import snomed.visualization.vaadin.listener.IVisualizationDslModifyListener;

public class VisualizationDsl extends com.vaadin.ui.AbstractComponent {

	private static final long serialVersionUID = 8677951025462863646L;

	private VisualizationDslServerRpc rpc = new VisualizationDslServerRpc() {
		private static final long serialVersionUID = 3504394854743841153L;

		@Override
		public void handleModify(String dsl) {
			fireEvent(new VisualizationDslModifyEvent(VisualizationDsl.this, dsl));
		}
	};  

	public VisualizationDsl() {
		registerRpc(rpc);
	}

	@Override
	public VisualizationDslState getState() {
		return (VisualizationDslState) super.getState();
	}
	
	public void setState(String dsl) {
		getState().setText(dsl);
		
		markAsDirty();
	}
	
	public void addModifyListener(IVisualizationDslModifyListener listener) {
		super.addListener(VisualizationDslModifyEvent.class, listener, IVisualizationDslModifyListener.METHOD);
	}
	
	public void removeModifyListener(IVisualizationDslModifyListener listener) {
		super.removeListener(VisualizationDslModifyEvent.class, listener, IVisualizationDslModifyListener.METHOD);
	}
}
