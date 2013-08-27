package snomed.visualization.util;

import java.util.List;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Color;

import snomed.visualization.dsl.visualizationDsl.Concept;
import snomed.visualization.dsl.visualizationDsl.Expression;
import snomed.visualization.dsl.visualizationDsl.Relationship;
import snomed.visualization.dsl.visualizationDsl.RelationshipGroup;
import snomed.visualization.model.VisualizationConnection;
import snomed.visualization.model.VisualizationConnection.ConnectionType;
import snomed.visualization.model.VisualizationDiagramConnection;
import snomed.visualization.model.VisualizationDiagramElement;
import snomed.visualization.model.VisualizationDiagramElement.VisualizationComponentType;

import com.google.common.collect.Lists;

/**
 * Utility class to provide diagram specific methods.
 * 
 * @author Porcio Roland
 */
public class VisualizationDiagramUtil {
	
	private enum DiagramType {
		EXPRESSION,
		DEFINITION
	}
	
	private int zoom;
	private int depth;

	private List<VisualizationConnection> diagramConnections;
	private List<Object> diagramElements;
	
	private DiagramType diagramType;
	
	public VisualizationDiagramUtil() {
		zoom = 100;
		diagramType = DiagramType.DEFINITION;
	}
	
	/**
	 * Creates a {@link Color} for the diagram elements based on the given values.
	 * 
	 * @param red the value of the red.
	 * @param green the value of the green.
	 * @param blue the value of the blue.
	 * @return the created color.
	 */
	public static Color getColor(int red, int green, int blue) {
		return new Color(org.eclipse.swt.widgets.Display.getDefault(), red, green, blue);
	}

	/**
	 * Creates the diagram elements and set their coordinates.
	 * 
	 * @param expression {@link Expression} which will be visualized.
	 * @return a list of the diagram elements.
	 */
	public List<?> createDiagramElements(Expression expression) {
		if (diagramType == DiagramType.DEFINITION) {
			depth = 70;
		} else {
			depth = 5;
		}
		
		diagramElements = Lists.newArrayList();
		diagramConnections = Lists.newArrayList();

		createConceptElement(expression);
		createIsaConceptElements(expression);
		createGroupedRelationshipElements(expression);
		createUngroupedRelationshipElements(expression);

		if (diagramType == DiagramType.DEFINITION) {
			diagramElements.add(0, new VisualizationDiagramConnection(zoom, new Rectangle(0, 0, zoom * 8, zoom * depth / 100), diagramConnections));
		} else {
			diagramElements.add(0, new VisualizationDiagramConnection(zoom, new Rectangle(0, 0, zoom * 7, zoom * depth / 100), diagramConnections));
		}

		return diagramElements;
	}
	
	/**
	 * Changes the characteristic of an expression element.
	 * 
	 * @param id the id of the expression element.
	 * @param expression the expression where the element can be found.
	 */
	public void changeCharacteristicType(final String id, Expression expression) {
		if (expression.getConcept().getId().equals(id)) {
			expression.getConcept().setDefined(expression.getConcept().isDefined());
			
			return;
		}
		
		for (Concept concept : expression.getIsaRelationships().getRelationships()) {
			if (concept.getId().equals(id)) {
				concept.setDefined(!concept.isDefined());
				
				return;
			}
		}
		
		if (null != expression.getUngroupedRelationships()) {
			for (Relationship relationship : expression.getUngroupedRelationships().getRelationships()) {
				if (relationship.getDestination().getId().equals(id)) {
					relationship.getDestination().setDefined(!relationship.getDestination().isDefined());
					
					return;
				} else if (relationship.getId().equals(id)) {
					relationship.setDefined(!relationship.isDefined());
					
					return;
				}
			}
		}
		
		for (RelationshipGroup relationshipGroup : expression.getGroupedRelationships()) {
			for (Relationship relationship : relationshipGroup.getRelationships()) {
				if (relationship.getDestination().getId().equals(id)) {
					relationship.getDestination().setDefined(!relationship.getDestination().isDefined());
					
					return;
				} else if (relationship.getId().equals(id)) {
					relationship.setDefined(!relationship.isDefined());
					
					return;
				}
			}
		}
	}

