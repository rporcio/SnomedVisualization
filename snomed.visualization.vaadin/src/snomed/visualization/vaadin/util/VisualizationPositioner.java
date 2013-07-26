package snomed.visualization.vaadin.util;

import java.util.List;

import snomed.visualization.dsl.visualizationDsl.Concept;
import snomed.visualization.dsl.visualizationDsl.Expression;
import snomed.visualization.dsl.visualizationDsl.Relationship;
import snomed.visualization.dsl.visualizationDsl.RelationshipGroup;
import snomed.visualization.vaadin.ConnectionComponent;
import snomed.visualization.vaadin.VisualizationComponent;
import snomed.visualization.vaadin.client.model.ConnectionCoordinate;
import snomed.visualization.vaadin.client.model.ConnectionCoordinate.ConnectionType;
import snomed.visualization.vaadin.client.model.VisualizationComponentModel;
import snomed.visualization.vaadin.client.model.VisualizationComponentModel.ComponentType;
import snomed.visualization.vaadin.ui.DiagramView;

import com.google.gwt.thirdparty.guava.common.collect.Lists;

/**
 * Utility class to position the diagram elements and the connections for the visualization.
 * 
 * @author rporcio
 */
public class VisualizationPositioner {
	
	int zoom;
	
	private List<VisualizationComponent> visualizationComponents;

	private Expression expression;
	private List<ConnectionCoordinate> coordinates;
	private final DiagramView diagramView;

	public VisualizationPositioner(DiagramView diagramView) {
		this.diagramView = diagramView;
		this.zoom = 100;
	}

	/**
	 * Position the diagram element and the connections.
	 */
	public void positionVisualizationComponents() {
		visualizationComponents = Lists.newArrayList();
		coordinates = Lists.newArrayList();
		
		positionConcept();
		positionIsaConcepts();
		positionRelationshipGroups();
		positionStandaloneRelationships();
		
		ConnectionComponent connectionComponent = new ConnectionComponent();
		connectionComponent.setState(zoom, zoom / 2 * visualizationComponents.size() + visualizationComponents.size() * zoom / 5,
				zoom * 8, 
				coordinates);
		
		diagramView.addComponent(connectionComponent, "left:0px;top:0px;z-index:0");
		
		if (visualizationComponents.size() > 12) {
			diagramView.setHeight((visualizationComponents.size()-2) * 10 + "%");
		} else {
			diagramView.setHeight("100%");
		}
	}
	
	public void setDiagramZoom(int zoom) {
		this.zoom = zoom;
	}

	public Expression getExpression() {
		return expression;
	}

	public void setExpression(Expression expression) {
		this.expression = expression;
	}
	
	private void positionConcept() {
		if (null != expression.getConcept()) {
			VisualizationComponent component = new VisualizationComponent();
			component.setState(new VisualizationComponentModel(expression.getConcept().isDefined(), expression.getConcept().getId(), expression.getConcept().getTerm(), ComponentType.CONCEPT, zoom));
			diagramView.addComponent(component, getCssCoordinates(5, 5));
			
			visualizationComponents.add(component);
			
			if (expression.getIsaRelationships().getRelationships().size() > 0 || expression.getRelationshipGroups().size() > 0 || expression.getStandaloneRelationships().getRelationships().size() > 0) {
				
				component = new VisualizationComponent();
				component.setState(new VisualizationComponentModel(false, null, "=", ComponentType.GROUP, zoom));
				diagramView.addComponent(component, getCssCoordinates(zoom * 0.6, zoom / 2 + zoom / 5 + zoom / 20));
				
				component = new VisualizationComponent();
				component.setState(new VisualizationComponentModel(false, null, null, ComponentType.CONJUCTION, zoom));
				diagramView.addComponent(component, getCssCoordinates(zoom * 1.5, zoom - 15));

				addNewConnection(null, zoom / 5, zoom / 2 + 5, zoom / 5, 
						zoom / 2 + zoom / 5 + zoom / 20 + zoom / 5);
				addNewConnection(ConnectionType.REGULAR, zoom / 5, zoom / 2 + zoom / 5 + zoom / 20 + zoom / 5, 
						(int) (zoom * 0.6), zoom / 2 + zoom / 5 + zoom / 20 + zoom / 5);
				addNewConnection(ConnectionType.REGULAR, (int) (zoom * 0.6) + zoom / 5 * 2, zoom / 2 + zoom / 5 + zoom / 20 + zoom / 5,
						(int) (zoom * 1.5),	zoom / 2 + zoom / 5 + zoom / 20 + zoom / 5);
				addNewConnection(null, (int) (zoom * 1.5), zoom / 2 + zoom / 5 + zoom / 20 + zoom / 5,
						zoom * 2, zoom / 2 + zoom / 5 + zoom / 20 + zoom / 5);
			}
		}
	}
	
