package geometry;

public class Donut extends Circle {

	private int innerRadius;
	private boolean selected;
	
	public Donut() {
		
	}
	
	public Donut(Point center, int radius, int innerRadius) {
		super(center,radius);
		this.innerRadius = innerRadius;
	}
	
	public Donut(Point center, int radius, int innerRadius, boolean selected) {
		this(center,radius,innerRadius);
		this.selected = selected;
	}
	
	public double area() {
		return super.area() - innerRadius*innerRadius*Math.PI;
	}
	
	public boolean contains(int x, int y) {
		return getCenter().distance(new Point(x,y)) <= getRadius() &&
				getCenter().distance(new Point(x,y)) >= innerRadius;
	}
	
	public boolean contains(Point p) {
		return contains(p.getX(), p.getY());
	}
	
	@Override
	public String toString() {
		return super.toString() + ", inner radius: " + innerRadius;
 	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Donut) {
			Donut temp = (Donut)obj;
			if(temp.getCenter().equals(super.getCenter()) &&
					temp.getRadius() == super.getRadius()
					&& temp.getInnerRadius() == innerRadius) {
				return true;
			}
		}
		return false;
	}
	
	public int getInnerRadius() {
		return innerRadius;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	public void setInnerRadius(int innerRadius) {
		this.innerRadius = innerRadius;
	}
}