	/**
	 * Deletes an element from the expression.
	 * 
	 * @param id the id of the expression element.
	 * @param expression the expression from the element will be deleted.
	 */
	public void deleteDiagramElement(final String id, Expression expression) {
		if (null != expression.getIsaRelationships()) {
			for (Concept concept : expression.getIsaRelationships().getRelationships()) {
				if (concept.getId().equals(id)) {
					expression.getIsaRelationships().getRelationships().remove(concept);
					
					return;
				}
			}
		}
		
		if (null != expression.getUngroupedRelationships()) {
			for (Relationship relationship : expression.getUngroupedRelationships().getRelationships()) {
				if (relationship.getDestination().getId().equals(id) || relationship.getId().equals(id)) {
					expression.getUngroupedRelationships().getRelationships().remove(relationship);
					
					return;
				}
			}
		}
		
		if (null != expression.getGroupedRelationships()) {
			for (RelationshipGroup relationshipGroup : expression.getGroupedRelationships()) {
				for (Relationship relationship : relationshipGroup.getRelationships()) {
					if (relationship.getDestination().getId().equals(id) || relationship.getId().equals(id)) {
						relationshipGroup.getRelationships().remove(relationship);
						
						if (0 == relationshipGroup.getRelationships().size()) {
							expression.getGroupedRelationships().remove(relationshipGroup);
						}
						
						return;
					}
				}
			}
		}
	}
	
	/**
	 * Increases the rate of the zoom.
	 */
	public void increaseZoom() {
		if (zoom < 150) {
			zoom += 5;
		}
	}
	
	/**
	 * Decreases the rate of the zoom.
	 */
	public void decreaseZoom() {
		if (zoom > 70) {
			zoom -= 5;
		}
	}
	
	/**
	 * Changes the diagram type.
	 */
	public void changeDiagramType() {
		if (diagramType == DiagramType.DEFINITION) {
			diagramType = DiagramType.EXPRESSION;
		} else {
			diagramType = DiagramType.DEFINITION;
		}
	}
	
	private void createConceptElement(Expression expression) {
		// we draw the main concept only if the diagram type is definition
		if (diagramType == DiagramType.DEFINITION) {
			Concept concept = expression.getConcept();
			diagramElements.add(new VisualizationDiagramElement(true, concept.isDefined(), concept.getId(), concept.getTerm(), VisualizationComponentType.CONCEPT, new Rectangle(5, 5, zoom * 2, zoom / 2), zoom));
		}
		
		// if there are other elements, draw the based elements
		if ((null != expression.getIsaRelationships() && expression.getIsaRelationships().getRelationships().size() > 0) || 
				(null != expression.getGroupedRelationships() && expression.getGroupedRelationships().size() > 0) || 
				(null != expression.getUngroupedRelationships() && expression.getUngroupedRelationships().getRelationships().size() > 0)) {
			if (diagramType == DiagramType.DEFINITION) {
				diagramElements.add(new VisualizationDiagramElement(false, false, null, null, VisualizationComponentType.GROUP, new Rectangle((int) (zoom * 0.6), (int) (zoom * 0.75), (int) (zoom / 2.5),
						(int) (zoom / 2.5)), zoom));
				diagramElements.add(new VisualizationDiagramElement(false, false, null, null, VisualizationComponentType.CONJUCTION, new Rectangle((int) (zoom * 1.5), (int) (zoom * depth / 100 + zoom * 0.25 - 5), 10,
						10), zoom));
				
				addNewConnection(null, zoom / 5, (int) (zoom * 0.55), zoom / 5, (int) (zoom * 0.95));
				addNewConnection(ConnectionType.REGULAR, zoom / 5, (int) (zoom * 0.95), (int) (zoom * 0.6), (int) (zoom * 0.95));
				addNewConnection(ConnectionType.REGULAR, (int) (zoom * 0.6) + zoom / 5 * 2, (int) (zoom * 0.95), (int) (zoom * 1.5), (int) (zoom * 0.95));
				addNewConnection(null, (int) (zoom * 1.5), (int) (zoom * 0.95), zoom * 2, (int) (zoom * 0.95));
			} else {
				diagramElements.add(new VisualizationDiagramElement(false, false, null, null, VisualizationComponentType.CONJUCTION, 
						new Rectangle((int) (zoom * 0.5), (int) (zoom * depth / 100 + zoom * 0.25 - 5), 10,	10), zoom));
				
				addNewConnection(null, (int) (zoom * 0.5), zoom * depth / 100 + (int)(zoom * 0.25), zoom, zoom * depth / 100 + (int)(zoom * 0.25));
			}
		}
	}

