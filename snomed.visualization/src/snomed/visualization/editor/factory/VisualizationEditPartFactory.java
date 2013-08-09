package snomed.visualization.editor.factory;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;

import snomed.visualization.dsl.visualizationDsl.Expression;
import snomed.visualization.editor.VisualizationEditor;
import snomed.visualization.editor.editpart.VisualizationCanvasEditPart;
import snomed.visualization.editor.editpart.VisualizationDiagramEditPart;
import snomed.visualization.model.VisualizationDiagramConnection;
import snomed.visualization.model.VisualizationDiagramElement;

public class VisualizationEditPartFactory implements EditPartFactory {

	private VisualizationEditor visualizationEditor;

	public VisualizationEditPartFactory(VisualizationEditor visualizationEditor) {
		this.visualizationEditor = visualizationEditor;
	}

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		EditPart editPart = null;
		
		if (model instanceof Expression) {
			editPart = new VisualizationCanvasEditPart(visualizationEditor);
		} else if (model instanceof VisualizationDiagramElement) {
			editPart = new VisualizationDiagramEditPart(visualizationEditor);
		} else if (model instanceof VisualizationDiagramConnection) {
			editPart = new VisualizationDiagramEditPart(visualizationEditor);
		}
		
		if (null != editPart) {
			editPart.setModel(model);
		}
		
		return editPart;
	}

}
