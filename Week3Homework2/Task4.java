import java.util.Arrays;
import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		char Array[] = { 'I', 'N', 'G', 'B', 'I', 'T', 'C', 'A', 'M', 'P' };

		System.out.println("Enter the number (Positive for right turn or Negative to move to the left ");
		int num = input.nextInt();
		int length = Array.length;

		while (num > 0) {
			char first = Array[length - 1];
			for (int i = length - 1; i > 0; i--) {
				Array[i] = Array[i - 1];
			}
			num--;
			Array[0] = first;
		}
		while (num < 0) {
			char last = Array[0];
			for (int i = 0; i < length - 1; i++) {
				Array[i] = Array[i + 1];
			}
			num++;
			Array[length - 1] = last;
		}
		System.out.println(Arrays.toString(Array));

	}

}
