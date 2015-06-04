import java.util.Scanner;

public class Task2 {

	// The method is useful for professors and assistants 
	
	public static char getGrade(int score) {

		int var = ((score - 4) / 10);
		char grade = ' ';

		switch (var) {

		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		case 5:
			grade = 'E';
			break;
		default:
			grade = 'F';
			break;
		}
		return grade;

	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the score:");
		int num1 = input.nextInt();

		System.out.println("Grade is: " + getGrade(num1));

	}

}
