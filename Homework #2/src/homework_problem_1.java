import java.util.Scanner;

public class homework_problem_1 {

	public static void main(String[] args) {
		// print my name and school number
		System.out.println("Name : Hyunjae Lee");
		System.out.println("School Number : 201746135");

					
		//It's a phrase for input in Java.
		Scanner scan = new Scanner(System.in);

		while(true)
		{
			
			// Output of the result, variable 'sum' is the value of adding each variable 'num'
			int sum = 0;
			// num is a variable that increases by 1 when O is continuous until it meets X. When it meets X, it initializes back to zero.
			int num = 0;
			
			System.out.print("Enter the combination of O and X(Enter -1 to stop) : ");
			// variable 'string' is input
			// I used next() to receive a string type.
			String str = scan.next();
			
			// when variable 'str' equals "-1", the program will be over.
			if(str.equals("-1"))
			{
				System.out.println("Program is over");
				// To realize the end of the program, I used 'break'.
				break;
			}
			// Check the input string one by one to see if index of i is "O" or "X".
			for(int i = 0 ; i<=str.length()-1 ; i++)
			{   // If index of i is "O", the num increases by 1 and adds its value to the sum.
			    // To add the cumulative value to sum when continuous "O".
				// Example ) OOO => (1+2+3) = 6
				if(str.charAt(i) == 'O')
				{
					num += 1;
					sum += num;
				}
				// 'else' means when it meets "X", When it meets "X", The variable num must be initialized to zero.
				else 
				{
					num = 0;
				}
					
			}
			// print the output
			System.out.println(sum);
		}	
	}
}
