package snomed.visualization.vaadin.util;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

import snomed.visualization.dsl.visualizationDsl.Concept;
import snomed.visualization.dsl.visualizationDsl.Expression;
import snomed.visualization.dsl.visualizationDsl.IsaRelationships;
import snomed.visualization.dsl.visualizationDsl.Relationship;
import snomed.visualization.dsl.visualizationDsl.RelationshipGroup;
import snomed.visualization.dsl.visualizationDsl.Relationships;
import snomed.visualization.vaadin.VisualizationDiagramConnection;
import snomed.visualization.vaadin.VisualizationDiagramElement;
import snomed.visualization.vaadin.client.model.VisualizationConnectionCoordinate;
import snomed.visualization.vaadin.client.model.VisualizationConnectionCoordinate.ConnectionType;
import snomed.visualization.vaadin.client.model.VisualizationDiagramElementModel;
import snomed.visualization.vaadin.client.model.VisualizationDiagramElementModel.VisualizationComponentType;
import snomed.visualization.vaadin.listener.VisualizationDiagramModifyListener;
import snomed.visualization.vaadin.ui.AbstractVisualizationDiagramView;
import snomed.visualization.vaadin.ui.VisualizationDiagramView;
import snomed.visualization.vaadin.ui.VisualizationDiagramView.DiagramType;

import com.google.gwt.thirdparty.guava.common.collect.Lists;
import com.google.gwt.thirdparty.guava.common.collect.Maps;
import com.vaadin.server.ResourceReference;
import com.vaadin.server.ThemeResource;

/**
 * Utility class to handle the position of the diagram elements, connections and the modify events.
 * 
 * @author rporcio
 */
public class VisualizationDiagramUtil implements Serializable {
	
	private static final long serialVersionUID = 70837089898207387L;

	private int zoom;
	private int depth;
	private Map<String, VisualizationDiagramElement> diagramElements;
	private List<VisualizationConnectionCoordinate> coordinates;
	private ResourceReference characteristicIcon;
	private ResourceReference deletionIcon;
	private VisualizationDiagramModifyListener modifyListener;

	private AbstractVisualizationDiagramView abstractDiagramView;
	
	public VisualizationDiagramUtil(AbstractVisualizationDiagramView abstractDiagramView) {
		this.abstractDiagramView = abstractDiagramView;
		this.zoom = 100;
		this.characteristicIcon = new ResourceReference(new ThemeResource("icons/changetype.png"), null, "");
		this.deletionIcon = new ResourceReference(new ThemeResource("icons/trash.png"), null, "");
		this.modifyListener = new VisualizationDiagramModifyListener(this);
	}

	/**
	 * Position the diagram element and the connections.
	 */
	public void visualizeDiagram() {
		diagramElements = Maps.newHashMap();
		coordinates = Lists.newArrayList();
		
		if (abstractDiagramView.getDiagramType() == DiagramType.DEFINITION) {
			depth = 70;
		} else {
			depth = 5;
		}
		
		visualizeConcept();
		visualizeIsaConcepts();
		visualizeGroupedRelationships();
		visualizeUngroupedRelationships();
		
		VisualizationDiagramConnection diagramConnection = new VisualizationDiagramConnection();
		if (abstractDiagramView.getDiagramType() == DiagramType.DEFINITION) {
			diagramConnection.setState(zoom, zoom * depth / 100, zoom * 8, coordinates);
		} else {
			diagramConnection.setState(  zoom, zoom * depth / 100, zoom * 7, coordinates);
		}
		
		abstractDiagramView.addComponent(diagramConnection, "left:0px;top:0px;z-index:0");
	}
	
	public void setDiagramZoom(int zoom) {
		this.zoom = zoom;
	}

	public Map<String, VisualizationDiagramElement> getDiagramElements() {
		return diagramElements;
	}
	
	public boolean canEdit() {
		if (abstractDiagramView instanceof VisualizationDiagramView) {
			return ((VisualizationDiagramView) abstractDiagramView).canEdit();
		} else {
			return false;
		}
	}
	
	public boolean isEmpty(EObject eObject) {
		if (null == eObject) {
			return true;
		} else  if (eObject instanceof IsaRelationships) {
			return ((IsaRelationships) eObject).getRelationships().isEmpty();
		} else if (eObject instanceof Relationships) {
			return ((Relationships) eObject).getRelationships().isEmpty();
		}
		
		return false;
	}
	
