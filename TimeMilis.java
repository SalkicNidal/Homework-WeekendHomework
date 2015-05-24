public class TimeMilis {

	public static void main(String[] args) {
		/*
		 * Write a program that will be based on the returned values mentioned
		 * methods to standard output print that is part of the day : 6 - 10 -
		 * " Morning " 10 - 18 - " Day " 18 - 22 - " Eve" 22-6 - " Night"
		 */

		long date = (System.currentTimeMillis());
		long h1,s1, m;
		long hours1,m1, minutes;  // Variables h1,s1,m and minutes used for assistant, 
		long s = date / 1000;     //variable hours1 and m1 used for print
 
		// The algorithm to convert milliseconds from 1970 to the current time in hours and minutes
		
		if (s > 60) {
			s1 = s % 60;
			m = s / 60;
		} else {
			s1 = s;
			m = s / 60;
		}
		if (m > 60) {
			m1 = m % 60;
			h1 = ((m / 60) + 2);
		} else {
			m1 = m;
			h1 = ((m / 60) + 2);
		}
		if (h1 > 24) {
			hours1 = h1 % 24;
			minutes = hours1 * 60 + m1;
		} else {
			hours1 = h1;
		}
		
           // The algorithm for the printing part of the day
		minutes = hours1 * 60 + m1;

		if (360 < minutes && minutes <= 600) {
			System.out.println("\nGood morning");
		} else if (600 < minutes && minutes <= 1080) {
			System.out.println("\nGood afternoon");
		} else if (1080 < minutes && minutes <= 1320) {
			System.out.println("\nGood evening");
		} else if (1320 < minutes) {
			System.out.println("\nGood night");
		}

		System.out.printf("Time is %d:%d", hours1, m1);
	}
}
