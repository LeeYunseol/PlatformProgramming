// ���Ⱑ ���� ���ε� �ϴ� ���� 

public class A extends BaseA{
	public static void main(String[] args){
		subA mySubA = new subA();
		Object o = new subA();
		System.out.println(o.toString()); // we got a subA 
		System.out.println(mySubA);
		/*
		A myA = new A(); // �� �̰� ������ذ� �����ؼ� ����
		AA myAA = new AA(); // value = 1 
		AB myAB = new AB(); // value = 2
		System.out.println("Test");
		myA.bar();
		System.out.println(myA); // ����� BaseA�� tostring������ �̷��� �Ȱ���(A�� tostring�� ���������)
		
		// ���Ⱑ ������
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
	public int bar()  Duplicate method bar() in type A�� ������
	{
		return 1;
	}
	*/
	
	public static void display(BaseA A) { // �� ������ �κ�  ������ ������ ������ �� �մ�
		System.out.println(A.getValue()); // myAA �� myAB�� BaseA�� TYPECAST�ؼ� �� �� �ִٴµ�
	}
	public int bar(int i) // �̰Ŵ� ���� �� �� 
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