package geometry;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Drawing extends JPanel {

	public static void main(String [] args) {
		JFrame frame = new JFrame();
		Drawing drawingPanel = new Drawing();
		frame.add(drawingPanel);
		frame.setSize(1066, 768);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		Point p1 = new Point(400, 400);
		p1.draw(g);
		Point p2 = new Point(500,500);
		p2.draw(g);
		Line l1 = new Line(p1,p2);
		l1.draw(g);
		Circle c1 = new Circle(p1, 50);
		c1.draw(g);
		Rectangle r1 = new Rectangle(100, 100, p1);
		r1.draw(g);
	}
}
