package snomed.visualization.vaadin.client.visualizationcomponent;

import snomed.visualization.vaadin.client.model.VisualizationComponentModel;
import snomed.visualization.vaadin.client.model.VisualizationComponentModel.ComponentType;

import com.google.gwt.canvas.client.Canvas;
import com.google.gwt.canvas.dom.client.Context2d;
import com.google.gwt.canvas.dom.client.CssColor;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.MouseOutEvent;
import com.google.gwt.event.dom.client.MouseOutHandler;
import com.google.gwt.event.dom.client.MouseOverEvent;
import com.google.gwt.event.dom.client.MouseOverHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

public class VisualizationComponentWidget extends Composite {

	public static final String CLASSNAME = "visualizationcomponent";
	private Canvas canvas;
	private Context2d context;
	
	private int zoomSize;
	private int componentHeight;
	private int componentWidth;
	private VisualizationComponentServerRpc rpc;

	public VisualizationComponentWidget() {
		
		VerticalPanel panel = new VerticalPanel();
		
		canvas = Canvas.createIfSupported();
		if (null == canvas) {
			panel.add(new Label("Sorry, your browser doesn't support the HTML5 Canvas element."));
		} else{
			panel.add(canvas);
			context = canvas.getContext2d();
		}
		
		initWidget(panel);

		// setText("VisualizationComponent sets the text via VisualizationComponentConnector using VisualizationComponentState");
		setStyleName(CLASSNAME);

	}
	
	public void visualize(VisualizationComponentState state) {
		if (null != canvas) {
			final VisualizationComponentModel componentModel = state.getComponentModel();
			
			zoomSize = componentModel.getSize();
			componentWidth = zoomSize * 2;
			componentHeight = zoomSize / 2;
			
			if (componentModel.getType().equals(ComponentType.GROUP)) {
				int groupSize = zoomSize / 5 * 2;
				canvas.getElement().setAttribute("width", "" + groupSize);
				canvas.getElement().setAttribute("height", "" + groupSize);
				canvas.setPixelSize(groupSize, groupSize);
			} else if (componentModel.getType().equals(ComponentType.CONJUCTION)) {
				int conjuctionSize = zoomSize / 20 * 2;
				canvas.getElement().setAttribute("width", "" + conjuctionSize);
				canvas.getElement().setAttribute("height", "" + conjuctionSize);
				canvas.setPixelSize(conjuctionSize, conjuctionSize);
			} else {
				canvas.getElement().setAttribute("width", "" + (componentWidth + 6));
				canvas.getElement().setAttribute("height", "" + (componentHeight + 6));
				canvas.setPixelSize(componentWidth + 6, componentHeight + 6);
				
			}
			
			context.setFont((zoomSize / 10 + 3) + "px arial");
			
			if (componentModel.getType().equals(ComponentType.CONCEPT)) {
				if (componentModel.isDefined()) {
					drawDefiningConcept(3, 3, componentModel.getTerm());
				} else {
					drawPrimitiveConcept(3, 3, componentModel.getTerm());
				}
			} else if (componentModel.getType().equals(ComponentType.RELATIONSHIP)) {
				if (componentModel.isDefined()) {
					drawDefiningRelationship(3, 3, componentModel.getTerm());
				} else {
					drawNonDefiningRelationship(3, 3, componentModel.getTerm());
				}
			} else if (componentModel.getType().equals(ComponentType.GROUP)) {
				drawGroup(componentModel.getTerm());
			} else if (componentModel.getType().equals(ComponentType.CONJUCTION)) {
				drawConjuction();
			}
			
			canvas.addMouseOverHandler(new MouseOverHandler() {
				
				@Override
				public void onMouseOver(MouseOverEvent event) {
					
				}
			});
			
			canvas.addMouseOutHandler(new MouseOutHandler() {
				
				@Override
				public void onMouseOut(MouseOutEvent event) {
					
				}
			});
			
			canvas.addClickHandler(new ClickHandler() {
				
				@Override
				public void onClick(ClickEvent event) {
					rpc.changeCharacteristicType(componentModel.getId());
				}
			});
		}
	}
	
