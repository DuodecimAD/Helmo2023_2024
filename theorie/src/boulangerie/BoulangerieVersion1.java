package boulangerie;

public class BoulangerieVersion1 {

	public static void main(String[] args) {
		// Variables pour les quantités
		int nbCroissants, nbPainsChoc, nbBaguettes, nbPains;

		// Variables pour les résultats
		double montantAchats;
		double montantFidelite;

		// Initialisation des données
		nbCroissants = 4;
		nbPainsChoc  = 0;
		nbBaguettes  = 2;
		nbPains      = 1;

		// Traitement des données
		// 1. Calculer le montant total des achats
		montantAchats  = nbCroissants * 1.1;
		montantAchats += nbPainsChoc  * 1.2;
		montantAchats += nbBaguettes  * 1.5;
		montantAchats += nbPains      * 2.5;

		// 2. Calculer le montant à reporter sur la carte de fidélité
		montantFidelite = montantAchats * 0.05;

		// Affichage des résultats
		System.out.println();
		System.out.print("Montant à payer        = ");
		System.out.print(montantAchats);
		System.out.println(" euros");
		System.out.print("Montant carte fidélité = ");
		System.out.print(montantFidelite);
		System.out.println(" euros");
	}

}