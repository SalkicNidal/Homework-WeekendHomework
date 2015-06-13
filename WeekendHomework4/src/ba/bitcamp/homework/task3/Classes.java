package ba.bitcamp.homework.task3;

public class Classes {
	
	public String name;
	public Integer numberOfStudents;
	
	// Declaration of constructor
	public Classes(String name, Integer numberOfStudents) {
		super();
		this.name = name;
		this.numberOfStudents = numberOfStudents;
	}


	// Declaration method toString
	public String toString() {
		return "Classes name is: " + name + " Number of students is: "
				+ numberOfStudents + ".";
	}
	
	

}
