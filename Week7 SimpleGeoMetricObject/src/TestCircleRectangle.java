
public class TestCircleRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircleFromSimpleGeometricObject circle = new CircleFromSimpleGeometricObject(1, "black" , true);
		circle.printCircle();
		System.out.println(circle); // �̰Ͷ����� haha�� �����°ų� 
		
		Object o = new Object();
		// Object has A toSting 
		
		SimpleGeometicObject s = new SimpleGeometicObject();
		SimpleGeometicObject s1 = new CircleFromSimpleGeometricObject(1, "dd", true);
		System.out.println(s1.toString());
		System.out.println(circle.toString());
		System.out.println(s);
		System.out.println(s.toString()); // �� �̰� 2�� �ٸ��� �ν��ؾ���
		System.out.println(circle.bar());
		
	}

} 
