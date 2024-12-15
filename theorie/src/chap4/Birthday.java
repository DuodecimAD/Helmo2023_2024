package chap4;

import io.Console;


/**
 * Programme qui perment de permuter 2 variables
 */
public class Birthday {

	public static void main(String[] args) {

		// Variables
		String prenom, date;
		int age;
		//LocalDate newDate;
		//String cleanDate, posSlash1, posSlash2;

		// Acquisition
		prenom = Console.lireString("\nTon prénom ? ");
		date = Console.lireString("\nDate d'anniversaire ?");

		/*
		posSlash1 = date.indexOf('/');
		posSlash1 = date.indexOf(posSlash1 + 1);
		jour =
		*/

		// Traitement

		//méthode 1
		age = 2024 - Integer.parseInt(date.substring(date.length()-4));

		//méthode 2
		/*
		if(date.substring(2,3).equals("/") && date.length() == 9){
			cleanDate = date.substring(0,3) + "0" + date.substring(3);
		}else if(!date.substring(2,3).equals("/") && date.length() == 9){
			cleanDate = "0" + date;
		}else if(date.length() == 8){
			cleanDate = "0" + date.substring(0,2) + "0" + date.substring(2);
		}else{
			cleanDate = date;
		}
		newDate = LocalDate.parse( cleanDate, DateTimeFormatter.ofPattern( "dd/MM/uuuu" ));
		age = Period.between(newDate, java.time.LocalDate.now()).getYears();
		*/

		// Afficher le résultat
		System.out.printf("\nBonjour %s, tu as %d ans.\n", prenom, age);


	}

}