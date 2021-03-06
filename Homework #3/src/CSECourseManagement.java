// To use an ArrayList.
import java.util.ArrayList;
// To use an Input.
import java.util.Scanner;
// To use an console 
import java.io.Console;  


public class CSECourseManagement {
	// ArrayList to store Student
	ArrayList<Student> studentlist = new ArrayList<Student>();
	// ArrayList to store Course
	ArrayList<Course> courselist = new ArrayList<Course>();
	// ArrayList to store Staff
	ArrayList<Staff> stafflist = new ArrayList<Staff>();
	// For an input
	Scanner scan = new Scanner(System.in);
	// Global variable to distinguish whether logged by student or staff.
	int login_state = 0;
	// Login Method.
	public void Login()
	{	// Infinite loop until the correct ID and password are entered.
		while(true)
		{
			// Make Console cnsl which is null.
			Console cnsl = null;
			// input for id.
			String id = null;
			try {
			     // creates a console object
			 cnsl = System.console();
			// For a blank.
			System.out.println(""); 
			 
			 // if console is not null
			 if (cnsl != null) {
			 // read line from the user input
			 id = cnsl.readLine("Login : ");
			// For a blank.
			System.out.println(""); 	
			 // read password into the char array => method "readPassword" means masking the password.
			 char[] pwd = cnsl.readPassword("Passwd: ");
			 // make a password to string to use.
			 String password = new String(pwd);
			    
			 // Checking the login way(Student or Staff)
			login_state = check_login(id, password, studentlist, stafflist);
			// If a variable "login_state' is 1, it means login as a Staff.
			if(login_state == 1)
			{	// Logged as the Staff, Show the Staff main page.
				ShowStaffMain();
				// The loop ends
				break;
			}
			// If a variable "login_state' is 2, it means login as a Student.
			if(login_state == 2)
			{	// Declare variable "student_index" to find a specific student in Student Arraylist.
				int student_index;
				// When a student logged in, I considered about how to hand over information of specific student.
				// So I make to find an index in Student Arraylist and give this information to other methods for student.
				student_index = FindStudentIndexAtList(id);
				// Logged as the Student, Show the Student main page.
				ShowStudentMain(student_index); 
				// The loop ends
				break;
			}
			// After the one loop and if the variable login_state is still 0, It means that the user entered the wrong ID or Password.
			// So, the loop does not end and repeat one more.
			        
			     } 
			  } catch(Exception ex) {
			     // if any error occurs
			         ex.printStackTrace();      
			      }
			   }
		}
	
	// To figure out which way to login. 
	// wrong login : 0, staff login : 1, student login : 2
	public  int check_login(String id, String pw, ArrayList<Student> studentlist, ArrayList<Staff> stafflist)
	{	// When there's no ID or password.
		if(id.length() == 0 || pw.length() ==0)
		{	// Tell about it. 
			System.out.println("You should enter id or password. Pleach check it one more.\n");
			// // Return integer 0 because it is wrong and want to loop again.
			return 0;
		}
		// When the ID or password is not 5 letters.
		else if(id.length() != 5 || pw.length() != 5)
		{	// Tell about it.
			System.out.println("The ID and password must be 5 letters.\n");
			//// Return integer 0 because it is wrong and want to loop again.
			return 0;
		}
		// The ID or password is five letters (if the conditions are met well)
		else
		{
		// Check it is logged in as a student first.
		for (Student element : studentlist) {
			if(id.equals(element.id))
			{
				if(pw.equals(element.pw))	
				{	
					// For a blank.
					System.out.println(""); 
					// If ID and Password are in the Student Arraylist, successfully login as a student.
					System.out.println("You login by Student");
					// Return integer 2 because it is logged in as a student and Method ends.
					// For a blank.
					System.out.println(""); 
					return 2;		
				}
				else // If the ID is correct but the password is wrong.
				{	
					// For a blank.
					System.out.println(""); 
					System.out.println("You enter the wrong password. Please check one more.");
					// For a blank.
					System.out.println(""); 
					return 0; // Return integer 0 because it is wrong and want to loop again.
				}	
			}
		}
		// Check it is logged in as a staff next.
		for (Staff element : stafflist) {
			if(id.equals(element.id))
			{
				if(pw.equals(element.pw))	
				{	
					// For a blank.
					System.out.println(""); 
					// If ID and Password are in the Staff Arraylist, successfully login as a staff.
					System.out.println("You login by Staff");
					// Return integer 1 because it is logged in as a staff and Method ends.
					// For a blank.
					System.out.println(""); 
					return 1;
				}
				// In this case, "else" means ID is correct but password is wrong.
				else
				{	
					// For a blank.
					System.out.println(""); 
					// If the ID is correct but the password is wrong.
					System.out.println("You enter the wrong password. Please check one more.");
					// For a blank.
					System.out.println("");
					return 0;
				}	
			}
		}
		// For a blank.
		System.out.println(""); 
		// If check both the Student Arraylist and the Staff Arraylist, it means that entered ID is not registered.
		System.out.println("This is an unregistered ID.");
		// For a blank.
		System.out.println(""); 
		// To Re-enter Open GUI window for login..
		Login();
		return 0;
	}
}
	
