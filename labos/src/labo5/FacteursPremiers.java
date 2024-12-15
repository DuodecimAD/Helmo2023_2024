package labo5;

import io.Console;

public class FacteursPremiers {

	public static void main(String[] args) {

		// Variables
		int entier;

		// Acquisitions
		entier = Console.lireInt("Entier >= 2 ? ");
		// Traitement


		// Affichage
		System.out.print("Décomposition de " + entier + " en produit de facteurs premiers = ");
		int counter = 2;
		while (entier > 1) {
			if (entier % counter == 0) {
				entier /= counter;
				System.out.print(counter + " ");
			} else {
				counter++;
			}

		}


	}
}
