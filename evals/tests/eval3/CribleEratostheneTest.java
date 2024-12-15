package eval3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class CribleEratostheneTest {

	@Test
	void eliminerMultiplesDe2() {
		
		boolean[] array = new boolean[17];
		array[0] = false;
		array[1] = false;
		Arrays.fill(array,2,17, true);
		CribleEratosthene.eliminerMultiples(array, 17);
		boolean[] tabAttendu  = {false, false, true, true, false, true, false, true, false, false, false, true, false, true, false, false, false};
		
		assertArrayEquals(tabAttendu, array);
	}

}
