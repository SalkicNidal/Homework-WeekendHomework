import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Enter the number of matter");
		int matter = ulaz.nextInt();
		System.out.println("Enter the number of containers");
		int num = ulaz.nextInt();
		int counter = 0;

		// If the number is odd add another matter and container

		if (matter % 2 != 0) {
			matter++;
			counter++;
		}

		// When sharing the matter with two if the result is equal to the number
		// of containers stop the program
		
		
		int var = matter;
		while (var % 2 == 0) {
			var /= 2;
			if (var == num) {
				break;
				
			//	In case if you did not go back and add the purchase of another container
				
			} else if (var % 2 != 0) {
				var = matter++;
				counter++;
			}

		}
		// Printing the results and number of buy container
		
		if (counter != 0)
			System.out.printf("Mujo you need buy %d containers", counter);
		else
			System.out
					.println("Mujo do not need to buy containers , go to the boss and ask for a raise");

	}

}
