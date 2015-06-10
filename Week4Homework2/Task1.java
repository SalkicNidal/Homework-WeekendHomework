import java.util.Scanner;

public class Task1 {

	/**
	 * Counting how many times entered number exist in the 2D array
	 * 
	 * @param Matrix
	 *            - 2D Array
	 * @param Num
	 *            - number for checking
	 * @return Output how many times number exist in the Array
	 */

	public static int countNumber(int[][] Matrix, int Num) {
		int counter = 0;
		for (int i = 0; i < Matrix.length; i++) {
			for (int j = 0; j < Matrix[i].length; j++) {
				if (Matrix[i][j] == Num)
					counter++;
			}
		}

		return counter;

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Declaration fill and print matrix with methods
		int[][] matrix = Array2D.fillMatrix();
		Array2D.print2D(matrix);
		// Entered the number for check
		System.out.println("Enter the number for counting");
		int num = input.nextInt();
		// Print result of counting number with method
		System.err.println("Number exist in matrix " + countNumber(matrix, num)
				+ " times");

	}

}
