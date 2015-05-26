import java.util.Scanner;


public class Task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		for(int i=1;i<=num;i++){
			for(int j=1;j<=num;j++){
				if((i+j)>num){
					System.out.print("*");
					System.out.print(" ");
				}

				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	
	}

}
