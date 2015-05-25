public class Task3H1W2 {

	public static void main(String[] args) {

		/*
		 * Your program contains a number n . Write a program that determines
		 * whether a given number n perfect or not . The perfect number in which
		 * the sum of the dividers ( excluding yourself ) actually gives that
		 * number .
		 */

		int Num = 5;
		int counter = 2;  // Variable of entered number, counter and the sum
		int sum = 0;

		//Algorithm with a while loop and if branching
		
		while (counter <= Num) {
			if (Num % counter == 0) {
				sum += Num / counter;
			}
			counter++;
		}
		if (sum == Num) {
			System.out
					.printf("Entered number is: %d.Sum of dividers(excluding yourself) is: %d\n Number is perfect number",
							Num, sum);
		} else
			System.out
					.printf("Entered number is: %d.Sum of dividers(excluding yourself) is: %d\n Number is not perfect number",
							Num, sum);

	}
}