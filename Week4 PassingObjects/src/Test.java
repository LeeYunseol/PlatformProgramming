
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle mycircle = new Circle();
		mycircle.setRadius(10);
		System.out.println(mycircle.getRadius());
		System.out.println("Area : " + mycircle.getArea());
		changeCircle(mycircle);
		System.out.println(mycircle.getRadius());
		System.out.println("Area : " + mycircle.getArea());
	}
	// 이게 되네 ★
	public static void changeCircle(Circle c) {
		c.setRadius(1);
	}
}
