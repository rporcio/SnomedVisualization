package snomed.visualization.vaadin.client.visualizationdsl;

import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.RichTextArea;

/**
 * Custom widget for the dsl editor.
 * 
 * @author rporcio
 */
public class VisualizationDslWidget extends RichTextArea {
	
	private class DslTimer extends Timer {
		@Override
		public void run() {
			rpc.handleModify(getHTML());
		}
	};
	
	public static final String CLASSNAME = "visualizationdsl";

	private VisualizationDslServerRpc rpc;
	private Timer timer;
	
	private KeyUpHandler keyUpHandler = new KeyUpHandler() {
		
		@Override
		public void onKeyUp(KeyUpEvent event) {
			switch (event.getNativeKeyCode()) {
			// prevent unwanted client to server events when the user is only navigating or formatting the dsl and not modifying it
			case KeyCodes.KEY_ALT:
				break;
			case KeyCodes.KEY_CTRL:
				break;
			case KeyCodes.KEY_DOWN:
				break;
			case KeyCodes.KEY_END:
				break;
			case KeyCodes.KEY_ENTER:
				break;
			case KeyCodes.KEY_ESCAPE:
				break;
			case KeyCodes.KEY_HOME:
				break;
			case KeyCodes.KEY_LEFT:
				break;
			case KeyCodes.KEY_PAGEDOWN:
				break;
			case KeyCodes.KEY_PAGEUP:
				break;
			case KeyCodes.KEY_RIGHT:
				break;
			case KeyCodes.KEY_SHIFT:
				break;
			case KeyCodes.KEY_TAB:
				break;
			case KeyCodes.KEY_UP:
				break;
			default:
				if (null != timer) {
					timer.cancel();
				}
				
				timer.schedule(1000);
			}
		}
	};

	public VisualizationDslWidget() {
		addKeyUpHandler(keyUpHandler);
		timer = new DslTimer();
	}

	public void setRpc(VisualizationDslServerRpc rpc) {
		this.rpc = rpc;
	}

	public void setText(VisualizationDslState state) {
		setHTML(state.getText());
	}

}