public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextIO.writeFile("src/input.in");
		System.out.println("Enter the first number");
		int a = TextIO.getInt();
		System.out.println("Enter the last number");
		int b = TextIO.getInt();
		for (int i = a + 1; i < b; i++)
			System.out.printf("Number between %d and %d is:%d\n", a, b, i);

	}

}
