package snomed.visualization.wizard;

import java.util.Random;

import org.eclipse.jface.wizard.Wizard;

import snomed.visualization.dsl.visualizationDsl.Expression;
import snomed.visualization.dsl.visualizationDsl.Relationship;
import snomed.visualization.dsl.visualizationDsl.RelationshipGroup;
import snomed.visualization.dsl.visualizationDsl.VisualizationDslFactory;

/**
 * Wizard class to create new relationship to the expression.
 * 
 * @author rporcio
 */
public class VisualizationRelationshipWizard extends Wizard {
	
	private Expression expression;
	private Relationship relationship;
	private VisualizationRelationshipWizardPage wizardPage;

	public VisualizationRelationshipWizard(Expression expression) {
		this.expression = expression;
		relationship = VisualizationDslFactory.eINSTANCE.createRelationship();
		relationship.setType(VisualizationDslFactory.eINSTANCE.createConcept());
		relationship.setDestination(VisualizationDslFactory.eINSTANCE.createConcept());
		
		setWindowTitle("Relationship wizard");
	}

	@Override
	public boolean performFinish() {
		
		if (wizardPage.isIsaRelationship()) {
			expression.getIsaRelationships().getRelationships().add(wizardPage.getRelationshipDestination());
		} else {
			relationship.setId(generateRandomItemIndentifier());
			relationship.setDefined(wizardPage.isRelationshipDefined());
			relationship.setType(wizardPage.getRelationshipType());
			relationship.setDestination(wizardPage.getRelationshipDestination());
			
			int group = wizardPage.getRelationshipGroup();
			
			if (0 == group) {
				expression.getStandaloneRelationships().getRelationships().add(relationship);
			} else if (1 == group) {
				RelationshipGroup relationshipGroup = VisualizationDslFactory.eINSTANCE.createRelationshipGroup();
				relationshipGroup.getRelationships().add(relationship);
				expression.getRelationshipGroups().add(relationshipGroup);
			} else {
				expression.getRelationshipGroups().get(group-2).getRelationships().add(getRelationship());
			}
		}
		
		return true;
	}
	
	@Override
	public void addPages() {
		wizardPage = new VisualizationRelationshipWizardPage("New relationship wizard");
		addPage(wizardPage);
	}

	public Expression getExpression() {
		return expression;
	}
	
	public Relationship getRelationship() {
		return relationship;
	}
	
	// TODO remove
	private String generateRandomItemIndentifier() {
		Random random = new Random();
		// nextInt excludes top value, add 1 to make it inclusive
		int randomNum = random.nextInt(99999999 - 100 + 1) + 100;
		return Integer.toString(randomNum);
	}
}
