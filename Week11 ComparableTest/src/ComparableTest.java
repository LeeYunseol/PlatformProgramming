
public class ComparableTest {

	public static void main(String[] args) {
		System.out.println(new Integer(3).compareTo(new Integer(5)));
		System.out.println("ABC".compareTo("ABZ"));
		System.out.println("BBC".compareTo("CDE")); // 이거 다른거 찾자마자 반환하는거같애  
		System.out.println(new Rectangle(1.0, 2.0).compareTo(new Rectangle(5.0, 5.0)));
	}

}

class Rectangle implements Comparable<Rectangle>
{
	double Width, Height;
	public Rectangle(double Width, double Height) {
		this.Width = Width;
		this.Height = Height;
	}
	
	public double getArea() {
		return Width*Height;
	}

	public double getWidth() {
		return Width;
	}
	
	
	@Override
	public int compareTo(Rectangle o) {
		// 이거는 이제 compareable을 구현하기 위해서 사용하는 것 
		if (getArea() > o.getArea())
			return 1;
		else if (getArea() < o.getArea())
			return -1;
		else 
			return 0;
	}
}