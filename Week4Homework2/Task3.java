import java.util.Scanner;

public class Task3 {
	/**
	 * Method which calculated max points which can get on the position x ,y
	 * 
	 * @param matrix
	 *            - 2D array
	 * @param x
	 *            - coordinate of X
	 * @param y
	 *            - coordinate of Y
	 * 
	 * @return - Max points from position X,Y
	 */
	public static int getMaxPoints(int[][] matrix, int x, int y) {

		// Possible position in array 3X3
		if (x == 1 && y == 1) {
			return matrix[1][1];
		} else if (x == 0 && y == 0) {
			if (matrix[1][2] > matrix[2][1]) {
				return matrix[1][2];
			} else
				return matrix[2][1];
		} else if (x == 0 && y == 1) {
			if (matrix[2][0] > matrix[2][2]) {
				return matrix[2][0];
			} else
				return matrix[2][2];
		} else if (x == 0 && y == 2) {
			if (matrix[1][0] > matrix[2][1]) {
				return matrix[1][0];
			} else
				return matrix[2][1];
		} else if (x == 1 && y == 0) {
			if (matrix[0][2] > matrix[2][2]) {
				return matrix[0][2];
			} else
				return matrix[2][2];
		} else if (x == 1 && y == 2) {
			if (matrix[0][0] > matrix[2][0]) {
				return matrix[0][0];
			} else
				return matrix[2][0];
		} else if (x == 2 && x == 0) {
			if (matrix[1][2] > matrix[0][1]) {
				return matrix[1][2];
			} else
				return matrix[0][1];
		} else if (x == 2 && y == 1) {
			if (matrix[0][0] > matrix[2][2]) {
				return matrix[0][0];
			} else
				return matrix[2][2];
		} else {
			if (matrix[0][1] > matrix[1][0]) {
				return matrix[0][1];
			} else
				return matrix[1][0];
		}

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Declaration of array 3X3 and fill with methods
		int[][] matrix = Array2D.fillMatrix();
		// Print matrix with method
		Array2D.print2D(matrix);

		// Input coordinate x with Scanner
		System.out.println("Enter the cordinate X");
		int x = input.nextInt();
		// Input coordinate Y with Scanner
		System.out.println("Enter the cordinate Y");
		int y = input.nextInt();

		// Printing the max points from coordinate x,y with method
		System.out.print("Max points from this position is ");
		System.out.println(getMaxPoints(matrix, x, y));
	}

}
