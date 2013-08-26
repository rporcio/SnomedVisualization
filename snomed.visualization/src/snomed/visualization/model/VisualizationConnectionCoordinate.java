package snomed.visualization.model;

/**
 * Represents a connection on the diagram.
 * 
 * @author rporcio
 */
public class VisualizationConnectionCoordinate {

	public enum ConnectionType {
		ISA,
		REGULAR
	}
	
	private ConnectionType type;
	private int beginX;
	private int beginY;
	private int endX;
	private int endY;
	
	public VisualizationConnectionCoordinate(final ConnectionType type, final int beginX, final int beginY, final int endX, final int endY) {
		this.type = type;
		this.beginX = beginX;
		this.beginY = beginY;
		this.endX = endX;
		this.endY = endY;
	}

	public ConnectionType getType() {
		return type;
	}

	public void setType(ConnectionType type) {
		this.type = type;
	}

	public int getBeginX() {
		return beginX;
	}

	public void setBeginX(int beginX) {
		this.beginX = beginX;
	}

	public int getBeginY() {
		return beginY;
	}

	public void setBeginY(int beginY) {
		this.beginY = beginY;
	}

	public int getEndX() {
		return endX;
	}

	public void setEndX(int endX) {
		this.endX = endX;
	}

	public int getEndY() {
		return endY;
	}

	public void setEndY(int endY) {
		this.endY = endY;
	}
}
