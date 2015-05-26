import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int index = in.nextInt();
		int counter = 0;
		int var = num;
		int var1 = 1;
		int solutions;
		while (var1 > 0) {
			var1 = var / 10;
			var /= 10;
			counter++;
		}

		if (index > counter) {
			System.out.println("Error");
		} else
			for (int i = 1; i < index; i++) {
				num /= 10;
			}
		solutions = num % 10;
		System.out.println(solutions);

	}

}
