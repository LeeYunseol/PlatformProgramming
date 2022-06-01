import java.util.ArrayList;

public class Store {
	private String name;
	private ArrayList<Merchandise> M_list;
	private ArrayList<Perishable> P_list;
	
	// Constructor for Class Store with a single parameter.
	Store(String name)
	{
		this.name = name;
		M_list = new ArrayList<Merchandise>();
		P_list = new ArrayList<Perishable>();
	}
	// This method takes an object of type Merchandise and adds it to the specific ArrayList.  
	public void addMerchandiseItem(Merchandise m)
	{	
		// All stuffs should be added to the ArrayList<Merchandise>, which is M_list.
		M_list.add(m);
		
		// If it is Merchandise and Perishable, It should additionally be added to the ArrayList<Perishable>, which is P_list.
		if (m instanceof Merchandise && m instanceof Perishable) 
		{	// Typecasting
			Perishable p = (Perishable) m;
			// adds to the Perishable ArrayList. 
			P_list.add(p);
		}
		
	}
	
	// This method should just iterate over the ArrayList<Merchandise> and display the sales pitch for each item.
	public void showInventory()
	{
		System.out.println("========== Merchandise ==========");
		// Loop to check all of elements in the ArrayList<Merchandise>.
		for (Merchandise element : M_list) 
		{	// Get all of variables of each element.
			System.out.println("Stuff : " + element.getClass().getSimpleName() + ", Price : " + element.getPrice() + ", Brand : " + element.getBrand());
			System.out.println(element.getSalesPitch());
			System.out.println();
		}
	}
	// This method should just iterate over the ArrayList<Perishable> and display the expiry date for each perishable item.
	public void showExpiryDates()
	{	
		System.out.println("========== Perishable ==========");
		// Loop to check all of elements in the ArrayList<Perishable>.
		for (Perishable element : P_list) 
		{	// Typecasting to get variable price and brand and call the getSalesPitch() method.
			Merchandise m = (Merchandise) element;
			System.out.println("Stuff : " + m.getClass().getSimpleName() + ", Price : " + m.getPrice() + ", Brand : " + m.getBrand());
			System.out.println(m.getSalesPitch());
			// In the phrase, it is expressed as mm/dd/yyyy, but it is uncomfortable to see, so I expressed as follows.
			System.out.println("ExpiryDate : " + element.getExpiryDate());	
			System.out.println();
		}
	}
	// This method is for shoing the store name which I entered.
	public String showStoreName()
	{
		return this.name;
	}
}
