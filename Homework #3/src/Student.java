// To use an ArrayList
import java.util.ArrayList;

public class Student {
	// Student has a student login ID (5 letters), login password (5 letters), school number (5 digits).
    String id , pw, school_number;
    // I used an Arraylist to store number of Course which specific student has.
    ArrayList<Course> registeredcourselist = new ArrayList<Course>();
 // Constructor of Student
    public Student(String i,String pw, String school_number)
    {
        this.id  = i;
        this.pw = pw;
        this.school_number = school_number;
    }  
}
