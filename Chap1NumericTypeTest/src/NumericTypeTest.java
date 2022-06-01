
public class NumericTypeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare a constant
		final double PI = 3.14159;
		double area = 5 * 5 * PI;
		
		System.out.println("The area for the circle of radius " + 5.0 + " is " + area);
		
		// Display Binary, Octect and Hexadecimal Numbers
		System.out.println("0B1111 is " + 0B1111);
		System.out.println("071111 is " + 071111);
		System.out.println("0XFF is " + 0XFF);
		
		long snn = 232_45_45_19;
		System.out.println("snn is " + snn);
		
		long credict_card_number = 2324_4545_4519_3415L;
		System.out.println("credict_card_number is " + credict_card_number);
		
		// Obtain the total milliseconds since midnight, Jan1, 1970
		long totalmillisencods = System.currentTimeMillis();
		System.out.println("totalmilliseconds = "+ totalmillisencods);
		System.out.println("1.0 / 3.0 is " + 1.0 / 3.0); // 16 digits
		System.out.println("1.0 / 3.0 is " + 1.0F / 3.0F); // 8 digits
		
		int i = 10;
		int newNum = 10 * i++;
		System.out.println("i is " + i + " New Number is " + newNum);
		
		int i2 = 10;
		int newNum2 = 10 * ++i2;
		System.out.println("i2 is " + i2 + " New Number is " + newNum2);
		
		System.out.println(1/2);
		System.out.println(1/2.0);
		int value = 2147483647 + 1;
		System.out.println(value);
		value = -2147483648 - 1;
		System.out.println(value);
		System.out.println(1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1);		
		System.out.println(1 - 0.9);
		
		final double EPSILON = 1E-14;
		
		double d = 1.0 ;
		while(true) {
			if (Math.abs(d- 0.1)< EPSILON) {
				System.out.println("Exit!!");
				break;
			}
			else {
				System.out.println("d : " + d);
				d -= 0.1;
			}
					}
		}
		
	}

}
