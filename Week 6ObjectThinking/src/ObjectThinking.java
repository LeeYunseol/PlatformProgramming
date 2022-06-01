
public class ObjectThinking {
	public static void main(String[] args) {
		Course course1 = new Course("Platform-based programming");
		Course course2 = new Course("Computer Networks");
		
		Student PeterJones = new Student("Peter Jones");
		Student Hyunjaelee = new Student("Hyunjae lee");
		
		course1.addStudent(PeterJones); // 이거 인스턴스로 만들어야함 ( 나중에 한 번 더 확인하기 )
		course1.addStudent(Hyunjaelee);
		
		course1.displayStudentList();
		
				
	}
}
 