	// Find an index of specific student to deliver the information of the entered student.
	public int FindStudentIndexAtList(String id) 
	{	// Find an index of specific student at studentlist.
		for(int i=0; i<studentlist.size() ;i++)
		{	// Because the ID is unique, I used the ID to find the index.
			if(id.equals(studentlist.get(i).id))
			{	// Return index of student.
				return i;
			}
		}
		// We don't have to care this return sentence. because it is sure entered id is in studentlist. (I use this method after login as a studnet)
		// I put it in to prevent compiler error.
		return 0;
	}
	// Method of add a staff without entering identification number in Staff Arraylist.
	public void addStaffID(String id, String pw)
	{	// Make an instance of Staff.
		Staff staff = new Staff(id, pw,"00000");
		// Add an instance just made at stafflist.
		stafflist.add(staff);
	}
	// (Overloading) Method of add a staff in Staff Arraylist.
	public void addStaffID(String id, String pw, String identification_number)
	{	// Make an instance of Staff.
		Staff staff = new Staff(id, pw, identification_number);
		// Add an instance just made at stafflist.
		stafflist.add(staff);
	}
	// Method of add a student in Student Arraylist.
	public void addStudent(String id, String pw, String school_number)
	{	// Make an instance of Student.
		Student student = new Student(id, pw, school_number);
		// Add an instance just made at studentlist.
		studentlist.add(student);
	}
	// Method of add a course in Course Arraylist.
	public void addCourse(String courseID, String title)
	{	// Make an instance of Course.
		Course course = new Course(courseID, title);
		// Add an instance just made at courselist.
		courselist.add(course);
	}
	// Show Staff main. 
	public void ShowStaffMain()   
	{	// Declare a variable 'menu' to select function.
		int menu;
		System.out.println("Staff Menu (1) Student List		(2) Course List  		(3) Check whether the course is open or not  		(4) Register Student");
		System.out.println("           (5) Register Staff  		(6) Staff List  		(7) Register Course          	(0) Previous");
		System.out.print(">> Select : ");
		// Enter an integer what we want to call.
		menu = scan.nextInt();
		// Use the switch to perform a specified function according to the value of menu.
		switch(menu) {
		// Case 0 means "Previous" 
		case 0:
			// Back to the main page.
			System.out.println("\n <<Back to the Main Page>>\n");
			Login(); 
			break;
		// Case 1 means show student list.
		case 1: ShowStudentList(); break;
		// Case 2 means show course list.
		case 2: ShowCourse(); break;
		// Case 3 means show whether the course is open or not.
		case 3: ShowCousreWhetherOpen(); break;
		// Case 4 means register student.
		case 4: RegisterStudnet(); break;
		// Case 5 means register staff.
		case 5: RegisterStaff(); break;
		// Case 6 means show staff list.
		case 6: ShowStaffList(); break; 
		// Case 7 means show register course.
		case 7: RegisterCourse(); break;
		// When a number other than the specified number is entered, tell that user entered it incorrectly and let user re-enter it.
		default :
			// Tell that user entered it incorrectly.
			System.out.println("Please enter the number on the menu.");
			// Re-enter
			ShowStaffMain();
			break;
		}
	}
	// It is a method that shows all student list registered in the CSE department. 
	public void ShowStudentList() {
		// Check all student list.
		for(int i=0; i<studentlist.size() ;i++)
		{	// Print each Student's school number, id and password in the studentlist.
			System.out.println("[" + (i+1) + " student] " + "School Number : " + studentlist.get(i).school_number + ", ID : " + studentlist.get(i).id + ", PASSWORD : " + studentlist.get(i).pw);
		}	
		System.out.println("You've checked everything. Back to the menu.");
		// For a blank.
		System.out.println("");
		// Back to the staff main page to continue program.
		ShowStaffMain();
	}
	// It is a method that shows all course list registered in the CSE department. 
	public void ShowCourse() {
		// Check all course list
		for(int i=0; i<courselist.size() ;i++)
		{	// Print id and title of each course in the courselist.
			System.out.println("[" + (i+1) + " Course] courseID : " + courselist.get(i).courseID + ", Title : " + courselist.get(i).title);
		}	
		System.out.println("You've checked everything. Back to the menu.");
		// For a blank.
		System.out.println("");
		// Back to the staff main page to continue program.
		ShowStaffMain();
	}
	// It is a method that informs whether courses registered in the CSE department can be opened.
	// The admin staff can list each course along with students?? information. I only showed only school_number on purpose.
	public void ShowCousreWhetherOpen(){
		// Check all courses in course list.
		for(int i=0; i<courselist.size() ;i++)
		{
			System.out.print("The school number of student who applied for the " + courselist.get(i).title + " is ");
			// Each course in course list has a list of student who applies this course.
			for(int j = 0 ; j < courselist.get(i).appliedstudent.size(); j++)
			{	// Print school number of student who applies a specific course.
				System.out.print(courselist.get(i).appliedstudent.get(j).school_number + " ");
			}
			// Print the number of student in specific course.
			System.out.print("The number of student who applied for the " + courselist.get(i).title + " is "+ courselist.get(i).appliedstudent.size());
			// Each course must have at least 2 students and at most 5 students. Check this condition.
			// If it meets, tell it will be opened.
			// For a blank.
			System.out.println("");
			if(courselist.get(i).appliedstudent.size() >=2 && courselist.get(i).appliedstudent.size() <= 5)
			{
				System.out.println("It will be opened this semester because it meets a condition about the number of students.");
			}
			else
			{	// Only else can be two case which is less then 2 or more than 5. But, we don't have to care more than 5.
				// This is because I restricted application of courses with five registered students when students apply for courses.
				// So, this case of else means only less then 2.
				System.out.println("It will not be opened this semester due to a lack of students.");
			}	
		}
		System.out.println("You've checked everything. Back to the menu.");
		// For a blank.
		System.out.println("");
		// Back to the staff main page to keep program.
		ShowStaffMain();
	}
	
