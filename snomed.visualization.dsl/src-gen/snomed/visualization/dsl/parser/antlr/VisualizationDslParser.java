/*
* generated by Xtext
*/
package snomed.visualization.dsl.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import snomed.visualization.dsl.services.VisualizationDslGrammarAccess;

public class VisualizationDslParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private VisualizationDslGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected snomed.visualization.dsl.parser.antlr.internal.InternalVisualizationDslParser createParser(XtextTokenStream stream) {
		return new snomed.visualization.dsl.parser.antlr.internal.InternalVisualizationDslParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Expression";
	}
	
	public VisualizationDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(VisualizationDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
