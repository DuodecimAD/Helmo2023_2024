package jeuxsociete;

import io.Console;
import util.TableauEntiers;

public class JeuxSociete {

	public static void main(String[] args) {
		
		// Tableaux
		String[] appreciations = {"Meilleur", "Recommandé", "Pas recommandé"};
		int[][] votes;
		// int[][] votes = {{3, 12, 5}, {21, 6, 0}, {5, 13, 0}, {0, 0, 0}};
		 
		
		// Variables
		int nbMinJoueurs, nbMaxJoueurs;
		String voteLettre;
		
		// Acquisitions
		nbMinJoueurs = Console.lireInt("Nombre minimum de joueurs ? ");
		nbMaxJoueurs = Console.lireInt("Nombre maximum de joueurs ? ");
		votes = new int[nbMaxJoueurs-nbMinJoueurs+1][3];
		
		System.out.println("Votre Appréciation ...");
		
		for (int i = 0; i < appreciations.length; i++) {
			System.out.println("(" + appreciations[i].charAt(0) + ")" + appreciations[i].substring(1));
		}
		System.out.println("(N)SP");
		
		
		for (int i = nbMinJoueurs; i <= nbMaxJoueurs; i++) {

			voteLettre = Console.lireString("... pour " + i + " joueur(s) ? ").substring(0,1).toUpperCase();
			
			for (int j = 0; j < appreciations.length; j++) {
				if (appreciations[j].substring(0,1).equals(voteLettre)) {
					votes[i-nbMinJoueurs][j]++;
				}
			}
		}
		
		// Traitement

		
		
		// Affichage
		
		afficherTableauRecapitulatif(appreciations, votes, nbMinJoueurs);
		
	}

	public static void afficherTableauRecapitulatif(String[] appreciations, int[][] votes, int nbMinJoueurs) {
		
		System.out.printf("# joueurs %14s %14s %14s # votes\n", appreciations[0], appreciations[1], appreciations[2]);
		
		for (int i = 0; i < votes.length; i++) {
			
			System.out.printf("%9d ", nbMinJoueurs);
			
			for (int j = 0; j < votes[i].length; j++) {
				System.out.printf(" %13s ", "(" + votes[i][j] + ")");
			}

			System.out.printf("%7d\n", TableauEntiers.sommer(votes[i]));
			nbMinJoueurs++;
		}
		
	}

}
