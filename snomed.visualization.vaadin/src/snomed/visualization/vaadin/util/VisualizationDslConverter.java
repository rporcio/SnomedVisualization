package snomed.visualization.vaadin.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

import snomed.visualization.dsl.visualizationDsl.Concept;
import snomed.visualization.dsl.visualizationDsl.Expression;
import snomed.visualization.dsl.visualizationDsl.Relationship;
import snomed.visualization.dsl.visualizationDsl.RelationshipGroup;
import snomed.visualization.dsl.visualizationDsl.VisualizationDslFactory;

import com.google.gwt.thirdparty.guava.common.collect.Lists;
import com.vaadin.data.util.converter.Converter;

/**
 * Utility class for convert to and from the expression model.
 * 
 * @author rporcio
 * @deprecated use {@link VisualizationDslUtil} instead
 */
public class VisualizationDslConverter implements Converter<String, Expression> {

	private static final long serialVersionUID = -2242787564277631541L;
	private Expression expression;

	@Override
	public Expression convertToModel(String dsl, Class<? extends Expression> targetType, Locale locale) throws com.vaadin.data.util.converter.Converter.ConversionException {

		dsl = dsl.toString().replaceAll("&nbsp;", "").replaceAll("<br>", "").trim();

		String[] components = dsl.split("\\|");

		int isaIndex = 0;
		int groupIndex = 0;
		
		for (int i = 0; i < components.length; i += 2) {
			if (components[i].contains(":")) {
				isaIndex = i;
			}
			if (components[i].contains("{")) {
				groupIndex = i;
				break;
			}
		}

		convertIsaConcepts(isaIndex, components);
		convertStandaloneRelationships(isaIndex, groupIndex, components);
		convertRelationshipGroups(groupIndex, components);

		return expression;
	}

	@Override
	public String convertToPresentation(Expression expression, Class<? extends String> targetType, Locale locale) throws com.vaadin.data.util.converter.Converter.ConversionException {
		this.expression = expression;

		StringBuilder sb = new StringBuilder();
		Iterator<Concept> isaIterator = expression.getIsaRelationships().getRelationships().iterator();
		while (isaIterator.hasNext()) {
			Concept concept = isaIterator.next();
			sb.append(concept.getId() + " | " + concept.getTerm() + " |");
			if (isaIterator.hasNext()) {
				sb.append(" + ");
			}
		}
		sb.append(":<br>");

		Iterator<Relationship> relationshipIterator = expression.getStandaloneRelationships().getRelationships().iterator();
		while (relationshipIterator.hasNext()) {
			Relationship relationship = relationshipIterator.next();
			sb.append("&nbsp;");
			sb.append(relationship.getType().getId() + " | " + relationship.getType().getTerm() + " |");
			sb.append(" = ");
			sb.append(relationship.getDestination().getId() + " | " + relationship.getDestination().getTerm() + " |");
			if (relationshipIterator.hasNext()) {
				sb.append(",");
			}
			sb.append("<br>");
		}

		Iterator<RelationshipGroup> groupsIterator = expression.getRelationshipGroups().iterator();
		while (groupsIterator.hasNext()) {
			Iterator<Relationship> groupIterator = groupsIterator.next().getRelationships().iterator();
			sb.append("&nbsp;{<br>");
			while (groupIterator.hasNext()) {
				Relationship relationship = groupIterator.next();
				sb.append("&nbsp;&nbsp;&nbsp;");
				sb.append(relationship.getType().getId() + " | " + relationship.getType().getTerm() + " |");
				sb.append(" = ");
				sb.append(relationship.getDestination().getId() + " | " + relationship.getDestination().getTerm() + " |");
				if (groupIterator.hasNext()) {
					sb.append(",");
					sb.append("<br>");
				}
			}
			sb.append("<br>&nbsp;}<br>");
		}

		return sb.toString();
	}

	@Override
	public Class<Expression> getModelType() {
		return Expression.class;
	}

	@Override
	public Class<String> getPresentationType() {
		return String.class;
	}

	private boolean convertIsaConcepts(int index, String[] components) {
		if (index == 0) {
			index = components.length;
		}
		List<Concept> isaConcepts = new ArrayList<Concept>();

		for (int i = 0; i < index; i += 2) {
			String id = components[i].replaceAll("\\+", "").trim();
			String term = components[i + 1].trim();
			
			isaConcepts.add(createNewConcept(id, term));
		}

		for (Concept oldConcept : expression.getIsaRelationships().getRelationships()) {
			for (Concept newConcept : isaConcepts) {
				if (newConcept.getId().equals(oldConcept.getId())) {
					newConcept.setDefined(oldConcept.isDefined());
				}
			}
		}

		expression.getIsaRelationships().getRelationships().clear();
		expression.getIsaRelationships().getRelationships().addAll(isaConcepts);

		return false;
	}

