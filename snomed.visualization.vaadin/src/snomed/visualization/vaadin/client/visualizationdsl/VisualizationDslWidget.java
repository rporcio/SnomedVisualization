package snomed.visualization.vaadin.client.visualizationdsl;

import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.ui.RichTextArea;

/**
 * Custom widget for the dsl editor.
 * 
 * @author rporcio
 */
public class VisualizationDslWidget extends RichTextArea {

	public static final String CLASSNAME = "visualizationdsl";
	private VisualizationDslServerRpc rpc;
	private String previousDsl = "";
	
	private KeyUpHandler keyUpHandler = new KeyUpHandler() {
		
		@Override
		public void onKeyUp(KeyUpEvent event) {
			if (!previousDsl.equals(getHTML())) {
				previousDsl = getHTML();
				rpc.handleModify(getHTML());
			}
		}
	};

	public VisualizationDslWidget() {
		addKeyUpHandler(keyUpHandler);
	}

	public void setRpc(VisualizationDslServerRpc rpc) {
		this.rpc = rpc;
	}

	public void setText(VisualizationDslState state) {
		setHTML(state.getText());
	}

}