
public class AbstractClassDemo {

	public static void main(String[] args) {
		// GeometricObject geometricobject = new GeometricObject(); 이거 안된다 
		GeometricObject[] objects = new GeometricObject[10];
		objects[0] = new Circle(10.0); 
		Circle circle = new Circle(5.0);
		Rectangle rectangle = new Rectangle(10.0, 10.0);
		objects[1] = new SmallCircle(10);
		System.out.println("Circle Area : " + circle.getArea());
		System.out.println("Rectangle Area : " + rectangle.getArea());
		System.out.println("Circle Area : " + objects[0].getArea());
		System.out.println(circle.getColor());
		System.out.println(objects[1].getArea() + objects[1].getColor());
	}

}
