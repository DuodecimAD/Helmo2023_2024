package theorie.chap6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import chap6.Shifumi;

class ShifumiTest {

	@Test
	void choisirArmeAleat_pierre() {
		assertEquals("pierre", Shifumi.choisirArmeAleat(0));
		assertEquals("pierre", Shifumi.choisirArmeAleat(0.15));
		assertEquals("pierre", Shifumi.choisirArmeAleat(0.33));
	}
	
	@Test
	void choisirArmeAleat_papier() {
		assertEquals("papier", Shifumi.choisirArmeAleat(0.34));
		assertEquals("papier", Shifumi.choisirArmeAleat(0.4));
		assertEquals("papier", Shifumi.choisirArmeAleat(0.66));
	}
	
	@Test
	void choisirArmeAleat_ciseaux() {
		assertEquals("ciseaux", Shifumi.choisirArmeAleat(1));
		assertEquals("ciseaux", Shifumi.choisirArmeAleat(0.67));
		assertEquals("ciseaux", Shifumi.choisirArmeAleat(0.8));
	}
	
	@Test
	void choisirArmeAleat_random() {
		String arme = new String(Shifumi.choisirArmeAleat()); // prof préfère créer une copie de la string avec new String ???
		
		for (int i = 0; i < 6; i++) {
			assertTrue(arme.equals("pierre") || arme.equals("papier") || arme.equals("ciseaux"));
		}	
	}
	
	@Test
	void choisirArmeAleat_armesDifférentes() {
		String arme = new String(Shifumi.choisirArmeAleat());
		String arme1 = new String(Shifumi.choisirArmeAleat());
		String arme2 = new String(Shifumi.choisirArmeAleat());
		String arme3 = new String(Shifumi.choisirArmeAleat());
		
		assertTrue(!arme.equals(arme1) || !arme1.equals(arme3) || !arme3.equals(arme2));
	
	}

}
