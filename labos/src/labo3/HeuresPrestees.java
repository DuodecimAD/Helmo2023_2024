package labo3;

import io.Console;

public class HeuresPrestees {

	static final double TAUX_RENUMERATION = 128.5;

	public static void main(String[] args) {

		// Variables
		String lundi, mardi, mercredi, jeudi, vendredi;
		double totalTime = 0, totalHeure = 0, totalMinute = 0;

		// Acquisition
		lundi = Console.lireString("Lundi ? ");
		mardi = Console.lireString("Mardi ? ");
		mercredi = Console.lireString("Mercredi ? ");
		jeudi = Console.lireString("Jeudi ? ");
		vendredi = Console.lireString("Vendredi ? ");

		// Traitement
		totalTime = enMinutes(lundi);
		totalTime += enMinutes(mardi);
		totalTime += enMinutes(mercredi);
		totalTime += enMinutes(jeudi);
		totalTime += enMinutes(vendredi);

		totalHeure = totalTime / 60;
		totalMinute =  totalTime % 60;

		// Affichage des résultats
		System.out.printf("\nTemps en minutes : " + totalTime);
		System.out.printf("\nDurée Hebdomadaire = %.0fh %.0fmin", totalHeure, totalMinute);
		System.out.printf("\nMontant à facturer = %.2f EUR\n", totalTime/60*TAUX_RENUMERATION);

	}

	public static int lireHeures(String day) {
		return Integer.parseInt(day.substring(0,day.indexOf(":")));
	}

	public static int lireMinutes(String day) {
		return Integer.parseInt(day.substring(day.indexOf(":")+1));
	}

	public static int enMinutes(String hhmm) {
		int heures = lireHeures(hhmm);
		int minutes = lireMinutes(hhmm);

		return (heures*60) + minutes;
	}

}