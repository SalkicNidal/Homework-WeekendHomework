public class Task8 {
	public static void main(String[] args) {

		String a = "www.nekastranica.com?name=John&surname=Stark";

		int num = a.length();
		int counter = 0;
		String surname = "";
		String name = "";
		String reverse1 = "";
		String reverse2 = "";

		// Retrieval from all characters starting from the right ,
		// until it is equal character ' = '

		for (int i = num - 1; i > 0; i--) {
			char c1 = a.charAt(i);
			if (c1 != '=') {
				surname += c1;
				counter++;
			} else {
				break;
			}
		}

		// Turning the character in the original form

		int m = surname.length();
		for (int j = m - 1; j >= 0; j--) {
			char c2 = surname.charAt(j);
			reverse1 += c2;
		}

		// Retrieval from all characters starting from char '&' ,
		// until it is equal character ' = '

		counter += 10;
		for (int k = num - counter; k > 0; k--) {
			char c3 = a.charAt(k);
			if (c3 != '=') {
				name += c3;
			} else {
				break;
			}

		}

		// Turning the character in the original form

		int n = name.length();
		for (int p = n - 1; p >= 0; p--) {
			char c4 = name.charAt(p);
			reverse2 += c4;
		}
		surname = reverse1;
		name = reverse2;
		
		// Printing the name and surname
		
		System.out.printf("%s %s", name, surname);

	}

}
