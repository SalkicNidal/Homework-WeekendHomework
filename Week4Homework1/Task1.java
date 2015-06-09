public class Task1 {
	
	
	/**
	 * Converts celsuis to kelvin
	 * @param temp Temperature in celsius.
	 * @return Temperature in Kelvin.
	 */
	public static double convertToKelvins(double temp){
		return temp + 273.15;
	}

	public static void main(String[] args) {
		
		//Converter temperature with method
		System.out.println(convertToKelvins(100));
		System.out.println(convertToKelvins(15.85));
		System.out.println(convertToKelvins(-15.15));
	}
	
	
	
}
