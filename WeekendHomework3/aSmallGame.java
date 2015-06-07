import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class aSmallGame {

	// Method for made of arrays with five random elements
	public static int[] returnsArray() {

		int Array[] = new int[5];

		for (int i = 0; i < 5; i++) {
			Array[i] = (int) (Math.random() * 4 + 1);
		}
		return Array;
	}

	// A method that checks whether all elements are zero
	public static boolean elemntsAreZero(int Array[]) {
		int counter = 0;
		for (int i = 0; i < Array.length; i++) {
			if (Array[i] != 0) {
				return false;
			} else
				counter++;
		}
		if (counter == Array.length)
			return true;
		return false;
	}

	public static int[] confusingMethods(int Array[], int num) {

		int element = Array[num];

		// Case 1. Entered number is 0 and element is even
		if (num == 0 && element % 2 == 0) {
			Array[num] = Array[num] - 1;
			if (Array[num] < 0) {
				Array[num] = 0;
			}
			Array[num + 1] = Array[num + 1] + element;
			if (Array[num + 1] > 4) {
				Array[num + 1] = 4;
				return Array;
			} else
				return Array;

		}
		// Case 2. Entered number is 0 and and element is odd
		else if (num == 0 && element % 2 != 0) {
			Array[num] = Array[num] - 1;
			if (Array[num] < 0) {
				Array[num] = 0;
			}
			Array[num + 1] = Array[num + 1] - element;
			if (Array[num + 1] < 0) {
				Array[num + 1] = 0;
				return Array;
			} else
				return Array;
		}
		// Case 3. Entered number is 4 and element is even
		else if (num == 4 && element % 2 == 0) {
			Array[num] = Array[num] - 1;
			if (Array[num] < 0) {
				Array[num] = 0;
			}
			Array[num - 1] = Array[num - 1] + element;
			if (Array[num - 1] > 4) {
				Array[num - 1] = 4;
				return Array;
			} else
				return Array;
		}
		// Case4. Entered number is 4 and element is odd
		else if (num == 4 && element % 2 != 0) {
			Array[num] = Array[num] - 1;
			if (Array[num] < 0) {
				Array[num] = 0;
			}
			Array[num - 1] = Array[num - 1] - element;
			if (Array[num - 1] < 0) {
				Array[num - 1] = 0;
				return Array;
			} else
				return Array;
		}
		// Case5. The element is zero
		else if (element == 0) {
			for (int i = 0; i < Array.length; i++) {
				Array[i] = Array[i];
			}
			return Array;
		}
		// Case6. Entered number is odd
		else if (num != 0 && num != 4 && element % 2 != 0) {
			Array[num] = Array[num] - 1;
			Array[num - 1] = Array[num - 1] - element;
			Array[num + 1] = Array[num + 1] - element;
			if (Array[num - 1] < 0) {
				Array[num - 1] = 0;
			}
			if (Array[num + 1] < 0) {
				Array[num + 1] = 0;
			}
			return Array;
		}
		// Case7. Entered number is even
		else if (num != 0 && num != 4 && element % 2 == 0) {
			Array[num] = Array[num] - 1;
			Array[num + 1] = Array[num + 1] + element;
			Array[num - 1] = Array[num - 1] + element;
			if (Array[num - 1] > 4) {
				Array[num - 1] = 4;
			}
			if (Array[num + 1] > 4) {
				Array[num + 1] = 4;
			}
			return Array;
		}
		return Array;

	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Testing of randomly array
		System.out.println("Testing of one of randomly generated array:");
		System.out.println(Arrays.toString(returnsArray()));
		System.out.println();

		// A SMALL GAME
		System.out.println("      ~ TIME IS FOR GAME ~ ");
		System.out.println(" ~ YOU NEED GET ALL ZERO IN A ARRAY ~");

		// Declaration of assistant variables
		int Array[] = returnsArray();
		boolean finish = false;
		double currentTimeMillis;
		int counter = 0;
		long start = (System.currentTimeMillis() / 1000);

		// Start of exception handling
		do {
			try {
				// Start of game
				do {

					// Input of the number
					System.out.println();
					System.out.println("Please enter the number:");
					int num = input.nextInt();

					// Printing the array used to the game
					System.out.println(Arrays.toString(Array));

					// Start a game code using methods
					int Array1[] = confusingMethods(Array, num);
					System.out.println(Arrays.toString(Array1));
					Array = Array1;
					finish = elemntsAreZero(Array1);
					counter++;
				} while (finish != true);

				// Catch possible exception in game
			} catch (ArrayIndexOutOfBoundsException e) {
				// e.printStackTrace();
				System.out
						.println("Sorry you can entered only number between 0 and 4 !!!");
				System.out.println("Enter 1 to continue");
				input.nextInt();
			} catch (InputMismatchException d) {
				// d.printStackTrace();
				System.out
						.println("Sorry you can onlny entered the numbers(0-4) !!!");
				input.nextLine();
			}

		} while (finish == false);

		// End of game,calculating gaming time and attempts
		long end = (System.currentTimeMillis() / 1000);
		long time = end - start;
		System.out.print("Congratulations you've completed the game for "
				+ time + " second with " + counter + " attempts.");

	}
}
