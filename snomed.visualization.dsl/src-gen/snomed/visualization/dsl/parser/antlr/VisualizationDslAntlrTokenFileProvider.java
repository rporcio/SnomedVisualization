/*
* generated by Xtext
*/
package snomed.visualization.dsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class VisualizationDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("snomed/visualization/dsl/parser/antlr/internal/InternalVisualizationDsl.tokens");
	}
}
