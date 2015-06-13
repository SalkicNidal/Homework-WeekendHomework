package ba.bitcamp.homework.task1;

public class main {

	/**
	 * Method which return youngest player at team
	 * 
	 * @param t
	 *            - Looking team
	 * @return - Youngest player at team
	 */
	public static Players getYoungestPlayer(Team t) {
		int min = t.player[0].yearOfBirth;
		Players youngest = t.player[0];
		for (int i = 1; i < t.player.length; i++) {
			if (t.player[i].yearOfBirth > min) {
				min = t.player[i].yearOfBirth;
				youngest = t.player[i];
			}
		}
		return youngest;

	}

	/**
	 * Calculated number of player at same position
	 * 
	 * @param t
	 *            - Array of team
	 * @param position
	 *            - Checking position
	 * @return - Number of same position
	 */
	public static int countPlayers(Team t, String position) {
		int counter = 0;
		for (int i = 0; i < t.player.length; i++) {
			if (t.player[i].position.equals(position)) {
				counter++;
			}
		}
		return counter;
	}

	/**
	 * Method which calculated number of player same of year of birth
	 * 
	 * @param t
	 *            - Class team
	 * @param year
	 *            - Integer testing year
	 * @return - Number of same year player
	 */
	public static int countPlayers(Team t, int year) {
		int counter = 0;
		for (int i = 0; i < t.player.length; i++) {
			if (t.player[i].yearOfBirth == year) {
				counter++;
			}
		}
		return counter;
	}

	public static void main(String[] args) {

		// Declaration of players to team one
		Players[] team1 = new Players[8];
		team1[0] = new Players("Dzeko", 1980, "Forward");
		team1[1] = new Players("Pogba", 1979, "Midfield");
		team1[2] = new Players("Pjanic", 1988, "Midfield");
		team1[3] = new Players("Marcelo", 1980, "Deffender");
		team1[4] = new Players("Begovic", 1992, "Goalkepeer");
		team1[5] = new Players("Totti", 1990, "Forward");
		team1[6] = new Players("Di Maria", 1987, "Forward");
		team1[7] = new Players("Visca", 1987, "Forward");

		// Declaration team one with players and team name
		Team t1 = new Team("Gliders team", team1);

		// Declaration of players to team two
		Players[] team2 = new Players[8];
		team2[0] = new Players("Benko", 1981, "Forward");
		team2[1] = new Players("Stojcev", 1979, "Midfield");
		team2[2] = new Players("Cimirot", 1981, "Midfield");
		team2[3] = new Players("Tatomirovic", 1981, "Deffender");
		team2[4] = new Players("Delac", 1992, "Goalkepeer");
		team2[5] = new Players("Velkoski", 1999, "Forward");
		team2[6] = new Players("Radovac", 1982, "Midfield");
		team2[7] = new Players("Duljevic", 1980, "Forward");

		// Declaration team two with players and team name
		Team t2 = new Team("FK Sarajevo", team2);
		
		// Calculated number of same year of birth with method
		System.out.print("Number of players at same year of birth is: ");
		System.out.println(countPlayers(t1, 1980));

		// Calculated number of same position with method
		System.out.print("Number of players at same position is: ");
		System.out.println(countPlayers(t1, "Midfield"));
		
		// Finding youngest player at team with method
		System.out.print("Youngest player from team   ");
		System.out.println(getYoungestPlayer(t1));
	}

}
