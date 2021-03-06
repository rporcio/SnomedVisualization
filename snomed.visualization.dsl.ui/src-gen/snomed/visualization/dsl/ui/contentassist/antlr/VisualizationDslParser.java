/*
* generated by Xtext
*/
package snomed.visualization.dsl.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import snomed.visualization.dsl.services.VisualizationDslGrammarAccess;

public class VisualizationDslParser extends AbstractContentAssistParser {
	
	@Inject
	private VisualizationDslGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected snomed.visualization.dsl.ui.contentassist.antlr.internal.InternalVisualizationDslParser createParser() {
		snomed.visualization.dsl.ui.contentassist.antlr.internal.InternalVisualizationDslParser result = new snomed.visualization.dsl.ui.contentassist.antlr.internal.InternalVisualizationDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getExpressionAccess().getGroup(), "rule__Expression__Group__0");
					put(grammarAccess.getExpressionAccess().getGroup_1(), "rule__Expression__Group_1__0");
					put(grammarAccess.getIsaRelationshipsAccess().getGroup(), "rule__IsaRelationships__Group__0");
					put(grammarAccess.getIsaRelationshipsAccess().getGroup_1(), "rule__IsaRelationships__Group_1__0");
					put(grammarAccess.getRelationshipGroupAccess().getGroup(), "rule__RelationshipGroup__Group__0");
					put(grammarAccess.getRelationshipGroupAccess().getGroup_2(), "rule__RelationshipGroup__Group_2__0");
					put(grammarAccess.getRelationshipsAccess().getGroup(), "rule__Relationships__Group__0");
					put(grammarAccess.getRelationshipsAccess().getGroup_1(), "rule__Relationships__Group_1__0");
					put(grammarAccess.getRelationshipAccess().getGroup(), "rule__Relationship__Group__0");
					put(grammarAccess.getConceptAccess().getGroup(), "rule__Concept__Group__0");
					put(grammarAccess.getExpressionAccess().getIsaRelationshipsAssignment_0(), "rule__Expression__IsaRelationshipsAssignment_0");
					put(grammarAccess.getExpressionAccess().getUngroupedRelationshipsAssignment_1_1(), "rule__Expression__UngroupedRelationshipsAssignment_1_1");
					put(grammarAccess.getExpressionAccess().getGroupedRelationshipsAssignment_1_2(), "rule__Expression__GroupedRelationshipsAssignment_1_2");
					put(grammarAccess.getIsaRelationshipsAccess().getRelationshipsAssignment_0(), "rule__IsaRelationships__RelationshipsAssignment_0");
					put(grammarAccess.getIsaRelationshipsAccess().getRelationshipsAssignment_1_1(), "rule__IsaRelationships__RelationshipsAssignment_1_1");
					put(grammarAccess.getRelationshipGroupAccess().getRelationshipsAssignment_1(), "rule__RelationshipGroup__RelationshipsAssignment_1");
					put(grammarAccess.getRelationshipGroupAccess().getRelationshipsAssignment_2_1(), "rule__RelationshipGroup__RelationshipsAssignment_2_1");
					put(grammarAccess.getRelationshipsAccess().getRelationshipsAssignment_0(), "rule__Relationships__RelationshipsAssignment_0");
					put(grammarAccess.getRelationshipsAccess().getRelationshipsAssignment_1_1(), "rule__Relationships__RelationshipsAssignment_1_1");
					put(grammarAccess.getRelationshipAccess().getTypeAssignment_0(), "rule__Relationship__TypeAssignment_0");
					put(grammarAccess.getRelationshipAccess().getDestinationAssignment_2(), "rule__Relationship__DestinationAssignment_2");
					put(grammarAccess.getConceptAccess().getIdAssignment_0(), "rule__Concept__IdAssignment_0");
					put(grammarAccess.getConceptAccess().getTermAssignment_3(), "rule__Concept__TermAssignment_3");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			snomed.visualization.dsl.ui.contentassist.antlr.internal.InternalVisualizationDslParser typedParser = (snomed.visualization.dsl.ui.contentassist.antlr.internal.InternalVisualizationDslParser) parser;
			typedParser.entryRuleExpression();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public VisualizationDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(VisualizationDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
