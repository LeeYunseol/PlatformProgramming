
public class test2 {
	public static void main(String[] args) {
		C a = new C();
		a.p(10);
		a.p(10.0);
	}
}

class D {
	public void p(double i)
	{
		System.out.println(i*2);
	}
}

class C extends D{
	// overload
	public void p(int i)
	{
		System.out.println(i);
	}
}
