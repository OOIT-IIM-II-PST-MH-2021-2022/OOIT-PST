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
