
public class SimpleGeometicObject extends Object {
	protected String color = "white";
	protected boolean filled;
	private java.util.Date dateCreated;
	
	public SimpleGeometicObject() 
	{
		super();
		dateCreated = new java.util.Date();
	}
	
	public SimpleGeometicObject(String color, boolean filled) 
	{
		this.color = color;
		this.filled = filled;
		dateCreated = new java.util.Date();
	}
	
	//getter
	public String getColor() 
	{
		return color;
	}
	
	public boolean isFilled() 
	{
		return filled;
	}
	
	public void setColor(String color)
	{
		this.color = color;
	}
	
	public void setFilled(boolean filled)
	{
		this.filled = filled;
	}
	
	public boolean getFilled()
	{
		return filled;
	}
	
//	public String toString() 
//	{
//		return "created on " + dateCreated + "\ncolor : " + color + " and filled : " + filled;
//	}
	public java.util.Date getDateCreated()
	{
		return dateCreated;
	}
	public String toString()
	{
		//return "[Object properties] Color : " + getColor() + " and filled : " + getFilled();
		return "[Object properties] Color : " + color + " and filled : " + filled;
	}
}
