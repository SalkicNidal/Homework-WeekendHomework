import java.util.Scanner;


public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		long first = 0;
		long second = 1;
		int fibonachi = 1;
		int num=0;
		long sum=1;
		while (num<1 || num>=50){
			System.out.println("Enter the number again");
			num = in.nextInt();
		} 
		
		while (fibonachi< num) {
			
			
			sum = first + second;
			first=second;
			second=sum;
			fibonachi += 1; 
			
		
		}
		System.out.print(sum);
	}

}
