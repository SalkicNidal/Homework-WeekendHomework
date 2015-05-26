import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		for (int i = 1; i < num; i++) {
			int var1 = i;
			int counter = 0;
			int sum = 0;
			int var = i;
			int var2 = 0;
			while (var > 0) {
				var /= 10;
				counter++;
			}
			for (int j = 0; j <= counter; j++) {
				var2 = var1%10;
				sum += var2;
				var1 /= 10;
			}

			if (i % sum == 0) {
				System.out.println(i);

			}
		}
	}

}
