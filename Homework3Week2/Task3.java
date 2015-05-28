public class Task3 {

	public static void main(String[] args) {
		TextIO.writeFile("src/input3.in");
		int num = 1;
		System.out.println("How many number you want to enter");
		num = TextIO.getInt();
		int min = num;
		for (int j = 1; j <= num; j++) {
			System.out.printf("Number %d of %d\n", j, num);
			int nums = TextIO.getInt();
			if (nums < min)
				min = nums;
		}
		System.out.printf("The minimal number is:%d", min);

	}
}
