package orange;

public class Calculator {
	private Adder adder;
	
	public Calculator() {
		adder = new Adder();
	}
	
	public int addTwoNumber(int num1, int num2)
	{
		return adder.addTwoNumber(num1,num2);
	}
	
	public void showioeratingtimes() {
		System.out.println("µ¡¼À È½¼ö : " +adder.getCntAdd());
	}
}