	// It is a method that register a new student.
	public void RegisterStudnet() {
		// Declare a local variables to input it and create a new student.
		String id;
		String pw;
		String school_number;
		// Input for a new student's ID
		System.out.print("Please enter the ID of the student you want to register for >> ");
		id = scan.next();
		// Input for a new student's Password.
		System.out.print("Please enter the password of the student you want to register for >> ");
		pw = scan.next();
		// Input for a new student's school number.
		System.out.print("Please enter the student's school number that you want to register for >> ");
		school_number = scan.next();
		// Student has a student login ID (5 letters), login password (5 letters), school number (5 digits).
		// We need to check about two cases. first is entering the information of a student who is already registered.
		// the second is entering 5 digits for id, password and school number.
		
		// Check the first case(figure out whether it is already registered, school number or ID). 
		// Check the school number in student list whether specific student is already registered.
		for(int i=0 ; i < studentlist.size(); i++)
		{	// Check school numbers of all students in student list. If it is already registered, tell it and go back to the main page.
			if(studentlist.get(i).school_number.equals(school_number))
			{	// For a blank.
				System.out.println(""); 
				// Tell it is already registered.
				System.out.println("This school number of student is already registered.");
				// For a blank.
				System.out.println(""); 
				// Re-enter it
				RegisterStudnet();
				break;
			}
			// Check the first case(figure out whether it is already registered, school number or ID). 
			// Check the ID in student list whether specific student is already registered.
			else if(studentlist.get(i).id.equals(id))
			{
				// For a blank.
				System.out.println(""); 
				// Tell it is already registered.
				System.out.println("This ID is already in use. Please enter other ID.");
				// For a blank.
				System.out.println(""); 
				// Re-enter it
				RegisterStudnet();
				break;
			}
			// Check the the second case.
			// Check the length of ID is 5.
			else if(id.length() != 5)
			{	
				// For a blank.
				System.out.println(""); 
				// tell user does not meet the condition of creating ID.
				System.out.println("The ID must be five letters. Please enter it again.");
				// For a blank.
				System.out.println(""); 
				// Re-enter it
				RegisterStudnet();
				break;
			}
			// Check the the second case.
			// Check the length of Password is 5.
			else if(pw.length() != 5)
			{
				// For a blank.
				System.out.println(""); 
				// tell user does not meet the condition of creating ID.
				System.out.println("The Password must be five letters. Please enter it again.");
				// For a blank.
				System.out.println(""); 
				// Re-enter it
				RegisterStudnet();
				break;
			}
			// Check the the second case.
			// Check the length of School number is 5.
			else if(school_number.length() != 5)
			{
				// For a blank.
				System.out.println(""); 
				// tell user does not meet the condition of creating ID.
				System.out.println("The School number must be five digits. Please enter it again.");
				// For a blank.
				System.out.println(""); 
				// Re-enter it
				RegisterStudnet();
				break;
			}
		}
		// After the loop means, It meets all of the conditions. So, Add the new student in studentlist.
		addStudent(id, pw, school_number);
		// For a blank.
		System.out.println(""); 
		System.out.println("It registered the student you entered. It'll go back to the main page.");
		// For a blank.
		System.out.println("");
		// Go back to the main page to keep program.
		ShowStaffMain();	
	}
	// It is a method that register a new staff.
	public void RegisterStaff()
	{	// Declare local variables to input and create a new staff.
		String id;
		String pw;
		String id_num;
		// Input for a new Staff's ID.
		System.out.print("Please enter the ID of the staff you want to register for >> ");
		id = scan.next();
		// Input for a new Staff's Password.
		System.out.print("Please enter the Password of the staff you want to register for >> ");
		pw = scan.next();
		// Input for a new Staff's Identification Number.
		System.out.print("Please enter the Identification Number of the staff you want to register for >> ");
		id_num = scan.next();
		
		// Staff has an employment login ID (5 letters), login password (5 letters), employment identification number (5 digits).
		// So we need to check the same condition as registering new student.
		
		// Check the first case(figure out whether it is already registered, identification number or ID). 
		// Check the identification number in staff list whether specific staff is already registered.
		for(int i=0 ; i < stafflist.size(); i++)
		{	// Check identification of all staffs in stafflist. If it is already registered, tell it and go back to the main page.
			if(stafflist.get(i).identification_number.equals(id_num))
			{	// For a blank.
				System.out.println(""); 
				// Tell it is already registered.
				System.out.println("This Identification Number of staff is already registered.");
				// For a blank.
				System.out.println(""); 
				// Re-enter it
				RegisterStaff();
				break;
			}
			// Check the first case(figure out whether it is already registered, identification number or ID). 
			// Check the ID in staff list whether specific staff is already registered.
			else if(stafflist.get(i).id.equals(id))
			{
				// For a blank.
				System.out.println(""); 
				// Tell it is already registered.
				System.out.println("This ID is already in use. Please enter other ID.");
				// For a blank.
				System.out.println(""); 
				// Re-enter it
				RegisterStaff();
				break;
			}
			// Check the the second case.
			// Check the length of ID is 5.
			else if(id.length() != 5)
			{	
				// For a blank.
				System.out.println(""); 
				// tell user does not meet the condition of creating ID.
				System.out.println("The ID must be five letters. Please enter it again.");
				// For a blank.
				System.out.println(""); 
				// Re-enter it
				RegisterStaff();
				break;
			}
			// Check the the second case.
			// Check the length of Password is 5.
			else if(pw.length() != 5)
			{
				// For a blank.
				System.out.println(""); 
				// tell user does not meet the condition of creating ID.
				System.out.println("The Password must be five letters. Please enter it again.");
				// For a blank.
				System.out.println(""); 
				// Re-enter it
				RegisterStaff();
				break;
			}
			// Check the the second case.
			// Check the length of identification number is 5.
			else if(id_num.length() != 5)
			{
				// For a blank.
				System.out.println(""); 
				// tell user does not meet the condition of creating ID.
				System.out.println("The Identification Number must be five digits. Please enter it again.");
				// For a blank.
				System.out.println(""); 
				// Re-enter it
				RegisterStaff();
				break;
			}
		}
		// After loop, It means it meets all conditions, So add it.
		addStaffID(id, pw, id_num);
		System.out.println("The staff you have entered has been registered. It'll back to the staff main page.");
		// Go back to the main page to keep program.
		ShowStaffMain();
	}
	
