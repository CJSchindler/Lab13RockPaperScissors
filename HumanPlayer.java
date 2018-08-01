package rockPaperScissors;
import java.util.Scanner;

public class HumanPlayer extends Player {
	
	private Scanner scnr; //needs scanner for player to put in choice for what to play

	//constructor (no return type, same name as class)
	public HumanPlayer(String name, Scanner scnr) { //need name and scanner for this class
		super(name); //inherit from super class, name is required in super class so repeated here
		this.scnr = scnr; //define what is not defined in superclass
	}
	
	//every player needs to generate Roshambo
	@Override
	public Roshambo generateRoshambo() { //
		String choice = Validator.getStringMatchingRegex(scnr, "Would you like to play rock, paper, or scissors?", 
				"rock|paper|scissors");
		if (choice.equals("rock")) {
			return Roshambo.ROCK;
		}
		else if (choice.equals("paper")) {
			return Roshambo.PAPER;
		}
		else {
			return Roshambo.SCISSORS;
		}
	}
	
}
