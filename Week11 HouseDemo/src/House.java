import java.util.Date;

public class House implements Cloneable, Comparable<House>{
	public int id;
	private double area;
	public Date whenBuilt;
	
	public House(int id, double area)
	{
		this.id = id;
		this.area = area;
		whenBuilt = new java.util.Date();
	}
	
	public int getID() {
		return id;
	}
	
	public double getArea() {
		return area;
	}
	
	public Date getWhenBuilt() {
		return whenBuilt;
	}
	@Override
	public int compareTo(House o) {
		if(area > o.area) // area는 this.area를 의미한다!!!!
			return 1;
		else if(area < o.area)
			return -1;
		else
			return 0;
	}
	
	@Override
	public Object clone() {
		try {
			// Perform a shallow copy
			House houseClone =  (House)super.clone();
			// Deep copy on whenBuilt
			houseClone.whenBuilt = (Date) whenBuilt.clone();
			return houseClone;
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}  // 이거 좀 흥미롭네 
	}
}
