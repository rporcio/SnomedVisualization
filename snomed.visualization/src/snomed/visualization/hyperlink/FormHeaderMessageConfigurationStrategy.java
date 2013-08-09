
package snomed.visualization.hyperlink;

import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.IMessage;
import org.eclipse.ui.forms.events.HyperlinkAdapter;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.forms.widgets.FormText;

/**
 * Strategy form create a form text based popup for the form {@link IMessage message}s- 
 * @author akitta
 * @see IFormTextConfigurationStrategy
 */
public class FormHeaderMessageConfigurationStrategy implements IFormTextConfigurationStrategy {

	/*
	 * (non-Javadoc)
	 * @see com.b2international.snowowl.ui.presenter.IFormTextConfigurationStrategy#configureFormText(org.eclipse.ui.forms.IManagedForm, org.eclipse.ui.forms.widgets.FormText)
	 */
	@Override
	public void configureFormText(final IManagedForm managedForm, final FormText text) {
		text.addHyperlinkListener(new HyperlinkAdapter() {
			public void linkActivated(final HyperlinkEvent e) {
				final String is = (String) e.getHref();
				try {
					final int index = Integer.parseInt(is);
					final IMessage[] messages = managedForm.getForm().getForm().getChildrenMessages();
					final IMessage message = messages[index];
					final Control c = message.getControl();
					((FormText) e.widget).getShell().dispose();
					if (null != c) {
						Display.getCurrent().asyncExec(new Runnable() {
							@Override public void run() {
								c.setFocus();
							}
						});
					}
				} catch (final NumberFormatException ex) {
				}
			}
		});
		text.setImage("error", getImage(IMessageProvider.ERROR));
		text.setImage("warning", getImage(IMessageProvider.WARNING));
		text.setImage("info", getImage(IMessageProvider.INFORMATION));
	}
	
	private Image getImage(final int type) {
		switch (type) {
			case IMessageProvider.ERROR:
				return getPlatformImage(ISharedImages.IMG_OBJS_ERROR_TSK);
			case IMessageProvider.WARNING:
				return getPlatformImage(ISharedImages.IMG_OBJS_WARN_TSK);
			case IMessageProvider.INFORMATION:
				return getPlatformImage(ISharedImages.IMG_OBJS_INFO_TSK);
			default: return null;
		}
	}

	private Image getPlatformImage(final String symbolicName) {
		return PlatformUI.getWorkbench().getSharedImages().getImage(symbolicName);
	}

}
