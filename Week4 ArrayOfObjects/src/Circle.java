
public class Circle {
	private double radius = 1;
	private double area;
	
	public Circle() {
		area = 3.14 * radius * radius;
	}
	
	public Circle(double newRadius) {
		radius = newRadius;
		area = 3.14 * radius * radius;
	}
	
	public void setRadius(double newRadius) {
		radius = newRadius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		area = 3.14 * radius * radius;
		return area;
	}
}
