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
		int i = 0;
		
		if(rolls[0] + rolls[1] == 10) {
			score = 10 + rolls[2];
			i += 2;
		}
		
		for (; i < rolls .length; i++) {
			score += rolls[i];
		}
		
		return score;
	}

}
