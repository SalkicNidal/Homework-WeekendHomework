package ba.bitcamp.homework.dinamic.stringArray;

import java.util.Arrays;

public class DinamicArray {

	private String[] myArray;
	private int count;

	/**
	 * Constructor for declaration new array with specified size and string
	 * elements
	 * 
	 * @param size
	 *            - Integer value of size of the array
	 * @param value
	 *            - String of element the array
	 */
	public DinamicArray(int size, String sentences) {
		super();
		count = size;
		myArray = new String[size];
		for (int i = 0; i < count; i++) {
			myArray[i] = sentences;
		}
	}

	/**
	 * Constructor for declaration new array with specified size, elements of
	 * array is default set in null
	 * 
	 * @param size
	 *            Integer value of size of the array
	 */
	public DinamicArray(int size) {
		this(size, null);
		count = 0;
	}

	/**
	 * Default constructor, set size is 8, value of elements is null
	 */
	public DinamicArray() {
		this(8);
	}

	// /////////////////////////

	public String[] getArray() {
		return myArray;
	}

	public void setArray(String[] array) {
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
	 *            - String word of adding element
	 */
	public void addElement(String sentences) {

		if (count >= myArray.length) {

			String[] tmp = new String[2 * myArray.length];
			for (int i = 0; i < myArray.length; i++) {
				tmp[i] = myArray[i];
			}
			myArray = tmp;
		}
		myArray[count] = sentences;
		count++;
	}

	/**
	 * Add elements from other String array to this myArray
	 * 
	 * @param arr
	 *            - array which element add in the myArray
	 */
	public void addArray(String... arr) {
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
	 * Method for get number of elements different of null
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

			String[] tmp = new String[myArray.length / 2];
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

			String[] tmp = new String[myArray.length / 2];
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

		for (int i = 0; i < count -1; i++) {

			s += myArray[i] + " ";
		}

		s += " ] \n" + getTotalSize() + "\t [" ;
		
		for ( int i = 0; i < myArray.length; i ++){
			
			s += myArray[i] + " ";
		}

		  s += "]";
		return s;
	}

}
