package util;

public class Date {
	public static void main(String[] args) {

		int jourDeLaSemaine = Date.jourDeLaSemaine(14,11,2015);

		String jourDeLaSemaineFull = Date.jourDeLaSemaineString(jourDeLaSemaine);


		System.out.printf("\nLe jour de la semaine à la date du 14/11/2015 est un %s.\n", jourDeLaSemaineFull);
	}

	/**
	 *
	 * Récupération du jour de la semaine par rapport à ladate spécifiée.
	 *
	 * @param jour est le numéro du jour entre 1 et 31.
	 * @param mois est le numéro du mois entre 1 et 12.
	 * @param annee est la valeur de l'année, exprimée avec 4 chiffres (ex:2024)
	 *
	 * @return Un entier compris entre 0 et 6 (0 = dimanche, 6 = samedi).
	 *
	 * */

	public static int jourDeLaSemaine(int jour, int mois, int annee){

		int anneeEnCours, a, b, m;

		anneeEnCours = (14 - mois) / 12;
		a = annee - anneeEnCours;
		b = a + a / 4 - a / 100 + a / 400;
		m = mois + 12 * anneeEnCours - 2;
		return (jour + b + 31 * m / 12) % 7;
	}

	/**
	 *
	 * Transformation du jour de la semaine (0 à 6) en mot (dimanche à lundi).
	 *
	 * @param jourDeLaSemaine est le numéro du jour entre 0 et 6.
	 *
	 * @return Une String selon le chiffre en entrée (0 = dimanche, 6 = samedi).
	 *
	 * */

	public static String jourDeLaSemaineString(int jourDeLaSemaine){

		switch(jourDeLaSemaine){
			case 0:
				return "dimanche";
		  	case 1:
		  		return "lundi";
		    case 2:
		  		return "mardi";
		    case 3:
		  		return "mercredi";
		    case 4:
		  		return "jeudi";
		    case 5:
		  		return "vendredi";
		    case 6:
		  		return "samedi";
		  	default:
		  		return "error";
		}
	}
}