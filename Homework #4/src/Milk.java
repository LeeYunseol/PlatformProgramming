
public class Milk extends Merchandise implements Perishable{
	// Constructor for Class Milk.
	public Milk(double price, String brand) {
		super(price, brand);
	}
	// Override getExpiryDate() at Perishable(interface) to return expiry date.
	@Override
	public String getExpiryDate() {
		return "12/01/2021";
	}
	// Override getSales() at Merchandise(Abstract class) to return ad.
	@Override
	public String getSalesPitch() {
		return "Milk is good for your bones!";
	}

}
