public class Movie {
	private String name;
	private Integer year;
	private String director; // Class attributes
	private String genere;
	private double imdb;
	private boolean oscar;

	/**
	 * Default construstor of class Movie with name,year,director,IMBD, and
	 * oscar
	 */

	// Movie Constructor that allows us to enter
	// the attributes in the main program in the class Movie

	public Movie(String name, Integer year, String director, String genere,
			Double imdb, Boolean oscar) {
		this.name = name;
		this.year = year;
		this.director = director;
		this.genere = genere;
		this.imdb = imdb;
		this.oscar = oscar;
	}

	// Methode for converting value to string

	public String toString() {
		String s = "";
		s = s + "Name: " + name + "\n";
		s = s + "Year: " + year + "\n";
		s = s + "Director: " + director + "\n";
		s = s + "Genere: " + genere + "\n";
		s = s + "Oscar: " + oscar + "\n";
		return s;
	}
}
