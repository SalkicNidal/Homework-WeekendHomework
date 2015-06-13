package ba.bitcamp.homework.task1;

import java.util.Arrays;

public class Team {
	
	public String name;
	public Players[] player;
	
	// Constructor for team
	public Team(String name, Players[] player) {
		super();
		this.name = name;
		this.player = player;
	}
    
	// Method toString for output for team
	@Override
	public String toString() {
		return "Team name is " + name + ". \n " + Arrays.toString(player)
				+ ".";
	}
	
	
	
	

}
