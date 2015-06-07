import java.util.Scanner;

public class Strings {

	// The method combines two strings
	public static void mixOfLine(String line1, String line2) {

		String line = "";
		int num1 = line1.length();
		int num2 = line2.length();

		// Case one: if first String higher of second
		if (num2 < num1) {

			// Combines two string to a smaller length of the string2
			for (int i = 0; i < line2.length(); i++) {
				char first = line1.charAt(i);
				char second = line2.charAt(i);
				line = line + first + second;
			}
			// Additional print other characters from the first String
			String line3 = "";
			for (int i = num1 - 1; i > num2 - 1; i--) {
				char first = line1.charAt(i);
				line3 = first + line3;
			}
			// Merge into one string and printing
			line = line + line3;
			System.out.println(line);

			// Case two: if second higher of first
		} else {
			// Combines two string to a smaller length of the string1
			for (int i = 0; i < line1.length(); i++) {
				char first = line1.charAt(i);
				char second = line2.charAt(i);
				line = line + first + second;
			}
			// Additional print other characters from the second String
			String line3 = "";
			for (int i = num2 - 1; i > num1 - 1; i--) {
				char second = line2.charAt(i);
				line3 = second + line3;
			}
			// Merge into one string and printing
			line = line + line3;
			System.out.println(line);
		}

	}

	// Method that determines whether all the character in the first string then
	// appear in the second .
	public static boolean allCharsExists(String line1, String line2) {

		int counter = 0;
		for (int i = 0; i < line1.length(); i++) {
			for (int j = 0; j < line2.length(); j++) {
				char first = line1.charAt(i);
				char second = line2.charAt(j);
				if (first == second) {
					counter++;
					break;
				}
			}
		}
		if (counter == line1.length()) {
			return true;
		} else
			return false;
	}

	// Method that prints the string comes second in alphabetical order.
	public static String seconOrder(String line1, String line2) {

		int result = line1.compareTo(line2);

		if (result < 0) {
			return line2;
		} else {
			return line1;
		}
	}

	// The method concludes that if the strings are anagrams
	public static boolean anagramOfString(String Line1, String Line2) {

		if (Line1.length() != Line2.length())
			return false;
		for (int i = 0; i < Line1.length(); i++) {
			int value = Line2.indexOf(Line1.charAt(i));
			if (value == -1) {
				return false;
			} else {
				Line2 = Line2.substring(0, value) + Line2.substring(value + 1);

			}
		}

		return true;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter first String: ");
		String line1 = input.nextLine();
		System.out.println("Please enter second String: ");
		String line2 = input.nextLine();

		// Using method one
		System.out.print("Combines two string look like : ");
		mixOfLine(line1, line2);

		// Checking all character exist with method two
		System.out
				.println("The claim that all the characters are in the second string is is is is is: ");
		System.out.println(allCharsExists(line1, line2));

		// Search for the string which comes the later with method
		System.out.print(seconOrder(line1, line2));
		System.out
				.println(" comes later compared to the second string in alphabetical order");
		
		//Check that  entered strings are anagrams
		System.out
				.print("The claim that the two entered a string is anagrams is: ");
		System.out.println(anagramOfString(line1, line2));
	}

}
