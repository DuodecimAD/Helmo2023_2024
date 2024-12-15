package labo3;

import io.Console;

/**
 * Simulation d'un emprunt basé sur le montant initial, le nombre d'années et l'intérêt de l'emprunt.
 */
public class SimulationEmprunt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Variables
		double capital;
		double interet;
		double moisMensualite1;
		double moisMensualite2;
		double tauxMensuel;
		double mensualite1;
		double mensualite2;

		// Acquisition
		capital = Console.lireDouble("Capital ? ");
		interet = Console.lireDouble("Taux annuel en % ? ");
		moisMensualite1 = Console.lireDouble("Durée 1 en années ? ");
		moisMensualite2 = Console.lireDouble("Durée 2 en années ? ");

		// Traitement
		interet = interet/100;
		moisMensualite1 = moisMensualite1*12;
		moisMensualite2 = moisMensualite2*12;
		tauxMensuel = Emprunt.calculerTauxMensuel(interet);
		mensualite1 = Emprunt.calculerMensualite(capital, moisMensualite1, tauxMensuel);
		mensualite2 = Emprunt.calculerMensualite(capital, moisMensualite2, tauxMensuel);

		// Affichage
		System.out.printf("\n%-22s = %8.2f EUR\n", "Capital à emprunter", 	capital);
		System.out.printf("%-22s = %.5f%%\n", "Taux d'intérêt mensuel",	tauxMensuel*100 );

		System.out.println("\nSur 15 ans : ");
		afficherSimulationEmprunt(capital, moisMensualite1, mensualite1);
		System.out.println("\nSur 20 ans : ");
		afficherSimulationEmprunt(capital, moisMensualite2, mensualite2);
	}

	/**
	 * Permet d'afficher le nombre de paiements, le remboursement mensuel, le total remboursé et les intérêts du prêt..
	 *
	 * @param capital : Le montant de départ.
	 * @param moisMensualite : la période en mois.
	 * @param mensualite : le montant par mois à payer.
	 */
	private static void afficherSimulationEmprunt(double capital, double moisMensualite, double mensualite) {

		System.out.printf("%-22s = %.0f\n", "Nombre de paiements", 			moisMensualite);
		System.out.printf("%-22s = %8.2f EUR\n", "Remboursement mensuel", 	mensualite);
		System.out.printf("%-22s = %8.2f EUR\n", "Total remboursé",			mensualite*moisMensualite);
		System.out.printf("%-22s = %8.2f EUR\n", "Intérêts prêt", 			mensualite*moisMensualite-capital);
	}

}
