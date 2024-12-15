package eval3;

import java.util.Arrays;

import io.Console;

public class CribleEratosthene {

	public static void main(String[] args) {
		// Variables
		boolean[] tableau;
		
		// Acquisitions
		int max = Console.lireInt("Nombres premiers de 0 à ... ? ");
		
		tableau = new boolean[max+1];
		tableau[0] = false;
		tableau[1] = false;
		Arrays.fill(tableau,2,max+1, true);
		
		// Traitement
		eliminerMultiples(tableau, max);
		
		// Affichage
		for (int i = 0; i < tableau.length; i++) {
			if (tableau[i]) {
				System.out.print(i + " ");
			}
			
		}
	}
	
	/**
	 * Methode permetant de determiner les nombres premiers jusqu'à un nombre donné
	 * @param naturels tableau de booleen dont les true sont les nombres premiers
	 * @param a nombre donné entier jusqu'auquel on veut determiner les nombres premiers
	 */
	public static void eliminerMultiples(boolean[] naturels, int a) {
		
		for (int i = 2; i < naturels.length; i++) {
			int square = i*i;
			
			if (square > a) {
				break;
			}
			
			for (int j = square; j < naturels.length; j++) {
				if (j % i == 0) {
					naturels[j] = false;
				}
			}

		}
	}

}
