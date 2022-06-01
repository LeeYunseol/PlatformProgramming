
public class InterfaceEdibleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Edible stuff1 = new Chicken();
		eat(stuff1);
		Edible stuff2 = new Brocolli();
		eat(stuff2);
		
	} 
	public static void eat(Edible stuff) 
	{
		System.out.println(stuff.howToEat());
	}
}

interface Edible {
	public String howToEat();
}
 
class Animal {
	
}

class Vegetable {
	
}

class Brocolli extends Vegetable implements Edible{    // extends이고 abstract 클래스를 사용
	@Override
	public String howToEat() {
		return "너 맘대로 먹어";
	}
}
class Chicken extends Animal implements Edible{
	@Override
	public String howToEat()
	{
		return "Fry it";
	}
}
