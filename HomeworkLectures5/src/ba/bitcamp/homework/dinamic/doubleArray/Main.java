package ba.bitcamp.homework.dinamic.doubleArray;

public class Main {

	public static void main(String[] args) {

		// Declaration new double array
		DinamicArray doubleArray = new DinamicArray(5, 9.0);
		System.out.println(doubleArray);

		// Add element to array
		doubleArray.addArray(3.0, 5.0, 6.0, 7.4, 8.7, 9.5, 0.7, 0.8);
		System.out.println(doubleArray);

		// Use the quick and slow removed element from array
		doubleArray.removeQuick(5);
		doubleArray.removeSlow(5);
		System.out.println(doubleArray);
	}

}
