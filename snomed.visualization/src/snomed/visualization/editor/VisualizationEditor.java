package snomed.visualization.editor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.ui.parts.GraphicalEditor;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.IMessage;
import org.eclipse.ui.forms.IMessageManager;
import org.eclipse.ui.forms.ManagedForm;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Hyperlink;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.xtext.nodemodel.INode;

import snomed.visualization.dsl.visualizationDsl.Expression;
import snomed.visualization.dsl.visualizationDsl.RelationshipGroup;
import snomed.visualization.editor.editpart.VisualizationCanvasEditPart;
import snomed.visualization.editor.factory.VisualizationEditPartFactory;
import snomed.visualization.hyperlink.CustomInformationPresenter;
import snomed.visualization.hyperlink.CustomInformationPresenter.IShowInformationCallback;
import snomed.visualization.hyperlink.FormHeaderMessageConfigurationStrategy;
import snomed.visualization.hyperlink.NullMessageToolTipManager;
import snomed.visualization.util.VisualizationDiagramUtil;
import snomed.visualization.util.VisualizationDslUtil;

import com.google.common.collect.Lists;


public class VisualizationEditor extends GraphicalEditor {
	
	public static final String ID = "snomed.visualization.editor";
	
	private VisualizationEditorInput editorInput;
	private Expression expression;
	private FormToolkit toolkit;
	private PageForm managedForm;
	private StyledText styledText;
	private VisualizationDiagramUtil diagramUtil;
	private VisualizationDslUtil dslUtil;
	
	private final AtomicBoolean providerConfigured = new AtomicBoolean(false);
	private CustomInformationPresenter presenter;
	private final IShowInformationCallback callback = new IShowInformationCallback() {
		@Override public Object getInput() {
			return createFormTextContent(getValidationMessages());
		}
	};
	
	private Job refreshJob = new Job("Refresh visual model") {
		
		@Override
		protected IStatus run(IProgressMonitor monitor) {
			
			Display.getDefault().asyncExec(new Runnable() {
				
				@Override
				public void run() {
					expression = dslUtil.updatePreviousExpression(expression, styledText.getText());
					getGraphicalViewer().setContents(expression);
					addContentAdapter();
					if (getGraphicalViewer().getFocusEditPart() instanceof VisualizationCanvasEditPart) {
						getGraphicalViewer().getFocusEditPart().refresh();
					} else {
						getGraphicalViewer().getFocusEditPart().getParent().refresh();
					}
				}
			});
			
			return Status.OK_STATUS;
		}
	};
	
	private ModifyListener modifyListener = new ModifyListener() {
		
		@Override
		public void modifyText(ModifyEvent e) {
			if (dslUtil.isValid(styledText.getText())) {
				if (refreshJob.getState() == Job.WAITING || refreshJob.getState() == Job.SLEEPING) {
					refreshJob.cancel();
				}
				
				styledText.setStyleRanges(new StyleRange[0]);
				
				refreshJob.schedule(500);
//				updateMessageManager(new ArrayList<String>());
			} else {
				List<String> errorMessages = Lists.newArrayList();
				List<StyleRange> ranges = Lists.newArrayList();
				Iterable<INode> syntaxErrors = dslUtil.getSyntaxErrors(styledText.getText());
				Iterator<INode> iterator = syntaxErrors.iterator();
				while (iterator.hasNext()) {
					INode syntaxError = iterator.next();
					errorMessages.add(syntaxError.getSyntaxErrorMessage().getMessage());
					StyleRange range = new StyleRange();
					range.start = syntaxError.getTotalOffset();
					range.length = syntaxError.getTotalEndOffset() - syntaxError.getTotalOffset();
					range.foreground = Display.getDefault().getSystemColor(SWT.COLOR_RED);
					range.underline = true;
					
					ranges.add(range);
				}
				
				styledText.setStyleRanges(ranges.toArray(new StyleRange[0]));
//				updateMessageManager(errorMessages);
			}
		}
	};
	
