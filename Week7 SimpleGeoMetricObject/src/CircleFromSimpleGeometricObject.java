
public class CircleFromSimpleGeometricObject extends SimpleGeometicObject{
	private double radius;
	
	public CircleFromSimpleGeometricObject()
	{
		
	}
	
	public CircleFromSimpleGeometricObject(double radius)
	{
		this.radius = radius;
	}
	
	public CircleFromSimpleGeometricObject(double radius, String color, boolean filled)
	{
		super(color, filled);
		this.radius = radius;
//		super.setColor(color);
//		super.setFilled(filled);   // 이거 안해도 바뀌긴 하는데?
//		setColor(color);
//		setFilled(filled);
		
	} 
	 
	public double getRadius()
	{
		return radius;
	}
	
	public void SetRadius(double radius)
	{
		this.radius = radius;
	}
	
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	public double getDiameter()
	{
		return 2 * radius;
	}
	
	public double geterimeter()
	{
		return 2* radius * Math.PI;
	}
	
	public void printCircle()
	{

		System.out.println("The circle is created " + getDateCreated() + " and the radius is "+ radius);
	}
	
	public String toString()
	{
		//return "[Object properties] Color : " + getColor() + " and filled : " + getFilled();
		return "[Cirlce properties] Color : " + color + " and filled : " + filled;
	}
	
	public String bar() 
	{
		return super.toString();
	}
}
