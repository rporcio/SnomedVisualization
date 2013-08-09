package snomed.visualization.hyperlink;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.Assert;
import org.eclipse.jface.text.AbstractInformationControl;
import org.eclipse.jface.text.AbstractInformationControlManager;
import org.eclipse.jface.text.DefaultInformationControl;
import org.eclipse.jface.text.IDocumentExtension3;
import org.eclipse.jface.text.IInformationControl;
import org.eclipse.jface.text.IInformationControlCreator;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.IViewportListener;
import org.eclipse.jface.text.IWidgetTokenKeeper;
import org.eclipse.jface.text.IWidgetTokenKeeperExtension;
import org.eclipse.jface.text.IWidgetTokenOwner;
import org.eclipse.jface.text.IWidgetTokenOwnerExtension;
import org.eclipse.jface.text.information.IInformationPresenter;
import org.eclipse.jface.text.information.IInformationPresenterExtension;
import org.eclipse.jface.text.information.IInformationProvider;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.ControlListener;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.forms.IManagedForm;

import snomed.visualization.Activator;

/**
 * Custom implementation of <code>IInformationPresenter</code>.
 * This implementation extends <code>AbstractInformationControlManager</code>.
 * The information control is made visible on request by calling
 * {@link #showInformationControl(Rectangle)}.
 * <p>
 * Usually, clients instantiate this class and configure it before using it. The configuration
 * must be consistent: This means the used {@link org.eclipse.jface.text.IInformationControlCreator}
 * must create an information control expecting information in the same format the configured
 * {@link org.eclipse.jface.text.information.IInformationProvider}s  use to encode the information they provide.
 * </p>
 *
 */
public class CustomInformationPresenter extends AbstractInformationControlManager implements IInformationPresenter, IInformationPresenterExtension, IWidgetTokenKeeper, IWidgetTokenKeeperExtension {

	/**
	 * Priority of the info controls managed by this information presenter.
	 * Default value: <code>5</code>.
	 *
	 * @since 3.0
	 */
	/*
	 * 5 as value has been chosen in order to beat the hovers of {@link org.eclipse.jface.text.TextViewerHoverManager}
	 */
	public static final int WIDGET_PRIORITY = 5;

	public static interface IMessageProvider {
		String getText(final Object input);
		static final IMessageProvider NULL_IMPL = new IMessageProvider() {
			@Override public String getText(final Object input) {
				return String.valueOf(input);
			}
		}; 
	}
	
	public static interface IShowInformationCallback {
		Object getInput();
	}

	/**
	 * Internal information control closer. Listens to several events issued by its subject control
	 * and closes the information control when necessary.
	 */
	private class Closer implements IInformationControlCloser, ControlListener, MouseListener, FocusListener, IViewportListener, KeyListener {

		/** The subject control. */
		private Control subjectControl;
		/** The information control. */
		private IInformationControl informationControlToClose;
		/** Indicates whether this closer is active. */
		private boolean active = false;

		/*
		 * (non-Javadoc)
		 * @see org.eclipse.jface.text.AbstractInformationControlManager.IInformationControlCloser#setSubjectControl(org.eclipse.swt.widgets.Control)
		 */
		@Override
		public void setSubjectControl(final Control control) {
			subjectControl = control;
		}

		/*
		 * (non-Javadoc)
		 * @see org.eclipse.jface.text.AbstractInformationControlManager.IInformationControlCloser#setInformationControl(org.eclipse.jface.text.IInformationControl)
		 */
		@Override
		public void setInformationControl(final IInformationControl control) {
			informationControlToClose = control;
		}

		/*
		 * (non-Javadoc)
		 * @see org.eclipse.jface.text.AbstractInformationControlManager.IInformationControlCloser#start(org.eclipse.swt.graphics.Rectangle)
		 */
		@Override
		public void start(final Rectangle informationArea) {

			if (active)
				return;
			active = true;

			if (subjectControl != null && !subjectControl.isDisposed()) {
				subjectControl.addControlListener(this);
				subjectControl.addMouseListener(this);
				subjectControl.addFocusListener(this);
				subjectControl.addKeyListener(this);
			}

			if (informationControlToClose != null)
				informationControlToClose.addFocusListener(this);

		}

