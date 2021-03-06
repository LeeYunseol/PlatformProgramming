import java.util.ArrayList;
public class CastingDemo {

	public static void main(String[] args) {
		Object o1 = new subA();
		subA o3 = (subA)o1;
		System.out.println(o3.getArea());
		subA o4 = new subA();  // ★ 이게 같은 이유는 
		Object o2 = new subA2();
		subA2 a5 = new subA2();
		displayObject(o1);
		displayObject(o2);
		System.out.println(o1);
		System.out.println((subA)o1);
		System.out.println(o4);
		
		int age = 12345;
		byte newAge = (byte)age;
		System.out.println(newAge);
		System.out.println(((subA)o1).equals(o3)); //아시발 이거 그거임 밑에 오버라이딩 되어있음 ㅡㅡ 
		System.out.println(((subA)o1).equals(o4));
		ArrayList<subA> subALists = new ArrayList<subA>();
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		for (int i=0 ; i<list.size() ; i++)
		{
			System.out.println(list.get(i));
		}
		
		for(int number : list)
		{
			System.out.println(number
					);
		}
	}
	public static void displayObject(Object object) {
		if(object instanceof subA) {
			System.out.println("subA: " + "Area: " + ((subA)object).getArea() + " Diameter : " + ((subA)object).getDiameter());
		}
		else if(object instanceof subA2) {
			System.out.println("subA2: " + "Area: " + ((subA2)object).getArea() + " Diameter : " + ((subA2)object).getDiameter());
		}
	}

}

class A{
	int radius;
	public A() {
		radius = 10;
	}
	public int getArea() {
		return 1;
	}
}

class subA extends A{
	public subA() {
		radius = 100;
	}
	public int getArea() {
		return 2;
	}
	public int getDiameter() {
		return -1;
	}
	public boolean equals(Object o) {
		if(o instanceof A)
			return radius == ((subA)o).radius;
		else
			return this == o;
	}
}

class subA2 extends A{
	public subA2() {
		radius = 1000;
	}
	
	public int getArea() {
		return 3;
	}
	public int getDiameter() {
		return -2;
	}
}