package ba.bitcamp.homework.task2;

public class main {
	
	/**
	 * Calculated which author have more bestseller
	 * @param author - Array of author
	 * @return - Authors name
	 */
	public static Authors getAuthorWithMostBestsellers(Authors[] author) {
		int num = countBestsellingBooks(author[0]);
		Authors best = author[0];
		for (int i = 0; i < author.length; i++) {
			if (countBestsellingBooks(author[i]) > num) {
				num = countBestsellingBooks(author[i]);
				best = (author[i]);

			}
		}
		return best;
	}

	/**
	 * /Calculated how many books was published between two years
	 * 
	 * @param a
	 *            - Author
	 * @param year1
	 *            - from year
	 * @param year2
	 *            - to year
	 * @return number of books
	 */
	public static int getNumberOfWrittenBooks(Authors a, int year1, int year2) {

		int counter = 0;
		for (int i = 0; i < a.book.length; i++) {
			if (a.book[i].year >= year1 && a.book[i].year <= year2) {
				counter++;
			}
		}
		return counter;
	}

	/**
	 * Calculated number of bestseller
	 * 
	 * @param a
	 *            - Checking author
	 * @return - Number of bestseller book
	 */
	public static int countBestsellingBooks(Authors a) {

		int counter = 0;
		for (int i = 0; i < a.book.length; i++) {
			if (a.book[i].isBestseller == true) {
				counter++;
			}

		}
		return counter;
	}

	public static void main(String[] args) {

		// Declaration array of books
		Books[] b1 = new Books[5];
		b1[0] = new Books("Demian", 1919, "novel", false);
		b1[1] = new Books("Siddhartha", 1980, "novel", false);
		b1[2] = new Books("Der Steppenwolf", 1927, "novel", false);
		b1[3] = new Books("Krieg und Frieden", 1977, "poem", true);
		b1[4] = new Books("Journey to the East", 1930, "esey", true);

		// Declaration new author with array of books
		Authors a1 = new Authors("Hermann Hesse", 1877, b1);

		// Declaration array of books
		Books[] b2 = new Books[5];
		b2[0] = new Books("Death and the Dervish", 1966, "novel", true);
		b2[1] = new Books("Somebody Elses Land", 1975, "drama", true);
		b2[2] = new Books("Fortress", 1970, "novel", true);
		b2[3] = new Books("The Island", 1977, " novel", false);
		b2[4] = new Books("Remembering", 1980, "esey", false);

		// Declaration new author with array of books
		Authors a2 = new Authors("Mesa Selimovic", 1910, b2);

		// Declaration array of books
		Books[] b3 = new Books[5];
		b3[0] = new Books("The Damned Yard", 1919, "novel", true);
		b3[1] = new Books("Unrest", 1958, "esey", false);
		b3[2] = new Books(" The Bridge on the Drina", 1927, "novel", true);
		b3[3] = new Books("Omer-Pasha Latas", 1966, "novel", true);
		b3[4] = new Books("Ex Ponto", 1930, "esey", true);

		// Declaration new author with array of books
		Authors a3 = new Authors("Ivo Andric", 1892, b3);

		// Declaration array of author
		Authors[] author = new Authors[3];
		author[0] = a1;
		author[1] = a2;
		author[2] = a3;

		// Finding and printing the number of bestseller of author with method
		System.out.print("Number of bestseller of author is: ");
		System.out.println(countBestsellingBooks(a1));

		// Finding and printing how many books was published between two years
		System.out.print("Number of published books between two years is: ");
		System.out.println(getNumberOfWrittenBooks(a2, 1970, 1977));

		// Finding and printing the authors with most bestseller with method
		System.out.println("Authors with most bestseller ");
		System.out.println(getAuthorWithMostBestsellers(author));

	}

}
