package snomed.visualization.wizard;

import java.util.regex.Pattern;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.beans.PojoObservables;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.databinding.validation.ValidationStatus;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.databinding.wizard.WizardPageSupport;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import snomed.visualization.dsl.visualizationDsl.Concept;
import snomed.visualization.dsl.visualizationDsl.Relationship;
import snomed.visualization.dsl.visualizationDsl.VisualizationDslFactory;

/**
 * 
 * @author rporcio
 */
public class VisualizationRelationshipWizardPage extends WizardPage {
	
	private Text destinationConceptIdText;
	private Text destinationConceptTermText;
	
	private Combo groupCombo;
	private Combo relationshipTypeCombo;
	private Combo relationshipCharacteristicCombo;
	private Combo destinationCharacteristicCombo;
	
	private Pattern idValidationPattern;

	protected VisualizationRelationshipWizardPage(String pageName) {
		super(pageName);
		setTitle("New relationship");
		setDescription("Fill the form to create a new relationship");
		
		idValidationPattern = Pattern.compile("[1-9]+\\d*");
	}

	@Override
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout(2, false);
		composite.setLayout(layout);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		
		new Label(composite, SWT.NONE).setText("Relationship type");
		relationshipTypeCombo = new Combo(composite, SWT.NONE);
		relationshipTypeCombo.setItems(new String[] {"Is a", "Finding site", "Associated morphology"});
		relationshipTypeCombo.select(0);
		relationshipTypeCombo.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		
		relationshipTypeCombo.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				if (0 == relationshipTypeCombo.getSelectionIndex()) {
					groupCombo.setEnabled(false);
				} else {
					groupCombo.setEnabled(true);
				}
			}
		});
		
		new Label(composite, SWT.NONE).setText("Relationship group");
		groupCombo = new Combo(composite, SWT.NONE);
		String[] items = new String[((VisualizationRelationshipWizard) getWizard()).getExpression().getGroupedRelationships().size()+2];
		items[0] = "Ungrouped";
		items[1] = "New group";
		for(int i = 2; i < items.length; i++) {
			items[i] = ""+(i-1);
		}
		groupCombo.setItems(items);
		groupCombo.select(0);
		groupCombo.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		groupCombo.setEnabled(false);
		
		new Label(composite, SWT.NONE).setText("Relationship characteristic type");
		relationshipCharacteristicCombo = new Combo(composite, SWT.NONE);
		relationshipCharacteristicCombo.setItems(new String[] {"Defined", "Additional"});
		relationshipCharacteristicCombo.select(0);
		relationshipCharacteristicCombo.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		
		new Label(composite, SWT.NONE).setText("Destination characteristic type");
		destinationCharacteristicCombo = new Combo(composite, SWT.NONE);
		destinationCharacteristicCombo.setItems(new String[] {"Defined", "Primitive"});
		destinationCharacteristicCombo.select(0);
		destinationCharacteristicCombo.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		
		new Label(composite, SWT.NONE).setText("Destination concept ID");
		destinationConceptIdText = new Text(composite, SWT.BORDER);
		destinationConceptIdText.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		
		new Label(composite, SWT.NONE).setText("Destination concept term");
		destinationConceptTermText = new Text(composite, SWT.BORDER);
		destinationConceptTermText.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		
		initDataBinding();
		
		setControl(composite);
	}

	private void initDataBinding() {
		Relationship relationship = ((VisualizationRelationshipWizard) getWizard()).getRelationship();
		DataBindingContext context = new DataBindingContext();
		
		IObservableValue destinationIdTargetValue = SWTObservables.observeText(destinationConceptIdText, SWT.Modify);
		IObservableValue destinationIdModelValue = PojoObservables.observeValue(relationship.getDestination(), "id");
		
		context.bindValue(destinationIdTargetValue, destinationIdModelValue, new UpdateValueStrategy().setAfterGetValidator(new IValidator() {

			@Override
			public IStatus validate(final Object value) {
				if (value instanceof String) {
					if (!((String) value).isEmpty()) {
						if (idValidationPattern.matcher((String) value).find()) {
							if (((String) value).length() >= 6 && ((String) value).length() <= 18) {
								return Status.OK_STATUS;
							} else {
								return ValidationStatus.error("Destination concept id's length can be only betwenn 6 and 18");
							}
						} else {
							return ValidationStatus.error("Destination concept id should only contains number");
						}
					}
				}
				return ValidationStatus.error("Destination concept id should be specified");
			}
		}), new UpdateValueStrategy());
		
		IObservableValue destinationTermTargetValue = SWTObservables.observeText(destinationConceptTermText, SWT.Modify);
		IObservableValue destinationTermModelValue = PojoObservables.observeValue(relationship.getDestination(), "term");
		
		context.bindValue(destinationTermTargetValue, destinationTermModelValue, new UpdateValueStrategy().setAfterGetValidator(new IValidator() {

			@Override
			public IStatus validate(final Object value) {
				if (value instanceof String) {
					if (((String) value).trim().length() > 0) {
						return Status.OK_STATUS;
					}
				}
				return ValidationStatus.error("Destination concept term should be specified");
			}
		}), new UpdateValueStrategy());
		
		WizardPageSupport.create(this, context);
	}
	
	public boolean isIsaRelationship() {
		return relationshipTypeCombo.getSelectionIndex() == 0;
	}

	public boolean isRelationshipDefined() {
		return relationshipCharacteristicCombo.getSelectionIndex() == 0;
	}
	
	public Concept getRelationshipType() {
		Concept concept = VisualizationDslFactory.eINSTANCE.createConcept();
		if (1 == relationshipTypeCombo.getSelectionIndex()) {
			concept.setId("363698007");
			concept.setTerm("Finding site");
			concept.setDefined(false);
		} else {
			concept.setId("116676008");
			concept.setTerm("Associated morphology");
			concept.setDefined(false);
		}
		
		return concept;
	}

	public Concept getRelationshipDestination() {
		Concept concept = VisualizationDslFactory.eINSTANCE.createConcept();
		concept.setDefined(0 == destinationCharacteristicCombo.getSelectionIndex());
		concept.setId(destinationConceptIdText.getText());
		concept.setTerm(destinationConceptTermText.getText());
		
		return concept;
	}

	public int getRelationshipGroup() {
		return groupCombo.getSelectionIndex();
	}

}
