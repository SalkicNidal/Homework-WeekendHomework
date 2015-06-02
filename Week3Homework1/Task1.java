import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the expression");
		String expression = input.nextLine();
		int length = expression.length();
		int counter = 0;
		String expres1 = "";
		String expres2 = "";
		char operator = 'x';

		for (int i = 0; i < length; i++) {
			char var = expression.charAt(i);
			if (var == '+' || var == '-' || var == '/' || var == '*') {
				operator = var;// expression.charAt(i);
				counter++;
			} else if (counter == 0) {
				expres1 = expres1 + var;
			} else if (counter == 1) {
				expres2 = expres2 + var;
			}
		}
		int num1 = 0;
		int num2 = 0;
		expres1 = expres1.trim();
		expres2 = expres2.trim();
		while (true) {
			try {
				num1 = Integer.parseInt(expres1);

				num2 = Integer.parseInt(expres2);

			} catch (Exception e) {
				System.out
						.println("Please check your input (You can only enter the numbers and operators + , - , / , *");
				System.out.println(e.getMessage());
				System.out.println("Enter first part of expression again");
				num1 = input.nextInt();
				System.out.println("Enter second part of expression again");
				num2 = input.nextInt();
				input.nextLine();

			}
			switch (operator) {

			case '+':
				System.out
						.println("The result of the sum is: " + (num1 + num2));
				break;

			case '-':
				System.out.println("The result of the subtraction is: "
						+ (num1 - num2));
				break;
			case '/':
				System.out.println("The result of the divide is: "
						+ ((double) (num1) / num2));
				break;
			case '*':
				System.out.println("The result of the multiplication is: "
						+ (num1 * num2));
				break;
			default:
				System.out.println("Sorry you are enter wrong operators");

			}

			break;
		}

	}

}
