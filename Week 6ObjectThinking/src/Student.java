// array�� ���µ��� array�� �� �� �ֳ�
public class Student {
	private Course[] courseList; 
	private String name;
	
	//Constructor
	public Student(String name) {
		this.name = name;
	}
	// Getter
	public String getName() {
		return this.name;
	}
	// Setter
	public void setName(String name)
	{
		this.name = name;
	}
}
