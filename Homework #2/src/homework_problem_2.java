import java.util.Scanner;
import java.util.Stack; //import java.util.Stack class to use stack 

public class homework_problem_2 {

	public static void main(String[] args) {
		// print my name and school number
		System.out.println("Name : Hyunjae Lee");
		System.out.println("School Number : 201746135");
		
		// Declaration of String type stack 
		Stack<String> stack = new Stack<>();
		//It's a phrase for input in Java.
		Scanner scan = new Scanner(System.in);
		// declare variable 'num' to store the pop numbers in the stack.
        int num= 0 ;
	    // declare variable 'sum' to calculate and print value(output) which is applied the rule.
        int output = 1;
        // Since the number of input is not constant, hasnext() is used to wait indefinitely until a new input is entered.
        // Escape "while" when there is no value to enter or -1 is entered.
		while(scan.hasNext())
		{
			String str;
			// I used next() to receive a string type.
			str = scan.nextLine();
			// If "Bang Bang" is entered, program will be over
			if(str.equals("-1"))
			{
				break;
			}
			// If "Bang Bang" is entered, pop the stack
			if(str.equals("Bang Bang"))
			{
				stack.pop();
			}
			// else push on the stack
			else
			{
				stack.push(str);
			}
			
		}
		// The process of multiplying all the remaining values of the stack.
		for(int i = 0 ; i<=stack.size()+1; i++)
		{
			// Change the string to integer to multiply.
			num = Integer.valueOf(stack.pop());
			output *= num;
		}
		// print the output
		System.out.println(output);
	}
}
