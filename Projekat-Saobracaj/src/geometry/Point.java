package geometry;

public class Point  {
	private int x;
	private int y;
	private boolean selected;
	
	public double distance(Point p) {
		int dX = this.x - p.x;
		int dY = this.y - p.y;
		double distance = Math.sqrt(dX*dX + dY*dY);
		return distance;
	}
	
	//Get i set metode
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
}
