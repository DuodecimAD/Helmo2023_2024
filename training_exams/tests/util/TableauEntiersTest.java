package util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TableauEntiersTest {

	@Test
	void test() {
		assertEquals(20, TableauEntiers.sommer(new int[] {3,12,5}));
		assertEquals(0, TableauEntiers.sommer(new int[] {}));
	}

}
