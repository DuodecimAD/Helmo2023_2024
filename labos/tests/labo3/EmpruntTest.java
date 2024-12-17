package labo3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;


@TestMethodOrder(OrderAnnotation.class)
class EmpruntTest {

	// Constante

	private static final double MARGE_ERREUR = 1e-3;

	// public static double calculerTauxMensuel(double tauxAnnuel)

	@Test
	@Order(1)
	void calculerTauxMensuel_test1() {
		assertEquals(0.0024987063, Emprunt.calculerTauxMensuel(0.0304), MARGE_ERREUR);
	}

	@Test
	@Order(2)
	void calculerTauxMensuel_test2() {
//		assertEquals(?, Emprunt.calculerTauxMensuel(?), MARGE_ERREUR);
	}

	@Test
	@Order(3)
	void calculerTauxMensuel_test3() {
//		assertEquals(?, Emprunt.calculerTauxMensuel(?), MARGE_ERREUR);
	}

	// public static double calculerMensualite(double capital, int nbMois, double tauxMensuel)

	@Test
	@Order(4)
	void calculerMensualite_test1() {
		assertEquals(138.62997, Emprunt.calculerMensualite(25000.0, 240.0, 0.0024987063), MARGE_ERREUR);
	}

	@Test
	@Order(5)
	void calculerMensualite_test2() {
//		assertEquals(?, Emprunt.calculerMensualite(?), MARGE_ERREUR);
	}

	@Test
	@Order(6)
	void calculerMensualite_test3() {
//		assertEquals(?, Emprunt.calculerMensualite(?), MARGE_ERREUR);
	}

	// public static double calculerSoldeCapital(double mensualite, int nbMoisRestants, double tauxMensuel)

	@Test
	@Order(7)
	void calculerSoldeCapital_test1() {
		assertEquals(24073.3865288, Emprunt.calculerSoldeCapital(138.62997, 228, 0.0024987063), MARGE_ERREUR);
	}

	@Test
	@Order(8)
	void calculerSoldeCapital_test2() {
//		assertEquals(?, Emprunt.calculerSoldeCapital(?), MARGE_ERREUR);
	}

	@Test
	@Order(9)
	void calculerSoldeCapital_test3() {
//		assertEquals(?, Emprunt.calculerSoldeCapital(?), MARGE_ERREUR);
	}

}
