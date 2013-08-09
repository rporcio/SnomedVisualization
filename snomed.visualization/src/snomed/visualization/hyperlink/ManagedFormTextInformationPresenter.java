package snomed.visualization.hyperlink;

import org.eclipse.jface.text.AbstractInformationControl;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.widgets.FormText;
import org.eclipse.ui.forms.widgets.ScrolledFormText;

import com.google.common.base.Preconditions;

/**
 * Rich form based implementation of {@link org.eclipse.jface.text.IInformationControl}.
 * <p>
 * Displays textual information in a {@link org.eclipse.ui.forms.widgets.FormText}
 * widget. Before displaying, the information set to this information control is
 * processed by an {@code IInformationPresenter}.
 *
 * @author akitta
 *
 */
public class ManagedFormTextInformationPresenter extends AbstractInformationControl {

	private final IManagedForm managedForm;
	private FormText text;
	private final IFormTextConfigurationStrategy strategy;

	public ManagedFormTextInformationPresenter(final IManagedForm managedForm, final IFormTextConfigurationStrategy strategy, final boolean resizable) {
		super(managedForm.getForm().getShell(), resizable);
		Preconditions.checkNotNull(strategy, "Form text configuration strategy argument cannot be null");
		this.strategy = null == strategy ? IFormTextConfigurationStrategy.NULL_IMPL : strategy;
		this.managedForm = managedForm;
		create();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.text.IInformationControlExtension#hasContents()
	 */
	@Override
	public boolean hasContents() {
		return true;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.text.AbstractInformationControl#createContent(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	protected void createContent(Composite parent) {
		ScrolledFormText scrolledFormText = new ScrolledFormText(parent, false);
		scrolledFormText.setBackground(managedForm.getToolkit().getColors().getBackground());
		text = managedForm.getToolkit().createFormText(scrolledFormText, true);
		scrolledFormText.setFormText(text);
		strategy.configureFormText(managedForm, text);
	}
	
	@Override
	public void setInformation(String information) {
		text.setText(information, true, false);
	}
	
}
