public class Task2W2 {

	public static void main(String[] args) {
		/*
		 * Write a program that contains a variable a. Print whether a variable
		 * a is between 5 and 7.5 , between 7.5 and 10 or is out of range .
		 */

		double var = 8; // Testing variable

		// The condition for finding whether the variable is in
		// the range ( 5-7.5 ] or ( 7.5-10 ] or outside it.

		if (var > 5 && var <= 7.5) {
			System.out.println("Testing variable is between 5 and 7.5");
		} else if (var > 7.5 && var <= 10) {
			System.out.println("Testing variable is between 7.5 and 10");
		} else
			System.out.println("Testing variable is out of testing range");
	}

}
