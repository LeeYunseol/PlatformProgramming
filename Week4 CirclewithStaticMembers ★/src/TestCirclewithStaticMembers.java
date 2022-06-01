
public class TestCirclewithStaticMembers {
	// numberOfObjects가 static이고 i가 int인데 오류 없음
	// 내 생각은 i가 global variable이기 때문에 static이어도 접근가능한것 아닐까?
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
