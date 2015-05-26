import java.util.Scanner;

public class Task5Week2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int counter = 0;
		int counter2 = 0;
		int a = num;
		int c = num;
		int b = 0;
		int var = 1;
		while (var > 0) {
			var = a / 10;
			a = a / 10;
			counter++;
		}
		for (int i = 0; i < counter; i++) {
			b += c % 10;
			if (b % 10 != 0) {
				b = b * 10;
			}
			c = c / 10;
		}
		b = b / 10;
		int var1 = 1;
		int d = 0;
		int num1 = b;
		while (var1 > 0) {
			var1 = b / 10;
			b = b / 10;
			counter2++;
		}
		for (int j = 0; j < counter2; j++) {
			d += num1 % 10;
			d *= 10;
			num1 = num1 / 10;

		}
		d = d / 10;
		System.out.println(d);

	}

}
