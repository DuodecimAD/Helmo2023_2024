package labo7;

import util.Aleatoire;

public class Lotto {

	public static void main(String[] args) {
		
		genererTirage(7,45);

	}
	
	static int[] genererTirage(int nbTirages, int numeroMax) {
		int[] tirage = new int[nbTirages];
		int[] possibilities = new int[numeroMax-1];
		
		for (int i = 0; i < numeroMax; i++) {
			possibilities[i] = i+1;
		}
		
		tirage[0] = Aleatoire.aleatoire(1, 45);
		for (int i = 1; i < nbTirages; i++) {
			int nouvelIndex = Aleatoire.aleatoire(1, 45);
			
			for (int j = 0; j < possibilities.length; j++) {
				
			}
			//if ()
		}
		
		return tirage;
	}
	/*
	static int[] encoderGrille(int nbNumeros, int numeroMax) {
		
	}
	
	static int[] compterNumerosGagnants(int[] tirage, int[] grille) {
		
	}
	
	static int determinerRang(int[] numerosGagnants) {
		
	}
	
	static double obtenirGain(int rang) {
		
	}
	 */


}
