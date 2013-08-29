package snomed.visualization.vaadin.wizard;

import snomed.visualization.dsl.visualizationDsl.Concept;
import snomed.visualization.dsl.visualizationDsl.Relationship;
import snomed.visualization.dsl.visualizationDsl.VisualizationDslFactory;
import snomed.visualization.vaadin.ui.VisualizationView;

import com.vaadin.data.Property;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.data.Property.ValueChangeListener;
import com.vaadin.data.fieldgroup.BeanFieldGroup;
import com.vaadin.data.fieldgroup.FieldGroup.CommitException;
import com.vaadin.data.util.BeanItem;
import com.vaadin.event.FieldEvents;
import com.vaadin.event.FieldEvents.TextChangeEvent;
import com.vaadin.event.FieldEvents.TextChangeListener;
import com.vaadin.server.Page;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.Field;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Notification.Type;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;

/**
 * Sub Window class for adding new relationship to the expression.
 * 
 * @author rporcio
 */
public class VisualizationRelationshipWizard extends Window {

	private static final long serialVersionUID = -2138817225506143109L;
	
	private VisualizationView visualizationView;
	private VerticalLayout layout;
	private ComboBox defined;
	private ComboBox relationshipType;
	private ComboBox relationshipGroup;
	private ComboBox destinationDefined;
	private TextField destinationId;
	private TextField destinationTerm;
	private Button okButton;
	private Button cancelButton;
	private BeanFieldGroup<Relationship> binder;
	
	private ValueChangeListener valueChangeListener = new Property.ValueChangeListener() {
		
		private static final long serialVersionUID = 4893047953459299775L;

		@Override
		public void valueChange(ValueChangeEvent event) {
			addValidators();
			validate();
		}
	};
	
	private ValueChangeListener relationshipTypeValueChangeListener = new Property.ValueChangeListener() {
		
		private static final long serialVersionUID = 4893047953459299775L;

		@Override
		public void valueChange(ValueChangeEvent event) {
			if (((Concept) relationshipType.getValue()).getId().equals("116680003")) {
				defined.setEnabled(false);
				relationshipGroup.setEnabled(false);
			} else {
				defined.setEnabled(true);
				relationshipGroup.setEnabled(true);
			}
		}
	};
	
	private TextChangeListener textChangeListener = new FieldEvents.TextChangeListener() {
		
		private static final long serialVersionUID = 2264212210849941030L;

		@Override
		public void textChange(TextChangeEvent event) {
			addValidators();
			validate();
		}
	};
	
	private ClickListener clickListener = new ClickListener() {

		private static final long serialVersionUID = -7656628027480996690L;

		@Override
		public void buttonClick(ClickEvent event) {
			if (event.getButton().equals(cancelButton)) {
				close();
			} else {
				try {
					addValidators();
					binder.commit();
					close();
				} catch (CommitException e) {
					new Notification("Error", "One or more validation error are exist.", Type.ERROR_MESSAGE).show(Page.getCurrent());
				}
			}
		}
	};
	
	private VisualizationWizardValidatorGrouper validatorGrouper;
	
	public VisualizationRelationshipWizard(VisualizationView visualizationView) {
		this.visualizationView = visualizationView;
		validatorGrouper = new VisualizationWizardValidatorGrouper();
		layout = new VerticalLayout();
		
		setCaption("New relationship");
		setContent(layout);
		setModal(true);
		center();
		setWidth("600");
		setHeight("500");
		
		layout.setMargin(true);
		
		createContent();
	}

	public ComboBox getDefined() {
		return defined;
	}

	public ComboBox getRelationshipType() {
		return relationshipType;
	}

	public ComboBox getRelationshipGroup() {
		return relationshipGroup;
	}

	public Field<?> getDestinationDefined() {
		return destinationDefined;
	}

	public Field<?> getDestinationId() {
		return destinationId;
	}

	public Field<?> getDestinationTerm() {
		return destinationTerm;
	}

	public VisualizationView getVisualizationView() {
		return visualizationView;
	}

	public BeanFieldGroup<Relationship> getBinder() {
		return binder;
	}

