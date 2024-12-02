package eval2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import src.eval2.ExcesVitesse;

class ExcesVitesseTest {

	@Test
	void amende1_10() {
		assertEquals(53, ExcesVitesse.montantAmende(1, false));
		assertEquals(53, ExcesVitesse.montantAmende(10, false));

	}

	@Test
	void amende11_40() {
		assertEquals(59, ExcesVitesse.montantAmende(11, false));
		assertEquals(233, ExcesVitesse.montantAmende(40, false));

	}


	@Test
	void amende41Plus() {
		assertEquals(300, ExcesVitesse.montantAmende(41, false));

	}

	@Test
	void amendeBirthday() {
		assertEquals(0, ExcesVitesse.montantAmende(1, true));
		assertEquals(0, ExcesVitesse.montantAmende(5, true));
	}

	@Test
	void amendeBirthday6_15() {
		assertEquals(53, ExcesVitesse.montantAmende(6, true));
		assertEquals(53, ExcesVitesse.montantAmende(15, true));

	}

	@Test
	void amendeBirthday16_45() {
		assertEquals(59, ExcesVitesse.montantAmende(16, true));
		assertEquals(233, ExcesVitesse.montantAmende(45, true));

	}


	@Test
	void amendeBirthday46Plus() {
		assertEquals(300, ExcesVitesse.montantAmende(46, true));

	}

}
