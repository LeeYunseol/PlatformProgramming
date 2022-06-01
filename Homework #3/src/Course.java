// To use an ArrayList
import java.util.ArrayList;
// Define "Course" Class
public class Course {
	// A course has a title, course ID, the number of students who register the course, and students¡¯ information (name and school number)
	String courseID; 
	String title;
	// I used an Arraylist to store number of students in Course class
	ArrayList<Student> appliedstudent = new ArrayList<Student>();
	// Constructor of Course
	public Course(String courseID, String title)
	{
		this.courseID = courseID;
		this.title = title;
	}
	
}