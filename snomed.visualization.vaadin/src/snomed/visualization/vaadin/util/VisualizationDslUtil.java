package snomed.visualization.vaadin.util;

import java.io.Serializable;
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

import com.google.gwt.thirdparty.guava.common.collect.Lists;

/**
 * Utility class to validate or convert the expression in text format using {@link VisualizationDslParser}.
 * 
 * @author rporcio
 */
public class VisualizationDslUtil implements Serializable {

	private static final long serialVersionUID = 5592163341926073094L;
	
	private enum FormatterState {
		ISAREALATIONSHIP,
		RELATIONSHIPGROUP,
		STANDALONERELATIONSHIP
	}
	
	/**
	 * Converts the given dsl from String format to {@link Expression} format.
	 * 
	 * @param dsl the string representation of the expression.
	 * @return the converted expression.
	 */
	public Expression convertToExpression(String dsl) {
		VisualizationDslParser dslParser = VisualizationDslStandaloneSetup.getInstance().getParser();
		return ((ModelImpl)dslParser.doParse(dsl).getRootASTElement()).getExpression();
	}
	
	/**
	 * Converts the given expression the a presentation (string) format.
	 * 
	 * @param expression the expression to be converted.
	 * @return the created string representation of the expression.
	 */
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
			sb.append(":");
		}

		if (null != expression.getStandaloneRelationships()) {
			Iterator<Relationship> relationshipIterator = expression.getStandaloneRelationships().getRelationships().iterator();
			while (relationshipIterator.hasNext()) {
				Relationship relationship = relationshipIterator.next();
				sb.append(relationship.getType().getId() + " | " + relationship.getType().getTerm() + " |");
				sb.append(" = ");
				sb.append(relationship.getDestination().getId() + " | " + relationship.getDestination().getTerm() + " |");
				if (relationshipIterator.hasNext()) {
					sb.append(",");
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
			
			// necessary because during the deletion of the relationship group members, the expression can be in a state,
			// where the deleted relationship group exist but with no members 
			if (notEmpty) {
				sb.append("{");
			}
			while (groupIterator.hasNext()) {
				Relationship relationship = groupIterator.next();
				sb.append(relationship.getType().getId() + " | " + relationship.getType().getTerm() + " |");
				sb.append(" = ");
				sb.append(relationship.getDestination().getId() + " | " + relationship.getDestination().getTerm() + " |");
				if (groupIterator.hasNext()) {
					sb.append(",");
				}
			}
			if (notEmpty) {
				sb.append("}");
			}
		}

		return addHtmlFormatters(sb.toString());
	}
	
	/**
	 * Adds html tags (eg: white space, new line) to the given dsl.
	 * 
	 * @param dsl the string to be extended.
	 * @return the extended string with html tags.
	 */
	public String addHtmlFormatters(String dsl) {
		String formattedDsl = "";
		
		FormatterState state = FormatterState.ISAREALATIONSHIP;
		
		for (char c : dsl.toCharArray()) {
			if (c == ':') {
				formattedDsl = formattedDsl.concat(":<br>&nbsp;");
				state = FormatterState.STANDALONERELATIONSHIP;
			} else if (c == ',') {
				formattedDsl = formattedDsl.concat(",<br>");
				if (state.equals(FormatterState.STANDALONERELATIONSHIP)) {
					formattedDsl = formattedDsl.concat("&nbsp;");
				} else if (state.equals(FormatterState.RELATIONSHIPGROUP)) {
					formattedDsl = formattedDsl.concat("&nbsp;&nbsp;&nbsp;");
				}
			} else if (c == '{') {
				formattedDsl = formattedDsl.concat("<br>&nbsp;{<br>&nbsp;&nbsp;&nbsp;");
				state = FormatterState.RELATIONSHIPGROUP;
			} else if (c == '}') {
				formattedDsl = formattedDsl.concat("<br>&nbsp;}");
			} else {
				formattedDsl = formattedDsl + c;
			}
		}
		
		return formattedDsl;
	}
	
	/**
	 * Removes the html tags from the given dsl.
	 * 
	 * @param dsl a string which contains html tags.
	 * @return the truncated dsl.
	 */
	public String removeHtmlFormatters(String dsl) {
		return dsl.replaceAll("\\<[^>]*>","").replaceAll("\t", "").replaceAll("&nbsp;", "");
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
