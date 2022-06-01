
public class Cake extends Merchandise implements Perishable{
	// Constructor for Class Cake.
	public Cake(double price, String brand) {
		super(price, brand);
	}
	// Override getExpiryDate() at Perishable(interface) to return expiry date.
	@Override
	public String getExpiryDate() {
		return "12/07/2021";
	}
	// Override getSales() at Merchandise(Abstract class) to return ad.
	@Override
	public String getSalesPitch() {
		return "Best Christmas with " + this.getBrand() + " cake!";
	}

}
