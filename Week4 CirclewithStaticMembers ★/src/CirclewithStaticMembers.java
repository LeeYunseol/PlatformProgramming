
public class CirclewithStaticMembers {
	double radius;
	 static int numberOfObjects; // ���⼭ �������ذ� �̷��� ��������ָ� �������� �׷��Ű���?
	//������
	CirclewithStaticMembers() {
		radius = 1;
		numberOfObjects++;
	}
	
	static int getNumberOfObjects() {
		//radius = 0;
		return numberOfObjects;
	}
	

}
