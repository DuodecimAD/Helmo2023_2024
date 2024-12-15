package labo7;

import io.Console;
import util.TableauChaines;

public class BlackJack {

	public static void main(String[] args) {

		String[] jeu = getJeuDeCartes();
		TableauChaines.melanger(jeu);
		// System.out.println(TableauChaines.toString(jeu, 4));
		int indexJoueur = 0, indexCroupier = 0, indexJeu = 0;
		int pointsJoueur = 0, pointsCroupier = 0;
		String[] joueur = new String[52];
		String[] croupier = new String[52];
		String tirer = null;

		// on distribue les cartes
		for (int i = 0; i < 2; i++) {
			joueur[indexJoueur] = jeu[indexJeu];
			indexJoueur++;
			indexJeu++;
			croupier[indexCroupier] = jeu[indexJeu];
			indexCroupier++;
			indexJeu++;
		}
		// affiche les points après les 4 premières cartes distribuées
		pointsJoueur = getValeurCartes(joueur, indexJoueur);
		System.out.println("Vous avez " + pointsJoueur + " points : ");
		System.out.println(TableauChaines.toString(joueur, indexJoueur));
		System.out.println();
		pointsCroupier = getValeurCartes(croupier, indexCroupier);
		System.out.println("Le croupier a " + pointsCroupier + " points : ");
		System.out.println(TableauChaines.toString(croupier, indexCroupier));
		System.out.println();
		
		// permet de tirer des cartes en + pour s'approcher de 21
		tirer = Console.lireString("Tirer une carte : (O)ui/(N)on ? ").toLowerCase().trim();
		
		while (tirer.equals("o") && pointsJoueur <= 21) {
			
			joueur[indexJoueur] = jeu[indexJeu];
			indexJoueur++;
			indexJeu++;
			pointsJoueur = getValeurCartes(joueur, indexJoueur);
			System.out.println("\nVous avez " + pointsJoueur + " points : ");
			System.out.println(TableauChaines.toString(joueur, indexJoueur));
			
			if (pointsJoueur <= 21) {
				System.out.println();
				tirer = Console.lireString("Tirer une carte : (O)ui/(N)on ? ").toLowerCase().trim();
			}
			
		}
		
		// logique pour le croupier de s'approcher de 21
		while (pointsCroupier <= 17) {
			
			croupier[indexCroupier] = jeu[indexJeu];
			indexCroupier++;
			indexJeu++;
			pointsCroupier = getValeurCartes(croupier, indexCroupier);
		}
		System.out.println("\nLe croupier a " + pointsCroupier + " points : ");
		System.out.println(TableauChaines.toString(croupier, indexCroupier));
		System.out.println();
		

		if (pointsJoueur == 21 && pointsCroupier == 21) {
			System.out.println("égalité");
		} else if (pointsCroupier > 21) {
			if (pointsJoueur > 21) {
				System.out.println("Les 2 dépasse 21, ... que faire ...");
			} else {
				System.out.println("Vous gagnez !");
			}
			
		} else if (pointsJoueur > 21){
			System.out.println("Vous perdez !");
		} else {
			int diffJoueur = 21 - pointsJoueur;
			int diffCroupier = 21 - pointsCroupier;
			
			if (diffJoueur == diffCroupier) {
				System.out.println("égalité");
			} else if (diffJoueur < diffCroupier) {
				System.out.println("Vous gagnez !");
			} else {
				System.out.println("Vous perdez !");
			}
		}
		System.out.println();
	}

	private static String[] getJeuDeCartes() {
		// Constantes
		final String[] COULEURS = { "coeur", "carreau", "trèfle", "pique" };
		final String[] CARTES = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valet", "Dame", "Roi", "As" };

		// Variable pour le résultat
		String[] jeuDeCartes;

		// Créer un jeu de cartes
		jeuDeCartes = new String[COULEURS.length * CARTES.length];
		for (int i = 0; i < COULEURS.length; i++) {
			for (int j = 0; j < CARTES.length; j++) {
				jeuDeCartes[CARTES.length * i + j] = CARTES[j] + " de " + COULEURS[i];
			}
		}

		// Retourner le jeu de cartes
		return jeuDeCartes;
	}

	public static int getValeurCarte(String carte) {
		int valeur = 10;

		if (carte.substring(0, 1).matches("\\d")) {
			valeur = Integer.parseInt(carte.substring(0, 1));
		} else if (carte.substring(0, 2).matches("As")) {
			valeur = 11;
		}

		return valeur;
	}

	public static int getValeurCartes(String[] cartes, int nbCartes) {
		int points = 0;

		for (int i = 0; i < nbCartes; i++) {
			points += getValeurCarte(cartes[i]);
		}

		return points;
	}

}
