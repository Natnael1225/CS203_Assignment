package assignment_5;

public class Circle  implements Shape{

	private float radius;

	   
	public Circle(float radius) {
		this.radius = radius;
	}

   public float getRadius() {
		return radius;
	}
	public void setRadius(float radius) {
		this.radius = radius;
	}

public double area() {
	return (int)(Math.PI * Math.pow(radius, 2));
}

   
@Override
public String toString() {
	return "radius: " + radius ;
}  
   
}