		/*
		 * (non-Javadoc)
		 * @see org.eclipse.jface.text.AbstractInformationControlManager.IInformationControlCloser#stop()
		 */
		@Override
		public void stop() {

			if (!active)
				return;
			active = false;

			if (informationControlToClose != null)
				informationControlToClose.removeFocusListener(this);

			if (subjectControl != null && !subjectControl.isDisposed()) {
				subjectControl.removeControlListener(this);
				subjectControl.removeMouseListener(this);
				subjectControl.removeFocusListener(this);
				subjectControl.removeKeyListener(this);
			}
		}

		/*
		 * (non-Javadoc)
		 * @see org.eclipse.swt.events.ControlListener#controlResized(org.eclipse.swt.events.ControlEvent)
		 */
		@Override
		public void controlResized(final ControlEvent e) {
			hideInformationControl();
		}

		/*
		 * (non-Javadoc)
		 * @see org.eclipse.swt.events.ControlListener#controlMoved(org.eclipse.swt.events.ControlEvent)
		 */
		@Override
		public void controlMoved(final ControlEvent e) {
			hideInformationControl();
		}

		/*
		 * (non-Javadoc)
		 * @see org.eclipse.swt.events.MouseListener#mouseDown(org.eclipse.swt.events.MouseEvent)
		 */
		@Override
		public void mouseDown(final MouseEvent e) {
			hideInformationControl();
		}

		/*
		 * (non-Javadoc)
		 * @see org.eclipse.swt.events.MouseListener#mouseUp(org.eclipse.swt.events.MouseEvent)
		 */
		@Override
		public void mouseUp(final MouseEvent e) {
		}

		/*
		 * (non-Javadoc)
		 * @see org.eclipse.swt.events.MouseListener#mouseDoubleClick(org.eclipse.swt.events.MouseEvent)
		 */
		@Override
		public void mouseDoubleClick(final MouseEvent e) {
			hideInformationControl();
		}

		/*
		 * (non-Javadoc)
		 * @see org.eclipse.swt.events.FocusListener#focusGained(org.eclipse.swt.events.FocusEvent)
		 */
		@Override
		public void focusGained(final FocusEvent e) {
		}

		/*
		 * (non-Javadoc)
		 * @see org.eclipse.swt.events.FocusListener#focusLost(org.eclipse.swt.events.FocusEvent)
		 */
		@Override
		public void focusLost(final FocusEvent e) {
			final Display d = subjectControl.getDisplay();
			d.asyncExec(new Runnable() {
				// Without the asyncExec, mouse clicks to the workbench window are swallowed.
				public void run() {
					if (informationControlToClose == null || !informationControlToClose.isFocusControl())
						hideInformationControl();
				}
			});
		}

		/*
		 * (non-Javadoc)
		 * @see org.eclipse.jface.text.IViewportListener#viewportChanged(int)
		 */
		@Override
		public void viewportChanged(final int topIndex) {
			hideInformationControl();
		}

		/*
		 * (non-Javadoc)
		 * @see org.eclipse.swt.events.KeyListener#keyPressed(org.eclipse.swt.events.KeyEvent)
		 */
		@Override
		public void keyPressed(final KeyEvent e) {
			hideInformationControl();
		}

		/*
		 * (non-Javadoc)
		 * @see org.eclipse.swt.events.KeyListener#keyReleased(org.eclipse.swt.events.KeyEvent)
		 */
		@Override
		public void keyReleased(final KeyEvent e) {
		}

	}
	
	private static final class PresenterCloseListener implements Listener {

		private final Control subjectControl;
		private final CustomInformationPresenter presenter;
		private final Display display;

		private PresenterCloseListener(final Control subjectControl, final CustomInformationPresenter presenter) {
			this.subjectControl = subjectControl;
			this.presenter = presenter;
			display = this.subjectControl.getDisplay();
		}
		
		/*
		 * (non-Javadoc)
		 * @see org.eclipse.swt.widgets.Listener#handleEvent(org.eclipse.swt.widgets.Event)
		 */
		@Override
		public void handleEvent(final Event event) {
			if (null == presenter.getCurrentPosition()) { //presenter is *NOT* visible
				return;
			}
			
			final Point cursorLocation = Activator.getDefault().getWorkbench().getDisplay().getCursorLocation();
			final Shell shell = getShell(presenter);
			
//			if (!UIUtils.checkWidget(shell)) { //shell is already gone
//				return;
//			}
			
			if (shell.getBounds().contains(cursorLocation)) { //cursor is in the shell
				return;
			}
			
//			if (shell.equals(UIUtils.getShell())) { //focus is in the shell
//				return;
//			}
			
			final Rectangle shellRectangle = shell.getBounds();
			
			if (Math.abs(shellRectangle.x - cursorLocation.x) > 30) {
				close(presenter);
			}
			
			if (Math.abs(shellRectangle.y - cursorLocation.y) > 30) {
				close(presenter);
			}
		}

