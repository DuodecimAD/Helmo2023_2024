package chap9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import chap9.CollecteDonsTab2d;

class CollecteDonsTest {

	@Test
	void positionDe_avecValeurPresenteDansTableau() {
		String[] t = new String[] {"Lucas", "Sophie", "Jeanne", "Tobias" };
		assertEquals(0, CollecteDonsTab2d.positionDe(t, "Lucas"));
		assertEquals(1, CollecteDonsTab2d.positionDe(t, "sophie"));
		assertEquals(2, CollecteDonsTab2d.positionDe(t, "Jeanne"));
		assertEquals(3, CollecteDonsTab2d.positionDe(t, "TOBIAS"));
	}

	@Test
	void positionDe_avecValeurNonPresenteDansTableau() {
		String[] t = new String[] {"Lucas", "Sophie", "Jeanne", "Tobias" };
		assertEquals(-1, CollecteDonsTab2d.positionDe(t, "Marc"));
		assertEquals(-1, CollecteDonsTab2d.positionDe(t, "Sophia"));
	}
	
}
