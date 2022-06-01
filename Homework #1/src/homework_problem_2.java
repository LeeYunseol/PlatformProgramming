import java.util.Scanner;

public class homework_problem_2 {

	public static void main(String[] args) {
		// print my name and school number
		System.out.println("Name : Hyunjae Lee");
		System.out.println("School Number : 201746135");
		// I use 'while' to loop it around until a specific variable is entered(in this case, variable is -1)
		while(true)
		{	// to scan something we need to use this
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter maximum denominator, floating-point value(Enter -1 to stop) : ");
			// variable 'max_denominator'  means the maximum denominator value, M (15 ≤ M ≤ 100000)
			// Input type: double (Do not use Array type) => all of inputs are double
			double max_denominator = scan.nextDouble();
			// if max_denominator is -1, program is over(exit code).
			if (max_denominator == -1) 
			{
				System.out.println("Program is over");
				break;
				
				
			}
			// variable 'f_value' means floating-point value, x, (0 ≤ x < 1).
			double f_value = scan.nextDouble();
			
			// Verify that the ranges of x and M are correct. If it is not, enter one more time
			if (	 < 15 || max_denominator>100000 || f_value<0 || f_value>=1 )
			{
				System.out.println("Please enter correct input again. check the range of each input");
				continue;
			}
			// Implement function which find the best rational approximation
			rational_approximation(max_denominator, f_value);
			
		}
		    
	}
	//find GCD
	// because if output p and q are 2, 14 => output should be p = 1 and q = 7 so I used gcd function to find GCD.
	 public static int gcd(int a, int b)  
	    {
		 while (b != 0) { // Euclidean algorithm
	            int temp = a;
	            a = b;
	            b = temp % b;
	        }
		 // return GCD which is a
	        return a;
	    }
	 
	 // function 'rational_approximation' is the way to find best rational approximation and print output
	 public static void rational_approximation(double maxdeno, double fval)
	 {
		 // variable 'last_p' and 'last_q" are meaning of the word itself => output.
		 int  last_p=0, last_q=0;
		 // variable 'p', 'q', 'a', 'b' are this variable =>  |x – p/q| ≤ |x – a/b|
		 // variable 'p', 'q', 'a', 'b' keeps changing until find a closet difference
		 int p, q, a, b, GCD;
		 // variable 'temp' means temporary value 
		 double temp;
		 // variable 'difference' means |x – p/q|, and the smallest difference is 'closet_difference' 
		 double difference, closet_difference;
		 // from here to 
		 b = 1;
		 // Variables a and b were defined to make them most similar to input x.
		 temp = b * fval;
		 a = (int)(temp+1);
		 difference = ((double)a)/((double)b);
		 closet_difference = Math.abs(fval - difference);
		 // here is setting the first difference to compare later (the first |x – p/q|)
		 
		 // set range of q and changing q,p to find the closet difference
		 for(q=b+1;q<=maxdeno;q++)
		 {
			 temp = q * fval;
			 p = (int)(temp+1);
			 difference = ((double)p)/((double)q);
			 difference = Math.abs(fval - difference);
			 // |x – p/q| ≤ |x – a/b|
			 if(difference < closet_difference)
			 {
				 a = p;
				 b = q;
				 closet_difference = difference;
			 } 
		 }
		 last_p = a;
		 last_q = b;
		 // reduction of fraction
		 GCD = gcd(last_p, last_q);
		 last_p /= GCD;
		 last_q /= GCD;
		 // output
		 // Output type: int + ‘/’ + int
		 System.out.println(last_p+"/"+last_q);
	 }	 
}