		private void close(final CustomInformationPresenter presenter) {
			presenter.hideInformationControl();
		}
		
		/**
		 * Returns with the presenter's shell. 
		 * <p><b>NOTE:&nbsp;</b>gets the shell via reflection. My return with {@code null}.</P> 
		 */
		@Deprecated
		private Shell getShell(final CustomInformationPresenter presenter) {
			try {
				return ReflectionUtils.getField(AbstractInformationControl.class, (AbstractInformationControl) presenter.getInformationControl(), "fShell");	
			} catch (final Throwable e) {
				return null;
			} 
			
		}
		
		private void unregister() {
			if (null != subjectControl) {
				display.removeFilter(SWT.MouseMove, this);
			}
		}
	}
	


	/** The structure-oriented viewer this information presenter works on */
	private StructuredViewer viewer;
	/** The map of <code>IInformationProvider</code> objects */
	private Map<String, IInformationProvider> providers;
	/**
	 * The document partitioning for this information presenter.
	 * @since 3.0
	 */
	private String partitioning;
	private Point currentPosition;
	private String text;
	private IMessageProvider messageProvider = IMessageProvider.NULL_IMPL;
	private PresenterCloseListener closeListener;

	public static CustomInformationPresenter createForControl(final Control control, final IShowInformationCallback callback,  final boolean resizable, final boolean takesFocus) {
		return internalCreateForControl(control, callback, null, null, resizable, takesFocus);
	}
	
	public static CustomInformationPresenter createForControl(final Control control, final IShowInformationCallback callback, final IManagedForm managedForm, final IFormTextConfigurationStrategy strategy, final boolean resizable, final boolean takesFocus) {
		return internalCreateForControl(control, callback, managedForm, strategy, resizable, takesFocus);
	}
	
	private static CustomInformationPresenter internalCreateForControl(final Control control, final IShowInformationCallback callback, final IManagedForm managedForm, final IFormTextConfigurationStrategy strategy, final boolean resizable, final boolean takesFocus) {
//		Preconditions.checkState(UIUtils.checkWidget(control), "Specified control cannot be referenced.");
		final CustomInformationPresenter presenter = new CustomInformationPresenter(new IInformationControlCreator() {
			@Override public IInformationControl createInformationControl(final Shell parent) {
				if (null != managedForm) {
					return new ManagedFormTextInformationPresenter(managedForm, strategy, resizable);
				}
				return new DefaultInformationControl(parent, resizable);
			}
		});
		presenter.install(control);
		presenter.takesFocusWhenVisible(takesFocus);
		control.addListener(SWT.MouseHover, new Listener() {
			@Override public void handleEvent(final Event event) {
				if (null == callback) {
					return;
				}
				presenter.showInformation(new Point(event.x, event.y), callback.getInput());
			}
		});
		
		presenter.closeListener = new PresenterCloseListener(control, presenter);
		control.getDisplay().addFilter(SWT.MouseMove, presenter.closeListener);
		
		return presenter;
	}
	
