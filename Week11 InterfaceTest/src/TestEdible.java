
public class TestEdible {
	public static void main(String[] args)
	{
		Object[] objects = {new Tiger(), new Chicken(), new Apple(), new Orange()};
		for (int i =0 ; i < objects.length ; i++)
		{
			if (objects[i] instanceof Edible) // ¿À¿Ë
				System.out.println(((Edible)objects[i]).howToEat());
			if (objects[i] instanceof Animal) // ¿À¿Ë
				System.out.println(((Animal   )objects[i]).sound());
		}
	}
}

abstract class Animal {
	public abstract String sound();
}

class Chicken extends Animal implements Edible {

	@Override
	public String sound() {
		// TODO Auto-generated method stub
		return "Chicken : cock-a-doodle*doo";
	}

	@Override
	public String howToEat() {
		// TODO Auto-generated method stub 
		return "Chicken : Fry it!!"; 
	}

	@Override
	public void p() {
		
		// TODO Auto-generated method stub
		
	}
}

class Tiger extends Animal { // TIGER´Â ¸ø ¸Ô¸ÔÀ¸´Ï±ñ 

	@Override
	public String sound() {
		// TODO Auto-generated method stub
		return "Tiger : RROOAAR";
	}
}

abstract class Fruit implements Edible { // ¿©±â¿¡´Â ¿Ö AbstractÀÌ ¾²¿´À»±î?  
}

class Apple extends Fruit{
	@Override
	public String howToEat() {
		// TODO Auto-generated method stub
		return "Apple : Make an apple cider";
	}

	@Override
	public void p() {
		// TODO Auto-generated method stub
		
	}
}

class Orange extends Fruit{
	@Override
	public String howToEat() {
		// TODO Auto-generated method stub
		return "Orange : Make an orange juice";
	}

	@Override
	public void p() {
		// TODO Auto-generated method stub
		
	}
}