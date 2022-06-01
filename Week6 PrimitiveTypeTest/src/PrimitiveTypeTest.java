import java.math.BigInteger;

public class PrimitiveTypeTest {

	public static void main(String[] args) {
		System.out.println("The maximum integer is " + Integer.MAX_VALUE);
		
		System.out.println("The minimum positive float is " + Float.MIN_VALUE);
		
		System.out.println("The maximum double-precision floating-point number is " + Double.MAX_VALUE);
		
		System.out.println((new Double(12.4)).intValue());
		System.out.println((new Double(12.4)).compareTo(new Double(12.3)));
		System.out.println((new Double(12.3)).compareTo(new Double(12.3)));
		System.out.println((new Double(12.3)).compareTo(new Double(12.5)));
		
		//Integer intObject = new Integer(2);
		Integer intObject = 125; // 이게 더 편한것같네
		System.out.println(intObject);

		Integer[] intArray = {1,2,3};
		System.out.println(intArray[0] + intArray[1] + intArray[2]);
		
		BigInteger a= new BigInteger("5456456456646541651651651");
		System.out.println(a);
		
		char[] charArray = {'G', 'o', 'o', 'd', ' ', 'D', 'a', 'y'};
		String message = new String(charArray);
		System.out.println(message); 
		
		System.out.println("Java".matches("Java")); //true
		System.out.println("Java".equals("Java")); // true 
		System.out.println("Java is fun".matches("Java")); //false
		System.out.println("Java is fun".matches("Java.*")); //true
		System.out.println("440-02-4534".matches(("\\d{3}-\\d{2}-\\d{1}"))); // false
		System.out.println("440-02-4534".matches(("\\d{3}-\\d{2}-\\d{4}"))); // true
		String s = "a+b$#c".replaceAll("[$+#]", "NNN");
		System.out.println(s);
		String[] tokens = "Java,C?C#,C++".split("[.,:;?]");
		for(int i =0;i<tokens.length;i++)
		{
			System.out.println(tokens[i]);
		}
		char[] chars = "Java".toCharArray();
		for (int i =0; i< chars.length ; i++)
		{
			System.out.println(chars[i]);
		}
		
//		char[] dst = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '10', '11', '12'};
//		"cs3720".getChars(2, 6, dst, 4);
		
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("welcome");
		stringBuilder.append(" ");
		stringBuilder.append("to ");
		stringBuilder.append("Java");
		stringBuilder.insert(11, "HTML and ");
		System.out.println(stringBuilder);
		
		String mystr = "Welcome to Java";
		String mystr2 = "Welcome to Java";
		String mystr3 = "Welcome to Java2";
		String mystr4 = mystr;
		
		System.out.println("nystr = " + Integer.toHexString(mystr.hashCode()));
		System.out.println("nystr2 = " + Integer.toHexString(mystr2.hashCode()));
		System.out.println("nystr3 = " + Integer.toHexString(mystr3.hashCode()));
		System.out.println("nystr4 = " + Integer.toHexString(mystr4.hashCode()));
		// string 조작
		System.out.println("String 조작 이후");
		mystr = mystr2 + mystr3; //mystr is immutable , java created in a new memory space -> 새로운 영역 할당  mystr값은 바뀌지 않음
		System.out.println("nystr = " + Integer.toHexString(mystr.hashCode())); // hashcode : 힙영역의 참조 상태
		System.out.println("nystr4 = " + Integer.toHexString(mystr4.hashCode()));
		// mystr 과 mystr2 는 같은 공간, mystr3 은 다른 공간에 위치
		// mystr의 위치는 연산 이후에도 바뀌지 않음
		
	}

}
