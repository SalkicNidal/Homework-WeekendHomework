import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number of day");
		int Day = input.nextInt();

		switch (Day) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Work Day");
			break;
		default:
			System.out.println("Weekend day");
			break;
		}

	}

}
