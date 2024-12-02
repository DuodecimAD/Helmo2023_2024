package labo2;

import io.Console;

public class AgeChien {

	public static void main(String[] args) {

		// Variables
		String nomChien;
		double ageChien;
		double result;

		// Acquisition
		nomChien = Console.lireString("\nNom de votre chien ? ");
		ageChien = Console.lireDouble("\nSon âge (en années) ? ");

		// Traitement
		result = 16 * Math.log(ageChien) + 31;

		// Affichage des résultats
		System.out.printf("\n%s aurait %.0f an(s) s'il était un humain.\n", nomChien, result);

		// %d  = 2
		// %2d = _2
		// %4d = ___2
		// %04 = 0002

		// %s = string
		// %d = integer
		// %f = double
	}
}