public class Task7W1 {

	public static void main(String[] args) {
		/*
		 * Design a program that contains a four-digit int variable type. Print
		 * to console the sum of its digits, eg . if it is variable 1815, then
		 * the result is 1 + 8 + 1 + 5 = 15th
		 */

		int num = 9999; // Hint! The variable num can accommodate only four
						// digits

		int num1;
		int num2;
		int num3; // Variable that are used for command
		int num4;
		int sum;

		// Lines of command code

		num1 = num % 10;
		num2 = (num / 10) % 10;
		num3 = (num / 100) % 10;
		num4 = (num / 1000);
		sum = num1 + num2 + num3 + num4; 
		
		// Print to console the sum of digits
		
		System.out
				.printf("The result of the sum of the digits of number: %d is\n%d+%d+%d+%d=%d",
						num, num1, num2, num3, num4, sum);

	}
}
