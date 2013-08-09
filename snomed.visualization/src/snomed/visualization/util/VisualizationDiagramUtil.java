package snomed.visualization.util;

import java.util.List;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Color;

import snomed.visualization.dsl.visualizationDsl.Concept;
import snomed.visualization.dsl.visualizationDsl.Expression;
import snomed.visualization.dsl.visualizationDsl.Relationship;
import snomed.visualization.dsl.visualizationDsl.RelationshipGroup;
import snomed.visualization.model.VisualizationConnectionCoordinate;
import snomed.visualization.model.VisualizationDiagramConnection;
import snomed.visualization.model.VisualizationDiagramElement;
import snomed.visualization.model.VisualizationConnectionCoordinate.ConnectionType;
import snomed.visualization.model.VisualizationDiagramElement.VisualizationComponentType;

import com.google.common.collect.Lists;

public class VisualizationDiagramUtil {
	
	private int zoom;
	private int depth;

	private List<VisualizationConnectionCoordinate> connectionCoordinates;
	private List<Object> elements;
	
	public static Color getColor(int red, int green, int blue) {
		return new Color(org.eclipse.swt.widgets.Display.getDefault(), red, green, blue);
	}

	public List<?> createDiagramElements(Expression expression) {
		zoom = 100;
		depth = 70;

		elements = Lists.newArrayList();
		connectionCoordinates = Lists.newArrayList();

		createConceptElement(expression);
		createIsaConceptElements(expression);
		createGroupedRelationshipElements(expression);
		createUngroupedRelationshipElements(expression);

		elements.add(0, new VisualizationDiagramConnection(zoom, new Rectangle(0, 0, zoom * 8, zoom * depth / 100), connectionCoordinates));

		return elements;
	}
	
	public void changeCharacteristicType(final String id, Expression expression) {
		if (expression.getConcept().getId().equals(id)) {
			expression.getConcept().setDefined(expression.getConcept().isDefined());
		}
		
		for (Concept concept : expression.getIsaRelationships().getRelationships()) {
			if (concept.getId().equals(id)) {
				concept.setDefined(!concept.isDefined());
			}
		}
		
		for (Relationship relationship : expression.getStandaloneRelationships().getRelationships()) {
			if (relationship.getDestination().getId().equals(id)) {
				relationship.getDestination().setDefined(!relationship.getDestination().isDefined());
			} else if (relationship.getId().equals(id)) {
				relationship.setDefined(!relationship.isDefined());
			}
		}
		
		for (RelationshipGroup relationshipGroup : expression.getRelationshipGroups()) {
			for (Relationship relationship : relationshipGroup.getRelationships()) {
				if (relationship.getDestination().getId().equals(id)) {
					relationship.getDestination().setDefined(!relationship.getDestination().isDefined());
				} else if (relationship.getId().equals(id)) {
					relationship.setDefined(!relationship.isDefined());
				}
			}
		}
	}

	public void deleteDiagramElement(final String id, Expression expression) {
		if (expression.getConcept().getId().equals(id)) {
			// TODO cannot delete
		}
		
		for (Concept concept : expression.getIsaRelationships().getRelationships()) {
			if (concept.getId().equals(id)) {
				expression.getIsaRelationships().getRelationships().remove(concept);
				
				return;
			}
		}
		
		for (Relationship relationship : expression.getStandaloneRelationships().getRelationships()) {
			if (relationship.getDestination().getId().equals(id) || relationship.getId().equals(id)) {
				expression.getStandaloneRelationships().getRelationships().remove(relationship);
				
				return;
			}
		}
		
		for (RelationshipGroup relationshipGroup : expression.getRelationshipGroups()) {
			for (Relationship relationship : relationshipGroup.getRelationships()) {
				if (relationship.getDestination().getId().equals(id) || relationship.getId().equals(id)) {
					relationshipGroup.getRelationships().remove(relationship);
					
					if (0 == relationshipGroup.getRelationships().size()) {
						expression.getRelationshipGroups().remove(relationshipGroup);
					}
					
					return;
				}
			}
		}
	}
	
	private void createConceptElement(Expression expression) {
		Concept concept = expression.getConcept();
		elements.add(new VisualizationDiagramElement(concept.isDefined(), concept.getId(), concept.getTerm(), VisualizationComponentType.CONCEPT, new Rectangle(5, 5, zoom * 2, zoom / 2), zoom));

		if (expression.getIsaRelationships().getRelationships().size() > 0 || expression.getRelationshipGroups().size() > 0 || expression.getStandaloneRelationships().getRelationships().size() > 0) {
			elements.add(new VisualizationDiagramElement(false, null, null, VisualizationComponentType.GROUP, new Rectangle((int) (zoom * 0.6), (int) (zoom * 0.75), (int) (zoom / 2.5),
					(int) (zoom / 2.5)), zoom));

			elements.add(new VisualizationDiagramElement(false, null, null, VisualizationComponentType.CONJUCTION, new Rectangle((int) (zoom * 1.5), (int) (zoom * depth / 100 + zoom * 0.25 - 5), 10,
					10), zoom));

			addNewConnection(null, zoom / 5, (int) (zoom * 0.55), zoom / 5, (int) (zoom * 0.95));
			addNewConnection(ConnectionType.REGULAR, zoom / 5, (int) (zoom * 0.95), (int) (zoom * 0.6), (int) (zoom * 0.95));
			addNewConnection(ConnectionType.REGULAR, (int) (zoom * 0.6) + zoom / 5 * 2, (int) (zoom * 0.95), (int) (zoom * 1.5), (int) (zoom * 0.95));
			addNewConnection(null, (int) (zoom * 1.5), (int) (zoom * 0.95), zoom * 2, (int) (zoom * 0.95));
		}

	}

