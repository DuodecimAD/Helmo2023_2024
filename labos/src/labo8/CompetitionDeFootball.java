package labo8;

import io.Console;

public class CompetitionDeFootball {

	public static void main(String[] args) {
		
		Console.simulerSaisies( "1", "6", "Aische", "FC Huy", "RES Durbuy", "Richelle", "RRC Mormont", "Tilleur", "2", "3", "5", "4");
//		Console.simulerSaisies( "1", "8", "A", "B", "C", "D", "E", "F", "G", "H", "2", "3", "5", "4");
		
		int nbEquipes = 0;
		String[] nomsEquipes = null;
		
		String choix = "";

		do {
			do {
				System.out.println("Compétition de football");
				System.out.println("1. Encoder les équipes");
				System.out.println("2. Afficher le calendrier de la compétition");
				System.out.println("3. Afficher le calendrier d'une équipe");
				System.out.println("4. Quitter");
				
				choix = Console.lireString("Choix ? ").trim();
			} while (!choix.matches("[1-4]") || choix.isEmpty());
			
			System.out.println();
			
			if(choix.equals("4")) {
				break;
			}
			
			
			switch (choix) {
				case "1" -> {
					String nbEquipesStr = "";
					do {
						nbEquipesStr = Console.lireString("Nombres d'equipes ? ").trim();
					} while(
							!nbEquipesStr.matches("[0-9]{1,2}") || 
							Integer.parseInt(nbEquipesStr) % 2 != 0 ||
							Integer.parseInt(nbEquipesStr) < 2 ||
							Integer.parseInt(nbEquipesStr) > 20
							);
					nbEquipes = Integer.parseInt(nbEquipesStr);
					nomsEquipes = CompetitionSportive.encoderNomsEquipes(Integer.parseInt(nbEquipesStr));
					System.out.println();
				}
				case "2" -> {
					String[][] journees = null;
					for (int i = 0; i < nbEquipes-1; i++) {
						
						System.out.println("Journée " + (i+1));
						journees = CompetitionSportive.journeeSuivante(nomsEquipes);
						System.out.println(CompetitionSportive.journeeToString(journees));
					}

				}
				case "3" -> {
					int choixEquipe = CompetitionSportive.choisirEquipe(nomsEquipes);
					String equipe = nomsEquipes[choixEquipe];
					System.out.println();
					String[][] journees = null;
					for (int i = 0; i < nbEquipes-1; i++) {
					
						System.out.println("Journée " + (i+1));
						journees = CompetitionSportive.journeeSuivante(nomsEquipes);
						System.out.println(CompetitionSportive.rencontreToString(CompetitionSportive.getRencontre(journees, equipe)));
					}

				}
				default -> System.out.println("ERROR");
			
			}

		} while(true);
	
		System.out.println("Fin du programme");
	}

}
