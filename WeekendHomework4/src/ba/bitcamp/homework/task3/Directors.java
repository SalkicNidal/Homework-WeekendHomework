package ba.bitcamp.homework.task3;

public class Directors {
	 public String name;
	 public Integer yearOfBIrth;
	 
	// Declaration of constructor
	public Directors(String name, Integer yearOfBIrth) {
		super();
		this.name = name;
		this.yearOfBIrth = yearOfBIrth;
	}


	// Declaration method toString
	public String toString() {
		return "" + name + "\n  Year of birth is: " + yearOfBIrth + ".";
	}
	 
	
	 
}
