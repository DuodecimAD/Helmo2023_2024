package labo3;

public class Emprunt {

	public static void main(String[] args) {
		double capital = 25000;
		double nbMois = 20 * 12;
		double interet = 3.04 /100;

		//double tauxMensuel = ;

		System.out.println(calculerMensualite(capital, calculerTauxMensuel(interet), nbMois));

	}
	/**
	 *
	 * @param interet : le taux d'emprunt (ex: 3.04% / 100 = 0.0304)
	 * @return : le taux mensuel càd le taux annuel mais par mois ... dunno, don't ask
	 */
	public static double calculerTauxMensuel(double interet) {

		return Math.pow((1 + interet), 1/12.)-1;
	}
	/**
	 *
	 * @param capital : Le montant de l'emprunt
	 * @param nbMois : Le nombre de mois pour l'emprunt
	 * @param tauxMensuel : le taux mensuel càd le taux annuel mais par mois ... dunno, don't ask
	 * @return : la mensualité càd le montant à payer par mois
	 */
	public static double calculerMensualite(double capital, double nbMois, double tauxMensuel) {

		return capital * (tauxMensuel / (1-Math.pow((1+tauxMensuel),-nbMois)));
	}

	/**
	 *
	 * @param mensualite : payement à rembourser par mois
	 * @param nbMoisRestants : nombres de mois restant à rembourser l'emprunt
	 * @param tauxMensuel : le taux mensuel càd le taux annuel mais par mois ... dunno, don't ask
	 * @return : le montant à rembourser selon le nombre de mois restants.
	 */
	public static double calculerSoldeCapital(double mensualite, int nbMoisRestants, double tauxMensuel) {

		return mensualite * ((1-Math.pow(1+tauxMensuel,-nbMoisRestants))/tauxMensuel);
	}

}
