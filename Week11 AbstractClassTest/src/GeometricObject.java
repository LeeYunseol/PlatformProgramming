public abstract class GeometricObject {
	private String color = "white"; // �ڡڡ� ���Ӱ� �� �ִ°ų� 
	
	// Constructor
	public GeometricObject()
	{
		
	}
	
	public String getColor() {
		return color;
	}
	public abstract double getArea();
	// public abstract static double getArea(); �� �Լ��� ���� �� 
	public abstract double getWidth();

}
