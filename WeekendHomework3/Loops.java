import java.util.Scanner;

public class Loops {

	/* The method returns the number with a comma after every three digits */
	public static void printNum(int Num) {

		String var = "";
		String var1 = "";
		int counter = 0;
		var = var + Num;
		char tmp = var.charAt(0);

		int length = var.length();
		for (int i = length - 1; i > 0; i--) {
			char c = var.charAt(i);
			counter++;
			if (counter % 3 != 0)
				var1 = c + var1;
			else
				var1 = "." + c + var1;
		}

		var1 = tmp + var1;
		System.out.printf(var1 + " ");
	}

	// The method , which determines how many digits there are number
	public static int counterNum(int Num) {

		/*
		 * Way by cheating :D
		 * 
		 * String line = ""; line = Num + line;
		 * 
		 * int numOfDigits = line.length();
		 * 
		 * return numOfDigits;
		 */

		// The way that is required because of loop
		int counter = 0;
		while (Num > 0) {
			Num /= 10;
			counter++;
		}

		return counter;
	}

	// The method of replacing the first and latest digits
	public static int replacePlaceFirstAndLast(int Num) {
		if (Num < 10) {
			return Num;
		} else {

			String line = "";
			String line1 = "";
			line = line + Num;
			int length = line.length();
			char first = line.charAt(0);
			char last = line.charAt(length - 1);
			for (int i = 1; i < length - 1; i++) {
				char c = line.charAt(i);
				line1 = line1 + c;
			}

			line1 = last + line1 + first;

			int result = Integer.parseInt(line1);

			return result;
		}
	}

	// The method for determining the value between the two numbers
	public static int numbersBetween(int Num, int Num1) {
		// The way that is required because of loop
		int counter = 0;
		for (int i = Num + 1; i < Num1; i++) {
			counter++;
		}
		return counter;
	}

	// The method to print all odd or even numbers , depending on the rang
	public static void oddOrEven(int Num, int Num1, int Num2) {

		if (Num % 2 == 0) {
			for (int i = Num1; i < Num2; i++) {
				if (i % 2 == 0) {
					printNum(i);
				}
			}
		} else {
			for (int i = Num1; i < Num2; i++) {
				if (i % 2 != 0) {
					printNum(i);

				}
			}
		}
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("This program work only with positive number!!!");
		System.out.println("Please enter the number");
		int Num = input.nextInt();

		// Result of first method
		System.out.print("Number with coma after every three digits is: ");
		printNum(Num);
		System.out.println();

		// Result of second method
		System.out.println("Number of digits is: " + counterNum(Num));

		// Result of third method using also first method
		int Num1 = replacePlaceFirstAndLast(Num);
		System.out.print("Number with replaced first and last number is: ");
		printNum(Num1);
		System.out.println();

		// Result of fourth method
		int range = numbersBetween(Num, Num1);
		System.out.println(range + " numbers there are between " + Num
				+ " and " + Num1);

		// Result of fifth method
		System.out
				.println("All odd or even numbers (depending on the rang) is: ");
		oddOrEven(range, Num, Num1);

	}
}
