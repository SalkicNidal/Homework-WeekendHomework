import java.util.Scanner;


public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number\n");
		int num = in.nextInt();
		int sum=0;
		int counter=0;
		int var=0;
		int num2=num;
		while(num2>0){
			num2/=10;
		     counter++;
		}
		 for (int i=0;i<=counter;i++){
			 var=num%10;
			 sum+=var;
			 num=num/10;
			 
		 }
		 System.out.printf("Sum od number digit is:%d",sum);
	}

}
