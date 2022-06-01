
public class Tester {

	public static void main(String[] args) {	
		System.out.println("Name : Hyunjae Lee");
		System.out.println("School Number : 201746135");
		System.out.println();
		
		// Creating a Store object.
		Store store = new Store("Yunseol's Market");
		
		// Creating objects of the subclasses I created in Part B.
		Milk milk = new Milk(1500, "Busan");
		Book book = new Book(10000, "BusanNationalUniversity");
		Computer computer = new Computer(1000000, "Samsung");
		Cake cake = new Cake(20000, "Paris Baguette");

		// Adding those Merchandise objects to the Store.
		store.addMerchandiseItem(milk);
		store.addMerchandiseItem(book);
		store.addMerchandiseItem(computer);
		store.addMerchandiseItem(cake);
		// Print Name of Store. 
		System.out.println("========== " + store.showStoreName() + " ==========");
		System.out.println("Welcome to our Managing Store Inventory Program!\n\n");
		// Calling showInventory.
		store.showInventory();
		// Calling showExpiryDates();
		store.showExpiryDates();
	}

}
