package geometry;

public class Test {

	public static void main(String[] args) {
		Point p1 = new Point();
		System.out.println("X je: " + p1.getX());
		p1.setX(12);
		p1.setY(30);
		System.out.println("X je: " + p1.getX());
		Point p2 = new Point();
		System.out.println("X od p2 je: " + p2.getX());
		p2.setX(12);
		p2.setY(25);
		System.out.println("X od p2 je: " + p2.getX());
		System.out.println(p1 == p2);
		System.out.println("Reference na objekat ima sledeću vrednost: " + p1);
		System.out.println("Reference na objekat ima sledeću vrednost: " + p2);
		System.out.println("Reference na objekat ima sledeću vrednost: " + p1);
		System.out.println("X od objekta koji je referenciran od strane p1 je: " + p1.getX());
		System.out.println(p1.distance(p2));
		
		Line l1 = new Line();
		l1.setStartPoint(p1);
		l1.setEndPoint(p2);
		System.out.println(l1.length());
		Line l2 = new Line();
		Point p3 = new Point();
		p3.setX(55);
		p3.setY(40);
		Point p4 = new Point();
		p4.setX(80);
		p4.setY(50);
		l2.setStartPoint(p3);
		l2.setEndPoint(p4);
		System.out.println(l2.length());
		System.out.println("Koren broja 725 je: " + Math.sqrt(725));
		
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		System.out.println(r1.getWidth());
		System.out.println(r2.getUpperLeft());
		r1.setUpperLeft(p3);
		System.out.println(r1.getUpperLeft().getX());
		
		Circle c1 = new Circle();
		c1.setCenter(p2);
		c1.setRadius(10);
		System.out.println(c1.area());
		System.out.println(c1.circumference());
		
		l1.getEndPoint().setY((int)((c1.getCenter().getX() - c1.getCenter().getY()) - (r1.getUpperLeft().getX() + c1.area())));
		System.out.println(l1.getEndPoint().getY());
	}

}
