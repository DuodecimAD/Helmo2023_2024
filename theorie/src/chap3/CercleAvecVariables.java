package chap3;

public class CercleAvecVariables {

	/**
	 * Programme qui permet de calculer le périmètre et l'aire d'un cercle.
	 */
	public static void main(String[] args) {
		
		// Variables et les traitements associés
		double rayon = 17.1;
		double perimetre = 2 * Math.PI * rayon;
		double aire = Math.PI * Math.pow(rayon, 2);
		
		// Afficher le périmètre
		System.out.print("Périmètre = ");
		System.out.printf("%.1f cm\n", perimetre);
		
		// Afficher l'aire
		System.out.print("Aire = ");
		System.out.printf("%.2f cm²\n", aire);
	}

}	