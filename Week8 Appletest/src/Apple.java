
public class Apple extends Fruit{
	public Apple() {
		super(); // �̷��� ������ ���ִ� ����� ���� �̰͵� ����ص��� ��
	}
	
	
	// Implicit super constructor Fruit() is undefined. Must explicitly invoke another  �� �� �����ڰ� ������ �� ����� Fruit Ŭ������ Fruit()�����ڰ� �־����
	public Apple(String name)
	{
		// compiler automaticlly puts super()
		// super(); Fruit()�� ���ǰ� �ȵǾ� �ֱ� ������ �����Ϸ� ������ �ߴ� ���̴�.
		super(name); // �� �տ� �⺻ �����ڰ� ������ �̰Ÿ� �־���� �� �����ڰ� ������ �� �� => �װų� ���� Ŭ������ ��������� ���� Ŭ������ ��������� �� 
	}
}
