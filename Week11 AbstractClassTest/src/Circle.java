
public class Circle extends GeometricObject{ // public abstract class Circle... 이렇게 선언해주면 됨 왜냐하면 abstract method는 abstract class에서 사용가능하므로
	double Radius;
	
	public Circle(double Radius)
	{
		// super();
		this.Radius = Radius;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI * Radius * Radius;
	}

	@Override
	public double getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}
	//@Override
	//public abstract String getColor();  // 이거를 위해서 circle 클래스를 abstract class로 만들어줘ㅑ함
	/*
	public String getColor() {
		return "Red";
	}
	*/
}