	private void positionIsaConcepts() {
		int xCoord = 0;
		int yCoord = 0;
		
		for (Concept concept : expression.getIsaRelationships().getRelationships()) {
			VisualizationComponent component = new VisualizationComponent();
			
			xCoord = zoom * 2 + zoom / 2;
			yCoord = zoom / 2 * visualizationComponents.size() + visualizationComponents.size() * zoom / 5;
			
			component.setState(new VisualizationComponentModel(concept.isDefined(), concept.getId(), concept.getTerm(), ComponentType.CONCEPT, zoom));
			diagramView.addComponent(component, getCssCoordinates(xCoord, yCoord));
			
			addNewConnection(ConnectionType.ISA, zoom * 2, yCoord + zoom / 5 + zoom / 20,
					xCoord, yCoord+ zoom / 5 + zoom / 20);
			
			visualizationComponents.add(component);
		}
		
		if (expression.getRelationshipGroups().isEmpty() && expression.getStandaloneRelationships().getRelationships().isEmpty()) {
			addNewConnection(null, zoom * 2, zoom / 2 + zoom / 5 + zoom / 20 + zoom / 5,
					zoom * 2, yCoord+ zoom / 5 + zoom / 20);
		}
	}
	
	private void positionRelationshipGroups() {
		int xCoordGroup = 0;
		int yCoordGroup = 0;
		
		for (RelationshipGroup relationshipGroup : expression.getRelationshipGroups()) {
			xCoordGroup = zoom * 2 + zoom / 2;
			yCoordGroup = zoom / 2 * visualizationComponents.size() + visualizationComponents.size() * zoom / 5 + zoom / 20;
			
			VisualizationComponent component = new VisualizationComponent();
			component.setState(new VisualizationComponentModel(false, null, null, ComponentType.GROUP, zoom));
			diagramView.addComponent(component, getCssCoordinates(xCoordGroup, yCoordGroup));
			
			addNewConnection(ConnectionType.REGULAR, zoom * 2, yCoordGroup + zoom / 5,
					xCoordGroup, yCoordGroup + zoom / 5);
			addNewConnection(null, zoom * 2 + zoom / 2 + (zoom / 5) * 2, zoom / 2 * visualizationComponents.size() + visualizationComponents.size() * zoom / 5 + zoom / 5 + zoom / 20, 
					zoom * 3, zoom / 2 * visualizationComponents.size() + visualizationComponents.size() * zoom / 5 + zoom / 5 + zoom / 20);
			
			for (Relationship relationship : relationshipGroup.getRelationships()) {
				int xCoordType = zoom * 3 + zoom / 2;
				int yCoordType = zoom / 2 * visualizationComponents.size() + visualizationComponents.size() * zoom / 5;
				int xCoordDestination = zoom * 6;
				int yCoordDestination = zoom / 2 * visualizationComponents.size() + visualizationComponents.size() * zoom / 5;
				
				component = new VisualizationComponent();
				component.setState(new VisualizationComponentModel(relationship.isDefined(), relationship.getType().getId(), relationship.getType().getTerm(), ComponentType.RELATIONSHIP, zoom));
				diagramView.addComponent(component, getCssCoordinates(xCoordType, yCoordType));
				
				component = new VisualizationComponent();
				component.setState(new VisualizationComponentModel(relationship.getDestination().isDefined(), relationship.getDestination().getId(), relationship.getDestination().getTerm(), ComponentType.CONCEPT, zoom));
				diagramView.addComponent(component, getCssCoordinates(xCoordDestination, yCoordDestination));
				
				addNewConnection(ConnectionType.REGULAR, zoom * 3, yCoordType + zoom / 5 + zoom / 20,
						xCoordType, yCoordType+ zoom / 5 + zoom / 20);
				addNewConnection(ConnectionType.REGULAR, zoom * 5, yCoordDestination + zoom / 5 + zoom / 20,
						xCoordDestination, yCoordDestination + zoom / 5 + zoom / 20);
				addNewConnection(null, zoom * 3, yCoordGroup + zoom / 5 + zoom / 20, 
						zoom * 3, yCoordDestination + zoom / 5 + zoom / 20);
				
				visualizationComponents.add(component);
			}
		}
		
		if (expression.getStandaloneRelationships().getRelationships().isEmpty() && !expression.getRelationshipGroups().isEmpty()) {
			addNewConnection(null, zoom * 2, zoom / 2 + zoom / 5 + zoom / 20 + zoom / 5,
					zoom * 2, yCoordGroup + zoom / 5);
		}
	}
	
