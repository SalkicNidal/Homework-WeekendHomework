import java.util.Scanner;

public class Task2 {

	/**
	 * Method which calculated number rows and column which sum is zero
	 * 
	 * @param matrix
	 *            - 2D array
	 * @return Number of rows and column which sum is zero
	 */
	public static int getNumOfZeroRowsAndColumns(int[][] matrix) {
		int counter = 0;
		for (int i = 0; i < matrix.length; i++) {

			// Calculating the sum of rows with method
			if (Array2D.sumOfRows(matrix, i) == 0)
				counter++;
		}
		for (int j = 0; j < matrix.length; j++) {
			// Calculating the sum of columns with method
			if (Array2D.sumOfcolumns(matrix, j) == 0)
				counter++;

		}
		return counter;

	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Declaration,Fill matrix and print matrix with methods
		int[][] matrix = Array2D.fillMatrix();
		Array2D.print2D(matrix);

		// Print the number of zero sum with method
		System.out.print("Number of rows and column which sum is zero is: ");
		System.out.println(getNumOfZeroRowsAndColumns(matrix));

	}

}
