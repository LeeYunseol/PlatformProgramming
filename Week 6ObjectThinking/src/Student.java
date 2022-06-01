// array가 없는데도 array를 줄 수 있네
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
