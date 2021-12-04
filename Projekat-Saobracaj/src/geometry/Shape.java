package geometry;

import java.awt.Graphics;

public abstract class Shape implements Moveable, Comparable<Object> {

	protected boolean selected;
	
	
	public abstract boolean contains(int x, int y);
	public abstract void draw(Graphics g);
	
	//Konstruktori
	public Shape() {
		
	}
	
	public Shape(boolean selected) {
		this.selected = selected;
	}
	
	//Metode pristupa
	public boolean isSelected() {
		return selected;
	}
	
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
}
