import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		for (int i = 1; i < num; i++) {
			int sum = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					sum += j;
				}

			}
			if (sum == i) {
				System.out.println(sum);
			}
		}
	}

}