	private void createIsaConceptElements(Expression expression) {
		int x = 0;
		int y = 0;

		for (Concept concept : expression.getIsaRelationships().getRelationships()) {
			x = (int) (zoom * 2.5);
			y = zoom * depth / 100;

			elements.add(new VisualizationDiagramElement(concept.isDefined(), concept.getId(), concept.getTerm(), VisualizationComponentType.CONCEPT, new Rectangle(x, y, zoom * 2, zoom / 2), zoom));

			addNewConnection(ConnectionType.ISA, zoom * 2, y + (int) (zoom * 0.25), x, y + (int) (zoom * 0.25));

			depth += 70;
		}

		if (!expression.getIsaRelationships().getRelationships().isEmpty() && expression.getRelationshipGroups().isEmpty()
				&& (null == expression.getStandaloneRelationships() || expression.getStandaloneRelationships().getRelationships().isEmpty())) {
			addNewConnection(null, zoom * 2, (int) (zoom * 0.95), zoom * 2, y + (int) (zoom * 0.25));
		}
	}

	private void createGroupedRelationshipElements(Expression expression) {
		int y = 0;
		int xGroup = 0;
		int yStart = 0;
		int xType;
		int xDestination;

		for (RelationshipGroup relationshipGroup : expression.getRelationshipGroups()) {
			xGroup = (int) (zoom * 2.5);
			y = zoom * depth / 100;
			yStart = y + zoom / 4;

			elements.add(new VisualizationDiagramElement(false, null, null, VisualizationComponentType.GROUP, new Rectangle(xGroup, y + zoom / 20, (int) (zoom / 2.5), (int) (zoom / 2.5)), zoom));

			addNewConnection(ConnectionType.REGULAR, zoom * 2, y + zoom / 4, xGroup, y + zoom / 4);
			addNewConnection(null, zoom * 2 + (int) (zoom * 0.9), y + zoom / 4, zoom * 3, y + zoom / 4);

			for (Relationship relationship : relationshipGroup.getRelationships()) {
				xType = (int) (zoom * 3.5);
				xDestination = zoom * 6;
				y = zoom * depth / 100;

				elements.add(new VisualizationDiagramElement(relationship.isDefined(), relationship.getId(), relationship.getType().getTerm(), VisualizationComponentType.RELATIONSHIP, new Rectangle(
						xType, y, zoom * 2, zoom / 2), zoom));
				elements.add(new VisualizationDiagramElement(relationship.getDestination().isDefined(), relationship.getDestination().getId(), relationship.getDestination().getTerm(),
						VisualizationComponentType.CONCEPT, new Rectangle(xDestination, y, zoom * 2, zoom / 2), zoom));

				addNewConnection(ConnectionType.REGULAR, zoom * 3, y + zoom / 4, xType, y + zoom / 4);
				addNewConnection(ConnectionType.REGULAR, (int) (zoom * 5.5), y + zoom / 4, xDestination, y + zoom / 4);
				addNewConnection(null, zoom * 3, yStart, zoom * 3, y + zoom / 4);

				depth += 70;
			}
		}

		if ((null == expression.getStandaloneRelationships() || expression.getStandaloneRelationships().getRelationships().isEmpty()) && !expression.getRelationshipGroups().isEmpty()) {
			addNewConnection(null, zoom * 2, (int) (zoom * 0.95), zoom * 2, yStart);
		}
	}

	private void createUngroupedRelationshipElements(Expression expression) {
		int xType;
		int xDestination;
		int y = 0;

		if (null != expression.getStandaloneRelationships()) {
			for (Relationship relationship : expression.getStandaloneRelationships().getRelationships()) {
				xType = (int) (zoom * 2.5);
				xDestination = zoom * 5;
				y = zoom * depth / 100;
				
				elements.add(new VisualizationDiagramElement(relationship.isDefined(), relationship.getId(), relationship.getType().getTerm(), VisualizationComponentType.RELATIONSHIP, new Rectangle(
						xType, y, zoom * 2, zoom / 2), zoom));
				elements.add(new VisualizationDiagramElement(relationship.getDestination().isDefined(), relationship.getDestination().getId(), relationship.getDestination().getTerm(),
						VisualizationComponentType.CONCEPT, new Rectangle(xDestination, y, zoom * 2, zoom / 2), zoom));
				
				addNewConnection(ConnectionType.REGULAR, zoom * 2, y + zoom / 4, xType, y + zoom / 4);
				addNewConnection(ConnectionType.REGULAR, (int) (zoom * 4.5), y + zoom / 4, xDestination, y + zoom / 4);
				
				depth += 70;
			}
			
			if (!expression.getStandaloneRelationships().getRelationships().isEmpty()) {
				addNewConnection(null, zoom * 2, (int) (zoom * 0.95), zoom * 2, y + zoom / 4);
			}
		}
	}

	private void addNewConnection(ConnectionType connectionType, int beginX, int beginY, int endX, int endY) {
		connectionCoordinates.add(new VisualizationConnectionCoordinate(connectionType, beginX, beginY, endX, endY));
	}
}