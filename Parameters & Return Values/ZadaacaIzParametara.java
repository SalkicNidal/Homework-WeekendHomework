public class ZadaacaIzParametara {

	public static int pomnozi(int num) {

		return num * num;
	}

	public static double pomnozi(double num) {

		return num * num;

	}

	public static int pomnozi(int num, int num2) {

		return num * num2;

	}

	public static double pomnozi(double num, double num2) {

		return num * num2;

	}

	public static void main(String[] args){
		System.out.println("Kvadrat  int broja je "+pomnozi(10));
		System.out.println("Kvadrat double broja je "+pomnozi(10.0));
		System.out.println("Proizvod dva int broja je "+pomnozi(10, 15));
		System.out.println("Proizvod dva double broja je "+pomnozi(10.0, 15));

	}
}