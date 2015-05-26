import java.util.Scanner;


public class Task4 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int num=1;
		int counter = 1;
	    int sum=0;
		while(num!=0){
			sum=0;
			System.out.println("Enter the number\n");
			 num = in.nextInt();
		
			 for(int i=1; i<=num;i++){
					if(num%i==0)
						sum+=i;
				}
				if(sum!=0)
				System.out.println("Suma svih djelilaca broja "+num+" je "+sum);
				}
				System.out.println("Kraj");
			
	

		
		
	}

}
