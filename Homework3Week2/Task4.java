public class Task4 {

	public static void main(String[] args) {
		TextIO.writeFile("src/input4.in");
		System.out.println("How much you want to enter numbers");
		int num = TextIO.getInt();
		System.out.println("What number is looking for");
		int look = TextIO.getInt();
		TextIO.putf("%d %d", num, look);
		int counter = 0;
		for (int i = 1; i < num; i++) {
			System.out.printf("Enter number %d of %d: ", i, num - 1);
			int d = TextIO.getInt();
			if (d == look) {
				counter++;

			}

		}
		if (counter >= 1)
			System.out.printf("Number exist %d times",counter);
		else
			System.out.println("Number don't exist");

	}

}
