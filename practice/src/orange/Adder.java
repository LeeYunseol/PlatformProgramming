package orange;

public class Adder {
	private int cntadd;

	Adder() {cntadd = 0;}
	int getCntAdd()
	{ return cntadd;}
	int addTwoNumber(int num1, int num2)
	{
		cntadd++;
		return num1 + num2;
	}
}