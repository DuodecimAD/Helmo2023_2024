package labo7;

import io.Console;
import util.TableauEntiers;

public class LoterieNationale {
	public static void main(String[] args) {
		
		int[] maGrille = null;
		String choix = "";
		do {
			
			do {
				System.out.println("Loterie Nationale");
				System.out.println("1. Remplir une grille de Lotto");
				System.out.println("2. Consulter mon gain pour le dernier tirage");
				System.out.println("3. Quitter");
				choix = Console.lireString("Choix ? ");
				System.out.println();
			} while (!choix.matches("[123]"));
			
			if(choix.matches("3")) {
				break;
			}
			
			switch (choix) {
				case "1" ->{
					maGrille = Lotto.encoderGrille(6, 45);
					System.out.println("Votre grille est " + TableauEntiers.toString(maGrille));
					System.out.println();
				}
				case "2" -> {
					int[] tirage = Lotto.genererTirage(7, 45);
					System.out.println("Le tirage est " + TableauEntiers.toString(tirage));
					if(maGrille == null) {
						System.out.println("Vous n'avez pas rempli de grille\n");
					} else {
						int[] numerosGagnants = Lotto.compterNumerosGagnants(tirage, maGrille);
						if(numerosGagnants[1] == 0) {
							System.out.println("Vous avez " + numerosGagnants[0] + " numéro gagnant");
						} else {
							System.out.println("Vous avez " + numerosGagnants[0] + " numéro gagnant et le numéro bonus");
						}
						System.out.println("Vous gagnez " + Lotto.obtenirGain(Lotto.determinerRang(numerosGagnants)) + " euros\n");
						
					}
				}
			}
			
			
		} while(true);
		
		System.out.println("Fin du programme.");
		
	}
}
