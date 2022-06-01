package practice10;

class OnlyOneInstance {
	public static void main(String[] args)
	{
		SimpleNumber num1 = SimpleNumber.getSimpleNumberInst();
		num1.addNum(20);
		
		SimpleNumber num2 = SimpleNumber.getSimpleNumberInst();
		num2.addNum(30);
		
		num1.showNum();
		num2.showNum();
	}
}
