package labo7;

import java.util.Arrays;

import io.Console;
import util.Aleatoire;
import util.TableauEntiers;

public class Lotto {
	
	static int[] genererTirage(int nbTirages, int numeroMax) {
		int[] tirage = new int[nbTirages];
		int[] possibilities = new int[numeroMax];
		
		// remplissage du tableau avec tous les chiffres possibles
		for (int i = 0; i < numeroMax; i++) {
			possibilities[i] = i+1;
		}
		
		int j = numeroMax-1;
				
		for (int i = 0; i < nbTirages; i++) {
			
			int p = Aleatoire.aleatoire(0, j);	
			tirage[i] = possibilities[p];
			TableauEntiers.permuter(possibilities, p, j);
			j--;
			if(i == 6) {
				Arrays.sort(tirage);
			}
		}

		return tirage;
	}
	
	static int[] encoderGrille(int nbNumeros, int numeroMax) {
		
		int[] grille = new int[nbNumeros];
		int index = 0;
				
		do {
			String acquisition;
			do {
				acquisition = Console.lireString("Numéro " + (index + 1) + " ? ");
			} while(!acquisition.matches("\\d+"));
			int numeroUser = Integer.parseInt(acquisition);
			
			boolean contain = false;
			for (int i = 0; i < grille.length; i++) {
				if(grille[i] == numeroUser) {
                    contain = true;
                    break;
                }
			}
			if(!contain && numeroUser <= numeroMax && numeroUser > 0) {
				nbNumeros--;
				grille[index] = numeroUser;
				index++;
			} else {
				System.out.println("Choix incorrect !");
			}
		} while(nbNumeros > 0);

		return grille;
	}
	
	static int[] compterNumerosGagnants(int[] tirage, int[] grille) {

		int[] numerosGagnants = new int[2];
		int count = 0;
		int bonus = 0;
		for (int i = 0; i < grille.length; i++) {
			for (int j = 0; j < grille.length; j++) {
				if (grille[i] == tirage[j]) {
					count++;
				}
			}
			if(grille[i] == tirage[6]) {
				bonus = 1;
			}
		}
		
		numerosGagnants[0] = count;
		numerosGagnants[1] = bonus;

		return numerosGagnants;
		
	}
	
	static int determinerRang(int[] numerosGagnants) {
		if (numerosGagnants[1] == 0) {
			return (7 - numerosGagnants[0]) * 2 - 1;
		} else {
			return (7 - numerosGagnants[0]) * 2 - 2;
		}
	}
	
	static double obtenirGain(int rang) {
		double[] gains = {500000.00, 75000.00 , 1500.00, 250.00, 30.00, 10.00, 5.00, 3.00};
		
		if (rang > 8) {
			return 0.00;
		}
		
		return	gains[rang-1];
	}

}
