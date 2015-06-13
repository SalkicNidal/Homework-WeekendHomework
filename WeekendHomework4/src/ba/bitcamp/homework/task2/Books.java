package ba.bitcamp.homework.task2;

public class Books {

	public String name;
	public Integer year;
	public String genre;
	public Boolean isBestseller;

	// Declaration of constructor
	public Books(String name, Integer year, String genre, Boolean isBestseller) {
		super();
		this.name = name;
		this.year = year;
		this.genre = genre;
		this.isBestseller = isBestseller;
	}

	// Declaration of method toString
	@Override
	public String toString() {
		return "-" + name + ". \n Year of publish is: " + year
				+ ". \n Genre is: " + genre + " \n Book is bestseller is: "
				+ isBestseller + "\n";
	}

}
