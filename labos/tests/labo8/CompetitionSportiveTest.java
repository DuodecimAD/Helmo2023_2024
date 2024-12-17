package labo8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CompetitionSportiveTest {

	@Test
	public void testJourneeSuivante4EquipesJ1() {
		String[][] expected = { { "A", "C" }, { "D", "B" } };
		String[] nomsEquipes = { "A", "B", "C", "D" };
		assertArrayEquals(expected, CompetitionSportive.journeeSuivante(nomsEquipes));
	}
	
	@Test
	public void testJourneeSuivante8EquipesJ1() {
		String[][] expected = { { "A", "G" }, { "H", "F" }, {"B", "E"}, {"C", "D"} };
		String[] nomsEquipes = { "A", "B", "C", "D", "E", "F", "G", "H" };
		assertArrayEquals(expected, CompetitionSportive.journeeSuivante(nomsEquipes));
	}
	
	@Test
	public void decalerADroiteTest() {
		String[] expected = { "H", "A", "B", "C", "D", "E", "F", "G" };
		String[] nomsEquipes = { "A", "B", "C", "D", "E", "F", "G", "H" };
		CompetitionSportive.decalerADroite(nomsEquipes);
		assertArrayEquals(expected, nomsEquipes);
	}
	
	@Test
	public void getRencontreTest() {
		String[][] journee = { { "A", "G" }, { "H", "B" }, {"C", "D"}, {"E", "F"} };
		String[] expected = { "C", "D" };
		assertArrayEquals(expected, CompetitionSportive.getRencontre(journee, "C"));
	}
	
	@Test
	public void getRencontreNullTest() {
		String[][] journee = { { "A", "G" }, { "H", "B" }, {"C", "D"}, {"E", "F"} };
		String[] expected = null;
		assertArrayEquals(expected, CompetitionSportive.getRencontre(journee, "azerty"));
	}

}
