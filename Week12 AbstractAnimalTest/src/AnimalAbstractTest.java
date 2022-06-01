
public class AnimalAbstractTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Chicken();
		eat(animal);
		Vegetable vegetable = new Brocolli();
		eat(vegetable);
		
	}
	public static void eat(Animal animal)
	{
		System.out.println(animal.howToEat());
	}
	
	public static void eat(Vegetable veget)
	{
		System.out.println(veget.howToEat());
	}
}

abstract class Animal {
	public abstract String howToEat();
}

class Brocolli extends Vegetable {   // extends이고 abstract 클래스를 사용
	@Override
	public String howToEat() {
		return "너 맘대로 먹어";
	}
}

abstract class Vegetable {
	public abstract String howToEat();
}

class Chicken extends Animal {
	@Override
	public String howToEat()
	{
		return "Fry it";
	}
}