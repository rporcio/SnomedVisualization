package snomed.visualization.util;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.parser.IParseResult;

import snomed.visualization.dsl.VisualizationDslStandaloneSetup;
import snomed.visualization.dsl.parser.antlr.VisualizationDslParser;
import snomed.visualization.dsl.visualizationDsl.Concept;
import snomed.visualization.dsl.visualizationDsl.Expression;
import snomed.visualization.dsl.visualizationDsl.Relationship;
import snomed.visualization.dsl.visualizationDsl.RelationshipGroup;
import snomed.visualization.dsl.visualizationDsl.impl.ModelImpl;

import com.google.common.collect.Lists;

public class VisualizationDslUtil {

	public Expression convertToExpression(String dsl) {
		VisualizationDslParser dslParser = VisualizationDslStandaloneSetup.getInstance().getParser();
		return ((ModelImpl) dslParser.doParse(dsl).getRootASTElement()).getExpression();
	}

	public String convertToPresentation(Expression expression) {
		StringBuilder sb = new StringBuilder();
		Iterator<Concept> isaIterator = expression.getIsaRelationships().getRelationships().iterator();
		while (isaIterator.hasNext()) {
			Concept concept = isaIterator.next();
			sb.append(concept.getId() + " | " + concept.getTerm() + " |");
			if (isaIterator.hasNext()) {
				sb.append(" + ");
			}
		}

		if ((null != expression.getStandaloneRelationships() && expression.getStandaloneRelationships().getRelationships().size() > 0) || !expression.getRelationshipGroups().isEmpty()) {
			sb.append(":\n");
		}

		if (null != expression.getStandaloneRelationships()) {
			Iterator<Relationship> relationshipIterator = expression.getStandaloneRelationships().getRelationships().iterator();
			while (relationshipIterator.hasNext()) {
				sb.append("  ");
				Relationship relationship = relationshipIterator.next();
				sb.append(relationship.getType().getId() + " | " + relationship.getType().getTerm() + " |");
				sb.append(" = ");
				sb.append(relationship.getDestination().getId() + " | " + relationship.getDestination().getTerm() + " |");
				if (relationshipIterator.hasNext()) {
					sb.append(",\n");
				}
			}
		}

		Iterator<RelationshipGroup> groupsIterator = expression.getRelationshipGroups().iterator();
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
				sb.append("\n  {\n");
			}
			while (groupIterator.hasNext()) {
				Relationship relationship = groupIterator.next();
				sb.append("\t");
				sb.append(relationship.getType().getId() + " | " + relationship.getType().getTerm() + " |");
				sb.append(" = ");
				sb.append(relationship.getDestination().getId() + " | " + relationship.getDestination().getTerm() + " |");
				if (groupIterator.hasNext()) {
					sb.append(",\n");
				}
			}
			if (notEmpty) {
				sb.append("\n  }");
			}
		}

		return sb.toString();
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

		if (null != newExpression.getStandaloneRelationships() && null != oldExpression.getStandaloneRelationships()) {
			for (Relationship newRelationship : newExpression.getStandaloneRelationships().getRelationships()) {
				for (Relationship oldRelationship : oldExpression.getStandaloneRelationships().getRelationships()) {
					updateRelationship(newRelationship, oldRelationship);
				}

				if (null == newRelationship.getId()) {
					newRelationship.setId(generateRandomItemIndentifier());
				}
			}
		}

		List<Relationship> oldRelationships = Lists.newArrayList();

		for (RelationshipGroup oldRelationshipGroup : oldExpression.getRelationshipGroups()) {
			for (Relationship oldRelationship : oldRelationshipGroup.getRelationships()) {
				oldRelationships.add(oldRelationship);
			}
		}

		for (RelationshipGroup newRelationshipGroup : newExpression.getRelationshipGroups()) {
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
	
	// TODO remove
		private String generateRandomItemIndentifier() {
			Random random = new Random();
			// nextInt excludes top value, add 1 to make it inclusive
			int randomNum = random.nextInt(99999999 - 100 + 1) + 100;
			return Integer.toString(randomNum);
		}
}