	private void convertStandaloneRelationships(int startIndex, int endIndex, String[] components) {
		if (startIndex == endIndex) {
			expression.getStandaloneRelationships().getRelationships().clear();
		} else {
			if (endIndex == 0) {
				endIndex = components.length;
			}
			List<Relationship> relationships = Lists.newArrayList();
			
			for (int i = startIndex; i < endIndex; i += 4) {
				String typeId = components[i].replaceAll(":", "").replaceAll(",", "").trim();
				String typeTerm = components[i + 1].trim();
				String destinationId = components[i + 2].replaceAll("=", "").trim();
				String destinationTerm = components[i + 3].replaceAll(",", "").trim();
				
				relationships.add(createNewRelationship(typeId, typeTerm, destinationId, destinationTerm));
			}
			
			for (Relationship oldRelationship : expression.getStandaloneRelationships().getRelationships()) {
				for (Relationship newRelationship : relationships) {
					updateRelationship(newRelationship, oldRelationship);
					
					if (null == newRelationship.getId()) {
						//TODO add id generiton method
					}
				}
			}
			
			expression.getStandaloneRelationships().getRelationships().clear();
			expression.getStandaloneRelationships().getRelationships().addAll(relationships);
			
		}
	}

	private void convertRelationshipGroups(int startIndex, String[] components) {
		if (startIndex == components.length || startIndex == 0) {
			expression.getRelationshipGroups().clear();
		} else {

			List<List<Relationship>> relationshipGroups = Lists.newArrayList();

			List<Relationship> relationships = Lists.newArrayList();

			for (int i = startIndex; i < components.length-1; i += 4) {
				if (components[i].contains("{") && i != startIndex) {

					relationshipGroups.add(relationships);
					relationships = Lists.newArrayList();
				}

				String typeId = components[i].replaceAll("\\{", "").replaceAll("\\}", "").replaceAll(",", "").replaceAll(":", "").trim();
				String typeTerm = components[i + 1].trim();
				String destinationId = components[i + 2].replaceAll("=", "").trim();
				String destinationTerm = components[i + 3].replaceAll(",", "").replaceAll("\\}", "").trim();

				relationships.add(createNewRelationship(typeId, typeTerm, destinationId, destinationTerm));
			}
			
			relationshipGroups.add(relationships);

			for (RelationshipGroup relationshipGroup : expression.getRelationshipGroups()) {
				for (Relationship oldRelationship : relationshipGroup.getRelationships()) {
					Iterator<List<Relationship>> iterator = relationshipGroups.iterator();
					while (iterator.hasNext()) {
						for (Relationship newRelationship : iterator.next()) {
							updateRelationship(newRelationship, oldRelationship);
						}
					}
				}
			}
			
			expression.getRelationshipGroups().clear();
			
			
			Iterator<List<Relationship>> iterator = relationshipGroups.iterator();
			while (iterator.hasNext()) {
				
				RelationshipGroup relationshipGroup = VisualizationDslFactory.eINSTANCE.createRelationshipGroup();
				List<Relationship> newRelationships = iterator.next();
				
				relationshipGroup.getRelationships().addAll(newRelationships);
				
				expression.getRelationshipGroups().add(relationshipGroup);
			}
		}

	}

	private void updateRelationship(Relationship newRelationship, Relationship oldRelationship) {
		if (newRelationship.getType().getId().equals(oldRelationship.getType().getId()) && newRelationship.getDestination().getId().equals(oldRelationship.getDestination().getId())) {
			newRelationship.setDefined(oldRelationship.isDefined());
			newRelationship.getType().setDefined(oldRelationship.getType().isDefined());
			newRelationship.getDestination().setDefined(oldRelationship.getDestination().isDefined());
			newRelationship.setId(oldRelationship.getId());
		}
	}

	private Relationship createNewRelationship(String typeId, String typeTerm, String destinationId, String destinationTerm) {
		Relationship relationship = VisualizationDslFactory.eINSTANCE.createRelationship();
		relationship.setType(createNewConcept(typeId, typeTerm));
		relationship.setDestination(createNewConcept(destinationId, destinationTerm));
		relationship.setDefined(false);
		relationship.setGroup(0);

		return relationship;
	}

	private Concept createNewConcept(String id, String term) {
		Concept concept = VisualizationDslFactory.eINSTANCE.createConcept();
		concept.setId(id.trim());
		concept.setTerm(term.trim());
		concept.setDefined(false);

		return concept;
	}

}
