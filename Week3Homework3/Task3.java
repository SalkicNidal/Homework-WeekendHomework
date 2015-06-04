import java.util.Scanner;

public class Task3 {

	// The method for finding number in String

	public static boolean hasNumbers(String s) {
		boolean result = false;

		int num1 = s.length();

		for (int i = 0; i < num1; i++) {
			char c = s.charAt(i);
			if (c >= 48 && c <= 57) {
				result = true;
				break;
			} else
				result = false;
		}

		return result;

	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the String");
		String line = input.nextLine();

		System.out.println("The claim that the string has a number is "
				+ hasNumbers(line));

	}

}
