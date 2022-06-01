public abstract class GeometricObject {
	private String color = "white"; // ★★★ ㅇㅣ걸 다 주는거네 
	
	// Constructor
	public GeometricObject()
	{
		
	}
	
	public String getColor() {
		return color;
	}
	public abstract double getArea();
	// public abstract static double getArea(); 이 함수는 오류 남 
	public abstract double getWidth();

}
