package labo5;

import io.Console;

public class FizzBuzzVariante {

	public static void main(String[] args) {

		// Variables
		int lastNumber;

		// Acquisitions
		lastNumber = Console.lireInt("Dernier nombre ? ");

		// Traitement


		// Affichage
		for (int i = 1; i <= lastNumber; i++) {

			if (contientChiffre(i,3) && contientChiffre(i,5)) {
				System.out.print("fizzbuzz");
			} else if (contientChiffre(i,3)) {
				System.out.print("fizz");
			} else if (contientChiffre(i,5)) {
				System.out.print("buzz");
			} else {
				System.out.print(i);
			}

			if(i != lastNumber) {
				System.out.print(", ");
			}
		}

	}

	public static boolean contientChiffre(int nombre, int chiffre) {
		String sNombre = Integer.toString(nombre), sChiffre = Integer.toString(chiffre);


		int count;

		for (int i = 0; i < sNombre.length(); i++) {

			if(String.valueOf(sNombre.charAt(i)).equals(sChiffre)) {
				return true;
			}
		}

		return false;

	}
}
