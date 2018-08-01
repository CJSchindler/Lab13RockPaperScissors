package rockPaperScissors;

public class RandomPlayer extends Player {

	//constructor, needs name
	public RandomPlayer(String name) {
		super(name);
	}

	@Override
	public Roshambo generateRoshambo() {
//		int random = (int) Math.random() * 3 +1; //generate a random number
		int rIndex = (int) (Math.random() * 3); //generate a random number between 0 and 2, then cast to int
		
		return Roshambo.values().clone()[rIndex];
		
//		switch (random) { // take the random number we just generated, and assign a roshambo result to each result
//			case 1:
//				return Roshambo.ROCK;
//			case 2:
//				return Roshambo.PAPER;
//			case 3:
//				return Roshambo.SCISSORS;
//			default:
//				return null;
//		}
	}

}
