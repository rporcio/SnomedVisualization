package snomed.visualization.vaadin.wizard;

import snomed.visualization.dsl.visualizationDsl.Concept;
import snomed.visualization.dsl.visualizationDsl.VisualizationDslFactory;
import snomed.visualization.vaadin.ui.VisualizationView;

import com.vaadin.data.fieldgroup.FieldGroupFieldFactory;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.Field;
import com.vaadin.ui.TextField;

/**
 * Wizard factory to build expression specific fields for the new relationship wizard.
 * 
 * @author rporcio
 */
public class VisualizationRelationshipWizardFactory implements FieldGroupFieldFactory {

		private static final long serialVersionUID = 5454892939294976257L;
		private VisualizationView visualizationView;

		public VisualizationRelationshipWizardFactory(VisualizationView visualizationView) {
			this.visualizationView = visualizationView;
		}

		@SuppressWarnings({ "rawtypes", "unchecked" })
		@Override
		public <T extends Field> T createField(Class<?> dataType, Class<T> fieldType) {
			if (Concept.class.isAssignableFrom(dataType)) {
				ComboBox comboBox = new ComboBox();
				comboBox.setSizeFull();

				Concept concept = VisualizationDslFactory.eINSTANCE.createConcept();
				concept.setDefined(false);
				concept.setId("116680003");
				concept.setTerm("Is a");
				comboBox.addItem(concept);
				comboBox.setItemCaption(concept, concept.getTerm());
				
				concept = VisualizationDslFactory.eINSTANCE.createConcept();
				concept.setDefined(false);
				concept.setId("363698007");
				concept.setTerm("Finding site");
				comboBox.addItem(concept);
				comboBox.setItemCaption(concept, concept.getTerm());
				
				concept = VisualizationDslFactory.eINSTANCE.createConcept();
				concept.setDefined(false);
				concept.setId("116676008");
				concept.setTerm("Associated morphology");
				comboBox.addItem(concept);
				comboBox.setItemCaption(concept, concept.getTerm());
				
				return (T) comboBox;
			} else if (Boolean.class.isAssignableFrom(dataType)) {
				ComboBox comboBox = new ComboBox();
				comboBox.setSizeFull();
				comboBox.addItem(true);
				comboBox.setItemCaption(true, "Defined");
				comboBox.addItem(false);
				if (ComboBox.class.isAssignableFrom(fieldType)) {
					comboBox.setItemCaption(false, "Additional");
				} else {
					comboBox.setItemCaption(false, "Primitive");
				}
				
				return (T) comboBox;
			} else {
				if (ComboBox.class.isAssignableFrom(fieldType)) {
					ComboBox comboBox = new ComboBox();
					comboBox.setSizeFull();
					for (int i = 0; i < visualizationView.getExpression().getRelationshipGroups().size(); i++) {
						comboBox.addItem(i);
					}
					comboBox.addItem(-2);
					comboBox.setItemCaption(-2, "New group");
					comboBox.addItem(-1);
					comboBox.setItemCaption(-1, "Ungrouped");
					
					return (T) comboBox;
				} else {
					TextField field = new TextField("");
					field.setSizeFull();field.setNullRepresentation("");
					
					return (T) field;
				}
			}
		}
		
	}