public class Arg2 {

	public static void main(String[] args) {
		/*
		 * Write a program that will be based on the returned values mentioned
		 * methods to standard output print that is part of the day : 6 - 10 -
		 * " Morning " 10 - 18 - " Day " 18 - 22 - " Eve" 22-6 - " Night"
		 */
		long date=(System.currentTimeMillis());
		
		long s=date/1000;
		long m=date%60;
		long h=date/60;
		
		System.out.print(date);
		
		
		
	}

}
