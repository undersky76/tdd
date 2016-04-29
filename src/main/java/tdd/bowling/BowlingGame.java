package tdd.bowling;

public class BowlingGame {

	private int[] rolls = new int[21];
	private int rollCount = 0;

	public void roll(int pins) {
		rolls[rollCount] = pins;
		rollCount++;
	}

	public int score() {
		int score = 0;
		
		for (int i = 0; i < rolls .length; i++) {
			score += rolls[i];
		}
		
		return score;
	}

}
