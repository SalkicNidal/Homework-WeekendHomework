import java.util.Scanner;

public class Task5 {

	public static String getNumbersOnly(String s) {

		String nums = "";
		int counter = 0;
		int num = s.length();
		for (int i = 0; i < num; i++) {
			char c = s.charAt(i);
			if (c >= 48 && c <= 57) {
				nums = nums + c;
				counter++;
			}
		}
		if (counter == 0)
			nums = "0";

		return nums;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string");
		String sentence = input.nextLine();

		System.out.println("String only with numbers is: "
				+ getNumbersOnly(sentence));
	}

}
