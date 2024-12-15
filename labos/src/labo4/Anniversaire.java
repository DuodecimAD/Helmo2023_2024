package labo4;

import io.Console;
import util.Date;

public class Anniversaire {

	public static void main(String[] args) {

		// Variables
		String birthday;
		int jour, mois, result;

		do {

			// Acquisitions
			birthday = Console.lireString("\nLa date de votre anniversaire (j/m) ? ");

			// Traitement
			jour = Integer.parseInt(birthday.substring(0, birthday.indexOf("/")));
			mois = Integer.parseInt(birthday.substring(birthday.indexOf("/")+1));

			result = Date.numeroJour(jour, mois, Date.anneeAuj()) - Date.numeroJour();
			
			System.out.println("result = " + result);

			if (result < 31 && result > 0) {
				System.out.println("Super ! c'est bientôt votre anniversaire.");
			} else if(result == 0){
				System.out.println("Joyeux anniversaire.");
			} else {
				System.out.println("Dommage ! Votre anniversaire est encore loin.");
			}

		} while (true);

	}

}