	/**
	 * Creates a new information presenter that uses the given information control creator.
	 * The presenter is not installed on any text viewer yet. By default, an information
	 * control closer is set that closes the information control in the event of key strokes,
	 * resizing, moves, focus changes, mouse clicks, and disposal - all of those applied to
	 * the information control's parent control. Also, the setup ensures that the information
	 * control when made visible will request the focus. By default, the default document
	 * partitioning {@link IDocumentExtension3#DEFAULT_PARTITIONING} is used.
	 *
	 * @param creator the information control creator to be used
	 */
	public CustomInformationPresenter(final IInformationControlCreator creator) {
		super(creator);
		setCloser(new Closer());
		takesFocusWhenVisible(false);
		partitioning = IDocumentExtension3.DEFAULT_PARTITIONING;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.text.information.IInformationPresenterExtension#getDocumentPartitioning()
	 */
	@Override
	public String getDocumentPartitioning() {
		return partitioning;
	}

	/*
	 * 
	 */
	@Override
	public IInformationProvider getInformationProvider(final String contentType) {
		if (providers == null)
			return null;

		return (IInformationProvider) providers.get(contentType);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.text.information.IInformationPresenter#install(org.eclipse.jface.text.ITextViewer)
	 */
	@Override
	public void install(final ITextViewer textViewer) {
		install(viewer.getControl());
	}

	@Override
	public void install(final Control subjectControl) {
		super.install(subjectControl);
		final IInformationControl informationControl = getInformationControl();
		informationControl.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(final FocusEvent e) {
				CustomInformationPresenter.this.hideInformationControl();
			}
		});
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.text.information.IInformationPresenter#uninstall()
	 */
	@Override
	public void uninstall() {
		dispose();
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.text.IWidgetTokenKeeper#requestWidgetToken(org.eclipse.jface.text.IWidgetTokenOwner)
	 */
	@Override
	public boolean requestWidgetToken(final IWidgetTokenOwner owner) {
		return false;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.text.IWidgetTokenKeeperExtension#requestWidgetToken(org.eclipse.jface.text.IWidgetTokenOwner, int)
	 */
	@Override
	public boolean requestWidgetToken(final IWidgetTokenOwner owner, final int priority) {
		return false;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.text.IWidgetTokenKeeperExtension#setFocus(org.eclipse.jface.text.IWidgetTokenOwner)
	 */
	@Override
	public boolean setFocus(final IWidgetTokenOwner owner) {
		return false;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.text.AbstractInformationControlManager#hideInformationControl()
	 */
	@Override
	public void hideInformationControl() {

		currentPosition = null;
		text = null;

		try {
			super.hideInformationControl();
		} finally {
			if (viewer instanceof IWidgetTokenOwner) {
				final IWidgetTokenOwner owner = (IWidgetTokenOwner) viewer;
				owner.releaseWidgetToken(this);
			}
		}
	}

	/**
	 * Sets the document partitioning to be used by this information presenter.
	 *
	 * @param partitioning the document partitioning to be used by this information presenter
	 * @since 3.0
	 */
	public void setDocumentPartitioning(final String partitioning) {
		Assert.isNotNull(partitioning);
		this.partitioning = partitioning;
	}

	/**
	 * Registers a given information provider for a particular content type.
	 * If there is already a provider registered for this type, the new provider
	 * is registered instead of the old one.
	 *
	 * @param provider the information provider to register, or <code>null</code> to remove an existing one
	 * @param contentType the content type under which to register
	 */
	public void setInformationProvider(final IInformationProvider provider, final String contentType) {

		Assert.isNotNull(contentType);

		if (providers == null)
			providers = new HashMap<String, IInformationProvider>();

		if (provider == null)
			providers.remove(contentType);
		else
			providers.put(contentType, provider);
	}

	public void showInformation(final Point cursorPosition, final Object input) {
		this.currentPosition = cursorPosition;
		this.text = messageProvider.getText(input);
		super.showInformation();
	}

	public void install(final StructuredViewer viewer) {
		install(viewer.getControl());
	}

	public Point getCurrentPosition() {
		return currentPosition;
	}
	
	public void setMessageProvider(final IMessageProvider messageProvider) {
		this.messageProvider = messageProvider;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.text.AbstractInformationControlManager#computeInformation()
	 */
	@Override
	protected void computeInformation() {
		setInformation(text, new Rectangle(currentPosition.x, currentPosition.y + 10, 0, 0));
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.text.AbstractInformationControlManager#showInformationControl(org.eclipse.swt.graphics.Rectangle)
	 */
	@Override
	protected void showInformationControl(final Rectangle subjectArea) {
		if (viewer instanceof IWidgetTokenOwnerExtension && viewer instanceof IWidgetTokenOwner) {
			final IWidgetTokenOwnerExtension extension = (IWidgetTokenOwnerExtension) viewer;
			if (extension.requestWidgetToken(this, WIDGET_PRIORITY))
				super.showInformationControl(subjectArea);
		} else if (viewer instanceof IWidgetTokenOwner) {
			final IWidgetTokenOwner owner = (IWidgetTokenOwner) viewer;
			if (owner.requestWidgetToken(this))
				super.showInformationControl(subjectArea);

		} else
			super.showInformationControl(subjectArea);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.text.AbstractInformationControlManager#handleInformationControlDisposed()
	 */
	@Override
	protected void handleInformationControlDisposed() {
		try {
			super.handleInformationControlDisposed();
		} finally {
			if (viewer instanceof IWidgetTokenOwner) {
				final IWidgetTokenOwner owner = (IWidgetTokenOwner) viewer;
				owner.releaseWidgetToken(this);
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.text.AbstractInformationControlManager#dispose()
	 */
	@Override
	public void dispose() {
		super.dispose();
		if (null != closeListener) {
			closeListener.unregister();
		}
	}
	
}
