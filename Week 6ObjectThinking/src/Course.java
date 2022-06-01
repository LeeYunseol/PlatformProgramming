
public class Course {
	private String courseName;
	private Student[] classList = new Student[60]; // 공간을 할당해줘야함 
	private Faculty faculty;
	// By default, initial value of int-type is 0 
	private int numberOfStudents = 0;
	
	public Course(String courseName)
	{
		// the assignment to variable courseName has no effect => 생성자의 파라미터와 지역변수의 이름이 같기 때문에 문제 그래서 this를 붙여줘야함
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
