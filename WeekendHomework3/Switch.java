import java.util.Scanner;

public class Switch {

	// Method for the reminder of task
	public static String itIsTimeFor(int Num) {

		// Throw exception if entered number is out of range
		try {
			if (Num > 24 || Num < 0) {
				throw new ArrayIndexOutOfBoundsException(
						"ArrayIndexOutOfBoundsException");
			}
		} catch (ArrayIndexOutOfBoundsException e) {

			return e.getMessage() + "  [The number must be between 0 and 24]";
		}

		// Determine it is time for lecture , exercises , homework or sleep with
		// case from 2 to 17
		switch (Num) {

		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 8:
			return "Bed Time, good night";
		case 9:
		case 10:
		case 11:
		case 12:
		case 13:
			return "During the lectures, be focused";
		case 14:
		case 15:
		case 16:
		case 17:
			return "During the exercises, keep going";

		default:
			return "It's time to start doing your homework";
		}

	}

	
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the time for check");
		int Num = input.nextInt();

		// Print methods for reminders
		System.out.println(itIsTimeFor(Num));

	}

}
