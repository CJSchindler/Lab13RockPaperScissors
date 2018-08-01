package rockPaperScissors;

import java.util.Scanner;

public class RockPaperScissorsApp {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		Player challenger1;
		String result = "";
		int win = 0, loss = 0, draw = 0;
		
		System.out.println("Let's play Rock Paper Scissors!\n");
		
		//create user as a human player
		String humanName = Validator.getString(scnr, "Please enter your name: ");
		HumanPlayer human = new HumanPlayer(humanName, scnr); //needs the scanner to generate a rock, paper, scissors choice
		
		while (true) {
			// allow user to choose a challenger to play against
			int opponent = Validator.getInt(scnr, "\nSelect your opponent: 1 or 2: ", 1, 2);
			
			// create a challenger player to be used in the playTheGame method
			if (opponent == 1 ) { //set up challenger based on user's choice
				challenger1 = new RandomPlayer("Randy");
				System.out.println("\nYou have selected Randy.\n");
				break;
			}
			else {
				challenger1 = new RockPlayer("Rocky");
				System.out.println("\nYou have selected Rocky.\n");
				break;
			}
		}
			
		//Game loop structure
		String cont = "y"; //keeps track of whether the player will continue or not
		do {
			
			result = playTheGame(human, challenger1);
			if (result.equals("draw")) {
				draw++;
			}
			else if (result.equals("win")) {
				win++;
			}
			else {
				loss++;
			}
			cont = Validator.getString(scnr, "\nWould you like to play again? (y/n) ");
			
		} while (cont.matches("[yY].*"));
		
		System.out.println("Here are your final scores: ");
		System.out.println("Wins: " + win + " Losses: " + loss + " Draws: " + draw);
		System.out.println("\nThanks for playing! Goodbye.");
			
		}
		
	private static String playTheGame(HumanPlayer human, Player challenger) {
		Roshambo input = human.generateRoshambo();
		
		Roshambo computerOutput = challenger.generateRoshambo();
		
		System.out.println("\nYou played " + input);
		System.out.println(challenger + " played " + computerOutput);
		System.out.println();
		
		return showTheScore(input, computerOutput);
		
		
	}

		private static String showTheScore(Roshambo input, Roshambo computerOutput) {

			if (input == computerOutput) {
				System.out.println("It's a tie!");
				return "draw";
			} else if ((input == Roshambo.ROCK && computerOutput == Roshambo.SCISSORS) ||
						(input == Roshambo.PAPER && computerOutput == Roshambo.ROCK) ||
						(input == Roshambo.SCISSORS && computerOutput == Roshambo.PAPER)) {
				System.out.println("You win!");
				return "win";
			}
			else {
				System.out.println("Sorry, you lose!");
				return "loss";
			}
			 
		}

}
