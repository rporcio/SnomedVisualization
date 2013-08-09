package snomed.visualization.hyperlink;

import org.eclipse.swt.widgets.Control;

@SuppressWarnings("restriction")
public enum NullMessageToolTipManager implements org.eclipse.ui.internal.forms.IMessageToolTipManager {

	INSTANCE;
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.internal.forms.IMessageToolTipManager#createToolTip(org.eclipse.swt.widgets.Control, boolean)
	 */
	@Override
	public void createToolTip(final Control control, final boolean imageControl) {
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.internal.forms.IMessageToolTipManager#update()
	 */
	@Override
	public void update() {
	}

}