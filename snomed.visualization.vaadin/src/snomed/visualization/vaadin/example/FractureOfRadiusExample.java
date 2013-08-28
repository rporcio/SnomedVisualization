package snomed.visualization.vaadin.example;

import java.util.Random;

import snomed.visualization.dsl.visualizationDsl.Concept;
import snomed.visualization.dsl.visualizationDsl.Expression;
import snomed.visualization.dsl.visualizationDsl.Relationship;
import snomed.visualization.dsl.visualizationDsl.RelationshipGroup;
import snomed.visualization.dsl.visualizationDsl.VisualizationDslFactory;

/**
 * Class to create the Fracture of radius expression for the application.
 * 
 * @author rporcio
 */
public class FractureOfRadiusExample {

	public static Expression createFactureOfRadiusExpression() {
		Expression expression = VisualizationDslFactory.eINSTANCE.createExpression();
		expression.setIsaRelationships(VisualizationDslFactory.eINSTANCE.createIsaRelationships());
		expression.setUngroupedRelationships(VisualizationDslFactory.eINSTANCE.createRelationships());

		Concept concept = VisualizationDslFactory.eINSTANCE.createConcept();
		concept.setId("12676007");
		concept.setTerm("Fracture of radius");
		concept.setDefined(true);
		expression.setConcept(concept);

		concept = VisualizationDslFactory.eINSTANCE.createConcept();
		concept.setId("65966004");
		concept.setTerm("Fracture of forearm");
		concept.setDefined(true);
		expression.getIsaRelationships().getRelationships().add(concept);

		concept = VisualizationDslFactory.eINSTANCE.createConcept();
		concept.setId("429353004");
		concept.setTerm("Injury of radius");
		concept.setDefined(true);
		expression.getIsaRelationships().getRelationships().add(concept);

		Relationship relationship = VisualizationDslFactory.eINSTANCE.createRelationship();

		concept = VisualizationDslFactory.eINSTANCE.createConcept();
		concept.setId("246112005");
		concept.setTerm("Severity");
		concept.setDefined(false);
		relationship.setType(concept);

		concept = VisualizationDslFactory.eINSTANCE.createConcept();
		concept.setId("272141005");
		concept.setTerm("Severities");
		concept.setDefined(false);
		relationship.setDestination(concept);
		relationship.setDefined(false);
		relationship.setGroup(0);
		relationship.setId(generateId());
		expression.getUngroupedRelationships().getRelationships().add(relationship);

		relationship = VisualizationDslFactory.eINSTANCE.createRelationship();

		concept = VisualizationDslFactory.eINSTANCE.createConcept();
		concept.setId("246456000");
		concept.setTerm("Episodicity");
		concept.setDefined(false);
		relationship.setType(concept);

		concept = VisualizationDslFactory.eINSTANCE.createConcept();
		concept.setId("288526004");
		concept.setTerm("Episodicities");
		concept.setDefined(false);
		relationship.setDestination(concept);
		relationship.setDefined(false);
		relationship.setGroup(0);
		relationship.setId(generateId());
		expression.getUngroupedRelationships().getRelationships().add(relationship);

		relationship = VisualizationDslFactory.eINSTANCE.createRelationship();

		concept = VisualizationDslFactory.eINSTANCE.createConcept();
		concept.setId("263502005");
		concept.setTerm("Clinical course");
		concept.setDefined(false);
		relationship.setType(concept);

		concept = VisualizationDslFactory.eINSTANCE.createConcept();
		concept.setId("288524001");
		concept.setTerm("Courses");
		concept.setDefined(false);
		relationship.setDestination(concept);
		relationship.setDefined(false);
		relationship.setGroup(0);
		relationship.setId(generateId());
		expression.getUngroupedRelationships().getRelationships().add(relationship);

		// Relationship group
		RelationshipGroup relationshipGroup = VisualizationDslFactory.eINSTANCE.createRelationshipGroup();
		relationship = VisualizationDslFactory.eINSTANCE.createRelationship();

		concept = VisualizationDslFactory.eINSTANCE.createConcept();
		concept.setId("116676008");
		concept.setTerm("Associated morphology");
		concept.setDefined(false);
		relationship.setType(concept);

		concept = VisualizationDslFactory.eINSTANCE.createConcept();
		concept.setId("72704001");
		concept.setTerm("Fracture");
		concept.setDefined(false);
		relationship.setDestination(concept);
		relationship.setDefined(true);
		relationship.setGroup(0);
		relationship.setId(generateId());

		relationshipGroup.getRelationships().add(relationship);

		relationship = VisualizationDslFactory.eINSTANCE.createRelationship();

		concept = VisualizationDslFactory.eINSTANCE.createConcept();
		concept.setId("363698007");
		concept.setTerm("Finding site");
		concept.setDefined(false);
		relationship.setType(concept);

		concept = VisualizationDslFactory.eINSTANCE.createConcept();
		concept.setId("62413002");
		concept.setTerm("Bone structure of radius");
		concept.setDefined(false);
		relationship.setDestination(concept);
		relationship.setDefined(true);
		relationship.setGroup(0);
		relationship.setId(generateId());

		relationshipGroup.getRelationships().add(relationship);

		expression.getGroupedRelationships().add(relationshipGroup);

		return expression;
	}
	
	// TODO remove
	private static String generateId() {
		Random random = new Random();
		// nextInt excludes top value, add 1 to make it inclusive
		int randomNum = random.nextInt(99999999 - 100 + 1) + 100;
		return Integer.toString(randomNum);
	}
}
