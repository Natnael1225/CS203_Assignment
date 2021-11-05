package assignment_5;

public class Rectangle  implements Shape{
	
	private float height;
	private float width;
	
	
	public Rectangle(float height, float width) {
		this.height = height;
		this.width = width;
	}


	public float getHeight() {
		return height;
	}


	public void setHeight(float height) {
		this.height = height;
	}


	public float getWidth() {
		return width;
	}


	public void setWidth(float width) {
		this.width = width;
	}
	
	public double area() {
		
		return height * width;
	}

	public void subtract() 	{
	System.out.println("Overrrideeeee");
	}
//	@Override
//	static void add() {
//		System.out.println("hhhhh");
//	}

}
