package labo1;

public class JourDeLaSemaine {
	public static void main(String[] args) {
		int jour = 30, mois = 9, annee = 2024;
		int anneeEnCours, a, b, m;
		int jourDeLaSemaine;

		//Traitement
		anneeEnCours = (14 - mois) / 12;
		System.out.println("anneeEnCours : " + anneeEnCours);

		a = annee - anneeEnCours;
		System.out.println("a : " + a);

		b = a + a / 4 - a / 100 + a / 400;
		System.out.println("b : " + b);

		m = mois + 12 * anneeEnCours - 2;
		System.out.println("m : " + m);

		jourDeLaSemaine = (jour + b + 31 * m / 12) % 7;
		System.out.println("jourDeLaSemaine : " + jourDeLaSemaine);

		double GaussFormula = (jour + mois + 5 *((annee-1)%4) + 4*((annee-1)%100) + 6*((annee-1)%400))%7;
		System.out.println("GaussFormula : " + GaussFormula);
	}
}
