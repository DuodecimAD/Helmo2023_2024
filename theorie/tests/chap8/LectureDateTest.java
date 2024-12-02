package chap8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import io.Console;

class LectureDateTest {

	@Test
	void test() {
		Console.simulerSaisies("12/03/1984");
		int[] dateAttendue = new int[] {12,3,1984};
		int[] dateObtenue = LectureDate.lireDate("date ? ");
		assertArrayEquals(dateAttendue, dateObtenue);
		
	}

}
