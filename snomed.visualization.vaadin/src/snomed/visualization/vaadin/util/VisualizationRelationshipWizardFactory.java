package snomed.visualization.vaadin.util;

import java.util.List;

import snomed.visualization.vaadin.ui.VisualizationConcept;
import snomed.visualization.vaadin.ui.VisualizationView;

import com.google.common.collect.Lists;
import com.vaadin.data.fieldgroup.FieldGroupFieldFactory;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.Field;
import com.vaadin.ui.TextField;

/**
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
			if (VisualizationConcept.class.isAssignableFrom(dataType)) {
				ComboBox comboBox = new ComboBox();
				comboBox.setSizeFull();
				List<VisualizationConcept> concepts = Lists.newArrayList();
				concepts.add(new VisualizationConcept(false, "116680003", "Is a"));	
				concepts.add(new VisualizationConcept(false, "363698007", "Finding site"));
				concepts.add(new VisualizationConcept(false, "116676008", "Associated morphology"));
				
				for (VisualizationConcept concept : concepts) {
					comboBox.addItem(concept);
					comboBox.setItemCaption(concept, concept.getTerm());
				}
				
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
						comboBox.addItem("" + i);
					}
					comboBox.addItem("New");
					comboBox.addItem("Standalone");
					
					return (T) comboBox;
				} else {
					TextField field = new TextField("");
					field.setSizeFull();field.setNullRepresentation("");
					
					return (T) field;
				}
			}
		}
		
	}