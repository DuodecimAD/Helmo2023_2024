package chap7;

import io.Console;

/**
 * Ce programme permet à l'utilisateur se saisir un nombre
 * quelconque de valeur réelles pour calculer leur moyenne
 */
public class Moyenne {

	public static void main(String[] args) {
		String saisie;
		double somme = 0;
		int count=0;
		
		saisie = Console.lireString("Un réel ? ").trim();
		while(!saisie.isBlank()) {
			count++;
			somme+= Double.parseDouble(saisie);
			saisie = Console.lireString("Un réel ? ").trim();
		}

	    // while(!saisie.length() == 0)
		// while(!saisie.equals(""))
		// while(!saisie.isEmpty())
		// while(saisie.matches("[+-]?\\d+(\\.\\d*)?"))
		if (count > 0) {
			System.out.println("somme : " + somme/count);
		} else {
			System.out.println("pas de valeur saisie !");
		}
		
	}

}
