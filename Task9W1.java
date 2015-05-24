public class Task9W1 {

	public static void main(String[] args) {
		/*
		 * Design a program that, given a three-digit number to determine
		 * whether the number is divisible by the sum of its digits.
		 */

		int num = 342; // Three-digit number

		int num1;
		int num2; // Variable that are used for command
		int num3;
		int sum;

		if (num >= 1000) {
			System.out
					.println("The variable num can accommodate only three digits, please enter the number again");
		} else {
			num1 = num % 10;
			num2 = (num / 10) % 10; // Command for calculating sums
			num3 = num / 100;
			sum = num1 + num2 + num3;

			// The condition which determines that the number is divisible by
			// the
			// sum of its digits

			if (num % sum == 0) {
				System.out
						.printf("Entered digit number: %d is divisible by the sum of its digits %d.The result is =%d",
								num, sum, num / sum);
			} else {
				System.out
						.printf("Entered digit number: %d is not divisible by the sum of its digits: %d!!! The rest is =%d",
								num, sum, num % sum);
			}

		}
	}

}
