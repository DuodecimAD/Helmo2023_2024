package chap9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import chap9.LectureDate;
import io.Console;

class LectureDateTest {

	@Test
	void lireDate_dateAvecFormatCorrect() {
		Console.simulerSaisies("12/5/2023");
		assertArrayEquals(new int[] { 12, 5, 2023 }, LectureDate.lireDate("Date ? "));
	}
	
	@Test
	void lireDate_dateAvecFormatIncorrect() {
		Console.simulerSaisies("12/150/2023", "12/mai/2023", "12/5/2023");
		assertArrayEquals(new int[] { 12, 5, 2023 }, LectureDate.lireDate("Date ? "));
	}

}
