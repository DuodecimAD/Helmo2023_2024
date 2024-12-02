package chap4;

import io.Console;

/**
 * Programme qui perment d'afficher un message personnalisé à l'utilisateur (ex : "Bienvenue Marc !")
 */
public class FormaterPrenom {

	public static void main(String[] args) {

		// Variables
		String surname;
		String message;
		String cleanSurname;

		// Acquisition du prénom
		surname = Console.lireString("\nComment t'appelles-tu ? ");

		// Traitement
		cleanSurname = surname.substring(0,1).toUpperCase();
		cleanSurname += surname.substring(1).toLowerCase();
		message = String.format("\nBienvenue %s !", cleanSurname);

		// Afficher le résultat
		System.out.println(message);

	}

}