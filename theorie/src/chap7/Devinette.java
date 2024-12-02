package chap7;

import chap5.Aleatoire;
import io.Console;

public class Devinette {

	public static void main(String[] args) {


		int nbrSecret, nbrJoueur, tentative = 7;
		nbrSecret = Aleatoire.aleatoire(1, 100);

		//System.out.println(nbrSecret);

		do {
			nbrJoueur = Console.lireInt("Nombre entre 1 et 100 ? ");

			tentative--;

			if (nbrJoueur > nbrSecret) {
				System.out.println("Non,le nombre est plus petit. Il vous reste " + tentative	+ " tentative(s).\n");
			} else if (nbrJoueur < nbrSecret) {
				System.out.println("Non,le nombre est plus grand. Il vous reste " + tentative	+ " tentative(s).\n");
			} 
			
		} while (nbrJoueur != nbrSecret && tentative > 0);

		 if (nbrJoueur == nbrSecret) {
			System.out.println();
			System.out.println("-------------------------------");
			System.out.println("Bravo ! Tu as trouvé le nombre.");
			System.out.println("-------------------------------");
		} else {
			System.out.println("------------------------");
			System.out.println("Perdu, le nombre était " + nbrSecret);
			System.out.println("------------------------");
		}


	}

}
