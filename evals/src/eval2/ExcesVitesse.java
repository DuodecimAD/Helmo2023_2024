package eval2;

import io.Console;

public class ExcesVitesse {

	static final int AMENDE_TYPE_1_A_10 = 53;
	static final int AMENDE_TYPE_11_A_40_TRANCHE = 6;
	static final int AMENDE_TYPE_41_PLUS = 300;

	public static void main(String[] args) {

		// Variables
		int vitesseMax, vitesseCar;

		// Acquisition
		vitesseMax = Console.lireInt("Limitation de vitesse (en km/h) ? ");
		vitesseCar = Console.lireInt("Vitesse du véhicule (en km/h) ? ");

		// Traitement


		// Affichage
		System.out.printf("Amende normale = %d euros.", montantAmende((vitesseCar - vitesseMax), false));
		System.out.printf("Amende le jour de l'anniversaire = %d euros.",
				montantAmende((vitesseCar - vitesseMax), true));

	}

	/**
	 *
	 * @param excesVistesse Vitesse maximale à l'endroit où l'automobiliste a été flashé.
	 * @param anniversaire Jour d'anniversaire de l'automibiliste ou non.
	 * @return Montant de l'amende
	 */
	public static int montantAmende(int excesVistesse, boolean anniversaire) {

		// Si anniversaire, on enlève directement 5 km/h à la vitesse atteinte
		// pour ne pas doubler le nombre de if

		if (anniversaire) {
			excesVistesse = excesVistesse - 5;
		}

		if (excesVistesse > 0 && excesVistesse <= 10) {
			return AMENDE_TYPE_1_A_10;
		} else if (excesVistesse > 10 && excesVistesse <= 40) {
			excesVistesse = excesVistesse - 10;
			return AMENDE_TYPE_1_A_10 + (AMENDE_TYPE_11_A_40_TRANCHE * excesVistesse);
		} else if (excesVistesse > 40) {
			return AMENDE_TYPE_41_PLUS;
		} else {
			return 0;
		}
	}

}
