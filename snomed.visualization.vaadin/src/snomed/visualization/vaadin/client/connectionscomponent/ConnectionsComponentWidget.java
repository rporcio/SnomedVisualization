package snomed.visualization.vaadin.client.connectionscomponent;

import snomed.visualization.vaadin.client.model.ConnectionCoordinate;
import snomed.visualization.vaadin.client.model.ConnectionCoordinate.ConnectionType;

import com.google.gwt.canvas.client.Canvas;
import com.google.gwt.canvas.dom.client.Context2d;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

// TODO extend any GWT Widget
public class ConnectionsComponentWidget extends Composite {

	public static final String CLASSNAME = "connectionscomponent";
	private Canvas canvas;
	private Context2d context;

	public ConnectionsComponentWidget() {
		
		VerticalPanel panel = new VerticalPanel();
		
		canvas = Canvas.createIfSupported();
		if (null == canvas) {
			panel.add(new Label("Sorry, your browser doesn't support the HTML5 Canvas element."));
		} else{
			panel.add(canvas);
			context = canvas.getContext2d();
		}
		
		initWidget(panel);

		// setText("ConnectionsComponent sets the text via ConnectionsComponentConnector using ConnectionsComponentState");
		setStyleName(CLASSNAME);
	}
	
	public void visualize(ConnectionsComponentState state) {
		if (null != canvas) {
			int zoom = state.getSize();
			canvas.getElement().setAttribute("width", "" + state.getCanvasWidth());
			canvas.getElement().setAttribute("height", "" + state.getCanvasHeight());
			
			for (ConnectionCoordinate coordinate : state.getConnectionCoordinates()) {
				if (null == coordinate.getType()) {
					context.moveTo(coordinate.getBeginX(), coordinate.getBeginY());
					context.lineTo(coordinate.getEndX(), coordinate.getEndY());
					context.stroke();
				} else {
					context.moveTo(coordinate.getBeginX(), coordinate.getBeginY());
					context.lineTo(coordinate.getEndX() - zoom / 5, coordinate.getEndY());
					context.stroke();
					
					if (coordinate.getType().equals(ConnectionType.ISA)) {
						context.beginPath();
						context.lineTo(coordinate.getEndX() - zoom / 5, coordinate.getEndY() - zoom / 10);
						context.lineTo(coordinate.getEndX() - zoom / 5, coordinate.getEndY() + zoom / 10);
						context.lineTo(coordinate.getEndX(), coordinate.getEndY());
						context.lineTo(coordinate.getEndX() - zoom / 5, coordinate.getEndY() - zoom / 10);
						
						context.stroke();
					} else if (coordinate.getType().equals(ConnectionType.REGULAR)) {
						context.beginPath();
						context.lineTo(coordinate.getEndX() - zoom / 5, coordinate.getEndY() - zoom / 20);
						context.lineTo(coordinate.getEndX() - zoom / 5, coordinate.getEndY() + zoom / 20);
						context.lineTo(coordinate.getEndX(), coordinate.getEndY());
						context.lineTo(coordinate.getEndX() - zoom / 5, coordinate.getEndY() - zoom / 20);
						
						context.fill();
					}
				}
				
			}
		}
	}

}