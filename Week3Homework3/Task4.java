import java.util.Scanner;

public class Task4 {

	public static double getPercentage(int N, int M) {

		double procent = 0;
         double m=(double)(M);
		procent = (double) ((N * 100) / m);

		return procent;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the maximum number of points");
		int max = input.nextInt();
		System.out.println("Enter the number of points");
		int points = input.nextInt();

		System.out.println("It's done " + getPercentage(points, max) + "%");
	}

}
 