package snomed.visualization.hyperlink;

import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.events.IHyperlinkListener;
import org.eclipse.ui.forms.widgets.FormText;

/**
 * Strategy for configuring {@link FormText form text}. E.g.: clients may 
 * add custom {@link IHyperlinkListener hyperlink listener} to the form text or
 * configure images to described in the HTML.
 * @author akitta
 */
public interface IFormTextConfigurationStrategy {

	/**
	 * Configure the form text. 
	 * @param managedForm the managed form which used for creating the form text.
	 * @param text the form text to configure.
	 */
	void configureFormText(final IManagedForm managedForm, final FormText text);

	/**
	 * Null implementation. Does nothing.
	 */
	public static final IFormTextConfigurationStrategy NULL_IMPL = new IFormTextConfigurationStrategy() {
		@Override public void configureFormText(final IManagedForm managedForm, final FormText text) {
			//does nothing.
		}
	}; 
	
}
