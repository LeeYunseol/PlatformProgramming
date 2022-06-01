
public class Book extends Merchandise {
	
	// Constructor for Class Book.
	public Book(double price, String brand) {
		super(price, brand);
	}
	// Override getSales() at Merchandise(Abstract class) to return ad.
	@Override
	public String getSalesPitch() {
		return "Read a Book! It will make you smart!";
	}

}
