package ba.bitcamp.homework.dinamic.stringArray;

public class Main {

	public static void main(String[] args) {
		
		DinamicArray stringArray = new DinamicArray(5,"NoN");
		System.out.println(stringArray);
		
		stringArray.addArray("Word");
		stringArray.addArray("word1", "word2", "word3");
		System.out.println(stringArray);
		
		stringArray.removeQuick(5);
		stringArray.removeSlow(1);
		System.out.println(stringArray);
	}

}
