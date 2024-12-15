package labo2;

import io.Console;

public class VenteVoiture {

	public static void main(String[] args) {

		// Variables
		final double TAUX_TVA = 0.21;
		final double TAUX_REDUCTION = 0.03;

		double htva;
		double tva;
		double remise;
		double montantFinal;

		// Acquisition
		htva = Console.lireDouble("\nMontant HTVA de la voiture ? ");

		// Traitement
		tva = htva * TAUX_TVA;
		remise = (htva + tva) * TAUX_REDUCTION;
		montantFinal = htva + tva - remise;

		// Affichage des résultats
		System.out.printf("\nMontant de la TVA \t=\t %10.4f EUR", tva);
		System.out.printf("\nMontant de la remise \t=\t %10.4f EUR", remise);
		System.out.printf("\nMontant final \t\t=\t %10.4f EUR\n", montantFinal);

		// %d  = 2
		// %2d = _2
		// %4d = ___2
		// %04 = 0002

		// %s = string
		// %d = integer
		// %f = double
		System.out.println(System.getProperty("file.encoding"));
	}
}