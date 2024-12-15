package labo4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DateTest {

	@Test
	void test() {
		assertEquals(31, Date.joursParMois(03, 1984));
		assertEquals(29, Date.joursParMois(02, 2000));
		assertEquals(28, Date.joursParMois(02, 2001));
	}

}
