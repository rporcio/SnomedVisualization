package snomed.visualization.dsl.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import snomed.visualization.dsl.services.VisualizationDslGrammarAccess;

@SuppressWarnings("all")
public class VisualizationDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected VisualizationDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Concept_WSTerminalRuleCall_2_a;
	protected AbstractElementAlias match_Concept_WSTerminalRuleCall_5_a;
	protected AbstractElementAlias match_Expression_COLONTerminalRuleCall_1_0_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (VisualizationDslGrammarAccess) access;
		match_Concept_WSTerminalRuleCall_2_a = new TokenAlias(true, true, grammarAccess.getConceptAccess().getWSTerminalRuleCall_2());
		match_Concept_WSTerminalRuleCall_5_a = new TokenAlias(true, true, grammarAccess.getConceptAccess().getWSTerminalRuleCall_5());
		match_Expression_COLONTerminalRuleCall_1_0_q = new TokenAlias(false, true, grammarAccess.getExpressionAccess().getCOLONTerminalRuleCall_1_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getCLOSING_CURLY_BRACKETRule())
			return getCLOSING_CURLY_BRACKETToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getCOLONRule())
			return getCOLONToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getCOMMARule())
			return getCOMMAToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getEQUAL_SIGNRule())
			return getEQUAL_SIGNToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getOPENING_CURLY_BRACKETRule())
			return getOPENING_CURLY_BRACKETToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getPIPERule())
			return getPIPEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getPLUS_SIGNRule())
			return getPLUS_SIGNToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getWSRule())
			return getWSToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal CLOSING_CURLY_BRACKET: '}';
	 */
	protected String getCLOSING_CURLY_BRACKETToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "}";
	}
	
	/**
	 * terminal COLON : ':';
	 */
	protected String getCOLONToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ":";
	}
	
	/**
	 * terminal COMMA: ',';
	 */
	protected String getCOMMAToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ",";
	}
	
	/**
	 * terminal EQUAL_SIGN: '=';
	 */
	protected String getEQUAL_SIGNToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "=";
	}
	
	/**
	 * terminal OPENING_CURLY_BRACKET : '{';
	 */
	protected String getOPENING_CURLY_BRACKETToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "{";
	}
	
	/**
	 * terminal PIPE : '|';
	 */
	protected String getPIPEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "|";
	}
	
	/**
	 * terminal PLUS_SIGN : '+';
	 */
	protected String getPLUS_SIGNToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "+";
	}
	
	/**
	 * terminal WS : (' '|'\t'|'\n'|'\r');
	 */
	protected String getWSToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return " ";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Concept_WSTerminalRuleCall_2_a.equals(syntax))
				emit_Concept_WSTerminalRuleCall_2_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Concept_WSTerminalRuleCall_5_a.equals(syntax))
				emit_Concept_WSTerminalRuleCall_5_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Expression_COLONTerminalRuleCall_1_0_q.equals(syntax))
				emit_Expression_COLONTerminalRuleCall_1_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_Concept_WSTerminalRuleCall_2_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_Concept_WSTerminalRuleCall_5_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     COLON?
	 */
	protected void emit_Expression_COLONTerminalRuleCall_1_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
