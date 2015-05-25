public class Task1H1W2 {

	public static void main(String[] args) {

		// Hint: Number n can be infinitely many times to share , and to never become zero
		
              
		// Solutions of the modified task
	
		/*R1
		 * Your program contains a number n . Write such a code to determine how
		 * many times n can divide before it becomes ONE and print the result
		 * on the console
		 */

		int Num = 33;
		int counter = 1; // Variable of entered number, counter and the sum
		int sum = 0;
		// Algorithm with a while loop and if branching
		while (counter <= Num) {
			if (Num % counter == 0) {
				Num /= counter;
				sum++;
			}
			counter++;
		}
		// Printing the result
		System.out.printf("Number can divide before it comes one %d times",
				sum);
	}

}
            
        /*       //R2. Write such a code to determine how many times n can divide

         while (counter <= Num) { 
	            if (Num % counter == 0) {
                sum++; } 
	            counter++; 
         }
	            // Printing the result 
            System.out.printf("Number %d can divide before it comes zero %d times", Num,
                sum); }
 
  }
}
      */
