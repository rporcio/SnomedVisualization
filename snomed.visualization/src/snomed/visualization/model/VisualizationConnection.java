package snomed.visualization.model;

/**
 * Represents a connection on the diagram.
 * 
 * @author rporcio
 */
public class VisualizationConnection {

	public enum ConnectionType {
		ISA,
		REGULAR
	}
	
	private final ConnectionType connectionType;
	private final int beginX;
	private final int beginY;
	private final int endX;
	private final int endY;
	
	public VisualizationConnection(final ConnectionType connectionType, final int beginX, final int beginY, final int endX, final int endY) {
		this.connectionType = connectionType;
		this.beginX = beginX;
		this.beginY = beginY;
		this.endX = endX;
		this.endY = endY;
	}

	public ConnectionType getConnectionType() {
		return connectionType;
	}

	public int getBeginX() {
		return beginX;
	}

	public int getBeginY() {
		return beginY;
	}

	public int getEndX() {
		return endX;
	}

	public int getEndY() {
		return endY;
	}
}