	public void ShowStaffList() {
		// For a blank.
		System.out.println(""); 
		// Check all staffs and print each staff information.
		for(int i=0 ; i < stafflist.size();i++)
		{
			System.out.println("[" + (i+1) + " Staff]  Identification Number : " + stafflist.get(i).identification_number + ", ID : " +
								stafflist.get(i).id + ", Password : " + stafflist.get(i).pw);
		}
		// For a blank.
		System.out.println(""); 
		// Go back to the main page to continue program.
		ShowStaffMain();	
	}
	
	// Method for registering course.
	public void RegisterCourse() {
		// Declare a local variables to input it and create a new student.
		String courseID;
		String title;
		// Input for a new ID of Course
		System.out.print("Please enter the ID of the course you want to register for >> ");
		courseID = scan.next();
		// Input for a new title of Course.
		System.out.print("Please enter the title of the course you want to register for >> ");
		title = scan.next();
		// We need to check about one case which is already registered or not.

		// I assumed that no course of the same name is opened.
		// Check the case(figure out whether it is already registered, courseID or title). 
		// Check the courseID in course list whether specific course is already registered.
		for(int i=0 ; i < courselist.size(); i++)
		{	// Check courseIDs of all courses in course list. If it is already registered, tell it and go back to the main page.
			if(courselist.get(i).courseID.equals(courseID))
			{	// For a blank.
				System.out.println(""); 
				// Tell it is already registered.
				System.out.println("This courseID of course is already registered.");
				// For a blank.
				System.out.println(""); 
				// Re-enter it
				RegisterCourse();
				break;
			}
			// Check the first case(figure out whether it is already registered, courseID or title). 
			// Check the title in course list whether specific course is already registered.
			else if(courselist.get(i).title.equals(title))
			{
				// For a blank.
				System.out.println(""); 
				// Tell it is already registered.
				System.out.println("This title is already in use. Please enter other title.");
				// For a blank.
				System.out.println(""); 
				// Re-enter it
				RegisterCourse();
				break;
			}
		}
		// After the loop means, It meets all of the conditions. So, Add the new course in courselist.
		addCourse(courseID, title);
		// For a blank.
		System.out.println(""); 
		System.out.println("It registered the course you entered. It'll go back to the main page.");
		// For a blank.
		System.out.println("");
		// Go back to the main page to keep program.
		ShowStaffMain();	
	}


