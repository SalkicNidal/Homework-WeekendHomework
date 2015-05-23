public class Task6W1 {

	public static void main(String[] args) {
		/*
		 * Make a program that contains two variables that represent the time in
		 * the format 24 : 00h (military time ) . Print the screen in the format
		 * AM / PM
		 */

		int hours = 2;            // Variables input hours and minutes
		int minutes = 57;

		int hours1;             // The variable assist in turning 24 hours of the AM/PM

		// The conditions that turn the clock from 24 hours to AM/PM and printing

		if (hours <= 12) {
			System.out.printf(" Time is: %dh : %dm AM", hours, minutes);
		} else {
			if (hours == 24) {
				System.out.printf("Time is 00 : %dm AM", minutes);
			} else {
				hours1 = hours / 12;
				System.out.printf(" Time is: %dh : %dm PM or %dh : %dm ",
						hours1, minutes, hours, minutes);
			}
		}
	}

}
