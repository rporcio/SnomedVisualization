package snomed.visualization.vaadin.example;

import snomed.visualization.dsl.visualizationDsl.Concept;
import snomed.visualization.dsl.visualizationDsl.Expression;
import snomed.visualization.dsl.visualizationDsl.Relationship;
import snomed.visualization.dsl.visualizationDsl.RelationshipGroup;
import snomed.visualization.dsl.visualizationDsl.VisualizationDslFactory;

public class TetralogyOfFallotExample {

	public static Expression createTetralogyOfFallotExample() {
		Expression expression = VisualizationDslFactory.eINSTANCE.createExpression();
		expression.setIsaRelationships(VisualizationDslFactory.eINSTANCE.createIsaRelationships());
		expression.setUngroupedRelationships(VisualizationDslFactory.eINSTANCE.createRelationships());

		Concept concept = VisualizationDslFactory.eINSTANCE.createConcept();
		concept.setId("86299006");
		concept.setTerm("Tetralogy of Fallot");
		concept.setDefined(false);
		expression.setConcept(concept);

		concept = VisualizationDslFactory.eINSTANCE.createConcept();
		concept.setId("253511007");
		concept.setTerm("Congenital abnormality of ventricles and ventricular septum");
		concept.setDefined(false);
		expression.getIsaRelationships().getRelationships().add(concept);

		concept = VisualizationDslFactory.eINSTANCE.createConcept();
		concept.setId("429353004");
		concept.setTerm("Injury of radius");
		concept.setDefined(true);
		expression.getIsaRelationships().getRelationships().add(concept);
		
		concept = VisualizationDslFactory.eINSTANCE.createConcept();
		concept.setId("30288003");
		concept.setTerm("Ventricular septal defect");
		concept.setDefined(true);
		expression.getIsaRelationships().getRelationships().add(concept);
		
		concept = VisualizationDslFactory.eINSTANCE.createConcept();
		concept.setId("56786000");
		concept.setTerm("Pulmonic valve stenosis");
		concept.setDefined(true);
		expression.getIsaRelationships().getRelationships().add(concept);
		
		concept = VisualizationDslFactory.eINSTANCE.createConcept();
		concept.setId("63934006");
		concept.setTerm("Overriding aorta");
		concept.setDefined(true);
		expression.getIsaRelationships().getRelationships().add(concept);
		
		concept = VisualizationDslFactory.eINSTANCE.createConcept();
		concept.setId("89792004");
		concept.setTerm("Right ventricular hypertrophy");
		concept.setDefined(true);
		expression.getIsaRelationships().getRelationships().add(concept);

		
		Relationship relationship = VisualizationDslFactory.eINSTANCE.createRelationship();

		concept = VisualizationDslFactory.eINSTANCE.createConcept();
		concept.setId("246454002");
		concept.setTerm("Occurrence");
		concept.setDefined(false);
		relationship.setType(concept);

		concept = VisualizationDslFactory.eINSTANCE.createConcept();
		concept.setId("255399007");
		concept.setTerm("Congenital");
		concept.setDefined(false);
		relationship.setDestination(concept);
		relationship.setDefined(true);
		relationship.setGroup(0);
		relationship.setId("0");
		expression.getUngroupedRelationships().getRelationships().add(relationship);

		relationship = VisualizationDslFactory.eINSTANCE.createRelationship();

		// Relationship group
		RelationshipGroup relationshipGroup = VisualizationDslFactory.eINSTANCE.createRelationshipGroup();
		relationship = VisualizationDslFactory.eINSTANCE.createRelationship();

		concept = VisualizationDslFactory.eINSTANCE.createConcept();
		concept.setId("116676008");
		concept.setTerm("Associated morphology");
		concept.setDefined(false);
		relationship.setType(concept);

		concept = VisualizationDslFactory.eINSTANCE.createConcept();
		concept.setId("107656002");
		concept.setTerm("Congenital anomaly");
		concept.setDefined(false);
		relationship.setDestination(concept);
		relationship.setDefined(true);
		relationship.setGroup(0);
		relationship.setId("1");

		relationshipGroup.getRelationships().add(relationship);

		relationship = VisualizationDslFactory.eINSTANCE.createRelationship();

		concept = VisualizationDslFactory.eINSTANCE.createConcept();
		concept.setId("363698007");
		concept.setTerm("Finding site");
		concept.setDefined(false);
		relationship.setType(concept);

		concept = VisualizationDslFactory.eINSTANCE.createConcept();
		concept.setId("21814001");
		concept.setTerm("Cardiac ventricular structure");
		concept.setDefined(false);
		relationship.setDestination(concept);
		relationship.setDefined(true);
		relationship.setGroup(0);
		relationship.setId("2");
		
		relationshipGroup.getRelationships().add(relationship);

		expression.getGroupedRelationships().add(relationshipGroup);
		
		relationshipGroup = VisualizationDslFactory.eINSTANCE.createRelationshipGroup();
		relationship = VisualizationDslFactory.eINSTANCE.createRelationship();

		concept = VisualizationDslFactory.eINSTANCE.createConcept();
		concept.setId("116676008");
		concept.setTerm("Associated morphology");
		concept.setDefined(false);
		relationship.setType(concept);

		concept = VisualizationDslFactory.eINSTANCE.createConcept();
		concept.setId("6920004");
		concept.setTerm("Defect");
		concept.setDefined(false);
		relationship.setDestination(concept);
		relationship.setDefined(true);
		relationship.setGroup(0);
		relationship.setId("3");

		relationshipGroup.getRelationships().add(relationship);

		relationship = VisualizationDslFactory.eINSTANCE.createRelationship();

		concept = VisualizationDslFactory.eINSTANCE.createConcept();
		concept.setId("363698007");
		concept.setTerm("Finding site");
		concept.setDefined(false);
		relationship.setType(concept);

		concept = VisualizationDslFactory.eINSTANCE.createConcept();
		concept.setId("589001");
		concept.setTerm("Interventricular septum structure");
		concept.setDefined(false);
		relationship.setDestination(concept);
		relationship.setDefined(true);
		relationship.setGroup(0);
		relationship.setId("4");
		
		relationshipGroup.getRelationships().add(relationship);

		expression.getGroupedRelationships().add(relationshipGroup);
		
		relationshipGroup = VisualizationDslFactory.eINSTANCE.createRelationshipGroup();
		relationship = VisualizationDslFactory.eINSTANCE.createRelationship();

		concept = VisualizationDslFactory.eINSTANCE.createConcept();
		concept.setId("116676008");
		concept.setTerm("Associated morphology");
		concept.setDefined(false);
		relationship.setType(concept);

		concept = VisualizationDslFactory.eINSTANCE.createConcept();
		concept.setId("415582006");
		concept.setTerm("Stenosis");
		concept.setDefined(false);
		relationship.setDestination(concept);
		relationship.setDefined(true);
		relationship.setGroup(0);
		relationship.setId("5");

		relationshipGroup.getRelationships().add(relationship);

		relationship = VisualizationDslFactory.eINSTANCE.createRelationship();

		concept = VisualizationDslFactory.eINSTANCE.createConcept();
		concept.setId("363698007");
		concept.setTerm("Finding site");
		concept.setDefined(false);
		relationship.setType(concept);

		concept = VisualizationDslFactory.eINSTANCE.createConcept();
		concept.setId("39057004");
		concept.setTerm("Pulmonary valve structure");
		concept.setDefined(false);
		relationship.setDestination(concept);
		relationship.setDefined(true);
		relationship.setGroup(0);
		relationship.setId("6");
		
		relationshipGroup.getRelationships().add(relationship);

		expression.getGroupedRelationships().add(relationshipGroup);
		
		relationshipGroup = VisualizationDslFactory.eINSTANCE.createRelationshipGroup();
		relationship = VisualizationDslFactory.eINSTANCE.createRelationship();

		concept = VisualizationDslFactory.eINSTANCE.createConcept();
		concept.setId("116676008");
		concept.setTerm("Associated morphology");
		concept.setDefined(false);
		relationship.setType(concept);

		concept = VisualizationDslFactory.eINSTANCE.createConcept();
		concept.setId("30812002");
		concept.setTerm("Overriding structures");
		concept.setDefined(false);
		relationship.setDestination(concept);
		relationship.setDefined(true);
		relationship.setGroup(0);
		relationship.setId("7");

		relationshipGroup.getRelationships().add(relationship);

		relationship = VisualizationDslFactory.eINSTANCE.createRelationship();

		concept = VisualizationDslFactory.eINSTANCE.createConcept();
		concept.setId("363698007");
		concept.setTerm("Finding site");
		concept.setDefined(false);
		relationship.setType(concept);

		concept = VisualizationDslFactory.eINSTANCE.createConcept();
		concept.setId("113262008");
		concept.setTerm("Thoracic aorta structure");
		concept.setDefined(false);
		relationship.setDestination(concept);
		relationship.setDefined(true);
		relationship.setGroup(0);
		relationship.setId("8");
		
		relationshipGroup.getRelationships().add(relationship);

		expression.getGroupedRelationships().add(relationshipGroup);
		
		relationshipGroup = VisualizationDslFactory.eINSTANCE.createRelationshipGroup();
		relationship = VisualizationDslFactory.eINSTANCE.createRelationship();

		concept = VisualizationDslFactory.eINSTANCE.createConcept();
		concept.setId("116676008");
		concept.setTerm("Associated morphology");
		concept.setDefined(false);
		relationship.setType(concept);

		concept = VisualizationDslFactory.eINSTANCE.createConcept();
		concept.setId("56246009");
		concept.setTerm("Hypertrophy");
		concept.setDefined(false);
		relationship.setDestination(concept);
		relationship.setDefined(true);
		relationship.setGroup(0);
		relationship.setId("9");

		relationshipGroup.getRelationships().add(relationship);

		relationship = VisualizationDslFactory.eINSTANCE.createRelationship();

		concept = VisualizationDslFactory.eINSTANCE.createConcept();
		concept.setId("363698007");
		concept.setTerm("Finding site");
		concept.setDefined(false);
		relationship.setType(concept);

		concept = VisualizationDslFactory.eINSTANCE.createConcept();
		concept.setId("244384009");
		concept.setTerm("Entire right ventricle");
		concept.setDefined(false);
		relationship.setDestination(concept);
		relationship.setDefined(true);
		relationship.setGroup(0);
		relationship.setId("10");
		
		relationshipGroup.getRelationships().add(relationship);

		expression.getGroupedRelationships().add(relationshipGroup);

		return expression;
	}
}
