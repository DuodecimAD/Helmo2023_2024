package labo2;

import io.Console;

public class Telechargement {

	public static void main(String[] args) {

		// Variables
		double heures = -1;
		double min = -1;
		double sec = -1;
		boolean big = false;
		double result;

		// Acquisition
		double fichier = Console.lireDouble("\nTaile du fichier en Mo ? ");
		double vitesse = Console.lireDouble("\nDébit en Mbps ? ");

		// Traitement
		result = fichier * 8 / vitesse;

		if (result >= 3600){
			heures = (int)result / 3600;
			result = result % 3600;
			big = true;
		}

		min = (int)result / 60;
		sec = result % 60;

		// Affichage des résultats
		if(!big){
			System.out.printf("\nDurée du téléchargement estimée à %.0fmin %.0fs\n", min, sec);
		}else{
			System.out.printf("\nDurée du téléchargement estimée à %.0fh %.0fmin %.0fs\n", heures, min, sec);
		}
	}
}