	public Expression getExpression() {
		return abstractDiagramView.getExpression();
	}

	private void visualizeConcept() {
		if (null != abstractDiagramView.getExpression().getConcept()) {
			VisualizationDiagramElement component = new VisualizationDiagramElement();

			if (abstractDiagramView.getDiagramType() == DiagramType.DEFINITION) {
				component.setState(new VisualizationDiagramElementModel(abstractDiagramView.getExpression().getConcept().isDefined(), abstractDiagramView.getExpression().getConcept().getId(), abstractDiagramView.getExpression().getConcept().getTerm(), VisualizationComponentType.CONCEPT, zoom), characteristicIcon, deletionIcon);
				abstractDiagramView.addComponent(component, getCssCoordinates(5, 5));
				
				component.addModifyListener(modifyListener);
				diagramElements.put(component.getState().getComponentModel().getId(), component);
			}

			if (!isEmpty(abstractDiagramView.getExpression().getIsaRelationships()) || !abstractDiagramView.getExpression().getGroupedRelationships().isEmpty() || !isEmpty(abstractDiagramView.getExpression().getUngroupedRelationships())) {
				if (abstractDiagramView.getDiagramType() == DiagramType.DEFINITION) {
					component = new VisualizationDiagramElement();
					component.setState(new VisualizationDiagramElementModel(false, null, "=", VisualizationComponentType.GROUP, zoom), characteristicIcon, deletionIcon);
					abstractDiagramView.addComponent(component, getCssCoordinates(zoom * 0.6, zoom * 0.75));
				}
				
				component = new VisualizationDiagramElement();
				component.setState(new VisualizationDiagramElementModel(false, null, null, VisualizationComponentType.CONJUCTION, zoom), characteristicIcon, deletionIcon);

				if (abstractDiagramView.getDiagramType() == DiagramType.DEFINITION) {
					abstractDiagramView.addComponent(component, getCssCoordinates(zoom * 1.5, zoom * depth / 100 + zoom * 0.25 - 10));
					
					addNewConnection(null, zoom / 5, (int) (zoom * 0.55), zoom / 5, (int) (zoom * 0.95));
					addNewConnection(ConnectionType.REGULAR, zoom / 5, (int) (zoom * 0.95),	(int) (zoom * 0.6), (int) (zoom * 0.95));
					addNewConnection(ConnectionType.REGULAR, (int) (zoom * 0.6) + zoom / 5 * 2, (int) (zoom * 0.95), (int) (zoom * 1.5), (int) (zoom * 0.95));
					addNewConnection(null, (int) (zoom * 1.5), (int) (zoom * 0.95), zoom * 2, (int) (zoom * 0.95));
				} else {
					abstractDiagramView.addComponent(component, getCssCoordinates(zoom * 0.5, zoom * depth / 100 + zoom * 0.25 - 10));
					addNewConnection(null, (int) (zoom * 0.5), zoom * depth / 100 + (int)(zoom * 0.25), zoom, zoom * depth / 100 + (int)(zoom * 0.25));
				}
			}
		}
	}
	
