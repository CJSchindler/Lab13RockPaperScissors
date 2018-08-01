package rockPaperScissors;

public class RockPlayer extends Player {

	// constructor
	public RockPlayer(String name) {
		super(name);
	}
	
	@Override
	public Roshambo generateRoshambo() {
		return Roshambo.ROCK;
	}
	

}
