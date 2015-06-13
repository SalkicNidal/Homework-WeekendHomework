package ba.bitcamp.homework.exercise;

public class Artists {

	public String name;
	public Boolean isGroup;
	public Integer yearOfStart;
	public String type;
	
	// Constructor for Artists
	public Artists(String name, Boolean isGroup, Integer yearOfStart,
			String type) {
		super();
		this.name = name;
		this.isGroup = isGroup;
		this.yearOfStart = yearOfStart;
		this.type = type;
		
		
		
		
		
	}
	// to String 
	public String toString() {
		return "Artists [name=" + name + ", isGroup=" + isGroup
				+ ", yearOfStart=" + yearOfStart + ", type=" + type + "]";
	}
	
	
}