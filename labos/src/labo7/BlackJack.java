package labo7;

import util.TableauChaines;

public class BlackJack {

	public static void main(String[] args) {

		String[] jeu = getJeuDeCartes();
		System.out.println(TableauChaines.toString(jeu, 10));
		TableauChaines.melanger(jeu);
		System.out.println(TableauChaines.toString(jeu, 10));
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
	/*
	 * public static int getValeurCarte(String carte) {
	 *
	 * }
	 *
	 * public static int getValeurCartes(String[] cartes, int nbCartes) {
	 *
	 * }
	 */
}
