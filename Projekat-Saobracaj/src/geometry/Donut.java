package geometry;

public class Donut extends Circle {

	private int innerRadius;
	private boolean selected;
	
	
	@Override
	public double area() {
		return super.area() - innerRadius*innerRadius*Math.PI;
	}
	
	@Override
	public boolean contains(int x, int y) {
		return super.contains(x, y) && super.center.distance(new Point(x,y))>= innerRadius;
	}
	
	public boolean contains(Point p) {
		return contains(p.getX(), p.getY());
	}
	
	//Konstruktori
	
	public Donut() {
		
	}
	
	public Donut(Point center, int radius , int innerRadius) {
		super(center, radius);
		this.innerRadius = innerRadius;
	}
	
	public Donut(Point center, int radius, int innerRadius, boolean selected) {
		this(center, radius, innerRadius);
		this.selected = selected;
	}
	
	//Get i set metode
	public int getInnerRadius() {
		return innerRadius;
	}

	public void setInnerRadius(int innerRadius) {
		this.innerRadius = innerRadius;
	}
	
	public boolean isSelected() {
		return selected;
	}


	public void setSelected(boolean selected) {
		this.selected = selected;
	}


	
	
}
