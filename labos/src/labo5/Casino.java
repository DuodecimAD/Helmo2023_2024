package labo5;

import io.Console;

public class Casino {

	public static void main(String[] args) {

		// Variables
		int miseDepart, montant, gainSouhait, count = 0, win = 0, total;

		// Acquisitions
		miseDepart = Console.lireInt("Mise de départ ? ");
		montant = miseDepart;
		gainSouhait = Console.lireInt("Gains souhaités ? ");
		total = miseDepart + gainSouhait;

		// Traitement
		while(miseDepart > 0 && montant > 0 && montant <= total) {

			if (Math.random() < 0.5) {
				montant++;
				win++;
			} else {
				montant--;
			}
			count++;
		}

		// Affichage
		System.out.printf("Vous avez réussi %d paris sur %d\n", win, count);
		if(montant > 0) {
			System.out.printf("Vous repartez avec %d EUR de plus\n", (montant-miseDepart));
		} else {
			System.out.printf("Vous avez tout perdu ... Betting is bad !");
		}

	}
}
