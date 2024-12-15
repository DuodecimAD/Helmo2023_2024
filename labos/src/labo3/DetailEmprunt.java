package labo3;

public class DetailEmprunt {

	public static void main(String[] args) {

		// Variables
		double capital = 25000, tauxAnnuel = 3.04/100, nbMois = 240, tauxMensuel, mensualite, soldeAnnee, totalRembourse, interetRembourse, totalRembourse1, totalRembourse2;
		//double capital, tauxAnnuel, nbMois, tauxMensuel;

		// Acquisition
		/*
		capital = Console.lireDouble("Capital ? ");
		tauxAnnuel = Console.lireDouble("Taux annuel en % ? ");
		nbMois = Console.lireDouble("Durée en années ? ")*12;
		*/

		// Traitement
		tauxMensuel = Emprunt.calculerTauxMensuel(tauxAnnuel);
		mensualite = Emprunt.calculerMensualite(capital, nbMois, tauxMensuel);


		// Affichage

		System.out.printf("\n%-22s = %.5f%%", "Taux d'intrêt mensuel", tauxMensuel*100);
		System.out.printf("\n%-22s = %8.0f EUR", "Nombre de paiements", nbMois);
		System.out.printf("\n%-22s = %8.2f EUR", "Remboursement mensuel", mensualite);

		System.out.printf("\n\n%-22s = %8.2f EUR", "Capital à emprunter", capital);
		System.out.printf("\n%-22s = %8.2f EUR", "Total remboursé", mensualite*nbMois);
		System.out.printf("\n%-22s = %8.2f EUR", "Intérêts prêt", mensualite*nbMois-25000);

		System.out.println("\n\nAnnée 1 : ");
		soldeAnnee = Emprunt.calculerSoldeCapital(mensualite, (int)nbMois-12, tauxMensuel);
		totalRembourse = capital-soldeAnnee;
		totalRembourse1  = capital-soldeAnnee;
		interetRembourse = (mensualite*12)-(capital-soldeAnnee);
		afficherBilanAnnee(soldeAnnee, totalRembourse, interetRembourse);

		System.out.println("\n\nAnnée 2 : ");
		soldeAnnee = Emprunt.calculerSoldeCapital(mensualite, (int)nbMois-24, tauxMensuel);
		totalRembourse = capital-soldeAnnee-totalRembourse1;
		totalRembourse2 = capital-soldeAnnee-totalRembourse1;
		interetRembourse = (mensualite*12)-(capital-soldeAnnee-totalRembourse1);
		afficherBilanAnnee(soldeAnnee, totalRembourse, interetRembourse);

		System.out.println("\n\nAnnée 3 : ");
		soldeAnnee = Emprunt.calculerSoldeCapital(mensualite, (int)nbMois-36, tauxMensuel);
		totalRembourse = capital-soldeAnnee-totalRembourse1-totalRembourse2;

		interetRembourse = (mensualite*12)-(capital-soldeAnnee-totalRembourse1-totalRembourse2);
		afficherBilanAnnee(soldeAnnee, totalRembourse, interetRembourse);

	}

	private static void afficherBilanAnnee(double soldeAnnee, double totalRembourse, double interetRembourse) {

		System.out.printf("%-22s = %8.2f EUR", "Solde du capital", soldeAnnee);
		System.out.printf("\n%-22s = %8.2f EUR", "Total remboursé", totalRembourse);
		System.out.printf("\n%-22s = %8.2f EUR", "Intérêts remboursés", interetRembourse);

	}

}
