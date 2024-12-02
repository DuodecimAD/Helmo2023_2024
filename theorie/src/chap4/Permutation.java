package chap4;

import io.Console;

/**
 * Programme qui perment de permuter 2 variables
 */
public class Permutation {

	public static void main(String[] args) {

		// Variables
		String ch1, ch2, temp;

		// Acquisition du prénom
		ch1 = Console.lireString("\nPrénom 1 ? ");
		ch2 = Console.lireString("\nPrénom 2 ? ");

		// Traitement
		temp = ch1;
		ch1 = ch2;
		ch2 = temp;

		// Afficher le résultat
		System.out.printf("\nch1=%s et ch2=%s\n", ch1, ch2);

	}

}