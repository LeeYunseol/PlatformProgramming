
public class ObjectThinking {
	public static void main(String[] args) {
		Course course1 = new Course("Platform-based programming");
		Course course2 = new Course("Computer Networks");
		
		Student PeterJones = new Student("Peter Jones");
		Student Hyunjaelee = new Student("Hyunjae lee");
		
		course1.addStudent(PeterJones); // �̰� �ν��Ͻ��� �������� ( ���߿� �� �� �� Ȯ���ϱ� )
		course1.addStudent(Hyunjaelee);
		
		course1.displayStudentList();
		
				
	}
}
 