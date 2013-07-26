package snomed.visualization.vaadin.ui;

import snomed.visualization.vaadin.util.VisualizationRelationship;
import snomed.visualization.vaadin.util.VisualizationRelationshipWizardFactory;
import snomed.visualization.vaadin.util.VisulizationRelationshipWizardCommitHandler;

import com.vaadin.data.Property;
import com.vaadin.data.Validator;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.data.Property.ValueChangeListener;
import com.vaadin.data.fieldgroup.BeanFieldGroup;
import com.vaadin.data.fieldgroup.FieldGroup.CommitException;
import com.vaadin.data.util.BeanItem;
import com.vaadin.event.FieldEvents;
import com.vaadin.event.FieldEvents.TextChangeEvent;
import com.vaadin.event.FieldEvents.TextChangeListener;
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
	private BeanFieldGroup<VisualizationRelationship> binder;
	
	private Validator relationshipCharacteristicTypeValidator = new Validator() {
		
		private static final long serialVersionUID = 1175395657929423394L;

		@Override
		public void validate(Object value) throws InvalidValueException {
			if (null == value) {
				throw new InvalidValueException("Relationship characteristic type cannot be empty.");
			}
		}
	};
	
	private Validator relationshipTypeValidator = new Validator() {
		
		private static final long serialVersionUID = 1175395657929423394L;

		@Override
		public void validate(Object value) throws InvalidValueException {
			if (null == value) {
				throw new InvalidValueException("Relationship type cannot be empty");
			}
		}
	};
	
	private Validator relationshipGroupValidator = new Validator() {
		
		private static final long serialVersionUID = 1175395657929423394L;

		@Override
		public void validate(Object value) throws InvalidValueException {
			if (null == value) {
				throw new InvalidValueException("Relationship group cannot be empty.");
			}
		}
	};
	
	private Validator destinationConceptCharacteristicTypeValidator = new Validator() {
		
		private static final long serialVersionUID = 7950514394733019663L;

		@Override
		public void validate(Object value) throws InvalidValueException {
			if (null == value) {
				throw new InvalidValueException("Destination concept characteristic type cannot be empty.");
			}
		}
	};
	
	private Validator destinationConceptIdValidator = new Validator() {
		
		private static final long serialVersionUID = 1175395657929423394L;

		@Override
		public void validate(Object value) throws InvalidValueException {
			String id = value.toString();
			
			if (id.isEmpty()) {
				throw new InvalidValueException("ID cannot be empty.");
			} else if (!id.matches("\\d*")) {
				throw new InvalidValueException("ID can only contains number.");
			} else if (id.length() < 6 || id.length() > 18) {
				throw new InvalidValueException("Lenght cannot be less than 6 or more than 18.");
			}
		}
	};
	
	private Validator destinationConceptTermValidator = new Validator() {
		
		private static final long serialVersionUID = 1175395657929423394L;

		@Override
		public void validate(Object value) throws InvalidValueException {
			if (value.toString().isEmpty()) {
				throw new InvalidValueException("Term cannot be empty.");
			}
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
					new Notification("Error", "One or more validation error are exist.", Type.ERROR_MESSAGE).show(visualizationView.getVisualizationUI().getPage());
				}
			}
		}
	};
	
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
			if (((VisualizationConcept) relationshipType.getValue()).getId().equals("116680003")) {
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
	
	public VisualizationRelationshipWizard(VisualizationView visualizationView) {
		this.visualizationView = visualizationView;
		
		layout = new VerticalLayout();
		
		setContent(layout);
		setModal(true);
		center();
		setWidth("600");
		setHeight("400");
		
		layout.setMargin(true);
		
		createContent();
	}

	private void createContent() {
		final BeanItem<VisualizationRelationship> beanItem = new BeanItem<VisualizationRelationship>(new VisualizationRelationship());
		binder = new BeanFieldGroup<VisualizationRelationship>(VisualizationRelationship.class);
		binder.setItemDataSource(beanItem);
		
		binder.setFieldFactory(new VisualizationRelationshipWizardFactory(visualizationView));
		binder.addCommitHandler(new VisulizationRelationshipWizardCommitHandler(this));
		
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
	
	public ComboBox getDefined() {
		return defined;
	}

	public void setDefined(ComboBox defined) {
		this.defined = defined;
	}

	public ComboBox getRelationshipType() {
		return relationshipType;
	}

	public void setRelationshipTypes(ComboBox relationshipType) {
		this.relationshipType = relationshipType;
	}

	public ComboBox getRelationshipGroup() {
		return relationshipGroup;
	}

	public void setRelationshipGroup(ComboBox relationshipGroup) {
		this.relationshipGroup = relationshipGroup;
	}

	public Field<?> getDestinationDefined() {
		return destinationDefined;
	}

	public void setDestinationDefined(ComboBox destinationDefined) {
		this.destinationDefined = destinationDefined;
	}

	public Field<?> getDestinationId() {
		return destinationId;
	}

	public void setDestinationId(TextField destinationId) {
		this.destinationId = destinationId;
	}

	public Field<?> getDestinationTerm() {
		return destinationTerm;
	}

	public void setDestinationTerm(TextField destinationTerm) {
		this.destinationTerm = destinationTerm;
	}

	public VisualizationView getVisualizationView() {
		return visualizationView;
	}

	public void setVisualizationView(VisualizationView visualizationView) {
		this.visualizationView = visualizationView;
	}

	public BeanFieldGroup<VisualizationRelationship> getBinder() {
		return binder;
	}

	public void setBinder(BeanFieldGroup<VisualizationRelationship> binder) {
		this.binder = binder;
	}
	
	private void addValidators() {
		defined.removeValidator(relationshipCharacteristicTypeValidator);
		relationshipType.removeValidator(relationshipTypeValidator);
		relationshipGroup.removeValidator(relationshipGroupValidator);
		destinationDefined.removeValidator(destinationConceptCharacteristicTypeValidator);
		destinationId.removeValidator(destinationConceptIdValidator);
		destinationTerm.removeValidator(destinationConceptTermValidator);
		
		relationshipType.addValidator(relationshipTypeValidator);
		if (null != relationshipType.getValue() && !((VisualizationConcept) relationshipType.getValue()).getId().equals("116680003")) {
			defined.addValidator(relationshipCharacteristicTypeValidator);
			relationshipGroup.addValidator(relationshipGroupValidator);
		} else if (null == relationshipType.getValue()) {
			defined.addValidator(relationshipCharacteristicTypeValidator);
			relationshipGroup.addValidator(relationshipGroupValidator);
		}
		destinationDefined.addValidator(destinationConceptCharacteristicTypeValidator);
		destinationId.addValidator(destinationConceptIdValidator);
		destinationTerm.addValidator(destinationConceptTermValidator);
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
