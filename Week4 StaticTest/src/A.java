// �ڡ� �̰Ŵ� �� �� �� ���� �����ҵ�?
public class A {
	int i = 5;
	static int k = 2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		int j = a.i; 
		a.m1(); // static �Լ� main ���� non static �޼ҵ带 �ҷ��������ؼ�
		
	}
	
	
	
	
	
	
	public void m1() {
		i = i + k + m2(i,k);
	}
	
	public static int m2(int i, int j ) {
		return (int)(Math.pow(i, j));
	}
}