	// Show Student main menu.
	// The difference from the ShowStaffMain() is that the ShowStudentMain(int student_index) gives the index as a parameter to each method for student.
	// ( ShowStaffMain() : void    ShowStudentMain(int student_index) : int)
	public void ShowStudentMain(int student_index) {
		// To tell you which student logged in, use the student_index to bring the school number from the studentlist.
		System.out.println("Hello! " + studentlist.get(student_index).school_number + " student !");
		// Empty space for readability.
		System.out.println(" ");
		// Declare a variable 'menu' to select function.
		int menu;
		System.out.println("Student Menu (1) Add Course		(2) Drop Course  		(3) Check my course registration		(0) Logout"	);
		System.out.print(">> Select : ");
		// Enter an integer what we want to call.
		menu = scan.nextInt();
		// Use the switch to perform a specified function according to the value of menu.
		switch(menu) {
		// Case 0 means Logout
		case 0: 
			// For a blank
			System.out.println(" ");
			// Tell logout successfully completes.
			System.out.println("Successfully Logout");
			// For a blank
			System.out.println(" ");
			// Go back to the Login page to continue program.
			Login();
			break;
		// Case 1 means call a method to add course.
		case 1: AddCourse(student_index); break;
		// Case 2 means call a method to drop course.
		case 2: DropCourse(student_index); break;
		// Case 3 means call a method to show all course that specific student has added so far.
		case 3: ShowAddedCourse(student_index); break;
		default : 
			// Tell that user entered it incorrectly.
			System.out.println("Please enter the number on the menu.");
			// For a blank.
			System.out.println("");
			// Re-enter
			ShowStudentMain(student_index);
			break;
		}		
	}
	
