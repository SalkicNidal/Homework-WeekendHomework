public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextIO.readFile("src/decimal.in");
		TextIO.writeFile("src/binary.out");

		int num = TextIO.getInt();
		System.out.printf("Number to change from decimal to binary is:%d\n",
				num);

		int var = 0;
		while (num > 0) {
			var += num % 2 + 2;
			var *= 10;
			num /= 2;
		}
		var /= 10;

		while (var > 0) {
			if (var % 10 == 3)
				TextIO.put(1);
			else
				TextIO.put(0);
			var /= 10;

		}
		TextIO.readFile("src/binary.out");
		int bin = TextIO.getInt();
		System.out.printf("The binary number is %d", bin);
}
	

}
