package labo4;

import io.Console;
import io.Fichier;

public class Authentification {

	public static void main(String[] args) {

		// Variables
		String utilisateur = null, password;
		Boolean testIfExist;

		// Acquisition
		utilisateur = Console.lireString("Nom utilisateur ? ").toLowerCase().trim();
		password = Console.lireString("Mot de passe ? ");

		// Traitement / affichage
		testIfExist = Fichier.contientCle("data/authentification.txt", utilisateur);

		if (!testIfExist) {
			System.out.printf("Données incorrectes ! Veuillez réessayer...");
		} else if (Fichier.lireString("data/authentification.txt", utilisateur).equals(password)) {
			System.out.printf("Bienvenue %s ! Vous êtes maintenant connecté\n",
					utilisateur.substring(0, 1).toUpperCase() + utilisateur.substring(1));
		} else {
			System.out.printf("Données incorrectes ! Veuillez réessayer...");
		}

	}
}
