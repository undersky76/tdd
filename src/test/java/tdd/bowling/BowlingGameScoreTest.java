package tdd.bowling;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

import tdd.bowling.BowlingGame;

public class BowlingGameScoreTest {

	@Test
	public void nothing() {
	}

	@Test
	public void gutterGame() {
		BowlingGame game = new BowlingGame();
		
		for (int i = 0; i < 20; i++) {
			game.roll(0);	
		}
		
		assertThat(game.score(), is(0));
	}

}
