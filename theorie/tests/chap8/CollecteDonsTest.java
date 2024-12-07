package chap8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CollecteDonsTest {

	@Test
	void positionDe_avecValeurPresenteDansTableau() {
		String[] t = new String[] {"Lucas", "Sophie", "Jeanne", "Tobias" };
		assertEquals(0, CollecteDons.positionDe(t, "Lucas"));
		assertEquals(1, CollecteDons.positionDe(t, "sophie"));
		assertEquals(2, CollecteDons.positionDe(t, "Jeanne"));
		assertEquals(3, CollecteDons.positionDe(t, "TOBIAS"));
	}

	@Test
	void positionDe_avecValeurNonPresenteDansTableau() {
		String[] t = new String[] {"Lucas", "Sophie", "Jeanne", "Tobias" };
		assertEquals(-1, CollecteDons.positionDe(t, "Marc"));
		assertEquals(-1, CollecteDons.positionDe(t, "Sophia"));
	}
	
}
