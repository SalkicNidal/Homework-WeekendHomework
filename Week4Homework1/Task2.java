public class Task2 {

	/**
	 * Get minimum number
	 * @param Elements
	 *            of array.
	 */
	public static void printMin(String[] args) {
		int min = 0;
		try {
			if (args.length != 0) {
				min = Integer.parseInt(args[0]);
			}
			for (int i = 1; i < args.length; i++) {
				if (Integer.parseInt(args[i]) < min) {
					min = Integer.parseInt(args[i]);
				}
			}

			System.out.println("Min. number is: " + min);

		} catch (Exception e) {
			System.out.println("Please enter only numbers!");
		}
	}

	public static void main(String[] args) {

		// Print min number with method
		printMin(args);
	}

}
