public class Task3W1 {

	public static void main(String[] args) {
		/*
		 * Write a program that includes six variables representing the two
		 * dates . Print to console the date of the two dates comes before the
		 * other.
		 */
		int day1 = 2;
		int month1 = 1;
		int year1 = 2018; // The six variables that represent two date
		int day2 =   2; // format of date is day - month -year
		int month2 = 1;
		int year2 = 2018;

		// The conditions that determine which of the two dates comes first and
		// that you are the same

		if (day1 == day2 && month1 == month2 && year1 == year2) {
			System.out.println("Entered dates are equal");
		} else if (year1 > year2) {
			System.out.printf("Date: %d-%d-%d comes before of date %d-%d-%d",
					day2, month2, year2, day1, month1, year1);
		} else if (month1 > month2) {
			System.out.printf("Date: %d-%d-%d comes before of date %d-%d-%d",
					day2, month2, year2, day1, month1, year1);
		} else if (day1 > day2) {
			System.out.printf("Date: %d-%d-%d comes before of date %d-%d-%d",
					day2, month2, year2, day1, month1, year1);
		} else {
			System.out.printf("Date: %d-%d-%d comes before of date %d-%d-%d",
					day1, month1, year1, day2, month2, year2);
		}

	}

}
