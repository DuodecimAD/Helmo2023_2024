package labo5;

import io.Console;

public class PuissanceDe2 {

	public static void main(String[] args) {

		// Variables
		int expoUser, puissance = 1;

		// Acquisitions
		expoUser = Console.lireInt("Exposant maximum ? ");

		// Traitement


		// Affichage
		System.out.printf("%4s %12s\n", "Exp.", "Puissance");

		for (int i = 0; i <= expoUser; i++) {
			System.out.printf("%4d %12d\n", i, puissance);
			puissance*=2;
		}
	}

}
