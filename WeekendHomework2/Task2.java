import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Determine whether all brackets open and closed properly . If so ,
		 * print true, otherwise false .
		 */

		Scanner input = new Scanner(System.in);
		   
		// Entered the brackets with Scanner
		
        System.out.println("Enter the brackets to check");     
		String brackets = input.nextLine();                    

		int counter1 = 0;
		int counter2 = 0; // Variable for calculating types brackets

		/*
		 * The algorithm in which we find the first number of brackets, then
		 * check each bracket , and we are also checking whether they are closed
		 * or not
		 */

		int length = brackets.length();
		for (int i = 0; i < length; i++) {
			char var = brackets.charAt(i);
			if (var == '}')
				counter1++;
			else
				counter2++;
		}

		// Algorithm for printing checks

		if (counter1 == counter2)
			System.out.println("All brackets is closed TRUE");
		else if (counter1 < counter2)
			System.out.println("Bracket is not closed FALSE");
		else
			System.out.println("One brackets is wrong open FALSE");

	}

}
