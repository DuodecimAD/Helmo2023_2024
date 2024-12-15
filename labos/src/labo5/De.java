package labo5;

import io.Console;
import util.Aleatoire;

public class De {

	public static void main(String[] args) {

		// Variables
		int numberPicked, numberAleat, count = 0;

		// Acquisitions
		numberPicked = Console.lireInt("Nombre de 1 à 6 ? ");

		// Traitement + Affichage

		do {
			numberAleat = Aleatoire.aleatoire(1, numberPicked);

			System.out.println(numberAleat);
			count++;
		} while (numberAleat != numberPicked);

		System.out.println("Nombre de lancés = " + count);

	}

}
