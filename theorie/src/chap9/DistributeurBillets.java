package chap9;

import io.Console;

public class DistributeurBillets {
	
	public static void main(String[] args) {
		
		// Tableaux
		int[] valeursBillets = new int[] {200,100,50,20,10};
		int[] quantitesBillets = new int[valeursBillets.length];
		
		// Variables
		int montant;
		
		// Acquisitions
		montant = Console.lireInt("Montant en euros ? ");
		
		// Traitement
		for (int i = 0; i < valeursBillets.length; i++) {
			quantitesBillets[i] = montant / valeursBillets[i];
			montant = montant % valeursBillets[i];
			
			//System.out.printf("%d fois %d\n", quantitesBillets[i], valeursBillets[i]);
		}
		
		// Affichage
		for (int i = 0; i < valeursBillets.length; i++) {
			System.out.printf("%d fois %d\n", quantitesBillets[i], valeursBillets[i]);
		}
		

	}
}