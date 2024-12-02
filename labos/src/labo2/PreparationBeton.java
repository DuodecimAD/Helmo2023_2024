package labo2;

import io.Console;

public class PreparationBeton {

	// Variables finales : quantités de matériaux pour 1 m³ de béton
	static final double CIMENT = 350;
	static final double SABLE = 766;
	static final double GRAVIERS = 1149;
	static final double EAU = 175;

	public static void main(String[] args) {

		// Variables
		double dalleLongueur, dalleLargeur, dalleHauteur, dimensions,
		calculCiment, calculSable, calculGraviers, calculEau;

		// Acquisition
		dalleLongueur = Console.lireDouble("Longueur (en m) ? ");
		dalleLargeur = Console.lireDouble("Largeur  (en m) ? ");
		dalleHauteur = Console.lireDouble("Hauteur  (en m) ? ");

		// Traitement
		dimensions = dalleLongueur * dalleLargeur * dalleHauteur;
		calculCiment = CIMENT * dimensions;
		calculSable = SABLE * dimensions;
		calculGraviers = GRAVIERS * dimensions;
		calculEau = EAU * dimensions;

		// Affichage
		System.out.printf("\nDosage pour %.1f m³ de béton : \n", dimensions);
		System.out.printf(" - %.1f kg de ciment\n", calculCiment);
		System.out.printf(" - %.13f kg de sable\n", calculSable);
		System.out.printf(" - %.1f kg de graviers\n", calculGraviers);
		System.out.printf(" - %.1f L d'eau\n", calculEau);

	}
}
