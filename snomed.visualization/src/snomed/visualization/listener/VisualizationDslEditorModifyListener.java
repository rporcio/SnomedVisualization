package snomed.visualization.listener;

import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Display;
import org.eclipse.xtext.nodemodel.INode;

import snomed.visualization.editor.VisualizationEditor;

import com.google.common.collect.Lists;

/**
 * Listener class to handle dsl editor modifies.
 * 
 * @author rporcio
 */
public class VisualizationDslEditorModifyListener implements ModifyListener {
	
	private VisualizationEditor visualizationEditor;

	public VisualizationDslEditorModifyListener(VisualizationEditor visualizationEditor) {
		this.visualizationEditor = visualizationEditor;
	}
	

	@Override
	public void modifyText(ModifyEvent e) {
		if (visualizationEditor.getDslUtil().isValid(visualizationEditor.getStyledText().getText())) {
			if (visualizationEditor.getRefreshJob().getState() == Job.WAITING || visualizationEditor.getRefreshJob().getState() == Job.SLEEPING) {
				visualizationEditor.getRefreshJob().cancel();
			}
			
			visualizationEditor.getStyledText().setStyleRanges(new StyleRange[0]);
			visualizationEditor.getRefreshJob().schedule(500);
			visualizationEditor.getMessageManager().removeAllMessages();
			visualizationEditor.getMessageManager().update();
		} else {
			List<String> errorMessages = Lists.newArrayList();
			List<StyleRange> ranges = Lists.newArrayList();
			Iterable<INode> syntaxErrors = visualizationEditor.getDslUtil().getSyntaxErrors(visualizationEditor.getStyledText().getText());
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
			
			visualizationEditor.getStyledText().setStyleRanges(ranges.toArray(new StyleRange[0]));
			visualizationEditor.updateMessageManager(errorMessages);
		}
	}

}
