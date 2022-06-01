
public class F {
	
	private int x = 0;
	private int y = 0;
	
	public static void main(String[] args) {
		F myF = new F();
		myF.p();
	}
		public F() {}
		
		public void p() {
			int x = 1;
			y += 10;
			System.out.println("x : " + x);
			System.out.println("y : " + y);
	}
}
