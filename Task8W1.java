public class Task8W1 {

	public static void main(String[] args) {
		/*
		 * Design a program that, given the coordinates x , y and z A point in
		 * 3D space determines, how a point away from the origin ( 0,0,0 ) .
		 */

		int x = 0;
		int y = -1; // Coordinates point A
		int z = 1;
		// Command to determine the distance
		double distance;
		distance = Math.sqrt((double) (x * x + y * y + z * z));
		// Print to console the distance from origin point
		System.out
				.printf("Distance A point (%d,%d,%d) from the origin point(0,0,0) is: %f",
						x, y, z, distance);
	}

}
