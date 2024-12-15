package chap3;

/**
 * Programme qui effectue l'addition de deux durées
 * exprimées en heures-minutes-secondes (HMS).
 *
 * L'approche choisie consiste à effectuer une addition
 * "classique" (sommer les secondes, puis les minutes
 * et, enfin, les heures) avec une gestion des reports.
 */
public class AdditionDurees1 {
	
	public static void main(String[] args) {
		// Variables pour les données de départ
		int h1 = 6, m1 = 21, s1 = 30;
		int h2 = 3, m2 = 38, s2 = 45;
		
		// Variables pour les résultats
		int hTot, mTot, sTot;
		
		// Variable de travail
		int report;
		
		// Traitement
		// 1. Additionner les secondes
		sTot = s1 + s2;
		report = sTot / 60;
		sTot = sTot % 60;
		
		// 2. Additionner les minutes
		mTot = m1 + m2 + report;
		report = mTot / 60;
		mTot = mTot % 60;
		
		// 3. Additionner les heures
		hTot = h1 + h2 + report;
		
		// Afficher les résultats
		System.out.print(hTot + "h ");
		System.out.print(mTot + "min ");
		System.out.println(sTot + "s");
	}
	
}