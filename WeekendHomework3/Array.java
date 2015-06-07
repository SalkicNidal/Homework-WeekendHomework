import java.util.Arrays;
import java.util.Scanner;


public class Array {

	public static boolean equalTwoArrays(int Array[], int Array1[]) {

		// Searching for smallest array

		if (Array1.length != Array.length) {

			return false;

		} else {

			int counter = 0;
			for (int i = 0; i < Array.length; i++) {
				if (Array[i] == Array1[i])
					counter++;

				else
					return false;
			}
		}

		return true;
	}

	// Method for sum of two arrays different or same length
	public static int[] sumOfArrays(int Array1[], int Array2[]) {

		if (Array1.length < Array2.length) {

			int Array[] = new int[Array2.length];

			for (int i = 0; i < Array1.length; i++) {

				Array[i] = Array1[i] + Array2[i];
			}
			for (int i = Array1.length; i < Array2.length; i++) {

				Array[i] = Array[i] + Array2[i];

				return Array;
			}

		} else {

			int Array[] = new int[Array1.length];

			for (int i = 0; i < Array2.length; i++) {

				Array[i] = Array1[i] + Array2[i];
			}
			for (int i = Array2.length; i < Array1.length; i++) {

				Array[i] = Array[i] + Array1[i];
			}
			return Array;
		}
		return Array1;
	}

	//Method for connecting two arrays into one arrays
	public static int[] twoIntoOne(int array[], int array1[]) {
		
		int num = array.length;
		int Array1[] = Arrays.copyOf(array, array.length + array1.length);

		for (int i = num, j = 0; i < Array1.length; i++, j++) {
			Array1[i] = +array1[j] + Array1[i];

		}
		return Array1;

	}
	

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Entering the length of the first and second arrays
		System.out.println("Please enter the length of first aray.");
		int length1 = input.nextInt();
		System.out.println("Please enter the length of second array.");
		int length2 = input.nextInt();

		// Declaration of arrays
		int Array1[] = new int[length1];
		int Array2[] = new int[length2];

		// Entering the elements of first array
		for (int i = 0; i < length1; i++) {
			System.out.println("Enter the element " + (i + 1)
					+ " of first array:");
			int num1 = input.nextInt();
			Array1[i] = num1;
		}

		// Entering the elements of second array
		for (int i = 0; i < length2; i++) {
			System.out.println("Enter the elemnt " + (i + 1)
					+ " of second array:");
			int num2 = input.nextInt();
			Array2[i] = num2;
		}
		

		// Testing of identity of two arrays with methods
		System.out.println("The claim that the two arrays is the equal is:");
		System.out.println(equalTwoArrays(Array1, Array2));

		// Sum of two arrays with method
		System.out.println("Sum of two arrrays is:");
		System.out.println(Arrays.toString(sumOfArrays(Array1, Array2)));

		// Connecting both arrays in a single array
		System.out.println("The connected arrays are");
		System.out.println(Arrays.toString(twoIntoOne(Array1, Array2)));

	}

}
