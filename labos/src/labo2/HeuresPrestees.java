package labo2;

import io.Console;

public class HeuresPrestees {

	static final double TAUX_RENUMERATION = 128.5;

	public static void main(String[] args) {

		// Variables
		String lundi, mardi, mercredi, jeudi, vendredi;
		double result = 0, totalTime = 0, totalHeure = 0, totalMinute = 0;

		// Acquisition
		lundi = Console.lireString("Lundi ? ");
		mardi = Console.lireString("Mardi ? ");
		mercredi = Console.lireString("Mercredi ? ");
		jeudi = Console.lireString("Jeudi ? ");
		vendredi = Console.lireString("Vendredi ? ");

		// Traitement
		result = calcul(lundi);
		result += calcul(mardi);
		result += calcul(mercredi);
		result += calcul(jeudi);
		result += calcul(vendredi);

		totalTime = result/TAUX_RENUMERATION*60;
		totalHeure = totalTime / 60;
		totalMinute =  totalTime % 60;

		// Affichage des résultats
		System.out.printf(" temps en minutes : " + totalTime);
		System.out.printf("\nDurée Hebdomadaire = %.0fh %.0fmin", totalHeure, totalMinute);
		System.out.printf("\nMontant à facturer = %.2f EUR\n", result);

	}


	public static double calcul(String day){

		int taille = 0, heure = 0, minute = 0;
		double time = 0;

		taille = day.length();

		if(taille == 5){
			heure = Integer.parseInt(day.substring(0,2));
			minute = Integer.parseInt(day.substring(3));
		}else if(taille == 3){
			heure = Integer.parseInt(day.substring(0,1));
			minute = Integer.parseInt(day.substring(2));
		}else if(taille == 4){
			if(day.indexOf(":") == 1){
				heure = Integer.parseInt(day.substring(0,1));
				minute = Integer.parseInt(day.substring(2));
			}else{
				heure = Integer.parseInt(day.substring(0,2));
				minute = Integer.parseInt(day.substring(3));
			}
		}else{
			System.out.println("Learn to read, don't forget the ':' between hour and minute");
		}


		time = heure * 60.0 + minute;
		//System.out.println(time);
		return time / 60.0 * TAUX_RENUMERATION;


	}
}