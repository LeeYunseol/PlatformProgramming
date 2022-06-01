public class DynamicBindingDemo {
	
	public static void main(String[] args) {
		//Object o = new Student();   => �ڵ����� �̰����� Object o = (Object)new Student();
//		Student s = new Student();
//		Object o = (Object)s;
		/*
		Object o = (Object)new Student();
		o.StudentFoo(); 						=> �̰Ŵ� �ȵ� �ֳ��ϸ� o�� Object�̰� Object�� �̰� ����
		*/
		//Object o = (Object)new Student();
		//Syetem.out.println(o.toString()); => Student   �ڡڡ� to string�� ������ ��  => ���̳��� ���ε� ã�ƿ��� 
		// Student s = o; => ���� 
		// Student s = (Student)o; => �̷��� ���� ����  
		
//		Object o = new Object();
//		Student s = (Student)o;
//		System.out.println(s instanceof Object);
//		System.out.println(o instanceof Student); //   => �̷����ϸ� Student(o) ������ true true ����
		/*
		Object o = new Object();
		Student s = new Student();
		System.out.println(s instanceof Object);
		System.out.println(o instanceof Student);   // => true false
		*/
		Object o = new GraduateStudent(); // implicit casting
		Object o1 = new Object();
		/*
		if(o1 instanceof GraduateStudent) {
			System.out.println("Never got here");
			GraduateStudent gs = (GraduateStudent)o1; // explicit casting
		}
		*/						
		
		
		
		if(o instanceof GraduateStudent) {
			System.out.println("got here");
	
			GraduateStudent gs = (GraduateStudent)o1; // explicit casting // Object is a GraduateStudnet = > �߸��Ȱ���   �߸��ƴٴ°� �׳� ���̾ȵȴٴ¶��ΰŰ���
			//GraduateStudent gs = (GraduateStudent)o; // ��������
		}
		
	}
	public static void m(Object x) {
		System.out.println(x.toString());
	}
}

class GraduateStudent extends Student {
	
}

class Student extends Person {
	public String toString() {
		return "Student";
	}
	public void StudentFoo() {
		System.out.println("StudentFoo");
	}
	
}

class Person extends Object {
	public String toString() { 
		return "Person"; 
	}
}