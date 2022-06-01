
public class ComparableTest {

	public static void main(String[] args) {
		System.out.println(new Integer(3).compareTo(new Integer(5)));
		System.out.println("ABC".compareTo("ABZ"));
		System.out.println("BBC".compareTo("CDE")); // �̰� �ٸ��� ã�ڸ��� ��ȯ�ϴ°Ű���  
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
		// �̰Ŵ� ���� compareable�� �����ϱ� ���ؼ� ����ϴ� �� 
		if (getArea() > o.getArea())
			return 1;
		else if (getArea() < o.getArea())
			return -1;
		else 
			return 0;
	}
}