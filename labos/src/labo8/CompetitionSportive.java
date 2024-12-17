package labo8;

import io.Console;
import util.TableauChaines;

public class CompetitionSportive {

	static String[] encoderNomsEquipes(int nbEquipes) {
		String[] nomEquipes = new String[nbEquipes];
		String nom = "";		
			
		for (int i = 0; i < nbEquipes; i++) {
			do {
				nom = Console.lireString("Equipe " + (i+1) + " ? ").trim();
				
			} while (!nom.matches("[a-zA-Z ]+") && nom.isEmpty());
			
			nomEquipes[i] = nom;
		}
		
		return nomEquipes;
	}
	
	static void decalerADroite(String[] nomsEquipes) {
		
		String temp = nomsEquipes[nomsEquipes.length-1];
		
		for (int i = nomsEquipes.length-1; i > 0; i--) {
			nomsEquipes[i] = nomsEquipes[i-1];
		}
		
		nomsEquipes[0] = temp;
	}
	
	static String[][] journeeSuivante(String[] nomsEquipes){
		
		int groupes = nomsEquipes.length/2;
		String[][] journeeSuivante = new String[groupes][2];

		
//		for (int i = 0; i < groupes; i++) {
			decalerADroite(nomsEquipes);
			TableauChaines.permuter(nomsEquipes, 0, 1);
//		}

		for (int i = 0; i < groupes; i++) {
			for (int j = 0; j < journeeSuivante.length; j++) {
				journeeSuivante[i][0] = nomsEquipes[i];
				journeeSuivante[i][1] = nomsEquipes[nomsEquipes.length-1-i];
			}
		}
		return journeeSuivante;
	}
	
	static String rencontreToString(String[] rencontre) {
		String string = "";
		string = rencontre[0] + " - " + rencontre[1] +"\n";
		
		return string;
	}
	
	static String journeeToString(String[][] journee) {
		String string = "";
		for (int i = 0; i < journee.length; i++) {
			string += rencontreToString(journee[i]);
		}
		return string;
	}
	
	static String[] getRencontre(String[][] journee, String nomEquipe) {
		
		for (int i = 0; i < journee.length; i++) {
			for (int j = 0; j < journee.length; j++) {
				if(TableauChaines.contient(journee[i], nomEquipe)) {
					return journee[i];
				}
			}
		}
		return null;
	}
	
	static int choisirEquipe(String[] nomsEquipes) {
		String choix;
		for (int i = 0; i < nomsEquipes.length; i++) {
			System.out.println((i+1) + ". " + nomsEquipes[i]);
		}
		
		do {
			choix = Console.lireString("Choix ? ").trim();
		} while(!choix.matches("[\\d]+") || Integer.parseInt(choix)-1 < 1 || Integer.parseInt(choix)-1 > nomsEquipes.length-1);
		
		return Integer.parseInt(choix)-1;
	}

	

}
