package snomed.visualization.util;

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
		org.eclipse.xtext.serializer.impl.Serializer serializer = VisualizationDslStandaloneSetup.getInstance().getSerializer();
		
		if (null != expression.getUngroupedRelationships() && 0 == expression.getUngroupedRelationships().getRelationships().size()) {
			expression.setUngroupedRelationships(null);
		}
		
		if (null != expression.getGroupedRelationships()) {
			int i = 0;
			for (RelationshipGroup relationshipGroup : expression.getGroupedRelationships()) {
				if (null != relationshipGroup && 0 == relationshipGroup.getRelationships().size()) {
					expression.getGroupedRelationships().remove(i);
					
					break;
				}
				
				i++;
			}
		}
		
		return serializer.serialize(expression);
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
	
	// TODO remove
	private String generateRandomItemIndentifier() {
		Random random = new Random();
		// nextInt excludes top value, add 1 to make it inclusive
		int randomNum = random.nextInt(99999999 - 100 + 1) + 100;
		return Integer.toString(randomNum);
	}
}
