
public class Course {
	private String courseName;
	private Student[] classList = new Student[60]; // ������ �Ҵ�������� 
	private Faculty faculty;
	// By default, initial value of int-type is 0 
	private int numberOfStudents = 0;
	
	public Course(String courseName)
	{
		// the assignment to variable courseName has no effect => �������� �Ķ���Ϳ� ���������� �̸��� ���� ������ ���� �׷��� this�� �ٿ������
		this.courseName = courseName;
	}
	public void addStudent(Student s)
	{
		classList[numberOfStudents] = s;
		numberOfStudents++; // point to the next available array element
	}
	
	public void displayStudentList() { 
		for(int i =0 ; i < numberOfStudents ; i++)
		{
			System.out.println(classList[i].getName());
		} 
	}
}