	private void drawGroup(String term) {
		int groupSize = zoomSize / 5;
		context.arc(groupSize, groupSize, groupSize, 0, Math.PI * 2.0);
		context.stroke();
		if (null != term) {
			context.moveTo(groupSize - groupSize / 2, groupSize - groupSize / 4);
			context.lineTo(groupSize + groupSize / 2, groupSize - groupSize / 4);
			context.moveTo(groupSize - groupSize / 2, groupSize);
			context.lineTo(groupSize + groupSize / 2, groupSize);
			context.moveTo(groupSize - groupSize / 2, groupSize + groupSize / 4);
			context.lineTo(groupSize + groupSize / 2, groupSize + groupSize / 4);
			context.stroke();
		}
	}
	
	private void drawConjuction() {
		int conjunctionSize = zoomSize / 20;
		context.arc(conjunctionSize, conjunctionSize, conjunctionSize, 0, Math.PI * 2.0);
		context.fill();
	}

	private void drawDefiningConcept(final int x, final int y, final String term) {
		context.setFillStyle(CssColor.make(204, 204, 255));
		context.fillRect(x, y, componentWidth, componentHeight);
		context.strokeRect(x, y, componentWidth, componentHeight);
		context.strokeRect(x - 3, y - 3, componentWidth + 6, componentHeight + 6);
		drawTerm(term);
	}
	
	private void drawPrimitiveConcept(final int x, final int y, final String term) {
		context.setFillStyle(CssColor.make(99, 204, 255));
		context.fillRect(x, y, componentWidth, componentHeight);
		context.strokeRect(x, y, componentWidth, componentHeight);
		drawTerm(term);
	}
	
	private void drawDefiningRelationship(final int x, final int y, final String term) {
		roundRect(x - 3, y - 3, componentWidth + 6, componentHeight + 6);
		context.stroke();
		roundRect(x, y, componentWidth, componentHeight);
		context.stroke();
		context.setFillStyle(CssColor.make(255, 255, 204));
		roundRect(x, y, componentWidth, componentHeight);
		context.fill();
		drawTerm(term);
	}
	
	private void drawNonDefiningRelationship(final int x, final int y, final String term) {
		context.setFillStyle(CssColor.make(204, 204, 99));
		roundRect(x, y, componentWidth, componentHeight);
		context.stroke();
		roundRect(x, y, componentWidth, componentHeight);
		context.fill();
		drawTerm(term);
	}
	
	private void roundRect(final int x, final int y, final int width, final int height) {
		int radius = componentWidth / 8;

		context.beginPath();
		context.moveTo(x + radius, y);
		context.lineTo(x + width - radius, y);
		context.quadraticCurveTo(x + width, y, x + width, y + radius);
		context.lineTo(x + width, y + height - radius);
		context.quadraticCurveTo(x + width, y + height, x + width - radius, y + height);
		context.lineTo(x + radius, y + height);
		context.quadraticCurveTo(x, y + height, x, y + height - radius);
		context.lineTo(x, y + radius);
		context.quadraticCurveTo(x, y, x + radius, y);
		context.closePath();
	}
	
	private void drawTerm(String term) {
		if (term.length() <= (zoomSize / 2 - 10)) {
			double position = term.length() / 2 * 5.5;
			context.strokeText(term, 3 + componentWidth / 2 - position, 7 + componentHeight / 2);
		} else {
			double position = term.substring(0, term.length() / 2).length() / 2 * 5.5;
			context.strokeText(term.substring(0, term.length() / 2), 3 + componentWidth / 2 - position, 7 + componentHeight / 4);
			position = term.substring(term.length() / 2).length() / 2 * 5.5;
			context.strokeText(term.substring(term.length() / 2), 3 + componentWidth / 2 - position, 7 + componentHeight / 1.5);
		}
	}

	public void setRpc(VisualizationComponentServerRpc rpc) {
		this.rpc = rpc;
	}

}