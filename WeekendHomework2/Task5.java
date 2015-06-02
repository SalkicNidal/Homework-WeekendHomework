public class Task5 {

	// The method for returning the first nearest odd number

	public static int getNextOddNumber(int num) {
		if (num % 2 == 0) {
			num = num + 1;
		} else

			num = num + 2;
		return num;
	}

	// The method for calculating the area of ​​a circle

	public static double getAreaOfCircle(int diameter) {
		double area = (diameter / 2) * (diameter / 2) * Math.PI;
		return area;
	}

	// Method for checking the number in a given range

	public static boolean isInRange(int start, int finish, int n) {
		boolean numIsInRange = true;
		if (start < n && n < finish) {
			numIsInRange = true;
		
		} else
			numIsInRange = false;
		return numIsInRange;
	}

	public static void main(String[] args) {

		// Calling methods with the entered argument in Main

		System.out.println("Next odd number is: ");
		System.out.println(getNextOddNumber(5));

		System.out.println("Area of circle is: ");
		System.out.println(getAreaOfCircle(45));

		System.out.println("NUmber is in range: ");
		System.out.println(isInRange(1, 5, 9));

	}

}
