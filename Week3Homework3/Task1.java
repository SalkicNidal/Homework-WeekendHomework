import java.util.Scanner;

public class Task1 {

	// The method for finding the minimum number

	public static int getMin2(int num1, int num2) {

		int min = num1;
		if (num2 < num1)
			min = num2;
		return min;
	}

	// The method for finding the minimum number
	// of entered three using the previous method

	public static int getMin3(int num1, int num2, int num3) {
		int min = getMin2(num1, num2);
		if (num3 < min)
			min = num3;

		return min;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out
				.println("Enter two or three for finding the minimum number of");
		int value = input.nextInt();
		if (value == 2) {
			System.out.println("Enter the first number");
			int num1 = input.nextInt();
			System.out.println("Enter the second number");
			int num2 = input.nextInt();
			System.out.println("Minimal number is: " + getMin2(num1, num2));
		} else if(value==3) {
			System.out.println("Enter the first number");
			int num1 = input.nextInt();
			System.out.println("Enter the second number");
			int num2 = input.nextInt();
			System.out.println("Enter the third number");
			int num3 = input.nextInt();
			System.out.println("Minimal number is: "
					+ getMin3(num1, num2, num3));
		}
		else
			System.out.println("Wrong number was entered!!! (Only 2 or 3)");
	}

}
