package chap9;

import util.Aleatoire;

/**
 * Ce programme doit explorer un tableau à deux dimensions afin d'y retrouver le
 * chemin formé par des astérisques.
 * 
 * @author Arnaud Comblin
 */
public class Chemin {

	public static void main(String[] args) {
		char[][] chemin = genererChemin(9, 7);
		afficher(chemin);
		

		int depart = positionDe(chemin[0], '*');
		System.out.println("departIndex : " + depart);
		
		// explorer gauche et droite suite
		int poGauche = positionDe(chemin[1], '*');
		System.out.println("gaucheIndex : " + poGauche);
		int posDroite = dernierePositionDe(chemin[1], '*');
		System.out.println("droiteIndex : " + posDroite);
		
	}

	private static int dernierePositionDe(char[] cs, char c) {
		for (int i = cs.length-1; i >= 0; i--) {
			if(cs[i] == c) {
				return i;
			}
		}
		return -1;
	}

	private static int positionDe(char[] cs, char c) {
		
		for (int i = 0; i < cs.length; i++) {
			if(cs[i] == c) {
				return i;
			}
		}
		return -1;
	}

	public static char[][] genererChemin(int hauteur, int largeur) {
		char[][] chemin = new char[hauteur][];
		int debut, fin = Aleatoire.aleatoire(0, largeur - 1);
		
		for (int i = 0; i < hauteur; i++) {
			debut = fin;
			if (i % 2 == 1 && Aleatoire.aleatoire(2) >= 1) {
				fin = Aleatoire.aleatoire(0, largeur - 1);
			}
			chemin[i] = creerLigne(largeur, debut, fin);
		}
		return chemin;
	}

	public static char[] creerLigne(int largeur, int debut, int fin) {
		char[] ligne = new char[largeur];
		int iDepart = Math.min(debut, fin);
		int iFin = Math.max(debut, fin);
		for (int i = iDepart; i <= iFin; i++) {
			ligne[i] = '*';
		}
		return ligne;
	}

	public static void afficher(char[][] t) {
		for (char[] ligne : t) {
			for (char element : ligne) {
				System.out.print(element);
			}
			System.out.println();
		}
	}

}
