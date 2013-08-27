package snomed.visualization.dsl.validation;

import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;

import snomed.visualization.dsl.visualizationDsl.Concept;
import snomed.visualization.dsl.visualizationDsl.VisualizationDslPackage;

/**
 * 
 * @author rporcio
 */
public class VisualizationDslValidator extends AbstractVisualizationDslValidator {
	
	public static final String INVALID_CONCEPT_ID_LENGTH = "invalidConceptId";
	
	@Check(CheckType.FAST)
	public void checkConceptId(Concept concept) {
		if (null == concept || null == concept.getId()) {
			return;
		}
		
		if (concept.getId().length() < 6 || concept.getId().length() > 18) {
			error("ID lenght should be between 6 and 18 characters", VisualizationDslPackage.Literals.CONCEPT__ID, INVALID_CONCEPT_ID_LENGTH);
		}
	}
	
	// TODO add more validation check

}
