public class Task4W1 {

	public static void main(String[] args) {
		/*
		 * Make a program that for a given date determined by the zodiac sign
		 * that belongs to that date .
		 */
		int day = 16;
		int month = 9;

		// The requirement that the insertion date is valid

		if (month > 12) {
			System.out.println("The entered date does not exist");
		} else if (day > 30|| (month == 4 && month == 6 && month == 9 && month == 11 && month > 12)) {
			System.out.println("The entered date does not exist");
		} else if (day > 31|| (month == 1 && month == 3 && month == 5 && month == 7 && month == 8 && month == 10 && month == 12)) {
			System.out.println("The entered date does not exist");
		} else if (month == 29 || (day > 29)) {
			System.out.println("The entered date does not exist");
		}
		    // The requirement that the insertion date given zodiac sign

		else if ((month == 3 && day >= 21) || (month == 4 && day <= 20)) {
			System.out.println("Zodiac sign is the Ram");
		} else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
			System.out.println("Zodiac sign is the Bull");
		} else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
			System.out.println("Zodiac sign is the Twins");
		} else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
			System.out.println("Zodiac sign is the Crab");
		} else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
			System.out.println("Zodiac sign is the Lion");
		} else if ((month == 8 && day >= 23) || (month == 9 && day <= 21)) {
			System.out.println("Zodiac sign is the Virgin");
		} else if ((month == 9 && day >= 22) || (month == 10 && day <= 23)) {
			System.out.println("Zodiac sign is the Scales");
		} else if ((month == 10 && day >= 24) || (month == 11 && day <= 21)) {
			System.out.println("Zodiac sign is the Scorpion");
		} else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
			System.out.println("Zodiac sign is the Archer");
		} else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
			System.out.println("Zodiac sign is the Goal");
		} else if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
			System.out.println("Zodiac sign is the Water Bearer");
		} else if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) {
			System.out.println("Zodiac sign is the Fihes");

		}
	}

}
