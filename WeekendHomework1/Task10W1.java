public class Task10W1 {

	public static void main(String[] args) {
		/*
		 * Implement code that determines whether a given number of one of the
		 * solutions given cubic equation form A*x^3+B*x^2+C*x+D=0
		 */

		int A = 1;
		int B = 4;
		int C = 3; // Variable Cubic s equations and entered solution
		int D = 45 ;
		int solutions = 9;

		// The requirement that checks whether the solution entered one of the
		// solutions cubic s equations
		if (A * solutions * solutions * solutions + B * solutions * solutions
				+ C * solutions + D == 0) {
			System.out
					.printf("Entered solution:%d of cubics equations %d*X^3+%d*X^2+%d*X+%d=0 is one of the solutions",solutions,A,B,C,D);
		} else {
			System.out
					.printf("Entered solution:%d of cubics equations %d*X^3+%d*X^2+%d*X+%d=0 is not one of the solutions",solutions,A,B,C,D);
		}

	}

}
