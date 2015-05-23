public class Task5W1 {

	public static void main(String[] args) {
		/*
		 * Make a program that contains four variables . Print on console
		 * variables have been sorted from least to greatest .
		 */

		int a = 9;
		int b = 4;  // The variables that need to be sorted
		int c = 6;
		int d = 2;

		int min;
		int min1;
		int min2;
		int max;    // Variables that are used to sort of  lowest to higher
		int max1;
		int max2;
		int m1;
		int m2;

		// Conditions to be satisfied for sorting numbers
		// Method split into two sets
		
		if (a < b) {
			min1 = a;
			max1 = b;
		} else {             // Minimal and max for first set
			min1 = b;
			max1 = a;
		}
		if (c < d) {
			min2 = c;
			max2 = d;
		} else {             // Minimal and max for second set
			min2 = d;
			max2 = c;
		}
		if (min1 < min2) {
			min = min1;
			m1 = min2;      
		} else {             // Minimal and second number of main 
			min = min2;
			m1 = min1;
		}
		if (max1 > max2) {
			max = max1;
			m2 = max2;
		} else {             // Max and third number of main
			max = max2;
			m2 = max1;
		}
		   // The condition for finding the second and third number and printing numbers
		
		if (m1 < m2) {
			System.out.printf(
					"Sorted numbers from lowest to higher is: %d<%d<%d<%d", min,
					m1, m2, max);
		} else {
			System.out.printf(
					"Sorted numbers from lowest to higher is: %d<%d<%d<%d", min,
					m2, m1, max);
		}

	}

}
