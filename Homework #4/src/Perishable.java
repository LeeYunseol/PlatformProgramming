// An interface to be used by classes representing perishable items.
public interface Perishable
{
/**
* @return a String representing the expiry date
* (for simplicity, just represent an expiry as "mm/dd/yyyy")
*/
public String getExpiryDate();
}
