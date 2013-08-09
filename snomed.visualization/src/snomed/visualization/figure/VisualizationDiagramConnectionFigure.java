package snomed.visualization.figure;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;

import snomed.visualization.model.VisualizationConnectionCoordinate;
import snomed.visualization.model.VisualizationConnectionCoordinate.ConnectionType;
import snomed.visualization.model.VisualizationDiagramConnection;

public class VisualizationDiagramConnectionFigure extends Figure {
	
	private VisualizationDiagramConnection visualizationDiagramConnection;

	public VisualizationDiagramConnectionFigure(VisualizationDiagramConnection visualizationDiagramConnection) {
		this.visualizationDiagramConnection = visualizationDiagramConnection;
	}
	
	@Override
	protected void paintFigure(Graphics graphics) {
		
		for (VisualizationConnectionCoordinate coordinate : visualizationDiagramConnection.getConnectionCoordinates()) {
			if (null == coordinate.getType()) {
				PolylineConnection connection = new PolylineConnection();
				connection.setEndpoints(new Point(coordinate.getBeginX(), coordinate.getBeginY()), new Point(coordinate.getEndX(), coordinate.getEndY()));
				add(connection);
			} else {
				PolylineConnection connection = new PolylineConnection();
				connection.setEndpoints(new Point(coordinate.getBeginX(), coordinate.getBeginY()), new Point(coordinate.getEndX() - visualizationDiagramConnection.getZoom() / 5, coordinate.getEndY()));
				add(connection);
				
				if (coordinate.getType() == ConnectionType.ISA) {
					PolylineConnection triangle = new PolylineConnection();
					
					PointList trianglePointList = new PointList();
					trianglePointList.addPoint(coordinate.getEndX() - visualizationDiagramConnection.getZoom() / 5, coordinate.getEndY() - visualizationDiagramConnection.getZoom() / 10);
					trianglePointList.addPoint(coordinate.getEndX() - visualizationDiagramConnection.getZoom() / 5, coordinate.getEndY() + visualizationDiagramConnection.getZoom() / 10);
					trianglePointList.addPoint(coordinate.getEndX(), coordinate.getEndY());
					trianglePointList.addPoint(coordinate.getEndX() - visualizationDiagramConnection.getZoom() / 5, coordinate.getEndY() - visualizationDiagramConnection.getZoom() / 10);
					
					triangle.setPoints(trianglePointList);
					add(triangle);
				} else if (coordinate.getType() == ConnectionType.REGULAR) {
					PolylineConnection triangle = new PolylineConnection();
					triangle.setEndpoints(new Point(coordinate.getEndX() - visualizationDiagramConnection.getZoom() / 5, coordinate.getEndY()), new Point(coordinate.getEndX(), coordinate.getEndY()));
					
					PolygonDecoration decoration = new PolygonDecoration();
					PointList arrowPointList = new PointList();
					arrowPointList.addPoint(0,0);
					arrowPointList.addPoint(-visualizationDiagramConnection.getZoom() / 50, visualizationDiagramConnection.getZoom() / 60);
					arrowPointList.addPoint(-visualizationDiagramConnection.getZoom() / 50, -visualizationDiagramConnection.getZoom() / 60);
					decoration.setTemplate(arrowPointList);
					
					triangle.setTargetDecoration(decoration);
					add(triangle);
				}
			}
		}
	}

}
