public class Task12W1 {

	public static void main(String[] args) {
		/*
		 * Implement code that determines whether a ball with a given radius of
		 * " good quality " . In this case, " good quality " means that the ball
		 * has a volume of 6,014 with a tolerance of ± 0.05 % .
		 */

		double radius = 1.3665677;     // Variable of radius

		// The algorithm for testing of whether ball belongs in "Good quality "
		// or not
		double volume = (3 / 4) * (radius * radius * radius * Math.PI);
		if (volume >= 6.010993 && volume <= 6.017007) {
			System.out.printf("Ball with given radius:%f is\"Good quality\"",radius);
		}  else {
			System.out.printf("Ball with given radius:%f is not\"Good quality\"",radius);
		}

	}

}
