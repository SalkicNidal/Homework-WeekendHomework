public class Task3 {

	/**
	 * Returns number of digit .
	 * 
	 * @param s
	 *            - String which testing.
	 * @return Number of digit characters.
	 */
	public static int getCountOfNumbers(String line) {
		int counter = 0;
		for (int i = 0; i < line.length(); i++) {
			if (line.charAt(i) >= 48 && line.charAt(i) <= 57)

				counter++;
		}
		return counter;
	}

	public static void main(String[] args) {

		if (args.length == 1) {
			int num = getCountOfNumbers(args[0]);
			if (num != 0) {
				System.out.println(args[0] + " contains " + num + " numbers!");
			} else {
				System.out.println(args[0] + " does not contain any numbers!");
			}
		} else if (args.length > 1) {
			System.out.println("Please pass only one String to the program.");
		} else {
			System.out.println("Please pass one String to the program.");
		}

	}

}
