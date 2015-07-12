package ba.bitcamp.homework.dinamic.doubleArray;

import java.util.Arrays;

public class DinamicArray {

	private double[] myArray;
	private int count;

	/**
	 * Constructor for declaration new array with specified size and double
	 * elements
	 * 
	 * @param size
	 *            - Integer value of size of the array
	 * @param value
	 *            - Double value of element the array
	 */
	public DinamicArray(int size, double value) {
		super();
		count = size;
		myArray = new double[size];
		for (int i = 0; i < count; i++) {
			myArray[i] = value;
		}
	}

	/**
	 * Constructor for declaration new array with specified size, elements of
	 * array is default set in 0.0
	 * 
	 * @param size
	 *            Integer value of size of the array
	 */
	public DinamicArray(int size) {
		this(size, 0.0);
		count = 0;
	}

	/**
	 * Default constructor, set size is 8, value of elements is 0.0
	 */
	public DinamicArray() {
		this(8);
	}

	// /////////////////////////

	public double[] getArray() {
		return myArray;
	}

	public void setArray(double[] array) {
		this.myArray = array;
	}

	public void setCount(int count) {
		this.count = count;
	}

	// /////////////////////////////

	/**
	 * Method for adding element in array, and for resize the length of array
	 * before adding
	 * 
	 * @param value
	 *            - Double value of adding element
	 */
	public void addElement(double value) {

		if (count >= myArray.length) {

			double[] tmp = new double[2 * myArray.length];
			for (int i = 0; i < myArray.length; i++) {
				tmp[i] = myArray[i];
			}
			myArray = tmp;
		}
		myArray[count] = value;
		count++;
	}

	/**
	 * Add elements from other double array to this myArray
	 * 
	 * @param arr
	 *            - array which element add in the myArray
	 */
	public void addArray(double... arr) {
		for (int i = 0; i < arr.length; i++) {

			addElement(arr[i]);
		}
	}

	/**
	 * Method for get length of array
	 */
	public int getTotalSize() {
		return myArray.length;
	}

	/**
	 * Method for get number of elements different of 0.0
	 */
	public int getCount() {
		return count;
	}

	/**
	 * Quick removed element from array, use directly remove
	 * 
	 * @param index
	 *            - index of elements
	 * @throws IllegalArgumentException
	 *             - index is out of range
	 */
	public void removeQuick(int index) throws IllegalArgumentException {

		if (index >= count)
			throw new IllegalArgumentException();

		myArray[index] = myArray[count - 1];
		count--;
		if (count <= myArray.length / 3) {

			double[] tmp = new double[myArray.length / 2];
			for (int i = 0; i < count; i++) {
				tmp[i] = myArray[i];
			}
			myArray = tmp;
		}
	}

	/**
	 * Slow removed element from array, using shift left of the elements
	 * 
	 * @param index
	 *            - index of element
	 * @throws IllegalArgumentException
	 *             - index is out of range
	 */
	public void removeSlow(int index) throws IllegalArgumentException {

		if (index >= count)
			throw new IllegalArgumentException();

		for (int i = index; i < count - 1; i++) {
			myArray[i] = myArray[i + 1];
		}

		count--;
		if (count <= myArray.length / 3) {

			double[] tmp = new double[myArray.length / 2];
			for (int i = 0; i < count; i++) {
				tmp[i] = myArray[i];
			}
			myArray = tmp;
		}
	}

	// /////////////////////////////////////////
	@Override
	public String toString() {

		String s = "";

		s += getCount() + "\t [ ";

		for (int i = 0; i < count ; i++) {

			s += myArray[i] + " ";
		}

		s += " ] \n" + getTotalSize() + "\t " + Arrays.toString(myArray);

		return s;
	}

}
