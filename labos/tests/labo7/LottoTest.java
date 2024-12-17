package labo7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LottoTest {

	@Test
	void compterNumerosGagnantsBonusTest() {
		int[] mesNumeros = {5, 13, 14, 21, 36, 44};
		int[] tirage 	 = {7, 12, 14, 21, 36, 44, 5};
		assertArrayEquals(new int[]{4,1}, Lotto.compterNumerosGagnants(tirage, mesNumeros));
	}
	
	@Test
	void compterNumerosGagnantsNoBonusTest() {
		int[] mesNumeros = {5, 13, 14, 21, 36, 44};
		int[] tirage  	 = {7, 12, 14, 31, 36, 44, 12};
		assertArrayEquals(new int[]{3,0}, Lotto.compterNumerosGagnants(tirage, mesNumeros));
	}
	
	@Test
	void determinerRangTest() {
		assertEquals(8, Lotto.determinerRang(new int[]{2,1}));
		assertEquals(4, Lotto.determinerRang(new int[]{4,1}));
		assertEquals(3, Lotto.determinerRang(new int[]{5,0}));
		assertEquals(1, Lotto.determinerRang(new int[]{6,0}));
	}
	
	@Test
	void obtenirGainTest() {
		assertEquals(500000.00, Lotto.obtenirGain(1));
		assertEquals(75000.00, Lotto.obtenirGain(2));
		assertEquals(30.00, Lotto.obtenirGain(5));
		assertEquals(3.00, Lotto.obtenirGain(8));
	}
	

}
