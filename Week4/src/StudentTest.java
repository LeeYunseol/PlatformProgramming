import java.util.Date;
public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		
		int x;
		String y;
		
		System.out.println(student.age);
		System.out.println(student.name);
		System.out.println(student.a);
		
		String a = "I am a boy";
		if( a!= null)
		{
			System.out.println(a.indexOf("a"));
		}
		/*
		java.util.Date date = new java.util.Date();
		System.out.println(date.toString());
		*/
		
		// ���� �Ȱ��� ���� �ð��� ��¥�� ����� 
		Date date = new Date();
		System.out.println(date.toString());
	}
}
class Student{
	String name;
	int age;
	char a;
}