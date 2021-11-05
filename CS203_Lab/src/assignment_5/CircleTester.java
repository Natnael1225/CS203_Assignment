package assignment_5;

public class CircleTester {

	public static void main(String[] args) {
		
		Circle circle = new Circle(4);
		
		Rectangle rec = new Rectangle(4,3);
		
		shoArea(circle);
		shoArea(rec);
		//Shape.add();
		//rec.add();
		
		
	}

	public static void shoArea(Shape s) {
		double area = s.area();
		System.out.println("The area of the shape is "+ area);
	}
}
