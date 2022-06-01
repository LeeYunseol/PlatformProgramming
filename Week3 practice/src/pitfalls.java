
public class pitfalls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		final double EPSILON = 1E-14;
		double x = 1.0 - 0.1 - 0.1 - 0.1 - 0.1 -0.1;
		if (Math.abs(x - 0.5) < EPSILON)
		{
			System.out.println(x + "is approximately 0.5");
		}
		*/
		double number1 = Math.random();
		double number2 = Math.random()*100;
		int number3 = (int)(Math.random()*100);
		System.out.printf("%f, %f, %d", number1, number2,number3);
	}

}
