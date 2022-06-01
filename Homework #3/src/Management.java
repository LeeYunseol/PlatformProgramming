public class Management {
	public static void main(String[] args) {
		CSECourseManagement SquidCSE = new CSECourseManagement();
		
		// Enter Staff information
		SquidCSE.addStaffID("Staff","Squid");
		// Enter Course information.
		// The CSE department opens 3 courses.  
		SquidCSE.addCourse("00000", "C++");
		SquidCSE.addCourse("00001", "Python");
		SquidCSE.addCourse("00002", "Java");
		
		// Enter Student information
		SquidCSE.addStudent("id000", "pw000", "00000");
		SquidCSE.addStudent("id001", "pw001", "00001");
		SquidCSE.addStudent("id002", "pw002", "00002");
		SquidCSE.addStudent("id003", "pw003", "00003");
		SquidCSE.addStudent("id004", "pw004", "00004");
		SquidCSE.addStudent("id005", "pw005", "00005");
			
		// Name & School number
		System.out.println("Name : Hyunjae Lee");
		System.out.println("School Number : 201746135\n");
		// I don't want to keep showing this sentence but only one(When we access the site, only that moment). but it is too messy. 
		System.out.println("Welcome to the CSE Department!!\n");
		// Start
		SquidCSE.Login();
	}
}