	private void createContent() {
		Relationship relationship = VisualizationDslFactory.eINSTANCE.createRelationship();
		Concept destination = VisualizationDslFactory.eINSTANCE.createConcept();
		relationship.setDestination(destination);
		
		final BeanItem<Relationship> beanItem = new BeanItem<Relationship>(relationship);
		binder = new BeanFieldGroup<Relationship>(Relationship.class);
		binder.setItemDataSource(beanItem);
		
		binder.setFieldFactory(new VisualizationRelationshipWizardFactory(visualizationView));
		binder.addCommitHandler(new VisualizationRelationshipWizardCommitHandler(this));
		
		relationshipType = binder.buildAndBind("Relationship type", "type", ComboBox.class);
		relationshipGroup = binder.buildAndBind("Relationship group", "group", ComboBox.class);
		defined = binder.buildAndBind("Relationship characteristic type", "defined", ComboBox.class);
		destinationDefined = (ComboBox) binder.buildAndBind("Destination characteristic type", "destination.defined");
		destinationId = (TextField) binder.buildAndBind("Destination concept ID", "destination.id");
		destinationTerm = (TextField) binder.buildAndBind("Destination concept term", "destination.term");
		
		layout.addComponent(relationshipType);
		layout.addComponent(relationshipGroup);
		layout.addComponent(defined);
		layout.addComponent(destinationDefined);
		layout.addComponent(destinationId);
		layout.addComponent(destinationTerm);
		
		okButton = new Button("Ok");
		cancelButton = new Button("Cancel");
		
		HorizontalLayout horizontalLayout = new HorizontalLayout();
		horizontalLayout.setSpacing(true);
		horizontalLayout.setMargin(true);
		horizontalLayout.setSizeFull();
		horizontalLayout.addComponent(cancelButton);
		horizontalLayout.addComponent(okButton);
		horizontalLayout.setExpandRatio(cancelButton, 1.0f);
		horizontalLayout.setExpandRatio(okButton, 1.0f);
		horizontalLayout.setComponentAlignment(cancelButton, Alignment.BOTTOM_RIGHT);
		layout.addComponent(horizontalLayout);
		
		cancelButton.addClickListener(clickListener);
		okButton.addClickListener(clickListener);
		
		defined.setImmediate(true);
		relationshipType.setImmediate(true);
		relationshipGroup.setImmediate(true);
		destinationDefined.setImmediate(true);
		destinationId.setImmediate(true);
		destinationTerm.setImmediate(true);
		
		defined.addValueChangeListener(valueChangeListener);
		relationshipType.addValueChangeListener(valueChangeListener);
		relationshipType.addValueChangeListener(relationshipTypeValueChangeListener);
		relationshipGroup.addValueChangeListener(valueChangeListener);
		destinationDefined.addValueChangeListener(valueChangeListener);
		destinationId.addTextChangeListener(textChangeListener);
		destinationTerm.addTextChangeListener(textChangeListener);
	}
	
	private void addValidators() {
		defined.removeValidator(validatorGrouper.getRelationshipCharacteristicTypeValidator());
		relationshipType.removeValidator(validatorGrouper.getRelationshipTypeValidator());
		relationshipGroup.removeValidator(validatorGrouper.getRelationshipGroupValidator());
		destinationDefined.removeValidator(validatorGrouper.getDestinationConceptCharacteristicTypeValidator());
		destinationId.removeValidator(validatorGrouper.getDestinationConceptIdValidator());
		destinationTerm.removeValidator(validatorGrouper.getDestinationConceptTermValidator());
		
		relationshipType.addValidator(validatorGrouper.getRelationshipTypeValidator());
		if (null != relationshipType.getValue() && !((Concept) relationshipType.getValue()).getId().equals("116680003")) {
			defined.addValidator(validatorGrouper.getRelationshipCharacteristicTypeValidator());
			relationshipGroup.addValidator(validatorGrouper.getRelationshipGroupValidator());
		} else if (null == relationshipType.getValue()) {
			defined.addValidator(validatorGrouper.getRelationshipCharacteristicTypeValidator());
			relationshipGroup.addValidator(validatorGrouper.getRelationshipGroupValidator());
		}
		destinationDefined.addValidator(validatorGrouper.getDestinationConceptCharacteristicTypeValidator());
		destinationId.addValidator(validatorGrouper.getDestinationConceptIdValidator());
		destinationTerm.addValidator(validatorGrouper.getDestinationConceptTermValidator());
	}
	
	private void validate() {
		defined.isValid();
		relationshipType.isValid();
		relationshipGroup.isValid();
		destinationDefined.isValid();
		destinationId.isValid();
		destinationTerm.isValid();
	}

}
