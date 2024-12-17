package labo5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class MatchDeTennisTest {

	@Test
	void test() {
		assertEquals(" 0", MatchDeTennis.getScore(0));
		assertEquals("15", MatchDeTennis.getScore(1));
		assertEquals("30", MatchDeTennis.getScore(2));
		assertEquals("40", MatchDeTennis.getScore(3));
		assertEquals(" A", MatchDeTennis.getScore(4));
		assertEquals(" ?", MatchDeTennis.getScore(5));
		assertEquals(" ?", MatchDeTennis.getScore(-1));
	}

}
