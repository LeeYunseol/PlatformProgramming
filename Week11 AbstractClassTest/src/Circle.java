
public class Circle extends GeometricObject{ // public abstract class Circle... �̷��� �������ָ� �� �ֳ��ϸ� abstract method�� abstract class���� ��밡���ϹǷ�
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
	//public abstract String getColor();  // �̰Ÿ� ���ؼ� circle Ŭ������ abstract class�� ����������
	/*
	public String getColor() {
		return "Red";
	}
	*/
}
