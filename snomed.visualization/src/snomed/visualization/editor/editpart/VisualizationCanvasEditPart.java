package snomed.visualization.editor.editpart;

import java.util.List;

import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;

import snomed.visualization.dsl.visualizationDsl.Expression;
import snomed.visualization.editor.VisualizationEditor;

/**
 * EditPart to create the main canvas of the diagram where the elements will be drawn.
 * 
 * @author rporcio
 */
public class VisualizationCanvasEditPart extends AbstractGraphicalEditPart {

	private VisualizationEditor visualizationEditor;

	public VisualizationCanvasEditPart(VisualizationEditor visualizationEditor) {
		this.visualizationEditor = visualizationEditor;
	}

	@Override
	protected IFigure createFigure() {
		FreeformLayer layer = new FreeformLayer();
		layer.setLayoutManager(new FreeformLayout());
		
		return layer;
	}

	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.LAYOUT_ROLE, new XYLayoutEditPolicy() {
			
			@Override
			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		});
	}
	
	@Override
	protected List<?> getModelChildren() {
		Expression expression = (Expression) getModel();
		
		return visualizationEditor.getDiagramUtil().createDiagramElements(expression);
	}

}
