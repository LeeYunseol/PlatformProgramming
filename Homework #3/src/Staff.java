// Define "Staff" Class
public class Staff {
	// Staff has an employment login ID (5 letters), login password (5 letters), employment identification number (5 digits).
	String id , pw, identification_number;
	// Constructor of Staff 
    public Staff(String i,String pw, String  n)
    {
        this.id = i;
        this.pw = pw;
        this.identification_number = n;
    }
    // Constructor of Staff without entering identification_number
    // There is the following sentence in the assignment instructions. => SquidCSE.addtStaffID(¡°Staff¡±, ¡°Squid¡±)
    // but the Staff should have identification number so I used 'overloading' to define Constructor without entering identification number.
    public Staff(String i, String pw)
    {
    	this.id = i;
    	this.pw = pw;
    	this.identification_number = "00000"; // default identification number is "00000".
    }
}
