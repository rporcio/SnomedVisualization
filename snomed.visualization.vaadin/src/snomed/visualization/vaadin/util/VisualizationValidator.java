package snomed.visualization.vaadin.util;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.SyntaxErrorMessage;
import org.eclipse.xtext.parser.IParseResult;

import snomed.visualization.dsl.VisualizationDslStandaloneSetup;
import snomed.visualization.dsl.parser.antlr.VisualizationDslParser;

import com.vaadin.data.Validator;

/**
 * Validator class to validate the content of the text area which contains the
 * the expression in text format.
 * 
 * @author rporcio
 * @deprecated use {@link VisualizationDslUtil} instead
 */
public class VisualizationValidator implements Validator {

	private static final long serialVersionUID = 3460720692725279963L;
	private CharacterState state;
	private ComponentState componentState;
	private boolean destinationConcept;
	private boolean firstDigit;
	private boolean lastDigit;
	
	private enum CharacterState {
		ID,
		TERM,
		COMMA,
		SEPARATOR,
		INNER_VERTICAL_BAR,
		ENDING_VERTICAL_BAR,
		ENDING_BRACKET,
		ERROR
	}
	
	private enum ComponentState {
		ISA,
		STANDALONE,
		GROUP
	}
	
	@Override
	public void validate(Object value) throws InvalidValueException {
		destinationConcept = true;
		firstDigit = true;
		lastDigit = false;
		state = CharacterState.ID;
		componentState = ComponentState.ISA; 
		
		String dsl = value.toString().replaceAll("&nbsp;", "").replaceAll("<br>", "").trim();
		
		VisualizationDslParser parser = VisualizationDslStandaloneSetup.getInstance().getParser();
		IParseResult result = parser.doParse(dsl);
		
		boolean syntaxErrors = result.hasSyntaxErrors();
		Iterable<INode> errors = result.getSyntaxErrors();
		Iterator<INode> iterator = errors.iterator();
		while (iterator.hasNext()) {
			INode next = iterator.next();
			String text = next.getText();
			SyntaxErrorMessage syntaxErrorMessage = next.getSyntaxErrorMessage();
			String message = syntaxErrorMessage.getMessage();
			int totalStartLine = next.getTotalStartLine();
			int totalEndLine = next.getTotalEndLine();
			int totalOffset = next.getTotalOffset();
			int totalEndOffset = next.getTotalEndOffset();
			int totalLength = next.getTotalLength();
			EObject grammarElement = next.getGrammarElement();
			Iterable<ILeafNode> leafNodes = next.getLeafNodes();
			System.out.println();
		}
		
		for (char c : dsl.toCharArray()) {
			switch (state) {
			case ID:
				evaulateId(c);
				continue;
			case TERM:
				evaulateTerm(c);
				continue;
			case INNER_VERTICAL_BAR:
				evaulateInnerVerticalBar(c);
				continue;
			case COMMA:
				evaulateComma(c);
				continue;
			case SEPARATOR:
				evaulateSpearator(c);
				continue;
			case ENDING_VERTICAL_BAR:
				evaulateEndingVerticalBar(c);
				continue;
			case ENDING_BRACKET:
				evaulateEndingBracket(c);
				continue;
			case ERROR:
				break;
			}
		}
		
		if (state != CharacterState.ENDING_VERTICAL_BAR && state != CharacterState.ENDING_BRACKET) {
			throw new InvalidValueException(getErrorMessage());
		} else {
			if (componentState == ComponentState.GROUP && state != CharacterState.ENDING_BRACKET) {
				throw new InvalidValueException(getErrorMessage());
			} else if (componentState == ComponentState.STANDALONE && !destinationConcept) {
				throw new InvalidValueException(getErrorMessage());
			}
		}
		
	}
	
	private void evaulateId(char c) {
		if (Character.isDigit(c)) {
			if (lastDigit) {
				state = CharacterState.ERROR;
			} else {
				firstDigit = false;
			}
		} else if (c == '|') {
			state = CharacterState.INNER_VERTICAL_BAR;
		} else if (Character.isWhitespace(c)) {
			if (!firstDigit && !lastDigit) {
				lastDigit = true;
			}
		} else {
			state = CharacterState.ERROR;
		}
	}
	
	private void evaulateTerm(char c) {
		if (Character.isLetter(c)) {
		} else if (Character.isWhitespace(c)) { 
			// do nothing
		} else if (c == '|') {
			state = CharacterState.ENDING_VERTICAL_BAR;
		} else {
			state = CharacterState.ERROR;
		}
	}

	private void evaulateInnerVerticalBar(char c) {
		if (Character.isLetter(c)) {
			state = CharacterState.TERM;
		} else if (Character.isWhitespace(c)) { 
			// do nothing
		} else {
			state = CharacterState.ERROR;
		}
	}

	private void evaulateComma(char c) {
		if (Character.isWhitespace(c)) {
		} else if (Character.isDigit(c)) {
			state = CharacterState.ID;
			firstDigit = true;
			lastDigit = false;
		} else  {
			state = CharacterState.ERROR;
		}
	}

	private void evaulateSpearator(char c) {
		if (Character.isDigit(c)) {
			state = CharacterState.ID;
			firstDigit = true;
			lastDigit = false;
		} else if (c == '{') {
			componentState = ComponentState.GROUP;
		} else if (Character.isWhitespace(c)) { 
			// do nothing
		} else {
			state = CharacterState.ERROR;
		}
	}

	private void evaulateEndingVerticalBar(char c) {
		if (c == '+') {
			state = CharacterState.SEPARATOR;
		} else if (c == ':') {
			state = CharacterState.SEPARATOR;
			componentState = ComponentState.STANDALONE;
			destinationConcept = false;
		} else if (c == '=') {
			state = CharacterState.SEPARATOR;
			destinationConcept = true;
		} else if (c == ',') {
			state = CharacterState.COMMA;
			destinationConcept = false;
		} else if (c == '{') {
			if (componentState == ComponentState.ISA){
				state = CharacterState.ERROR;
			} else {
				state = CharacterState.SEPARATOR;
				componentState = ComponentState.GROUP;
			}
		} else if (c == '}') {
			state = CharacterState.ENDING_BRACKET;
		} else if (Character.isWhitespace(c)) {
			// do nothing
		} else {
			state = CharacterState.ERROR;
		}
	}

	private void evaulateEndingBracket(char c) {
		if (c == '{') {
			state = CharacterState.SEPARATOR;
		} else if (Character.isWhitespace(c)) {
			// do nothing
		} else {
			state = CharacterState.ERROR;
		}
	}
	
	private String getErrorMessage() {
		return "There are one or more errors in the expression. Fix these errors before continue.";
	}

}
