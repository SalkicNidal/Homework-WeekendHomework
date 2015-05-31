import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		/*
		 * Do the second complement only if the first digit from the left is 1 ,
		 * taking into account how much the figures that fixed binary number .
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the binary number");
		String bin = input.nextLine();
		System.out.println("Enter the nubmer of digits");
		int num = input.nextInt();

		String solution = ""; // Entering a binary number and number of digits .
		int length = bin.length();
		char var = bin.charAt(0);
		if (var == '1' && num == length) {
			for (int i = 0; i < length; i++) {
				char var1 = bin.charAt(i);
				if (var1 == '1') {
					solution += 0;

				} else {
					solution += 1;

				}
			}

			String kompl = "";

			char var2 = solution.charAt(length - 1);
			if (var2 == '0') {
				for (int i = 0; i < length; i++) {
					var2 = solution.charAt(i);
					if (i == length - 1)
						kompl += '1';
					else
						kompl += var2;

				}
				System.out.print("Second complement is" + kompl);
			} else if (var2 == '1') {
				int counter = 0;
				for (int i = length - 1; i >= 0; i--) {

					var2 = solution.charAt(i);
					if (var2 == '1') {
						kompl += '0';
						counter++;
					} else {
						kompl += '1';
						counter++;
					}
					int num1 = counter - 1;
					if (kompl.charAt(num1) == '1') {
						counter = i - 1;
						break;
					}
				}
				if (counter < length) {
					for (int i = counter; i >= 0; i--) {
						var2 = solution.charAt(i);
						kompl += var2;
					}

				}
				String novi = "";
				for (int i = length - 1; i >= 0; i--) {
					char var3 = kompl.charAt(i);
					novi += var3;
				}
				System.out.println(novi);
			}

		} else
			System.out.println(bin);

	}

}
