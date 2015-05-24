public class Task5W1 {

	public static void main(String[] args) {
		/*
		 * Make a program that contains four variables . Print on console
		 * variables have been sorted from least to greatest .
		 */

		int a = 4;
		int b = 410;             // The numbers that need to be sorted
		int c = 4;
		int d = 410;

		int min;
		int min1;
		int min2;
		int max;             // Variables that are used like assist for sort of  lowest to higher
		int max1;
		int max2;
		int med1;
		int med2;

		 // The algorithm and the conditions by which we sort the numbers. Method split into two sets
		
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
			med1 = min2;      
		} else {             // Minimal and medium1 number 
			min = min2;
			med1 = min1;
		}
		
		if (max1 > max2) {
			max = max1;
			med2 = max2;
		} else {             // Max and medium2 number
			max = max2;
			med2 = max1;
		}
		
		   // The condition for finding the second and third number and printing numbers
		
		if (med1 < med2) {
			System.out.printf(
					"Numbers %d-%d-%d-%d is sorted from lowest to higher: %d<%d<%d<%d",a,b,c,d, min,
					med1, med2, max);
		} else {
			System.out.printf(
					"Numbers %d-%d-%d-%d is sorted from lowest to higher: %d<%d<%d<%d",a,b,c,d, min,
					med2, med1, max);
		}

	}

}
