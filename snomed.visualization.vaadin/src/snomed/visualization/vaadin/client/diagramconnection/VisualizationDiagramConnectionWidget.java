package snomed.visualization.vaadin.client.diagramconnection;

import snomed.visualization.vaadin.client.model.VisualizationConnectionCoordinate;
import snomed.visualization.vaadin.client.model.VisualizationConnectionCoordinate.ConnectionType;

import com.google.gwt.canvas.client.Canvas;
import com.google.gwt.canvas.dom.client.Context2d;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

public class VisualizationDiagramConnectionWidget extends Composite {

	public static final String CLASSNAME = "visualizationdiagramconnection";
	
	private Canvas canvas;
	private Context2d context;

	public VisualizationDiagramConnectionWidget() {

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
	
	public void visualize(VisualizationDiagramConnectionState connectionState) {
		if (null != canvas) {
			int zoom = connectionState.getSize();
			canvas.getElement().setAttribute("width", "" + connectionState.getCanvasWidth());
			canvas.getElement().setAttribute("height", "" + connectionState.getCanvasHeight());
			
			for (VisualizationConnectionCoordinate coordinate : connectionState.getConnectionCoordinates()) {
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