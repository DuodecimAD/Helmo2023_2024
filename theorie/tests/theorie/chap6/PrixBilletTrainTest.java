package theorie.chap6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import chap6.PrixBilletTrain;

class PrixBilletTrainTest {

	@Test
	void tauxReduction_cat_bebe_0_2() {
		assertEquals(1.0, PrixBilletTrain.tauxReduction(0));
		assertEquals(1.0, PrixBilletTrain.tauxReduction(1));
		assertEquals(1.0, PrixBilletTrain.tauxReduction(2));
	}
	
	@Test
	void tauxReduction_cat_enfant_3_11() {
		assertEquals(0.5, PrixBilletTrain.tauxReduction(3));
		assertEquals(0.5, PrixBilletTrain.tauxReduction(7));
		assertEquals(0.5, PrixBilletTrain.tauxReduction(11));
	}
	
	@Test
	void tauxReduction_cat_étudiant_12_25() {
		assertEquals(0.2, PrixBilletTrain.tauxReduction(12));
		assertEquals(0.2, PrixBilletTrain.tauxReduction(18));
		assertEquals(0.2, PrixBilletTrain.tauxReduction(25));
	}
	
	@Test
	void tauxReduction_cat_adulte_26_64() {
		assertEquals(0.0, PrixBilletTrain.tauxReduction(26));
		assertEquals(0.0, PrixBilletTrain.tauxReduction(50));
		assertEquals(0.0, PrixBilletTrain.tauxReduction(64));
	}
	
	@Test
	void tauxReduction_cat_retraité_65_129() {
		assertEquals(0.5, PrixBilletTrain.tauxReduction(65));
		assertEquals(0.5, PrixBilletTrain.tauxReduction(65));
		assertEquals(0.5, PrixBilletTrain.tauxReduction(130));
	}
	
	@Test
	void tauxReduction_cat_irreel_min0_130plus() {
		assertEquals(Double.NaN, PrixBilletTrain.tauxReduction(-1));
		assertEquals(Double.NaN, PrixBilletTrain.tauxReduction(131));
	}

}