	private void visualizeIsaConcepts() {
		int x = 0;
		int y = 0;
		
		if (!isEmpty(abstractDiagramView.getExpression().getIsaRelationships())) {
			for (Concept concept : abstractDiagramView.getExpression().getIsaRelationships().getRelationships()) {
				VisualizationDiagramElement component = new VisualizationDiagramElement();
				
				if (abstractDiagramView.getDiagramType() == DiagramType.DEFINITION) {
					x = (int) (zoom * 2.5);
				} else {
					x = (int) (zoom * 1.5);
				}
				y = zoom * depth / 100;
				
				component.setState(new VisualizationDiagramElementModel(concept.isDefined(), concept.getId(), concept.getTerm(), VisualizationComponentType.CONCEPT, zoom), characteristicIcon, deletionIcon);
				abstractDiagramView.addComponent(component, getCssCoordinates(x, y));
				
				component.addModifyListener(modifyListener);
				diagramElements.put(component.getState().getComponentModel().getId(), component);
				
				
				if (abstractDiagramView.getDiagramType() == DiagramType.DEFINITION) {
					addNewConnection(ConnectionType.ISA, zoom * 2, y + (int)(zoom * 0.25), x, y + (int)(zoom * 0.25));
				} else {
					addNewConnection(ConnectionType.ISA, zoom, y + (int)(zoom * 0.25), x, y + (int)(zoom * 0.25));
				}
				
				depth += 70;
			}
		}
		
		/*
		 * if the are no more relationships, we draw the vertical connection 
		 */
		if (!isEmpty(abstractDiagramView.getExpression().getIsaRelationships()) && abstractDiagramView.getExpression().getGroupedRelationships().isEmpty() && isEmpty(abstractDiagramView.getExpression().getUngroupedRelationships())) { 
			if (abstractDiagramView.getDiagramType() == DiagramType.DEFINITION) {
				addNewConnection(null, zoom * 2, (int)(zoom * 0.95), zoom * 2, y + (int)(zoom * 0.25));
			} else {
				addNewConnection(null, zoom, (int) (zoom * 0.3), zoom, y + (int)(zoom * 0.25));
			}
		}
	}
	
	private void visualizeGroupedRelationships() {
		int y = 0;
		int xGroup = 0;
		int yStart = 0;
		int xType;
		int xDestination;
		
		for (RelationshipGroup relationshipGroup : abstractDiagramView.getExpression().getGroupedRelationships()) {
			if (abstractDiagramView.getDiagramType() == DiagramType.DEFINITION) {
				xGroup = (int) (zoom * 2.5);
			} else {
				xGroup = (int) (zoom * 1.5);
			}
			y = zoom * depth / 100;
			yStart = y + zoom / 4;
			
			VisualizationDiagramElement component = new VisualizationDiagramElement();
			component.setState(new VisualizationDiagramElementModel(false, null, null, VisualizationComponentType.GROUP, zoom), characteristicIcon, deletionIcon);
			abstractDiagramView.addComponent(component, getCssCoordinates(xGroup, y + zoom / 20));
			
			if (abstractDiagramView.getDiagramType() == DiagramType.DEFINITION) {
				addNewConnection(ConnectionType.REGULAR, zoom * 2, y + zoom / 4, xGroup, y + zoom / 4);
				addNewConnection(null, zoom * 2 + (int)(zoom * 0.9), y + zoom / 4, zoom * 3, y + zoom / 4);
			} else {
				addNewConnection(ConnectionType.REGULAR, zoom, y + zoom / 4, xGroup, y + zoom / 4);
				addNewConnection(null, zoom + (int)(zoom * 0.9), y + zoom / 4, zoom * 2, y + zoom / 4);
			}
			
			for (Relationship relationship : relationshipGroup.getRelationships()) {
				if (abstractDiagramView.getDiagramType() == DiagramType.DEFINITION) {
					xType = (int) (zoom * 3.5);
					xDestination = zoom * 6;
				} else {
					xType = (int) (zoom * 2.5);
					xDestination = zoom * 5;
				}
				
				y = zoom * depth / 100;
				
				component = new VisualizationDiagramElement();
				component.setState(new VisualizationDiagramElementModel(relationship.isDefined(), relationship.getId(), relationship.getType().getTerm(), VisualizationComponentType.RELATIONSHIP, zoom), characteristicIcon, deletionIcon);
				abstractDiagramView.addComponent(component, getCssCoordinates(xType, y));
				component.addModifyListener(modifyListener);
				diagramElements.put(component.getState().getComponentModel().getId(), component);
				
				component = new VisualizationDiagramElement();
				component.setState(new VisualizationDiagramElementModel(relationship.getDestination().isDefined(), relationship.getDestination().getId(), relationship.getDestination().getTerm(), VisualizationComponentType.CONCEPT, zoom), characteristicIcon, deletionIcon);
				abstractDiagramView.addComponent(component, getCssCoordinates(xDestination, y));
				component.addModifyListener(modifyListener);
				diagramElements.put(component.getState().getComponentModel().getId(), component);
				
				if (abstractDiagramView.getDiagramType() == DiagramType.DEFINITION) {
					addNewConnection(ConnectionType.REGULAR, zoom * 3, y + zoom / 4, xType, y + zoom / 4);
					addNewConnection(ConnectionType.REGULAR, (int) (zoom * 5.5), y + zoom / 4, xDestination, y + zoom / 4);
					addNewConnection(null, zoom * 3, yStart, zoom * 3, y + zoom / 4);
				} else {
					addNewConnection(ConnectionType.REGULAR, zoom * 2, y + zoom / 4, xType, y + zoom / 4);
					addNewConnection(ConnectionType.REGULAR, (int) (zoom * 4.5), y + zoom / 4, xDestination, y + zoom / 4);
					addNewConnection(null, zoom * 2, yStart, zoom * 2, y + zoom / 4);
				}
				
				depth += 70;
			}
		}
		
		/*
		 * if the are no more relationships, we draw the vertical connection 
		 */
		if (isEmpty(abstractDiagramView.getExpression().getUngroupedRelationships()) && !abstractDiagramView.getExpression().getGroupedRelationships().isEmpty()) {
			if (abstractDiagramView.getDiagramType() == DiagramType.DEFINITION) {
				addNewConnection(null, zoom * 2, (int) (zoom * 0.95), zoom * 2, yStart);
			} else {
				addNewConnection(null, zoom, (int) (zoom * 0.3), zoom, yStart);
			}
		}
	}
	
