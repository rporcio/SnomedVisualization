package snomed.visualization.editor;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;

import snomed.visualization.dsl.visualizationDsl.Expression;

/**
 * Editor input for the {@link VisualizationEditor}.
 * 
 * @author rporcio
 */
public class VisualizationEditorInput implements IEditorInput {

	private Expression expression;

	public VisualizationEditorInput(Expression expression) {
		this.expression = expression;
	}

	@Override
	public Object getAdapter(@SuppressWarnings("rawtypes") Class adapter) {
		return null;
	}

	@Override
	public boolean exists() {
		return true;
	}

	@Override
	public ImageDescriptor getImageDescriptor() {
		return null;
	}

	@Override
	public String getName() {
		return expression.getConcept().getTerm();
	}

	@Override
	public IPersistableElement getPersistable() {
		return null;
	}

	@Override
	public String getToolTipText() {
		return expression.getConcept().getTerm();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof VisualizationEditorInput))
			return false;

		VisualizationEditorInput other = (VisualizationEditorInput) obj;
		
		if (null == expression && other.getExpression() != null) {
			return false;
		} else if (null == other.getExpression() && null != expression) {
			return false;
		} else if (!expression.getConcept().getId().equals(other.getExpression().getConcept().getId())) {
			return false;
		}
		
		return true;
	}

	public Expression getExpression() {
		return expression;
	}

}
