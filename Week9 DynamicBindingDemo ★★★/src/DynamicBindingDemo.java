public class DynamicBindingDemo {
	
	public static void main(String[] args) {
		//Object o = new Student();   => 자동으로 이거해줌 Object o = (Object)new Student();
//		Student s = new Student();
//		Object o = (Object)s;
		/*
		Object o = (Object)new Student();
		o.StudentFoo(); 						=> 이거는 안됨 왜냐하면 o는 Object이고 Object는 이게 없음
		*/
		//Object o = (Object)new Student();
		//Syetem.out.println(o.toString()); => Student   ★★★ to string은 가능한 ㅔ  => 다이나믹 바인딩 찾아오네 
		// Student s = o; => 오류 
		// Student s = (Student)o; => 이러면 오류 없음  
		
//		Object o = new Object();
//		Student s = (Student)o;
//		System.out.println(s instanceof Object);
//		System.out.println(o instanceof Student); //   => 이렇게하면 Student(o) 때문에 true true 나옴
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
	
			GraduateStudent gs = (GraduateStudent)o1; // explicit casting // Object is a GraduateStudnet = > 잘못된거임   잘못됐다는게 그냥 말이안된다는뜻인거같음
			//GraduateStudent gs = (GraduateStudent)o; // 문제없음
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