	private void visualizeUngroupedRelationships() {
		int xType;
		int xDestination;
		int y = 0;
		
		if (!isEmpty(abstractDiagramView.getExpression().getUngroupedRelationships())) {
			for (Relationship relationship : abstractDiagramView.getExpression().getUngroupedRelationships().getRelationships()) {
				if (abstractDiagramView.getDiagramType() == DiagramType.DEFINITION) {
					xType = (int) (zoom * 2.5);
					xDestination = zoom * 5;
				} else {
					xType = (int) (zoom * 1.5);
					xDestination = zoom * 4;
				}
				
				y = zoom * depth / 100;
				
				VisualizationDiagramElement component = new VisualizationDiagramElement();
				component.setState(new VisualizationDiagramElementModel(relationship.isDefined(), relationship.getId(), relationship.getType().getTerm(), VisualizationComponentType.RELATIONSHIP, zoom), characteristicIcon, deletionIcon);
				abstractDiagramView.addComponent(component, getCssCoordinates(xType, y));
				component.addModifyListener(modifyListener);
				diagramElements.put(component.getState().getComponentModel().getId(), component);
				
				component = new VisualizationDiagramElement();
				component.setState(new VisualizationDiagramElementModel(relationship.getDestination().isDefined(), relationship.getDestination().getId(), relationship.getDestination().getTerm(), VisualizationComponentType.CONCEPT, zoom), characteristicIcon, deletionIcon);
				abstractDiagramView.addComponent(component, getCssCoordinates(xDestination, y));
				component.addModifyListener(modifyListener);
				diagramElements.put(component.getState().getComponentModel().getId(), component);
				
				if (abstractDiagramView.getDiagramType() == DiagramType.DEFINITION) {
					addNewConnection(ConnectionType.REGULAR, zoom * 2, y + zoom / 4, xType, y+ zoom / 4);
					addNewConnection(ConnectionType.REGULAR, (int) (zoom * 4.5), y + zoom / 4, xDestination, y + zoom / 4);
				} else {
					addNewConnection(ConnectionType.REGULAR, zoom, y + zoom / 4, xType, y+ zoom / 4);
					addNewConnection(ConnectionType.REGULAR, (int) (zoom * 3.5), y + zoom / 4, xDestination, y + zoom / 4);
				}
				
				depth += 70;
			}
			
			if (abstractDiagramView.getDiagramType() == DiagramType.DEFINITION) {
				addNewConnection(null, zoom * 2, (int) (zoom * 0.95), zoom * 2, y + zoom / 4);
			} else {
				addNewConnection(null, zoom, (int) (zoom * 0.3), zoom, y + zoom / 4);
			}
		}
	}
	
	private void addNewConnection(ConnectionType connectionType, int beginX, int beginY, int endX, int endY) {
		coordinates.add(new VisualizationConnectionCoordinate(connectionType, beginX, beginY, endX, endY));
	}

	private String getCssCoordinates(double left, double top) {
		return "left:" + left + "px; top:" + top +"px;z-index:1";
	}
}
