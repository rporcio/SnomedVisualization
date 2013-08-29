package snomed.visualization.vaadin.util;

import java.io.Serializable;
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

import com.google.gwt.thirdparty.guava.common.collect.Lists;

/**
 * Utility class to validate or convert the expression in text format using {@link VisualizationDslParser}.
 * 
 * @author rporcio
 */
public class VisualizationDslUtil implements Serializable {

	private static final long serialVersionUID = 5592163341926073094L;
	
	/**
	 * Converts the given dsl from String format to {@link Expression} format.
	 * 
	 * @param dsl the string representation of the expression.
	 * @return the converted expression.
	 */
	public Expression convertToExpression(String dsl) {
		VisualizationDslParser dslParser = VisualizationDslStandaloneSetup.getInstance().getParser();
		return ((Expression) dslParser.doParse(dsl).getRootASTElement());
	}
	
	/**
	 * Converts the given expression the a presentation (string) format.
	 * 
	 * @param expression the expression to be converted.
	 * @return the created string representation of the expression.
	 */
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
	
	/**
	 * Adds html tags (eg: white space, new line) to the given dsl.
	 * 
	 * @param dsl the string to be extended.
	 * @return the extended string with html tags.
	 */
	public String addHtmlTags(String dsl) {
		return dsl.replaceAll("\r\n", "<br>").replaceAll("\n", "<br>").replaceAll("\r", "<br>").replaceAll("  ", "&nbsp;&nbsp;");
	}
	
	/**
	 * Removes the html tags from the given dsl.
	 * 
	 * @param dsl a string which contains html tags.
	 * @return the truncated dsl.
	 */
	public String removeHtmlTags(String dsl) {
		return dsl.replaceAll("<br>", "\r\n").replaceAll("\\<[^>]*>","").replaceAll("\t", "").replaceAll("&nbsp;", " ");
	}
	
	/**
	 * Checks if the given dsl is valid against the xtext validator.
	 * 
	 * @param dsl the expression in string format to be validated.
	 * @return <code>true</code> if valid.
	 */
	public boolean isValid(String dsl) {
		return !getParserResult(dsl).hasSyntaxErrors();
	}
	
	/**
	 * Gets the syntax errors for the given dsl.
	 * 
	 * @param dsl the expression in string format.
	 * @return the syntax errors from the dsl.
	 */
	public Iterable<INode> getSyntaxErrors(String dsl) {
		return getParserResult(dsl).getSyntaxErrors();
	}
	
	/**
	 * Updates the new expression from the previous expression (matching relationship attributes, etc)
	 * 
	 * @param oldExpression the previous expression.
	 * @param dsl the string representation of the new expression.
	 * @return the newly created and updated expression.
	 */
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

	private IParseResult getParserResult(String dsl) {
		VisualizationDslParser dslParser = VisualizationDslStandaloneSetup.getInstance().getParser();
		IParseResult parseResult = dslParser.doParse(dsl);
		
		return parseResult;
	}
	
	private void updateRelationship(Relationship newRelationship, Relationship oldRelationship) {
		if (newRelationship.getType().getId().equals(oldRelationship.getType().getId()) && newRelationship.getDestination().getId().equals(oldRelationship.getDestination().getId())) {
			newRelationship.setId(oldRelationship.getId());
			newRelationship.setDefined(oldRelationship.isDefined());
			newRelationship.getType().setDefined(oldRelationship.getType().isDefined());
			newRelationship.getDestination().setDefined(oldRelationship.getDestination().isDefined());
		}
	}
	
	// TODO remove
	private String generateRandomItemIndentifier() {
		Random random = new Random();
		// nextInt excludes top value, add 1 to make it inclusive
		int randomNum = random.nextInt(99999999 - 100 + 1) + 100;
		return Integer.toString(randomNum);
	}

}
