
import java.util.Arrays;

public class Task1 {

	public static void main(String[] args) {

		int[] Array = new int[100];
		int counter = 0;
		for (int i = 0; i < 100; i++) {
			Array[i] = counter;
			counter++;
			if (counter > 9)
				counter = 0;

		}

		System.out.print(Arrays.toString(Array));

	}

}
