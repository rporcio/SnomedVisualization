package snomed.visualization.vaadin.wizard;

import com.vaadin.data.Validator;

/**
 * Grouper class for grouping validators which are used in the relationship wizard.
 * 
 * @author rporcio
 */
public class VisualizationWizardValidatorGrouper {
	
	private final Validator relationshipCharacteristicTypeValidator = new Validator() {

		private static final long serialVersionUID = 1175395657929423394L;

		@Override
		public void validate(Object value) throws InvalidValueException {
			if (null == value) {
				throw new InvalidValueException("Relationship characteristic type cannot be empty.");
			}
		}
	};

	private final  Validator relationshipTypeValidator = new Validator() {

		private static final long serialVersionUID = 1175395657929423394L;

		@Override
		public void validate(Object value) throws InvalidValueException {
			if (null == value) {
				throw new InvalidValueException("Relationship type cannot be empty");
			}
		}
	};

	private final  Validator relationshipGroupValidator = new Validator() {

		private static final long serialVersionUID = 1175395657929423394L;

		@Override
		public void validate(Object value) throws InvalidValueException {
			if (null == value) {
				throw new InvalidValueException("Relationship group cannot be empty.");
			}
		}
	};

	private final  Validator destinationConceptCharacteristicTypeValidator = new Validator() {

		private static final long serialVersionUID = 7950514394733019663L;

		@Override
		public void validate(Object value) throws InvalidValueException {
			if (null == value) {
				throw new InvalidValueException("Destination concept characteristic type cannot be empty.");
			}
		}
	};

	private final  Validator destinationConceptIdValidator = new Validator() {

		private static final long serialVersionUID = 1175395657929423394L;

		@Override
		public void validate(Object value) throws InvalidValueException {
			if (null == value) {
				throw new InvalidValueException("ID cannot be empty.");
			} else {
				String id = value.toString();

				if (id.isEmpty()) {
					throw new InvalidValueException("ID cannot be empty.");
				} else if (!id.matches("\\d*")) {
					throw new InvalidValueException("ID can only contains number.");
				} else if (id.length() < 6 || id.length() > 18) {
					throw new InvalidValueException("Length cannot be less than 6 or more than 18.");
				}
			}
		}
	};

	private final  Validator destinationConceptTermValidator = new Validator() {

		private static final long serialVersionUID = 1175395657929423394L;

		@Override
		public void validate(Object value) throws InvalidValueException {
			if (null == value || value.toString().isEmpty()) {
				throw new InvalidValueException("Term cannot be empty.");
			}
		}
	};

	public Validator getRelationshipCharacteristicTypeValidator() {
		return relationshipCharacteristicTypeValidator;
	}

	public Validator getRelationshipTypeValidator() {
		return relationshipTypeValidator;
	}

	public Validator getRelationshipGroupValidator() {
		return relationshipGroupValidator;
	}

	public Validator getDestinationConceptCharacteristicTypeValidator() {
		return destinationConceptCharacteristicTypeValidator;
	}

	public Validator getDestinationConceptIdValidator() {
		return destinationConceptIdValidator;
	}

	public Validator getDestinationConceptTermValidator() {
		return destinationConceptTermValidator;
	}
	
}
