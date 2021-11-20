package geometry;

public class Circle {

	protected Point center;
	protected int radius;
	private boolean selected;
	
	public double area() {
		return radius*radius*Math.PI;
	}
	
	public double circumference() {
		return 2*radius*Math.PI;
	}
	
	@Override
	public String toString() {
		return "Center: (" + this.center.getX() + ", " + this.center.getY()+
				"), radius = " + this.radius;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Circle) {
			Circle temp = (Circle) obj;
			if(this.center.equals(temp.center) && this.radius == temp.radius) {
				return true;
			}
		}
		return false;
	}
	
	public boolean contains(int x, int y) {
		return this.center.distance(new Point(x,y)) <= radius;
	}
	
	public boolean contains(Point p) {
		return contains(p.getX(), p.getY());
	}
	
	//Konstruktori
	
	public Circle() {
		
	}
	
	public Circle(Point center, int radius) {
		this.center =  center;
		this.radius = radius;
	}
	
	public Circle(Point center, int radius, boolean selected) {
		this(center, radius);
		this.selected =selected;
	}
	
	//Get i set metode
	public Point getCenter() {
		return center;
	}
	
	public void setCenter(Point center) {
		this.center =  center;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int radius) {
		this.radius =  radius;
	}
	
	public boolean isSelected() {
		return selected;
	}
	
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
}
