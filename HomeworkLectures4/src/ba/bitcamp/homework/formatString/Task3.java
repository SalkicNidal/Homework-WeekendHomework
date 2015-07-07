package ba.bitcamp.homework.formatString;

import java.util.Arrays;
import java.util.MissingFormatArgumentException;

public class Task3 {

	public static void formatString(String format, Object... value) {
		String sentence = "";
		int tmp = format.indexOf('%');

		sentence = format.substring(0, tmp);
		for (int i = 0; i < value.length; i++) {
			sentence += value[i];
		}
		sentence += format.substring(tmp + 2, format.length());

		System.out.println(sentence);
	}

	/**
	 * Method for check of compatible string format and entered object
	 * 
	 * @param format
	 *            - String for format
	 * @param value
	 *            - array of Objects
	 * @return true if length of Object is equals with number of char '%' in
	 *         string format
	 */
	public static boolean isCompatible(String format, Object... value) {

		int counter = numberOfFormat(format);
		if (counter == value.length) {
			return true;
		}

		return false;
	}

	/**
	 * Method for fill array of index of characters '%'
	 * 
	 * @param format
	 *            - input string
	 * @return integer array of value of index of character %
	 */
	public static int[] arrayOfIndex(String format) {

		int length = numberOfFormat(format);
		int[] array = new int[length];

		int index = format.indexOf('%');

		while (index >= 0) {
			for (int i = 0; i < length; i++) {
				array[i] = index;

				index = format.indexOf('%', index + 1);
			}
		}

		return array;

	}

	/**
	 * MEthod for calculated number of char '%' in string format
	 * 
	 * @param format
	 *            String
	 * @return integer
	 */
	public static int numberOfFormat(String format) {

		int counter = 0;
		for (int i = 0; i < format.length(); i++) {
			if (format.charAt(i) == '%') {
				counter++;
			}

		}
		return counter;
	}

	public static void formatStringManipulation(String format, Object... value) {
		String sentence = "";
		int[] array = arrayOfIndex(format);

		if (isCompatible(format, value) == false) {

			throw new MissingFormatArgumentException("Wrong input");

		} else {

			for (int i = 0; i < array.length; i++) {

				int index = format.indexOf('%');
				String tmp = "" + (format.charAt(array[i] + 2));

				try {

					int length = Integer.parseInt(tmp);

					if (value[i].toString().length() >= length) {

						sentence += format.substring(0, array[i]);

						for (int j = 0; j < length; j++) {
							sentence += value[j];
						}
						sentence += format.substring(array[i] + 4,
								format.length());
					} else {

						sentence += format.substring(0, index);
						for (int j = 0; j < value.length; j++) {
							sentence += value[j];
						}

						for (int j = value.toString().length(); j < length; j++) {
							sentence += " ";

						}
						sentence +=" " +format.substring(array[i] + 4,
								format.length());

					}
				} catch (NumberFormatException e) {
					formatString(format, value);
				}

			}
			System.out.println(sentence);
		}
	}
	
	
	public static void replace(String format, Object... value){
		String s = "";
		for ( int i = 0; i < value.length; i++){
		 format += format.replaceAll("%.", value[i].toString());
		
	     System.out.print(format);
		}
	}

	public static void main(String[] args) {

//		formatStringManipulation(" %.3d %.4d", 5342, 3);
		System.out.println(isCompatible("%d , %d", 1));
		System.out.println(Arrays.toString(arrayOfIndex("3%d, %d, %d")));
		replace("%d niii , %d, %d", 1 ,3,5);
	}
}
