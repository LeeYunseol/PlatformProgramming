
public class Computer extends Merchandise{

	// Constructor for Class Computer.
	public Computer(double price, String brand) {
		super(price, brand);
	}
	// Override getSales() at Merchandise(Abstract class) to return ad.
	@Override
	public String getSalesPitch() {
		return "Best Computer in the world!";
	}
	
}
