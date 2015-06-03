import java.util.Arrays;
import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the length of array");
		int length = input.nextInt();
		String Array[] = new String[length];

		for (int i = 0; i < length; i++) {
			System.out.println("Enter the value of String array " +(i+1));
			Array[i] = input.next();
		}

		System.out.println(Arrays.toString(Array));

		int Array1[] = new int[10];
		char element = ' ';
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < Array[i].length(); j++) {
				element = Array[i].charAt(j);

				switch (element) {

				case '0':
					Array1[0]++;
					break;
				case '1':
					Array1[1]++;
					break;
				case '2':
					Array1[2]++;
					break;
				case '3':
					Array1[3]++;
					break;
				case '4':
					Array1[4]++;
					break;
				case '5':
					Array1[5]++;
					break;
				case '6':
					Array1[6]++;
					break;
				case '7':
					Array1[7]++;
					break;
				case '8':
					Array1[8]++;
					break;
				case '9':
					Array1[9]++;
					break;

				}

			}

		}
		System.out.println(Arrays.toString(Array1));

	}

}
