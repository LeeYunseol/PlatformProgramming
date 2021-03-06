// 여기가 동적 바인등 하는 곳임 

public class A extends BaseA{
	public static void main(String[] args){
		subA mySubA = new subA();
		Object o = new subA();
		System.out.println(o.toString()); // we got a subA 
		System.out.println(mySubA);
		/*
		A myA = new A(); // ★ 이거 만들어준거 유의해서 보기
		AA myAA = new AA(); // value = 1 
		AB myAB = new AB(); // value = 2
		System.out.println("Test");
		myA.bar();
		System.out.println(myA); // 여기는 BaseA의 tostring때문에 이렇게 된거임(A에 tostring이 생기기전에)
		
		// 여기가 다형성
		display(myAA);
		display(myAB);
		*/
	}
	public void bar()
	{
		super.foo();
		System.out.println("bar");
	}
	/*
	public int bar()  Duplicate method bar() in type A로 오류뜸
	{
		return 1;
	}
	*/
	
	public static void display(BaseA A) { // ★ 다형성 부분  상위는 하위를 참조할 수 잇다
		System.out.println(A.getValue()); // myAA 랑 myAB가 BaseA로 TYPECAST해서 할 수 있다는데
	}
	public int bar(int i) // 이거는 오류 안 뜸 
	{
		return 1; 
	}   
	// Override BaseA's toString
	@Override
	public String toString()
	{
		return super.toString() + " A";
	}
}

class subA extends A{
	public subA() {}
	@Override
	public String toString()
	{
		return "subA";
	}
}

class AB extends BaseA{
	public AB() {
		value = 2;
}

}
class BaseA
{
	public int value = 0;
	
	public void foo()
	{
		System.out.println("foo");
	}	
	// Override Object's toString()
	public String toString()
	{
		return "BaseA";
	}
	
	public int getValue()
	{
		return value;
	}
	
}
