public class Task2H1W2 {

	public static void main(String[] args) {
		/*
		 * Your program contains a number n . Write a program that finds the sum
		 * of all the even numbers from 1 to n , excluding the number n
		 */

		int Num = 20;
		int counter = 1; // Variable of entered number, counter and the sum
		int sum = 0;

		// Algorithm with a while loop and if branching

		while (counter < Num) {
			if (counter % 2 == 0) {
				sum += counter;
			}
			counter++;
		}
		// // Printing the result
		System.out.printf("The sum of all the even numbers from 1 to %d (excluding yourself) is %d:",Num,sum);

	}

}
