
public class TestCirclewithStaticMembers {
	// numberOfObjects�� static�̰� i�� int�ε� ���� ����
	// �� ������ i�� global variable�̱� ������ static�̾ ���ٰ����Ѱ� �ƴұ�?
	static int i = CirclewithStaticMembers.numberOfObjects;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before creating objects");
		System.out.println("The number of circle object is " + CirclewithStaticMembers.numberOfObjects);
		
		// create c1
		CirclewithStaticMembers c1 = new CirclewithStaticMembers();
		System.out.println("After creating objects");
		System.out.println("The number of circle object is " + CirclewithStaticMembers.numberOfObjects);
		
		CirclewithStaticMembers c2 = new CirclewithStaticMembers();
		System.out.println("After creating objects");
		System.out.println("The number of circle object is " + CirclewithStaticMembers.numberOfObjects);
		 
	}
}
