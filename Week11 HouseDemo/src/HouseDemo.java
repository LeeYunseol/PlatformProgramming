
public class HouseDemo {

	public static void main(String[] args) {
		House house1 = new House(1, 1750.50);
		House house2 = (House)house1.clone();
		System.out.println("House1 ID : " + house1.getID());
		System.out.println("House2 ID : " + house2.getID());
		System.out.println("House1 Area : " + house1.getArea());
		System.out.println("House2 Area : " + house2.getArea());
		System.out.println("House1 BuiltDate : " + house1.getWhenBuilt());
		System.out.println("House2 BuiltDate : " + house2.getWhenBuilt());
		house1.id = 2;
		System.out.println("House1 ID : " + house1.getID());
		System.out.println("House2 ID : " + house2.getID());
		
		System.out.println("House1 == House2 : " + (house1==house2));
		System.out.println("House1.whenBuilt equal? house2.whenBuilt " + (house1.whenBuilt == house2.whenBuilt));
	}
	
}
  