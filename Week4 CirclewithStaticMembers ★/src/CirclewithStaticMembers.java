
public class CirclewithStaticMembers {
	double radius;
	 static int numberOfObjects; // 여기서 선언해준거 이렇게 선언안해주면 오류나서 그런거겠지?
	//생성자
	CirclewithStaticMembers() {
		radius = 1;
		numberOfObjects++;
	}
	
	static int getNumberOfObjects() {
		//radius = 0;
		return numberOfObjects;
	}
	

}
