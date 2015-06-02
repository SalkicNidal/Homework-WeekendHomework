package Task4;

public class Task4 {

	public static void main(String[] args) {

		/*
		 * Decoding file Encoded.in using Text.IO on the principle of taking
		 * each line and each character in each line and the return of each
		 * character to one place back
		 */

		TextIO.readFile("src/Task4/EncodedFile.in");

		int num = TextIO.getlnInt();
		for (int i = 1; i <= num; i++) {
			String line = TextIO.getlnString();
			int length = line.length();
			for (int j = 0; j < length; j++) {
				char var = line.charAt(j);
				int num1 = var - 1;
				var = (char) (num1);
				System.out.print(var);
			}
			System.out.println();

		}
		TextIO.readStandardInput();

	}

}
