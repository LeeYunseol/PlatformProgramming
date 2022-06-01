
public class Quotient {
	public static int quotient(int num1, int num2)
	{
		if (num2 == 0)
			throw new ArithmeticException("Divisor cannot be Zero");
			
		return num1 / num2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 5;
		int num2 = 1;
		/*
		if (num2 != 0)
		{
			System.out.println(num1 + " / "  + num2 + " is " + (num1/num2));
		}
		else
		{
			System.out.println("Divisor cannot be Zero");
		}
		*/
		try {
			int result = quotient(num1, num2);
			System.out.println(num1 + " / "  + num2 + " is " + (num1/num2));
		}
		catch (ArithmeticException e){
			System.out.println("Exception : an integer cannot be divided by zero");
		}
		System.out.println("아 공부하기 싫어~~~~~");
	}  
}
