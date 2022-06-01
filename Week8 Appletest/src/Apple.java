
public class Apple extends Fruit{
	public Apple() {
		super(); // 이렇게 오류를 없애는 방법도 있음 이것도 기억해두자 ★
	}
	
	
	// Implicit super constructor Fruit() is undefined. Must explicitly invoke another  ★ 이 생성자가 오류가 안 뜰려면 Fruit 클래스에 Fruit()생성자가 있어야함
	public Apple(String name)
	{
		// compiler automaticlly puts super()
		// super(); Fruit()은 정의가 안되어 있기 때문에 컴파일러 오류가 뜨는 것이다.
		super(name); // ★ 앞에 기본 생성자가 없으면 이거를 넣어줘야 이 생성자가 오류가 안 뜸 => 그거네 상위 클래스가 만들어져야 하위 클래스가 만들어지는 것 
	}
}
