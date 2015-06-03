import java.util.Arrays;
import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the length of array");
		int length = input.nextInt();
		int Array[] = new int[length];

		for (int i = 0; i < length; i++) {
			System.out.println("Enter the value " + (i + 1));
			int element = input.nextInt();
			Array[i] = element;
		}
		System.out.println("Enter the number for cheking");
		int num = input.nextInt();
		int counter = 0;
		for (int i = 0; i < length; i++) {
			if (Array[i] == num) {
				counter++;
				break;
			}
		}
		if (counter == 0) {
			System.out.println("Number " + num + " don't exist on array;");
			System.out.println(Arrays.toString(Array));
		} else {

			System.out.println("The number " + num + " exist on array:");
			System.out.println(Arrays.toString(Array));
		}
	}

}