	// It is a method that add a course for a student.
	public void AddCourse(int student_index) 
	{	// Declare a local variable to add a course which is selected.
		int wantCourse;
		// Print courseID and title of each course in the courselist first to know what course will be opened in this semester.
		for(int i=0; i<courselist.size() ;i++)
		{	
			System.out.println("[" + (i+1) + " Course] courseID : " + courselist.get(i).courseID + ", Title : " + courselist.get(i).title);
		}	
		System.out.print("What course would you like to add? Enter your number >> ");
		// Input
		wantCourse = scan.nextInt();
		
		// Check some conditions.
		// Case when course which want to register has already been registered.
		if(studentlist.get(student_index).registeredcourselist.contains(courselist.get(wantCourse-1)))
		{
			System.out.println("You already added a " + courselist.get(wantCourse-1).title);
		}
		// Other case when course which want to register is full.
		else if(courselist.get(wantCourse-1).appliedstudent.size() >= 5)
		{
			System.out.println("You can't register for the course because the number of students is full.");
		}
		// Here is the condition. => The student needs to select at least 2 courses and at most 4 courses.
		// The student can not take more than 4 courses. So, I restricted it.
		else if(studentlist.get(student_index).registeredcourselist.size() >= 4)
		{
			System.out.println("You have exceeded the number of courses you can take this semester.");
		}
		// "Else" means it meets all of the conditions and finally we can add the course.
		else
		{	
			// Tell it is added successfully.
			System.out.println("You add a " + courselist.get(wantCourse-1).title + " successfully.");
			// Specific student in student list adds a new course at each registeredcourselist in each Student class. 
			studentlist.get(student_index).registeredcourselist.add(courselist.get(wantCourse-1));
			// If the student add a course, Students should also be added to the course's student information.
			// ?? This is the charm of object-oriented programming. ??
			courselist.get(wantCourse-1).appliedstudent.add(studentlist.get(student_index));
		}
		// Go back to the student main page to continue the program.
		ShowStudentMain(student_index);	
	}
	// It is a method that drop a course for a student.
	private void DropCourse(int student_index) {
		// Declare a local variable to drop a course which is selected.
		int dropCourse;
		// Print courseID and title of each course in the courselist first to know what course will be opened in this semester.
		for(int i=0; i<courselist.size() ;i++)
		{	
			System.out.println("[" + (i+1) + " Course] courseID : " + courselist.get(i).courseID + ", Title : " + courselist.get(i).title);
		}	
		System.out.print("What course would you like to drop? Enter your number >> ");
		// Input
		dropCourse = scan.nextInt();
		// If student registered a course that student wants to drop.
		if(studentlist.get(student_index).registeredcourselist.contains(courselist.get(dropCourse-1)))
		{
			// Tell it is droped successfully
			System.out.println("You drop a " + courselist.get(dropCourse-1).title + " successfully.");
			// Specific student in student list drops a course at each registeredcourselist in each Student class.
			studentlist.get(student_index).registeredcourselist.remove(courselist.get(dropCourse-1));
			// If the student drop a course, Students should also be removed to the course's student information.
			courselist.get(dropCourse-1).appliedstudent.remove(studentlist.get(student_index));
		}
		// "Else" means in the case where student didn't register for a course that student was going to drop.
		else
		{
			// Tell student did not added it before.
			System.out.println("It's a course that you didn't add before. Please check it one more time.");
		}
		// Go back to the student main page to continue the program.
		ShowStudentMain(student_index);
	}
	// It is a method that show all courses that student has added so far for a student.
	private void ShowAddedCourse(int student_index) {
		// If a student doesn't add for any course. The size of registeredcourselist of each student is 0.
		if(studentlist.get(student_index).registeredcourselist.size() == 0)
			System.out.println("There are no courses you added.");
		// The student needs to select at least 2 courses and at most 4 courses.
		// If the number of course which student takes is less then 2, Tell it should take more courses.
		else if(studentlist.get(student_index).registeredcourselist.size() < 2)
		{
			System.out.println("So far, the number of courses you have registered for is " + studentlist.get(student_index).registeredcourselist.size() 
					+". You should add " + (2-studentlist.get(student_index).registeredcourselist.size()) + " more courses.");
			// Show all courses that student has added.
			System.out.print("The courses you added are ");
			for(int i=0; i<studentlist.get(student_index).registeredcourselist.size() ;i++)
			{
				System.out.print(studentlist.get(student_index).registeredcourselist.get(i).title + " ");
			}

		}
		// In a case where the condition of two or more and four or less courses added by a student is satisfied.
		else if(studentlist.get(student_index).registeredcourselist.size() <=4)
		{
			System.out.println("You satisfied the conditions for the number of courses you have to add to.");
			System.out.print("The course you took this semester is ");
			// Print by searching through the courselist of a particular student.
			for(int i=0; i<studentlist.get(student_index).registeredcourselist.size() ;i++)
			{
				System.out.print(studentlist.get(student_index).registeredcourselist.get(i).title + " ");
			}

		}
		// When there are more than four courses to add. 
		// This cannot be realized. This is because the number of courses that can be added was limited to less than four. This is assumed case.
		else 
		{
			System.out.println("You have exceeded the course you have to add.");
		}
		// For a blank
		System.out.println("");
		// Go back to the student main page to continue the program.
		ShowStudentMain(student_index);
	}	
}
