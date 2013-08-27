package snomed.visualization.util;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.validation.IConcreteSyntaxValidator.InvalidConcreteSyntaxException;

import snomed.visualization.dsl.VisualizationDslStandaloneSetup;
import snomed.visualization.dsl.parser.antlr.VisualizationDslParser;
import snomed.visualization.dsl.visualizationDsl.Concept;
import snomed.visualization.dsl.visualizationDsl.Expression;
import snomed.visualization.dsl.visualizationDsl.Relationship;
import snomed.visualization.dsl.visualizationDsl.RelationshipGroup;

import com.google.common.collect.Lists;

/**
 * Utility class to provide dsl specific methods.
 * 
 * @author rporcio
 */
public class VisualizationDslUtil {
	
	public VisualizationDslUtil() {
	}

	public Expression convertToExpression(String dsl) {
		VisualizationDslParser dslParser = VisualizationDslStandaloneSetup.getInstance().getParser();
		return ((Expression) dslParser.doParse(dsl).getRootASTElement());
	}

	@SuppressWarnings("restriction")
	public String convertToPresentation(Expression expression) {
		String dsl = "";
		org.eclipse.xtext.serializer.impl.Serializer serializer = VisualizationDslStandaloneSetup.getInstance().getSerializer();

		try {
			dsl = serializer.serialize(expression);
			return dsl;
		} catch (InvalidConcreteSyntaxException e) {
			// TODO
			// the serializer cannot create the string presentation if one of the elements is empty :(
			dsl = createOldPresentation(expression);
		}
		
		return dsl;
	}

	public boolean isValid(String dsl) {
		return !getParserResult(dsl).hasSyntaxErrors();
	}

	public Iterable<INode> getSyntaxErrors(String dsl) {
		return getParserResult(dsl).getSyntaxErrors();
	}

	public Expression updatePreviousExpression(Expression oldExpression, String dsl) {
		Expression newExpression = convertToExpression(dsl);

		newExpression.setConcept(oldExpression.getConcept());

		for (Concept newConcept : newExpression.getIsaRelationships().getRelationships()) {
			for (Concept oldConcept : oldExpression.getIsaRelationships().getRelationships()) {
				if (newConcept.getId().equals(oldConcept.getId())) {
					newConcept.setDefined(oldConcept.isDefined());
					break;
				}
			}
		}

		if (null != newExpression.getUngroupedRelationships() && null != oldExpression.getUngroupedRelationships()) {
			for (Relationship newRelationship : newExpression.getUngroupedRelationships().getRelationships()) {
				for (Relationship oldRelationship : oldExpression.getUngroupedRelationships().getRelationships()) {
					updateRelationship(newRelationship, oldRelationship);
				}

				if (null == newRelationship.getId()) {
					newRelationship.setId(generateRandomItemIndentifier());
				}
			}
		}

		List<Relationship> oldRelationships = Lists.newArrayList();

		for (RelationshipGroup oldRelationshipGroup : oldExpression.getGroupedRelationships()) {
			for (Relationship oldRelationship : oldRelationshipGroup.getRelationships()) {
				oldRelationships.add(oldRelationship);
			}
		}

		for (RelationshipGroup newRelationshipGroup : newExpression.getGroupedRelationships()) {
			for (Relationship newRelationship : newRelationshipGroup.getRelationships()) {
				for (Relationship oldRelationship : oldRelationships) {
					updateRelationship(newRelationship, oldRelationship);
				}

				if (null == newRelationship.getId()) {
					newRelationship.setId(generateRandomItemIndentifier());
				}
			}
		}

		return newExpression;
	}

	private void updateRelationship(Relationship newRelationship, Relationship oldRelationship) {
		if (newRelationship.getType().getId().equals(oldRelationship.getType().getId()) && newRelationship.getDestination().getId().equals(oldRelationship.getDestination().getId())) {
			newRelationship.setId(oldRelationship.getId());
			newRelationship.setDefined(oldRelationship.isDefined());
			newRelationship.getType().setDefined(oldRelationship.getType().isDefined());
			newRelationship.getDestination().setDefined(oldRelationship.getDestination().isDefined());
		}
	}

	private IParseResult getParserResult(String dsl) {
		VisualizationDslParser dslParser = VisualizationDslStandaloneSetup.getInstance().getParser();
		IParseResult parseResult = dslParser.doParse(dsl);

		return parseResult;
	}
	
	private String createOldPresentation(Expression expression) {
		StringBuilder sb = new StringBuilder();
		Iterator<Concept> isaIterator = expression.getIsaRelationships().getRelationships().iterator();
		while (isaIterator.hasNext()) {
			Concept concept = isaIterator.next();
			sb.append(concept.getId() + "|" + concept.getTerm() + "|");
			if (isaIterator.hasNext()) {
				sb.append(" + ");
			}
		}

		if ((null != expression.getUngroupedRelationships() && expression.getUngroupedRelationships().getRelationships().size() > 0) || !expression.getGroupedRelationships().isEmpty()) {
			sb.append(":");
		}

		if (null != expression.getUngroupedRelationships()) {
			if (!expression.getUngroupedRelationships().getRelationships().isEmpty()) {
				sb.append("\n");
			}
			
			Iterator<Relationship> relationshipIterator = expression.getUngroupedRelationships().getRelationships().iterator();
			while (relationshipIterator.hasNext()) {
				Relationship relationship = relationshipIterator.next();
				sb.append(relationship.getType().getId() + "|" + relationship.getType().getTerm() + "|");
				sb.append(" = ");
				sb.append(relationship.getDestination().getId() + "|" + relationship.getDestination().getTerm() + "|");
				if (relationshipIterator.hasNext()) {
					sb.append(",\n");
				}
			}
		}

		Iterator<RelationshipGroup> groupsIterator = expression.getGroupedRelationships().iterator();
		while (groupsIterator.hasNext()) {
			Iterator<Relationship> groupIterator = groupsIterator.next().getRelationships().iterator();
			boolean notEmpty = false;
			if (groupIterator.hasNext()) {
				notEmpty = true;
			}

			// necessary because during the deletion of the relationship group
			// members, the expression can be in a state,
			// where the deleted relationship group exist but with no members
			if (notEmpty) {
				sb.append("\n{\n");
			}
			while (groupIterator.hasNext()) {
				Relationship relationship = groupIterator.next();
				sb.append("  ");
				sb.append(relationship.getType().getId() + "|" + relationship.getType().getTerm() + "|");
				sb.append(" = ");
				sb.append(relationship.getDestination().getId() + "|" + relationship.getDestination().getTerm() + "|");
				if (groupIterator.hasNext()) {
					sb.append(",\n");
				}
			}
			if (notEmpty) {
				sb.append("\n}");
			}
		}

		return sb.toString();
	}
	
	// TODO remove
	private String generateRandomItemIndentifier() {
		Random random = new Random();
		// nextInt excludes top value, add 1 to make it inclusive
		int randomNum = random.nextInt(99999999 - 100 + 1) + 100;
		return Integer.toString(randomNum);
	}
}
