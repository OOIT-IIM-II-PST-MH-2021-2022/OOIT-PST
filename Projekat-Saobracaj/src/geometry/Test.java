package geometry;

public class Test {

	public static void main(String[] args) {
		Point p1 = new Point();
		//System.out.println("X je: " + p1.getX());
		p1.setX(12);
		p1.setY(30);
		//System.out.println("X je: " + p1.getX());
		Point p2 = new Point();
		//System.out.println("X od p2 je: " + p2.getX());
		p2.setX(12);
		p2.setY(25);
		//System.out.println("X od p2 je: " + p2.getX());
		//System.out.println(p1 == p2);
		//System.out.println("Reference na objekat ima sledeću vrednost: " + p1);
		//System.out.println("Reference na objekat ima sledeću vrednost: " + p2);
		//System.out.println("Reference na objekat ima sledeću vrednost: " + p1);
		//System.out.println("X od objekta koji je referenciran od strane p1 je: " + p1.getX());
		//System.out.println(p1.distance(p2));
		
		Line l1 = new Line();
		l1.setStartPoint(p1);
		l1.setEndPoint(p2);
		//System.out.println(l1.length());
		Line l2 = new Line();
		Point p3 = new Point();
		p3.setX(55);
		p3.setY(40);
		Point p4 = new Point();
		p4.setX(80);
		p4.setY(50);
		l2.setStartPoint(p3);
		l2.setEndPoint(p4);
		//System.out.println(l2.length());
		//System.out.println("Koren broja 725 je: " + Math.sqrt(725));
		
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		//System.out.println(r1.getWidth());
		//System.out.println(r2.getUpperLeft());
		r1.setUpperLeft(p3);
		//System.out.println(r1.getUpperLeft().getX());
		
		Circle c1 = new Circle();
		c1.setCenter(p2);
		c1.setRadius(10);
		//System.out.println(c1.area());
		//System.out.println(c1.circumference());
		
		l1.getEndPoint().setY((int)((c1.getCenter().getX() - c1.getCenter().getY()) - (r1.getUpperLeft().getX() + c1.area())));
		//System.out.println(l1.getEndPoint().getY());
		Point p5 = new Point(15,10,true);
		Point p6 = new Point(15,10,true);
		/*System.out.println("X je: " + p5.getX() + ", Y je: " + p5.getY()+ ", selected je: " + p5.isSelected());
		System.out.println(p5.toString());
		System.out.println(p6);
		System.out.println(l1);
		System.out.println(r1);
		System.out.println(p5 == p6);
		System.out.println(p5.equals(p6));
		System.out.println(l1.equals(l2));*/
		l2.setStartPoint(p1);
		l2.setEndPoint(p2);
		/*System.out.println(l1 == l2);
		System.out.println(l1.equals(l2));*/
		
		//Vezbe 5
		l1.setStartPoint(new Point(0,25));
		l1.setEndPoint(new Point(0,23));
		System.out.println(l1.contains(0, 23));
		r1.setUpperLeft(new Point(10,10));
		r1.setWidth(20);
		r1.setHeight(15);
		System.out.println(r1.contains(20, 30));
		Circle c2 = new Circle(p6, 80);
		
		//Vezbe 7
		System.out.println("Vezbe 7: p1.x = " + p1.getX()+ " i p1.y  = " + p1.getY());
		p1.moveTo(50, 40);
		System.out.println("Vezbe 7 posle pomeranja: p1.x = " + p1.getX()+ " i p1.y  = " + p1.getY());
		Donut d1 = new Donut(new Point(50,50), 80, 50);
		System.out.println("Compare to za Donut: " + d1.compareTo(c2));
		System.out.println("Compare to za Circle: " + c1.compareTo(d1));
		Circle c3 = new Donut(new Point(50,50),100,50);
		System.out.println("Compare to za Donut: " + d1.compareTo(c3));
	}

}
