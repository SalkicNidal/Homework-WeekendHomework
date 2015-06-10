import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Array2D {
	public static void enteredRowsandColumn() {

		Scanner input = new Scanner(System.in);
		// Entered value of columns and rows with scanner
		System.out.println("Enter the value of columns");
		int column = input.nextInt();
		System.out.println("Enter the value of row");
		int row = input.nextInt();
	}

	/**
	 * Methods which returns sum of elements on Rows
	 * 
	 * @param matrix
	 *            - 2D array
	 * @param i
	 *            - index of row
	 * @return Sum of rows which index was entered
	 */
	public static int sumOfRows(int[][] matrix, int i) {

		int sum = 0;
		for (int j = 0; j < matrix.length; j++) {
			sum += matrix[i][j];
		}
		return sum;

	}

	/**
	 * Methods which returns sum of elements on column
	 * 
	 * @param matrix
	 *            - 2D array
	 * @param j
	 *            - index of column
	 * @return Sum of column which index was entered
	 */
	public static int sumOfcolumns(int[][] matrix, int j) {

		int sum = 0;
		for (int i = 0; i < matrix.length; i++) {
			sum += matrix[i][j];
		}
		return sum;

	}

	/**
	 * Input the value of elements
	 * 
	 * @param matrix
	 *            - 2D array
	 */
	public static int[][] fillMatrix() {
		Scanner input = new Scanner(System.in);
		// Entered value of columns and rows with scanner

		System.out.println("Enter the value of columns");
		int column = input.nextInt();
		System.out.println("Enter the value of row");
		int row = input.nextInt();
		int[][] matrix = new int[column][row];
		int counteri = -1, counterj = 0;
		while (true) {

			try {
				if (counteri != -1) {
					for (int i = counteri; i < matrix.length; i++) {
						for (int j = counterj; j < matrix[i].length; j++) {
							System.out.println("Enter the " + (i + 1)
									+ " element of row,and " + (j + 1)
									+ " element of column");
							int element = input.nextInt();
							matrix[i][j] = element;
						}
					}
				} else {
					for (int i = 0; i < matrix.length; i++) {
						for (int j = 0; j < matrix[i].length; j++) {
							counteri = i;
							counterj = j;
							System.out.println("Enter the " + (i + 1)
									+ " element of row,and " + (j + 1)
									+ " element of column");
							int element = input.nextInt();
							matrix[i][j] = element;

						}
					}
				}
				break;
			} catch (InputMismatchException e) {
				System.err
						.println("You can only entered the  positive numbers");
				System.out.println();
				input.next();

			}

		}
		return matrix;
	}

	/**
	 * Print to console 2D Array
	 * 
	 * @param Array
	 *            - 2D array
	 */
	public static void print2D(int[][] Array) {

		for (int i = 0; i < Array.length; i++) {
			System.out.print("[	");
			for (int j = 0; j < Array[i].length; j++) {

				System.out.print(Array[i][j] + "	");

			}
			System.out.print("]");
			System.out.println();
		}

	}

	/**
	 * Print entered column of 2d array
	 * 
	 * @param array
	 *            - 2D array
	 * @param column
	 *            - number of column
	 * @return 1D array which element elements of 2D column
	 */
	public static int[] getColumn(int[][] array) {

		Scanner input = new Scanner(System.in);

		while (true) {
			try {
				System.out.println("Enter the index of column");
				int indx = input.nextInt();
				int arr[] = new int[array.length];
				for (int i = 0; i < array.length; i++) {
					arr[i] = array[i][indx];
				}
				System.out.println("Finding colums is :");
				return arr;

			} catch (IndexOutOfBoundsException e) {
				System.out.println("Entered column not exist");
				input.nextLine();

			} catch (InputMismatchException e) {
				System.err
						.println("You can only entered the  positive numbers");
				input.next();

			}
		}

	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		// Repeat program if throw exception
		while (true) {
			try {

				// Declaration and fill of 2D array
				int[][] matrix = fillMatrix();
				// Print the 2D array with method
				System.out.println("Your entered matrix is: ");
				print2D(matrix);
				// Finding the entered column in the 2D array
				System.out.println(Arrays.toString(getColumn(matrix)));
				break;

				// Catch possible exception
			} catch (NegativeArraySizeException e) {
				System.out.println("You can only enter the possitive number");

			} catch (InputMismatchException e) {
				System.out
						.println("You can only entered the  positive numbers");
				input.next();

			}
		}

	}
}
