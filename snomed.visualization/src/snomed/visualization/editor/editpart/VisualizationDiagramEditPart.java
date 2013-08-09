package snomed.visualization.editor.editpart;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import snomed.visualization.editor.VisualizationEditor;
import snomed.visualization.figure.VisualizationDiagramConnectionFigure;
import snomed.visualization.figure.VisualizationDiagramElementFigure;
import snomed.visualization.model.VisualizationDiagramConnection;
import snomed.visualization.model.VisualizationDiagramElement;

public class VisualizationDiagramEditPart extends AbstractGraphicalEditPart {
	
	private VisualizationEditor visualizationEditor;

	private PropertyChangeListener changeListener = new PropertyChangeListener() {
		
		@Override
		public void propertyChange(PropertyChangeEvent evt) {
			if (evt.getSource() instanceof VisualizationDiagramElementFigure && !evt.getPropertyName().equals("parent")) {
				VisualizationDiagramElementFigure figure = (VisualizationDiagramElementFigure) evt.getSource();
				
				visualizationEditor.handleDiagramChanges(evt.getPropertyName(), figure.getDiagramElement().getId());
			}
		}
	};
	
	public VisualizationDiagramEditPart(VisualizationEditor visualizationEditor) {
		this.visualizationEditor = visualizationEditor;
	}

	@Override
	protected void refreshVisuals() {
		if (getModel() instanceof VisualizationDiagramElement) {
			VisualizationDiagramElement diagramElement = (VisualizationDiagramElement) getModel();
			VisualizationDiagramElementFigure diagramFigure = (VisualizationDiagramElementFigure) getFigure();

			VisualizationCanvasEditPart canvasEditPart = (VisualizationCanvasEditPart) getParent();
			canvasEditPart.setLayoutConstraint(this, diagramFigure, diagramElement.getConstraint());
		} else  if (getModel() instanceof VisualizationDiagramConnection) {
			VisualizationDiagramConnection diagramConnection = (VisualizationDiagramConnection) getModel();
			VisualizationDiagramConnectionFigure connectionFigure = (VisualizationDiagramConnectionFigure) getFigure();
			
			VisualizationCanvasEditPart canvasEditPart = (VisualizationCanvasEditPart) getParent();
			canvasEditPart.setLayoutConstraint(this, connectionFigure, diagramConnection.getConstraint());
		}
		
	}

	@Override
	protected IFigure createFigure() {
		if (getModel() instanceof VisualizationDiagramElement) {
			VisualizationDiagramElementFigure diagramElementFigure = new VisualizationDiagramElementFigure((VisualizationDiagramElement) getModel());
			diagramElementFigure.addPropertyChangeListener(changeListener);
			
			return diagramElementFigure;
		} else if (getModel() instanceof VisualizationDiagramConnection) {
			return new VisualizationDiagramConnectionFigure((VisualizationDiagramConnection) getModel());
		} else {
			return null;
		}
	}

	@Override
	protected void createEditPolicies() {
		// TODO Auto-generated method stub
		
	}

}
