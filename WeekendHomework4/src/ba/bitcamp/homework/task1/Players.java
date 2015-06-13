package ba.bitcamp.homework.task1;

public class Players {
	
	public String name;
	public Integer yearOfBirth;
	public String position;
	
	// Constructor for player
	public Players(String name, Integer yearOfBirth, String position) {
		super();
		this.name = name;
		this.yearOfBirth = yearOfBirth;
		this.position = position;
	}

    // Method toString for output of player
	@Override
	public String toString() {
		return " \n Player name is " + name + ". \n Year of birth is " + yearOfBirth
				+ ". \n Position is " + position + "";
	}
	
	

	
	
	
	
}
