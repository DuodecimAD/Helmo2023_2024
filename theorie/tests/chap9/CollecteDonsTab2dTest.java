package chap9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CollecteDonsTab2dTest {

	@Test
	void sommerLignes() {
		int[][] tab2d = {{5,10}, {}, {20}, {15,10,20}};
		
		int[] tabAttendu  = { 15, 0, 20, 45};
		CollecteDonsTab2d.sommerLignes(tab2d);
		assertArrayEquals(tabAttendu, CollecteDonsTab2d.sommerLignes(tab2d));

	}

	
}
