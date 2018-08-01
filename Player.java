package rockPaperScissors;

public abstract class Player {

	private String name;

	//constructor (no return type, has same name as class)
	public Player(String name) {
		super();
		this.name = name;
	}

	//getter
	public String getName() {
		return name;
	}
	
	//return one of ROCK, PAPER, SCISSORS
	abstract public Roshambo generateRoshambo();
	
	// describe how Player class should print out
	public String toString() {
		return name;
	}
}
