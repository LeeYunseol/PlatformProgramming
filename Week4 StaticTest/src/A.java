// ★★ 이거는 한 번 더 설명 들어야할듯?
public class A {
	int i = 5;
	static int k = 2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		int j = a.i; 
		a.m1(); // static 함수 main 에서 non static 메소드를 불러오기위해서
		
	}
	
	
	
	
	
	
	public void m1() {
		i = i + k + m2(i,k);
	}
	
	public static int m2(int i, int j ) {
		return (int)(Math.pow(i, j));
	}
}
