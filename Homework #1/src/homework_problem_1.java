import java.util.Scanner;

public class homework_problem_1 {

	public static void main(String[] args) {
		// print my name and school number
		System.out.println("Name : Hyunjae Lee");
		System.out.println("School Number : 201746135");
		// I use 'while' to loop it around until a specific variable is entered(in this case, variable is -1)
		while (true)
		{
			// variable 'check_lower' will use to check all letters are lower-case.
			int check_lower=0;
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter the string to check which fits the rule(Enter -1 to stop) : ");
			// variable 'word' is input that consists of a single line containing the string 
			String word = scan.next();
			// check word is less than 100 letters. if it's not, new word will be entered.
			if (word.length() > 100)
			{
				System.out.println("Please enter another word with less than 100 letters");
				continue;
			}
			// check all letters are lower case. if it's not, new word will be entered.
			for(int i=0 ; i< word.length() ; i++)
			{
				if (Character.isUpperCase(word.charAt(i)) == true)
				{
					System.out.println("Some letter is upper case, please enter lower case again");
					check_lower = 1;
					break;
				}
			}
			// if some letters are upper case, it will stop loop(while).
			if (check_lower == 1)
			{
				continue;
			}
			// if value of word and "-1" are equal, the program will be over.
			if (word.equals("-1") == true)
			{
				System.out.println("Program is over");
				break;
			}
			// start point p
			int p = 0;
			// last point q
			int q = word.length() - 1;
			// variable 'count' means how many times that word.charAt(p) and word.charAt(q) are same
			int count = 0;
			// compare letter of position p and letter of position q until p is bigger than q. 
			while(p<q)
			{
				if(word.charAt(p)==word.charAt(q))
				{
					count +=1;
				}
				p+=1;
				q-=1;
			}
			// evenly seperated
			if (count % 2 == 1)
			{
				System.out.println("NO");
			}
			// oddly seperated
			else
			{
				System.out.println("YES");
			}
			
		}
	}

}
