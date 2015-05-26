import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Input 1: ");
		int max1 = in.nextInt();
		System.out.print("Input 2: ");
		int max2 = in.nextInt();
		for (int i = 0; i < max1; i++) {
			for (int j = 0; j < max2; j++) {
				if ((i == 0 || i == max1 - 1) && (j == 0 || j == max2 - 1)){
					System.out.print("+ ");
				} else if (i == 0 || i == max1 - 1){
					System.out.print("- ");
				} else if (j == 0 || j == max2 - 1){
					System.out.print("| ");
				} else {
					System.out.print("  ");
					}
		        }
				System.out.println();   
		 
			}
		}
	}