	private void createIsaConceptElements(Expression expression) {
		int x = 0;
		int y = 0;

		for (Concept concept : expression.getIsaRelationships().getRelationships()) {
			if (diagramType == DiagramType.DEFINITION) {
				x = (int) (zoom * 2.5);
				y = zoom * depth / 100;
			} else {
				x = (int) (zoom * 1.5);
				y = zoom * depth / 100;
			}

			diagramElements.add(new VisualizationDiagramElement(false, concept.isDefined(), concept.getId(), concept.getTerm(), VisualizationComponentType.CONCEPT, new Rectangle(x, y, zoom * 2, zoom / 2), zoom));

			if (diagramType == DiagramType.DEFINITION) {
				addNewConnection(ConnectionType.ISA, zoom * 2, y + (int) (zoom * 0.25), x, y + (int) (zoom * 0.25));
			} else {
				addNewConnection(ConnectionType.ISA, zoom, y + (int) (zoom * 0.25), x, y + (int) (zoom * 0.25));
			}
			
			depth += 70;
		}

		/*
		 * if the are no more relationships, we draw the vertical connection 
		 */
		if (!expression.getIsaRelationships().getRelationships().isEmpty() && expression.getGroupedRelationships().isEmpty()
				&& (null == expression.getUngroupedRelationships() || expression.getUngroupedRelationships().getRelationships().isEmpty())) {
			if (diagramType == DiagramType.DEFINITION) {
				addNewConnection(null, zoom * 2, (int) (zoom * 0.95), zoom * 2, y + (int) (zoom * 0.25));
			} else {
				addNewConnection(null, zoom, (int) (zoom * 0.3), zoom, y + (int) (zoom * 0.25));
			}
		}
	}

