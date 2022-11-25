package geometry;

public class Line {

	private Point startPoint;
	private Point endPoint;
	private boolean selected;
	
	public Line() {
		
	}
	
	public Line(Point startPoint, Point endPoint) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}
	
	public Line(Point startPoint, Point endPoint, boolean selected) {
		this(startPoint, endPoint);
		this.selected = selected;
	}
	
	
	public double lenght() {
		return startPoint.distance(endPoint);
	}
	
	public boolean contains(int x, int y) {
		return lenght() - (startPoint.distance(new Point(x,y))
			+ endPoint.distance(new Point(x,y))) <= 2;
	}
	
	@Override
	public String toString() {
		return startPoint.toString() + " --> " + endPoint.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Line) {
			Line temp = (Line)obj;
			if(temp.getStartPoint().equals(startPoint) && 
					temp.getEndPoint().equals(endPoint)) {
				return true;
			}
		}
		return false;
	}
	
	public void setStartPoint(Point startPoint) {
		this.startPoint = startPoint;
	}
	
	public void setEndPoint(Point endPoint) {
		this.endPoint = endPoint;
	}
	
	public Point getStartPoint() {
		return startPoint;
	}
	
	public Point getEndPoint() {
		return endPoint;
	}
	
	public boolean isSelected() {
		return selected;
	}
	
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
}
