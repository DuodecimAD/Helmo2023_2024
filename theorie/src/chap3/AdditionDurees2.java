package chap3;

/**
 * Programme qui effectue l'addition de deux durées
 * exprimées en heures-minutes-secondes (HMS).
 *
 * L'approche choisie consiste à convertir au préalable
 * les deux durées en secondes afin de simplifier
 * l'addition. Le total exprimé en secondes doit ensuite
 * être décomposé en HMS.
 */
public class AdditionDurees2 {
	
	public static void main(String[] args) {
		// Variables pour les données en entrée
		int h1 = 6, m1 = 21, s1 = 30;
		int h2 = 3, m2 = 38, s2 = 45;
		
		// Variables pour les résultats
		int hTot, mTot, sTot;
		
		// Variable de travail
		int duree1EnSec, duree2EnSec;
		int dureeTotEnSec;
		
		// Traitement
		// 1. Convertir les durées en secondes
		duree1EnSec = h1 * 3600 + m1 * 60 + s1;
		duree2EnSec = h2 * 3600 + m2 * 60 + s2;
		
		// 2. Additionner les durées exprimées en secondes
		dureeTotEnSec = duree1EnSec + duree2EnSec;
		
		// 3. Décomposer la durée totale en HMS
		hTot = dureeTotEnSec / 3600;
		dureeTotEnSec %= 3600;
		mTot = dureeTotEnSec / 60;
		sTot = dureeTotEnSec % 60;
		
		// Afficher les résultats
		System.out.print(hTot + "h ");
		System.out.print(mTot + "min ");
		System.out.println(sTot + "s");
	}
	
}