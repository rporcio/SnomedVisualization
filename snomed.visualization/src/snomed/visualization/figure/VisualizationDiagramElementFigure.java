package snomed.visualization.figure;

import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.MouseEvent;
import org.eclipse.draw2d.MouseListener;
import org.eclipse.draw2d.MouseMotionListener;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import snomed.visualization.model.VisualizationDiagramElement;
import snomed.visualization.model.VisualizationDiagramElement.VisualizationComponentType;
import snomed.visualization.util.VisualizationDiagramUtil;

public class VisualizationDiagramElementFigure extends Figure {

	private Shape innerShape;
	private Shape outerShape;
	private Label term;
	private boolean mouseOver;
	
	private final VisualizationDiagramElement diagramElement;
	private final ImageFigure deletionIcon;
	private final ImageFigure characteristicIcon;
	
	private MouseMotionListener motionListener = new MouseMotionListener() {
		
		@Override
		public void mouseMoved(MouseEvent me) {
		}
		
		@Override
		public void mouseHover(MouseEvent me) {
		}
		
		@Override
		public void mouseExited(MouseEvent me) {
			if (mouseOver) {
				mouseOver = false;
				remove(deletionIcon);
				remove(characteristicIcon);
				repaint();
			}
		}
		
		@Override
		public void mouseEntered(MouseEvent me) {
			if (!mouseOver) {
				mouseOver = true;
				add(deletionIcon);
				add(characteristicIcon);
				repaint();
			}
		}
		
		@Override
		public void mouseDragged(MouseEvent me) {
		}
	};
	
	MouseListener mouseListener = new MouseListener() {
		
		@Override
		public void mouseReleased(MouseEvent me) {
		}
		
		@Override
		public void mousePressed(MouseEvent me) {
			if (1 == me.button) {
				Rectangle clientArea = innerShape.getClientArea();
				
				int width = clientArea.x + clientArea.width - 16;
				int height = clientArea.y + clientArea.height;
				
				if (me.x > width) {
					if (me.y > height - 16) {
						firePropertyChange("characteristic", null, null);
					} else if (me.y < height - 16 && me.y > height - 32) {
						firePropertyChange("deletion", null, null);
					}
				}
			}
		}
		
		@Override
		public void mouseDoubleClicked(MouseEvent me) {
		}
	};
	
	
	public VisualizationDiagramElementFigure(VisualizationDiagramElement diagramElement) {
		this.diagramElement = diagramElement;
		
		setLayoutManager(new XYLayout());
		
		if (diagramElement.getType() == VisualizationComponentType.CONCEPT) {
			innerShape = new RectangleFigure();
			outerShape = new RectangleFigure();
			
			if (diagramElement.isDefined()) {
				innerShape.setBackgroundColor(VisualizationDiagramUtil.getColor(153,204,255));
			} else {
				innerShape.setBackgroundColor(VisualizationDiagramUtil.getColor(204,204,255));
			}
		} else if (diagramElement.getType() == VisualizationComponentType.RELATIONSHIP) {
			innerShape = new RoundedRectangle();
			outerShape = new RoundedRectangle();
			
			if (diagramElement.isDefined()) {
				innerShape.setBackgroundColor(VisualizationDiagramUtil.getColor(255,255,204));
			} else {
				innerShape.setBackgroundColor(VisualizationDiagramUtil.getColor(204,204,153));
			}
			
			int corner = diagramElement.getZoom()/3;
			
			innerShape.setAntialias(5);
			((RoundedRectangle) innerShape).setCornerDimensions(new Dimension(corner, corner));
			outerShape.setAntialias(5);
			((RoundedRectangle) outerShape).setCornerDimensions(new Dimension(corner, corner));
		} else if (diagramElement.getType() == VisualizationComponentType.GROUP) {
			innerShape = new Ellipse();
			innerShape.setAntialias(5);
		} else if (diagramElement.getType() == VisualizationComponentType.CONJUCTION) {
			innerShape = new Ellipse();
			innerShape.setAntialias(5);
		}
		

		term = new Label(diagramElement.getTerm());
		deletionIcon = new ImageFigure(AbstractUIPlugin.imageDescriptorFromPlugin("snomed.visualization", "icons/trash.png").createImage());
		deletionIcon.setAlignment(PositionConstants.EAST);
		characteristicIcon = new ImageFigure(AbstractUIPlugin.imageDescriptorFromPlugin("snomed.visualization", "icons/changetype.png").createImage());
		characteristicIcon.setAlignment(PositionConstants.EAST);
		
		if (diagramElement.getType() != VisualizationComponentType.GROUP && diagramElement.getType() != VisualizationComponentType.CONJUCTION) {
			add(outerShape);
			add(innerShape);
			add(term);
			
			String tooltipTerm = diagramElement.getId() + " | " + diagramElement.getTerm() + " |"; 
			outerShape.setToolTip(new Label(tooltipTerm));
			innerShape.setToolTip(new Label(tooltipTerm));
			term.setToolTip(new Label(tooltipTerm));
			characteristicIcon.setToolTip(new Label(tooltipTerm));
			deletionIcon.setToolTip(new Label(tooltipTerm));
		} else {
			add(innerShape);
		}
		
		
		addMouseMotionListener(motionListener);
		addMouseListener(mouseListener);
		
	}
	
	@Override
	protected void paintFigure(Graphics graphics) {
		Rectangle rectangle = getBounds().getCopy();
		
		if (diagramElement.isDefined()) {
			setConstraint(innerShape, new Rectangle(3, 3, rectangle.width-6, rectangle.height-6));
			setConstraint(outerShape, new Rectangle(0, 0, rectangle.width, rectangle.height));
		} else {
			setConstraint(innerShape, new Rectangle(0, 0, rectangle.width, rectangle.height));
		}
		
		if (diagramElement.getType() != VisualizationComponentType.GROUP && diagramElement.getType() != VisualizationComponentType.CONJUCTION) {
			setConstraint(term, new Rectangle(0, 0, rectangle.width, rectangle.height));
			
			if (mouseOver) {
				setConstraint(deletionIcon, new Rectangle(0, 0, rectangle.width, rectangle.height-10));
				setConstraint(characteristicIcon, new Rectangle(0, 0, rectangle.width, rectangle.height+30));
			}
		} 
		
		
	}

	public VisualizationDiagramElement getDiagramElement() {
		return diagramElement;
	}

}
