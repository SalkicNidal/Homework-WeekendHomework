import java.util.Arrays;
import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int Array[] = new int[100000];
		for (int i = 0; i < 100000; i++) {
			Array[i] = ((int) (Math.random() * 100000));
		}
		Arrays.sort(Array);
		System.out.println(Arrays.toString(Array));

		System.out.println("Enter the number for check");
		int num = input.nextInt();

		long start = System.currentTimeMillis();
		Arrays.binarySearch(Array, num);
		long end = System.currentTimeMillis() - start;
		System.out.println("Time for finding number by binnarySearch is " + end
				+ " millis");

		start = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {

			if (Array[i] == num) {
				break;

			}
		}
		end = System.currentTimeMillis() - start;

		System.out.println("Time for finding number is " + end + " millis");

	}

}
