package snomed.visualization.vaadin.wizard;

import java.util.Random;

import snomed.visualization.dsl.visualizationDsl.Concept;
import snomed.visualization.dsl.visualizationDsl.Expression;
import snomed.visualization.dsl.visualizationDsl.Relationship;
import snomed.visualization.dsl.visualizationDsl.RelationshipGroup;
import snomed.visualization.dsl.visualizationDsl.VisualizationDslFactory;

import com.vaadin.data.Item;
import com.vaadin.data.fieldgroup.FieldGroup.CommitEvent;
import com.vaadin.data.fieldgroup.FieldGroup.CommitException;
import com.vaadin.data.fieldgroup.FieldGroup.CommitHandler;

/**
 * Commit handler to handle the new relationship commit whcih comes from the wizard.
 * 
 * @author rporcio
 */
public class VisualizationRelationshipWizardCommitHandler implements CommitHandler {

		private static final long serialVersionUID = -7255938137665580357L;
		private VisualizationRelationshipWizard visualizationRelationshipWizard;

		public VisualizationRelationshipWizardCommitHandler(VisualizationRelationshipWizard visualizationRelationshipWizard) {
			this.visualizationRelationshipWizard = visualizationRelationshipWizard;
		}

		@Override
		public void preCommit(CommitEvent commitEvent) throws CommitException {
			if (!isValid()) {
				throw new CommitException();
			}
		}

		@Override
		public void postCommit(CommitEvent commitEvent) throws CommitException {
			Item item = commitEvent.getFieldBinder().getItemDataSource();
			
			boolean relationshipDefiend = (Boolean) item.getItemProperty("defined").getValue();
			Concept type = (Concept) item.getItemProperty("type").getValue();
			int group = (Integer) item.getItemProperty("group").getValue();
			boolean destinationDefined = (Boolean) item.getItemProperty("destination.defined").getValue();
			String destinationId = (String) item.getItemProperty("destination.id").getValue();
			String destinationTerm = (String) item.getItemProperty("destination.term").getValue();
			
			Expression expression = visualizationRelationshipWizard.getVisualizationView().getExpression();

			if (type.getId().equals("116680003")) {
				Concept destinationConcept = VisualizationDslFactory.eINSTANCE.createConcept();
				destinationConcept.setDefined(destinationDefined);
				destinationConcept.setId(destinationId);
				destinationConcept.setTerm(destinationTerm);
				
				expression.getIsaRelationships().getRelationships().add(destinationConcept);
			} else {
				Concept typeConcept = VisualizationDslFactory.eINSTANCE.createConcept();
				typeConcept.setDefined(type.isDefined());
				typeConcept.setId(type.getId());
				typeConcept.setTerm(type.getTerm());
				
				Concept destinationConcept = VisualizationDslFactory.eINSTANCE.createConcept();
				destinationConcept.setDefined(destinationDefined);
				destinationConcept.setId(destinationId);
				destinationConcept.setTerm(destinationTerm);

				Relationship relationship = VisualizationDslFactory.eINSTANCE.createRelationship();
				relationship.setDefined(relationshipDefiend);
				relationship.setType(typeConcept);
				relationship.setDestination(destinationConcept);
				
				//TODO
				relationship.setGroup(0);
				relationship.setId(generateRandomItemIndentifier());
				
				if (group == -1) {
					expression.getUngroupedRelationships().getRelationships().add(relationship);
				} else  if (group == -2) {
					RelationshipGroup relationshipGroup = VisualizationDslFactory.eINSTANCE.createRelationshipGroup();
					relationshipGroup.getRelationships().add(relationship);
					expression.getGroupedRelationships().add(relationshipGroup);
				} else {
					expression.getGroupedRelationships().get(group).getRelationships().add(relationship);
				}
				
			}
		}
		
		private boolean isValid() {
			if (!visualizationRelationshipWizard.getDefined().isValid()) {
				return false;
			}
			
			if (!visualizationRelationshipWizard.getRelationshipType().isValid()) {
				return false;
			}
			
			if (!visualizationRelationshipWizard.getRelationshipGroup().isValid()) {
				return false;
			}
			
			if (!visualizationRelationshipWizard.getDestinationDefined().isValid()) {
				return false;
			}
			
			if (!visualizationRelationshipWizard.getDestinationId().isValid()) {
				return false;
			}
			
			if (!visualizationRelationshipWizard.getDestinationTerm().isValid()) {
				return false;
			}
			
			return true;
		}
		
		// TODO remove
		private String generateRandomItemIndentifier() {
			Random random = new Random();
			// nextInt excludes top value, add 1 to make it inclusive
			int randomNum = random.nextInt(99999999 - 100 + 1) + 100;
			return Integer.toString(randomNum);
		}
		
	}