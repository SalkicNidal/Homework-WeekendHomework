import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {
	/**
	 * Checking empty place on the matrix
	 * 
	 * @param matrix
	 *            - char matrix
	 * @return True - matrix is full False - matrix have empty place
	 */
	public static boolean outOfEmptyPlace(char[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == ' ') {
					return false;
				}

			}
		}
		return true;

	}

	/**
	 * Methods which print the frame with elements of char matrix
	 * 
	 * @param matr
	 *            - char 2D matrix
	 */
	public static void printCharMatrix(char[][] matr) {

		// Print the frame of char matrix
		for (int i = 0; i < matr.length; i++) {
			System.out.print(" -" + i + "- ");
		}
		System.out.println();
		// Input space in the char matrix
		for (int i = 0; i < matr.length; i++) {
			for (int j = 0; j < matr[i].length; j++) {
				System.out.print("| " + matr[i][j] + "  ");
			}
			System.out.print("|" + i);
			System.out.println();
			// Print the frame of char matrix
			for (int ii = 0; ii < matr.length; ii++) {
				System.out.print(" --- ");
			}
			System.out.println();
		}
	}

	/**
	 * Method which input size of matrix and fill matrix with ' '
	 * 
	 * @return- Char matrix with empty places for elements
	 * @throws- InputMismatchException - NegativeArraySizeException
	 */
	public static char[][] fillCharMatrix() {
		Scanner input = new Scanner(System.in);
		while (true) {
			try {
				System.out.println("Please enter the size of square matrix");
				int size = input.nextInt();
				if (size < 3 && size >= 0) {
					System.err.println("Cheater");
				} else {
					char matrix[][] = new char[size][size];
					for (int i = 0; i < matrix.length; i++) {
						for (int j = 0; j < matrix[i].length; j++) {
							matrix[i][j] = ' ';
						}
					}
					return matrix;
				}
			} catch (InputMismatchException e) {
				System.err.println("You can only entered the number");
				System.out.println();
				input.nextLine();
			} catch (NegativeArraySizeException e) {
				System.err.println("Size can only been a possitive");
				System.out.println();

			}

		}
	}

	/**
	 * Check all elements for specify column
	 * 
	 * @param matrix
	 *            -Char 2d matrix
	 * @param j
	 *            - Specify column
	 * @param symbol
	 *            Checking symbol to column
	 * @return True - if all element equal with symbol, or False when elements
	 *         are different
	 */
	public static boolean checkForColumns(char matrix[][], int j, char symbol) {
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][j] != symbol) {
				return false;
			}

		}

		return true;
	}

	/**
	 * Check all elements for specify row
	 * 
	 * @param matrix
	 *            - char 2D array
	 * @param i
	 *            - Specify row
	 * @param symbol
	 *            - Checking symbol to row
	 * @return True - if all element equal with symbol, or False when elements
	 *         are different
	 */
	public static boolean checkForRows(char matrix[][], int i, char symbol) {
		for (int j = 0; j < matrix.length; j++) {
			if (symbol != matrix[i][j]) {
				return false;
			}

		}

		return true;
	}

	/**
	 * Check all element from positive diagonal
	 * 
	 * @param matrix
	 *            2D array
	 * @param symbol
	 *            Checking symbol to diagonal
	 * @return True - if all element equal with symbol, or False when elements
	 *         are different
	 */
	public static boolean checkForPositiveDiagonal(char matrix[][], char symbol) {

		for (int i = 0; i < matrix.length; i++) {
			if (symbol != matrix[i][i]) {
				return false;
			}
		}

		return true;

	}

	/**
	 * Check all element from negative diagonal
	 * 
	 * @param matrix
	 *            -char 2D array
	 * @param symbol
	 *            - checking symbol
	 * @return - True - if all element equal with symbol, or False when elements
	 *         are different
	 */
	public static boolean checkForNegativeDiagonal(char matrix[][], char symbol) {

		for (int i = 0, j = matrix.length - 1; i < matrix.length; i++, j--) {
			if (symbol != matrix[i][j]) {
				return false;
			}
		}

		return true;

	}

	/**
	 * The method for determining the symbols to enter the matrix and that the
	 * player 's turn
	 * 
	 * @param counter
	 *            - number of playing
	 * @return Symbol of player X or O
	 */
	public static char symbolOfPlayer(int counter) {

		if (counter % 2 != 0) {
			return 'X';
		}
		return 'O';

	}

	/**
	 * The method, which awards the player character, check the columns and rows
	 * and diagonals whether their elements are the same, and checks whether the
	 * area already filled
	 * 
	 * @param Matrix
	 *            - char matrix
	 * @param symbol
	 *            - symbol for player
	 * @return - True - if one of the players wins
	 * @throws - InputMismatchException ArrayIndexOutOfBoundsException
	 */
	public static boolean playingTheGame(char Matrix[][], char symbol) {
		Scanner input = new Scanner(System.in);

		while (true) {
			try {
				System.out.println("~ ~ PLAYER " + symbol + " PLAYING ~ ~");
				System.out.println("Please enter the number of row");
				int x = input.nextInt();
				System.out.println("Please enter the number of column");
				int y = input.nextInt();
				if (Matrix[x][y] == ' ') {
					Matrix[x][y] = symbol;
					if (checkForColumns(Matrix, y, symbol) == true) {
						return true;
					} else if (checkForRows(Matrix, x, symbol) == true) {
						return true;
					} else if (checkForPositiveDiagonal(Matrix, symbol) == true) {
						return true;
					} else if (checkForNegativeDiagonal(Matrix, symbol) == true) {
						return true;
					} else {
						return false;
					}

				} else {
					System.out.println("This place is filled");
				}
			} catch (InputMismatchException e) {
				System.err.println("You can only entered the number");
				System.out.println();
				input.nextLine();
			} catch (ArrayIndexOutOfBoundsException e) {
				System.err.println("Entered number is out of range");
				System.out.println();
			}

		}
	}

}