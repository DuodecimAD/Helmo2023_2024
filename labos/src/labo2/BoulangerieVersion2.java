package labo2;

import io.Console;

public class BoulangerieVersion2 {

	public static void main(String[] args) {
		// Constantes
		final double PU_CROISSANTS        = 1.1;
		final double PU_PAIN_CHOC         = 1.2;
		final double PU_BAGUETTE          = 1.5;
		final double PU_PAIN              = 2.5;
		final double POURCENTAGE_FIDELITE = 0.05;

		// Variables pour l'acquisition des quantités
		int nbCroissants, nbPainsChoc, nbBaguettes, nbPains;

		// Variables pour les résultats
		double montantAchats, montantFidelite;

		// Acquisition des quantités
		System.out.print("Croissants ? ");
		nbCroissants = Console.lireInt();

		System.out.print("Pains au chocolat ? ");
		nbPainsChoc = Console.lireInt();

		System.out.print("Baguettes ? ");
		nbBaguettes = Console.lireInt();

		System.out.print("Pains ? ");
		nbPains = Console.lireInt();

		// Traitement des données
		// 1. Calculer le montant total des achats
		montantAchats  = nbCroissants * PU_CROISSANTS;
		montantAchats += nbPainsChoc  * PU_PAIN_CHOC;
		montantAchats += nbBaguettes  * PU_BAGUETTE;
		montantAchats += nbPains      * PU_PAIN;

		// 2. Calculer le montant à reporter sur la carte de fidélité
		montantFidelite = montantAchats * POURCENTAGE_FIDELITE;

		// Affichage des résultats
		System.out.println();
		System.out.printf("Montant des achats       = %.2f euros\n", montantAchats);
		System.out.printf("Montant pour la cagnotte = %.2f euros\n", montantFidelite);
	}

}
