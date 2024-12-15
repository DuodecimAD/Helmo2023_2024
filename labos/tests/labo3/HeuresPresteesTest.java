package labo3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

class HeuresPresteesTest {

	@Test
	@Order(1)
	void lireHeure_7_15() {
		assertEquals(7, HeuresPrestees.lireHeures("7:15"));
	}

	@Test
	@Order(2)
	void lireHeure_07_5() {
		assertEquals(7, HeuresPrestees.lireHeures("07:5"));
	}

	@Test
	@Order(3)
	void lireHeure_15_3() {
		assertEquals(15, HeuresPrestees.lireHeures("15:3"));
	}

	@Test
	@Order(4)
	void lireMinute_7_15() {
		assertEquals(15, HeuresPrestees.lireMinutes("7:15"));
	}

	@Test
	@Order(5)
	void lireMinute_07_5() {
		assertEquals(5, HeuresPrestees.lireMinutes("07:5"));
	}

	@Test
	@Order(6)
	void lireMinute_5_3() {
		assertEquals(3, HeuresPrestees.lireMinutes("5:03"));
	}

	@Test
	@Order(7)
	void enMinute_7_15() {
		assertEquals(435, HeuresPrestees.enMinutes("7:15"));
	}

	@Test
	@Order(8)
	void enMinute_12_25() {
		assertEquals(745, HeuresPrestees.enMinutes("12:25"));
	}

	@Test
	@Order(9)
	void enMinute_5_3() {
		assertEquals(303, HeuresPrestees.enMinutes("5:03"));
	}


}
