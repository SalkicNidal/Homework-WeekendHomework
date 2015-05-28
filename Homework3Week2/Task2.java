public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextIO.writeFile("src/input2.in");
		int sum = 0;
		int num=-1;
		do{
			System.out.println("Enter the number");
			num = TextIO.getInt();
			if(num!=-1){
			TextIO.putln(num);
			sum+=num;
			}
		
		}while(num!=-1);
		
		
		System.out.println(sum);
	}

}
