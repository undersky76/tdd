package tdd.bowling;

import static org.junit.Assert.*;

import org.junit.Before;

import static org.hamcrest.Matchers.*;

import org.junit.Test;

import tdd.bowling.BowlingGame;

public class BowlingGameScoreTest {

	private BowlingGame game;

	@Before
	public void setUp() {
		game = new BowlingGame();
	}

	public void rollMany(int rollCount, int pins) {
		for (int i = 0; i < rollCount; i++) {
			game.roll(pins);	
		}
	}

	@Test
	public void nothing() {
	}

	@Test
	public void gutterGame() {
		rollMany(20, 0);
		assertThat(game.score(), is(0));
	}

	@Test
	public void oneGame() {
		game.roll(1);
		rollMany(19, 0);
		assertThat(game.score(), is(1));
	}
}
