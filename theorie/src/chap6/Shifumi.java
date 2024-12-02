package chap6;

import io.Console;

/**
 * Ce programme permet de jouer desarties de Shifumi(pierr, papier, ciseaux) contre une IA
 */
public class Shifumi {

	public static void main(String[] args) {
		jouer();
	}

	/**
	 * lance le jeu
	 */
	private static void jouer() {

		String armeJoueur, armeIA, message;
		int result, pointsJoueur = 0, pointsIA = 0, pointsEgal = 0;

		for (int i = 0; i < 10; i++) {

			do {
				armeJoueur = associerArme(Console.lireString("\nPierre, papier, ciseaux ? ").trim().toLowerCase());
			} while (armeJoueur == null);
			
			armeIA = choisirArmeAleat();

			System.out.println("Joueur : " + armeJoueur + ", IA : " + armeIA + " => " + printWinner(armeJoueur, armeIA));

			result = comparerArmes(armeJoueur, armeIA);

			if (result == 1) {
				message = "Joueur gagne";
				pointsJoueur++;
			} else if (result == -1) {
				message = "IA gagne";
				pointsIA++;
			} else {
				message = "égalité";
				pointsEgal++;
			}
			System.out.println("Joueur : " + armeJoueur + ", IA : " + armeIA + " => " + message);
		}
		System.out.printf("\nJoueur a gagné %d fois, IA a gagné %d fois, il y a eu %d fois une égalité.", pointsJoueur, pointsIA, pointsEgal);
	}

	/**
	 * méthode prof - short
	 * 
	 * @param arme1
	 * @param arme2
	 * @return
	 */
	public static int comparerArmes(String arme1, String arme2) {
		if (arme1.equals(arme2)) {
			return 0;
		}
		if ((arme1.equals("pierre") && arme2.equals("ciseaux")) || (arme1.equals("papier") && arme2.equals("pierre"))
				|| (arme1.equals("ciseaux") && arme2.equals("papier"))) {
			return 1;
		}
		return -1;
	}

	/**
	 * ma méthode - long
	 * 
	 * @param armeJoueur
	 * @param armeIA
	 * @return
	 */
	public static String printWinner(String armeJoueur, String armeIA) {
		String message = "";

		for (int i = 0; i < 10; i++) {

			switch (armeJoueur) {
			case "pierre":
				if (armeIA.equals("pierre")) {
					message = "égalité";
				} else if (armeIA.equals("papier")) {
					message = "IA gagne";
				} else if (armeIA.equals("ciseaux")) {
					message = "Joueur gagne";
				}
				break;
			case "papier":
				if (armeIA.equals("pierre")) {
					message = "Joueur gagne";
				} else if (armeIA.equals("papier")) {
					message = "égalité";
				} else if (armeIA.equals("ciseaux")) {
					message = "IA gagne";
				}
				break;
			case "ciseaux":
				if (armeIA.equals("pierre")) {
					message = "IA gagne";
				} else if (armeIA.equals("papier")) {
					message = "Joueur gagne";
				} else if (armeIA.equals("ciseaux")) {
					message = "égalité";
				}
				break;
			default:
				break;
			}
		}
		return message;
	}

	/**
	 * selectionne arme
	 * 
	 * @return pierre, papier ou ciseaux
	 */
	public static String choisirArmeAleat() {
		return choisirArmeAleat(Math.random());
	}

	/**
	 * selectionne arme surcharge
	 * 
	 * @param reelAleat
	 * @return pierre, papier ou ciseaux
	 */
	public static String choisirArmeAleat(double reelAleat) {
		String armeAleat;

		if (reelAleat <= 0.33333) {
			armeAleat = "pierre";
		} else if (reelAleat <= 0.66666) {
			armeAleat = "papier";
		} else {
			armeAleat = "ciseaux";
		}
		return armeAleat;
	}

	/**
	 * selectionne arme - switch méthode
	 * 
	 * @param reelAleat
	 * @return pierre, papier ou ciseaux
	 */
	public static String choisirArmeAleatAvecSwitch(double reelAleat) {
		String armeAleat;
		int nombreAleat = (int) (Math.random() * 3);

		armeAleat = switch (nombreAleat) {
		case 0 -> "pierre";
		case 1 -> "papier";
		default -> "ciseaux";
		};
		return armeAleat;
	}

	/**
	 * selectionne arme - Ternaire méthode
	 * 
	 * @param reelAleat
	 * @return pierre, papier ou ciseaux
	 */
	public static String choisirArmeAleatAvecTernaire(double reelAleat) {
		int nombreAleat = (int) (Math.random() * 3);
		return (nombreAleat == 0) ? "pierre" : ((nombreAleat == 1) ? "papier" : "ciseaux");
	}

	/**
	 * Vérif la chaine rentrée par l'utilisateur
	 * 
	 * @param chaine de Console par l'utilisateur
	 * @return pierre, papier, ciseaux
	 */
	public static String associerArme(String chaine) {
		if (chaine.isEmpty()) {
			return null;
		}
		if ("pierre".startsWith(chaine)) {
			return "pierre";
		}
		if ("papier".startsWith(chaine)) {
			return "papier";
		}
		if ("papier".startsWith(chaine)) {
			return "ciseaux";
		}
		return null;
	}

}
