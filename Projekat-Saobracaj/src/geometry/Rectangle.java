package geometry;

public class Rectangle {

	private Point upperLeft;
	private int height;
	private int width;
	private boolean selected;
	
	public int area() {
		return height*width;
	}
	
	public int circumference() {
		return 2*height + 2*width;
	}
	
	@Override
	public String toString() {
		return "Upper left point: (" + this.upperLeft.getX() + ", " + this.upperLeft.getY() + "), width = " + this.width
				+ ", height = " + this.height;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Rectangle) {
			Rectangle temp =  (Rectangle) obj;
			if(this.upperLeft.equals(temp.upperLeft) && this.width == temp.width && this.height == temp.height) {
				return true;
			}
		}
		return false;
	}
	
	//Konstruktori
	
	public Rectangle() {
		
	}
	
	public Rectangle(int height, int width, Point upperLeft) {
		this.height = height;
		this.width = width;
		this.upperLeft = upperLeft;
	}
	
	public Rectangle(int height, int width, Point upperLeft, boolean selected) {
		this(height,width, upperLeft);
		this.selected = selected;
	}
	
	//Get i set metode
	public Point getUpperLeft() {
		return upperLeft;
	}
	public void setUpperLeft(Point upperLeft) {
		this.upperLeft = upperLeft;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	
}