	private EContentAdapter adapter = new EContentAdapter() {
		public void notifyChanged(Notification notification) {
			super.notifyChanged(notification);
			
			if (getGraphicalViewer().getFocusEditPart() instanceof VisualizationCanvasEditPart) {
				getGraphicalViewer().getFocusEditPart().refresh();
			} else {
				getGraphicalViewer().getFocusEditPart().getParent().refresh();
			}
			
			styledText.removeModifyListener(modifyListener);
			styledText.setText(dslUtil.convertToPresentation(expression));
			styledText.addModifyListener(modifyListener);
			
		}
	};

	public VisualizationEditor() {
		diagramUtil = new VisualizationDiagramUtil();
		dslUtil = new VisualizationDslUtil();
		
		setEditDomain(new DefaultEditDomain(this));
	}
	
	public static void openEditor(final Expression expression) {
		Display.getDefault().asyncExec(new Runnable() {
			
			@Override
			public void run() {
				VisualizationEditorInput editorInput = new VisualizationEditorInput(expression);
				try {
					PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().openEditor(editorInput, ID);
				} catch (PartInitException e) {
					throw new RuntimeException("Error while opening expression for concept: " + expression.getConcept().getId(), e);
				}
			}
		});
	}

	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		super.init(site, input);
		editorInput = (VisualizationEditorInput) input;
		expression = editorInput.getExpression();
		setPartName(expression.getConcept().getTerm());
		addContentAdapter();
	}
	
	@Override
	protected void initializeGraphicalViewer() {
		getGraphicalViewer().setContents(expression);
	}
	
	@Override
	protected void configureGraphicalViewer() {
		super.configureGraphicalViewer();
		getGraphicalViewer().setEditPartFactory(new VisualizationEditPartFactory(this));
	}
	
	@Override
	public void createPartControl(Composite parent) {
		toolkit = createToolkit(parent.getDisplay());
		
		ScrolledForm form = getToolkit().createScrolledForm(parent);
		managedForm = new PageForm(this, form);
		managedForm.getForm().setText(expression.getConcept().getId() + " | " + expression.getConcept().getTerm() + " |");
		
		toolkit.decorateFormHeading(form.getForm());
		
//		getToolkit().getHyperlinkGroup().setHyperlinkUnderlineMode(HyperlinkSettings.UNDERLINE_HOVER);
//		getForm().addMessageHyperlinkListener(new HyperlinkAdapter());
		
		Composite composite = form.getBody();
		composite.setLayout(new GridLayout(2, false));
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		
		super.createPartControl(composite);
		
		styledText = new StyledText(composite, SWT.BORDER);
		styledText.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		
		styledText.setText(dslUtil.convertToPresentation(expression));
		styledText.addModifyListener(modifyListener);
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
	}
	
	public FormToolkit getToolkit() {
		return toolkit;
	}
	
	@Override
	public void dispose() {
		if (!styledText.isDisposed()) {
			styledText.removeModifyListener(modifyListener);
		}
		
		disposePresenter(presenter);
		super.dispose();
	}
	
	public void handleDiagramChanges(String propertyName, String id) {
		if (propertyName.equals("deletion")) {
			diagramUtil.deleteDiagramElement(id, expression);
		} else if (propertyName.equals("characteristic")) {
			diagramUtil.changeCharacteristicType(id, expression);
		}
	}

	private void updateMessageManager(final List<String> errorMessages) {
		Display.getCurrent().asyncExec(new Runnable() {
			
			@SuppressWarnings({ "restriction", "unused" })
			@Override
			public void run() {
				getMessageManager().setAutoUpdate(false);
				getMessageManager().removeAllMessages();
				updateMessageToolTipMapager();
				
				for (String errorMessage : errorMessages) {
					addMessage(new Status(Status.ERROR, "snomed.visualization.editor.VisualizationEditor", errorMessage));
				}
				
				if (null == getForm() || getForm().isDisposed()) {
					return; // form is disposed meanwhile
				}
				
				org.eclipse.ui.internal.forms.widgets.TitleRegion titleRegion = null;
				for (Control child : getHeading().getChildren()) {
					if (child instanceof org.eclipse.ui.internal.forms.widgets.TitleRegion) {
						titleRegion = (org.eclipse.ui.internal.forms.widgets.TitleRegion) child;
						break;
					}
				}

				
				getMessageManager().update();
				
				final Hyperlink hyperlink = getMessageHyperlink();
				if (!providerConfigured.get()) {
					synchronized (this) {
						if (!providerConfigured.get()) {
							presenter = CustomInformationPresenter.createForControl(hyperlink, callback, getManagedForm(), new FormHeaderMessageConfigurationStrategy(), true, false);
							providerConfigured.set(true);
						}
					}
				}
				
			}
			
			@SuppressWarnings("restriction")
			private void updateMessageToolTipMapager() {
				getHeading().setMessageToolTipManager(NullMessageToolTipManager.INSTANCE);
			}
		});
	}
	
	private String createFormTextContent(final IMessage[] messages) {
		final StringWriter sw = new StringWriter();
		final PrintWriter pw = new PrintWriter(sw);
		pw.println("<form>");
		for (int i = 0; i < messages.length; i++) {
			final IMessage message = messages[i];
			pw
					.print("<li vspace=\"false\" style=\"image\" indent=\"16\" value=\"");
			switch (message.getMessageType()) {
			case IMessageProvider.ERROR:
				pw.print("error");
				break;
			case IMessageProvider.WARNING:
				pw.print("warning");
				break;
			case IMessageProvider.INFORMATION:
				pw.print("info");
				break;
			}
			pw.print("\"> <a href=\"");
			pw.print(i+"");
			pw.print("\">");
			if (message.getPrefix() != null)
				pw.print(message.getPrefix());
			pw.print(message.getMessage());
			pw.println("</a></li>");
		}
		pw.println("</form>");
		pw.flush();
		return sw.toString();
	}
	
	private void addMessage(final IStatus status) {
		getMessageManager().addMessage(status, status.getMessage(), null, getStatusType(status));
	}
	
	private int getStatusType(final IStatus status) {
		switch (status.getSeverity()) {
		case IStatus.OK:
			return IMessageProvider.NONE;
		case IStatus.CANCEL:
			return IMessageProvider.NONE;
		case IStatus.INFO:
			return IMessageProvider.INFORMATION;
		case IStatus.WARNING:
			return IMessageProvider.WARNING;
		case IStatus.ERROR:
			return IMessageProvider.ERROR;
		default:                       
			return IMessageProvider.NONE;
		}
	}
	
	private Hyperlink getMessageHyperlink() {
		for (final Control control : getHeading().getChildren()) {
			if (control instanceof Hyperlink)
				return (Hyperlink) control;
		}
		return null;
	}
	
	private IMessageManager getMessageManager() {
		return getManagedForm().getMessageManager();
	}
	
	@SuppressWarnings("restriction")
	private org.eclipse.ui.internal.forms.widgets.FormHeading getHeading() {
		return (org.eclipse.ui.internal.forms.widgets.FormHeading) getForm().getHead();
	}
	
	
	private PageForm getManagedForm() {
		return managedForm;
	}

	private FormToolkit createToolkit(Display display) {
		return new FormToolkit(display);
	}
	
	private Form getForm() {
		return getManagedForm().getForm().getForm();
	}
	
	private IMessage[] getValidationMessages() {
		return getForm().getChildrenMessages();
	}
	
	private static class PageForm extends ManagedForm {
		public PageForm(VisualizationEditor page, ScrolledForm form) {
			super(page.getToolkit(), form);
			setContainer(page);
		}
		
		public FormPage getPage() {
			return (FormPage)getContainer();
		}
		public void dirtyStateChanged() {
			getPage().getEditor().editorDirtyStateChanged();
		}
		public void staleStateChanged() {
			if (getPage().isActive())
				refresh();
		}
	}
	
	private void disposePresenter(final CustomInformationPresenter presenter) {
		if (null != presenter) {
			presenter.disposeInformationControl();
			presenter.dispose();
		}
	}
	
	private void addContentAdapter() {
		// TODO
		expression.eAdapters().add(adapter);
		expression.getConcept().eAdapters().add(adapter);
		expression.getIsaRelationships().eAdapters().add(adapter);
		if (null != expression.getStandaloneRelationships()) {
			expression.getStandaloneRelationships().eAdapters().add(adapter);
		}
		for (RelationshipGroup relationshipGroup : expression.getRelationshipGroups()) {
			relationshipGroup.eAdapters().add(adapter);
		}
	}
}