	private void positionStandaloneRelationships() {
		for (Relationship relationship : expression.getStandaloneRelationships().getRelationships()) {
			int xCoordType = zoom * 2 + zoom / 2;
			int yCoordType = zoom / 2 * visualizationComponents.size() + visualizationComponents.size() * zoom / 5;
			int xCoordDestination = zoom * 5;
			int yCoordDestination = zoom / 2 * visualizationComponents.size() + visualizationComponents.size() * zoom / 5;
			
			VisualizationComponent component = new VisualizationComponent();
			component.setState(new VisualizationComponentModel(relationship.isDefined(), relationship.getType().getId(), relationship.getType().getTerm(), ComponentType.RELATIONSHIP, zoom));
			diagramView.addComponent(component, getCssCoordinates(xCoordType, yCoordType));
			
			component = new VisualizationComponent();
			component.setState(new VisualizationComponentModel(relationship.getDestination().isDefined(), relationship.getDestination().getId(), relationship.getDestination().getTerm(), ComponentType.CONCEPT, zoom));
			diagramView.addComponent(component, getCssCoordinates(xCoordDestination, yCoordDestination));
			
			addNewConnection(ConnectionType.REGULAR, zoom * 2, yCoordType + zoom / 5 + zoom / 20,
					xCoordType, yCoordType+ zoom / 5 + zoom / 20);
			addNewConnection(ConnectionType.REGULAR, zoom * 4, yCoordDestination + zoom / 5 + zoom / 20,
					xCoordDestination, yCoordDestination + zoom / 5 + zoom / 20);
			
			visualizationComponents.add(component);
		}
		
		if (!expression.getStandaloneRelationships().getRelationships().isEmpty()) {
			addNewConnection(null, zoom * 2, zoom / 2 + zoom / 5 + zoom / 20 + zoom / 5,
					zoom * 2, zoom / 2 * (visualizationComponents.size()-1) + visualizationComponents.size() * zoom / 5 + zoom / 20);
		}
		
	}
	
	private void addNewConnection(ConnectionType connectionType, int beginX, int beginY, int endX, int endY) {
		coordinates.add(new ConnectionCoordinate(connectionType, beginX, beginY, endX, endY));
	}

	private String getCssCoordinates(double left, double top) {
		return "left:" + left + "px; top:" + top +"px;z-index:1";
	}

}
