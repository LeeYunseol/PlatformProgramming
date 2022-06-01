
public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//B b = new B();
		//Math math = new Math();
		Math.sin();
		s();
	}
	
	public static void s()
	{
		System.out.println("dsadaa");
	}

}

class Math {
//	 Math() { // 이게 생성자 이름이 클래스와 같은데 public만 있고 return도 아무것도 없는 것 
//		System.out.println("Constructor B is called");
//	}
	public static void sin()
	{
		System.out.println("sin() is called"); //★
		// 이게 가능하네 
	}
} 