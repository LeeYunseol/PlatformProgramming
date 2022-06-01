
public class SmallCircle extends Circle {

	public SmallCircle(double Radius) {
		super(Radius);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public String a() {   // => 아 이렇게 따로 하면 함수를 못 만드는 것 같은데? 
		return "red";
	}
	// Circle에서 implemented method가 없으면 여기서 선언해줘서 오류를 막을 수 있음   

}
