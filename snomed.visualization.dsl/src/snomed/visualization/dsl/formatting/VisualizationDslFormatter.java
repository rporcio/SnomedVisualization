package snomed.visualization.dsl.formatting;

import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;

import snomed.visualization.dsl.services.VisualizationDslGrammarAccess;

/**
 * 
 * @author rporcio
 */
public class VisualizationDslFormatter extends AbstractDeclarativeFormatter {

 	@Override
	protected void configureFormatting(FormattingConfig c) {
		VisualizationDslGrammarAccess ga = (VisualizationDslGrammarAccess) getGrammarAccess();
		
		c.setAutoLinewrap(100);
		
		// comment
		c.setLinewrap(0, 1, 2).before(ga.getSL_COMMENTRule());
		c.setLinewrap(0, 1, 2).before(ga.getML_COMMENTRule());
		c.setLinewrap(0, 1, 1).after(ga.getML_COMMENTRule());
		
		// no space between pipe, pipe and concept id, space after closing pipe
		c.setNoSpace().before(ga.getConceptAccess().getPIPETerminalRuleCall_1());
		c.setNoSpace().after(ga.getConceptAccess().getPIPETerminalRuleCall_1());
		c.setNoSpace().before(ga.getConceptAccess().getPIPETerminalRuleCall_4());
		
		// set space before and after '+' character
		c.setSpace(" ").before(ga.getPLUS_SIGNRule());
		c.setSpace(" ").after(ga.getPLUS_SIGNRule());
		
		// set space before and after '=' character
		c.setSpace(" ").before(ga.getEQUAL_SIGNRule());
		c.setSpace(" ").after(ga.getEQUAL_SIGNRule());
		
		// line wrap after ':'
		c.setLinewrap().after(ga.getCOLONRule());
		
		// set new line after ',' character
		c.setLinewrap().after(ga.getCOMMARule());
		
		// set new line before '{' and '}' characters
		c.setLinewrap().before(ga.getOPENING_CURLY_BRACKETRule());
		c.setLinewrap().before(ga.getCLOSING_CURLY_BRACKETRule());
		
		// do not break the line after '|'
		c.setNoLinewrap().after(ga.getConceptAccess().getPIPETerminalRuleCall_1());

		// do not break the line before '|'
		c.setNoLinewrap().before(ga.getConceptAccess().getPIPETerminalRuleCall_4());
		
		// set no space before ',', ':' characters
		c.setNoSpace().before(ga.getCOMMARule());
		c.setNoSpace().before(ga.getCOLONRule());
		
		// set no space before the concept term
		c.setNoSpace().after(ga.getTERMRule());
		
		// set new line and 2 space before the relationships in the relationship groups
		c.setSpace("\n  ").before(ga.getRelationshipGroupAccess().getRelationshipsRelationshipParserRuleCall_1_0());
		c.setSpace("\n  ").after(ga.getRelationshipGroupAccess().getCOMMATerminalRuleCall_2_0());
	}

}
