public class main {

	public static void main(String[] args) {
		System.err.println("******  TIC TAC GAME *******");
		boolean test = false;
		// Declaration of char matrix using method
		char[][] matrix = Game.fillCharMatrix();
		// Print the matrix with frame using method
		Game.printCharMatrix(matrix);
		// Declaration of counter for player change
		int counter = 1;
		// Declaration of symbol
		char sim = Game.symbolOfPlayer(counter);
		// Code for start gaming
		while (true) {
			if (Game.outOfEmptyPlace(matrix) == false) {
				// Declaration of symbol of player depending of counter
				sim = Game.symbolOfPlayer(counter);
				// Playing game with method
				test = Game.playingTheGame(matrix, sim);
				// Testing whether any of the players wins and break a program
				if (test == true) {
					Game.printCharMatrix(matrix);
					System.err
							.println("///  PLAYER " + sim + " IS WINNER  ///");
					break;
				} else {
					// Anyways print the matrix with the match move
					Game.printCharMatrix(matrix);
					counter++;
				}

			} else {
				System.out.println(" Game is draw ");
				break;
			}
		}
	}

}
