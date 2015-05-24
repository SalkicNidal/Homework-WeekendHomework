public class Tak11W1 {

	public static void main(String[] args) {
		/*
		 * Implement code that determines how many hours and minutes a plane
		 * lands at the airport if you know how many hours and minutes the plane
		 * takes off and how many minutes is flight . Flights taking off and
		 * landing in the same time zone .
		 */

		int hours = 23;
		int minutes = 59;                  // Variables of hours , minutes and duration of the flight
		int time = 450; 

		int day, minutes2, hours2;         // Assistant variable

		// The algorithm for calculating the time of landing
		int minutes1 = time + minutes;
		int hours1 = hours + minutes1 / 60;

		if (minutes1 < 60 && hours1 <= 24) {
			System.out
					.printf("Plane takes off at:%d:%dh, plane land in %d:%dh Flight time was: %d",
							hours, minutes, hours1, minutes1, time);
		} else {
			minutes2 = minutes1 % 60;
			hours2 = (hours + minutes1 / 60) % 24;
			day = hours1 / 24;
			System.out
					.printf("Plane takes off at: %d:%dh, plane land %d nexts day,at %d hours and %d minutes. Flight time is:%d minutes",
							hours, minutes, day, hours2, minutes2, time);

		}
	}
}
