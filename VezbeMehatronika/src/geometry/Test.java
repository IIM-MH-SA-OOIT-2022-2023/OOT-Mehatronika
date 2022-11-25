package geometry;

public class Test {

	public static void main(String[] args) {
		
		Point p1 = new Point();
		/*System.out.println(p1);
		System.out.println(p1.getX());
		System.out.println(p1.getY());*/
		
		Point p2 = new Point();
		p2.setX(50);
		p1.setX(30);
		//System.out.println(p1.getX());
		//System.out.println(p2.getX());
		//p2 = p1;
		//System.out.println(p2.getX());
		
		p1.setX(10);
		p1.setY(5);
		p2.setX(8);
		p2.setY(3);
		
		//System.out.println(p1.distance(p2.getX(), p2.getY()));
		
		Line l1 = new Line(p1,p2);
		System.out.println(l1.getStartPoint().getX());
		System.out.println(l1.getEndPoint().getX());
		System.out.println(p1.distance(p2));
		
		System.out.println(p1.toString());


	}

}
