
public class OuterClass {
	private static int data;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass outerObject = new OuterClass();
		OuterClass.InnerClass innerObject = new OuterClass.InnerClass();
		/* 
		OuterClass.InnerClass innerObject = outerObject.new InnerClass();
		*/
	}
	// Inner Class
	static class InnerClass {
		public void m() {
			data = data + 1;
		}
	}
}

class A {
	public void m() {
	}
}

class B {
	public void m() {
		A a = new A();
	}
}