	private void createGroupedRelationshipElements(Expression expression) {
		int y = 0;
		int xGroup = 0;
		int yStart = 0;
		int xType;
		int xDestination;

		for (RelationshipGroup relationshipGroup : expression.getGroupedRelationships()) {
			if (diagramType == DiagramType.DEFINITION) {
				xGroup = (int) (zoom * 2.5);
			} else {
				xGroup = (int) (zoom * 1.5);
			}
			
			y = zoom * depth / 100;
			yStart = y + zoom / 4;

			diagramElements.add(new VisualizationDiagramElement(false, false, null, null, VisualizationComponentType.GROUP, new Rectangle(xGroup, y + zoom / 20, (int) (zoom / 2.5), (int) (zoom / 2.5)), zoom));

			if (diagramType == DiagramType.DEFINITION) {
				addNewConnection(ConnectionType.REGULAR, zoom * 2, y + zoom / 4, xGroup, y + zoom / 4);
				addNewConnection(null, zoom * 2 + (int)(zoom * 0.9), y + zoom / 4, zoom * 3, y + zoom / 4);
			} else {
				addNewConnection(ConnectionType.REGULAR, zoom, y + zoom / 4, xGroup, y + zoom / 4);
				addNewConnection(null, zoom + (int)(zoom * 0.9), y + zoom / 4, zoom * 2, y + zoom / 4);
			}

			for (Relationship relationship : relationshipGroup.getRelationships()) {
				if (diagramType == DiagramType.DEFINITION) {
					xType = (int) (zoom * 3.5);
					xDestination = zoom * 6;
				} else {
					xType = (int) (zoom * 2.5);
					xDestination = zoom * 5;
				}

				y = zoom * depth / 100;

				diagramElements.add(new VisualizationDiagramElement(false, relationship.isDefined(), relationship.getId(), relationship.getType().getTerm(), VisualizationComponentType.RELATIONSHIP, new Rectangle(
						xType, y, zoom * 2, zoom / 2), zoom));
				diagramElements.add(new VisualizationDiagramElement(false, relationship.getDestination().isDefined(), relationship.getDestination().getId(), relationship.getDestination().getTerm(),
						VisualizationComponentType.CONCEPT, new Rectangle(xDestination, y, zoom * 2, zoom / 2), zoom));

				if (diagramType == DiagramType.DEFINITION) {
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
		if ((null == expression.getUngroupedRelationships() || expression.getUngroupedRelationships().getRelationships().isEmpty()) && !expression.getGroupedRelationships().isEmpty()) {
			if (diagramType == DiagramType.DEFINITION) {
				addNewConnection(null, zoom * 2, (int) (zoom * 0.95), zoom * 2, yStart);
			} else {
				addNewConnection(null, zoom, (int) (zoom * 0.3), zoom, yStart);
			}
		}
	}

	private void createUngroupedRelationshipElements(Expression expression) {
		int xType;
		int xDestination;
		int y = 0;

		if (null != expression.getUngroupedRelationships()) {
			for (Relationship relationship : expression.getUngroupedRelationships().getRelationships()) {
				if (diagramType == DiagramType.DEFINITION) {
					xType = (int) (zoom * 2.5);
					xDestination = zoom * 5;
				} else {
					xType = (int) (zoom * 1.5);
					xDestination = zoom * 4;
				}
				
				y = zoom * depth / 100;
				
				diagramElements.add(new VisualizationDiagramElement(false, relationship.isDefined(), relationship.getId(), relationship.getType().getTerm(), VisualizationComponentType.RELATIONSHIP, new Rectangle(
						xType, y, zoom * 2, zoom / 2), zoom));
				diagramElements.add(new VisualizationDiagramElement(false, relationship.getDestination().isDefined(), relationship.getDestination().getId(), relationship.getDestination().getTerm(),
						VisualizationComponentType.CONCEPT, new Rectangle(xDestination, y, zoom * 2, zoom / 2), zoom));
				
				
				if (diagramType == DiagramType.DEFINITION) {
					addNewConnection(ConnectionType.REGULAR, zoom * 2, y + zoom / 4, xType, y + zoom / 4);
					addNewConnection(ConnectionType.REGULAR, (int) (zoom * 4.5), y + zoom / 4, xDestination, y + zoom / 4);
				} else {
					addNewConnection(ConnectionType.REGULAR, zoom, y + zoom / 4, xType, y + zoom / 4);
					addNewConnection(ConnectionType.REGULAR, (int) (zoom * 3.5), y + zoom / 4, xDestination, y + zoom / 4);
				}
				
				depth += 70;
			}
			
			/*
			 * we draw the vertical connection 
			 */
			if (!expression.getUngroupedRelationships().getRelationships().isEmpty()) {
				if (diagramType == DiagramType.DEFINITION) {
					addNewConnection(null, zoom * 2, (int) (zoom * 0.95), zoom * 2, y + zoom / 4);
				} else {
					addNewConnection(null, zoom, (int) (zoom * 0.3), zoom, y + zoom / 4);
				}
			}
		}
	}

	private void addNewConnection(ConnectionType connectionType, int beginX, int beginY, int endX, int endY) {
		diagramConnections.add(new VisualizationConnection(connectionType, beginX, beginY, endX, endY));
	}
}
