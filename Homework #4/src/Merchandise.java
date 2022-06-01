// A class representing an item to be sold in a store.
public abstract class Merchandise
{
	// Every merchandise item has a price and a brand/manufacturer.
	private double price;
	private String brand;
	/**
	*
	* @param price: the price of the item
	* @param brand: the brand of the item
	*/
	public Merchandise(double price, String brand)
	{
		this.price = price;
		this.brand = brand;
	}
	/**
	*
	* @return the price of the item
	*/
	public double getPrice()
	{
		return price;
	}
	/**
	*
	* @return the brand of the item
	*/
	public String getBrand()
	{
		return brand;
	}
	/**
	*
	* @param price: the price of the item
	*/
	public void setPrice(double price)
	{
		this.price = price;
	}
	/**
	*
	* @param brand: the brand of the item
	*/
	public void setBrand(String brand)
	{
		this.brand = brand;
	}
	/**
	*
	* @return a String representing a sales pitch for the item
	* (to be used in ads)
	* This must be implemented for any subclass if it is to be instantiated.
	*/
	public abstract String getSalesPitch();
}