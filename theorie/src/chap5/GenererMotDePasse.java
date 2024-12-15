package chap5;

import io.Console;

public class GenererMotDePasse {

	public static void main(String[] args) {
		//Choisir une lettre aléatoirement
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		//                 01234567890123456789012345
		//                           1         2
				//?? = Math.random(??); (nous garantir de pas avoir tjrs le mm résultat)

		char lettreAleat = alphabet.charAt(Aleatoire.aleatoire(alphabet.length()-1));

		int lgMDP = Console.lireInt("Longueur du mot de passe ?");


		System.out.println(genererMotDePasse(lgMDP)  ); //pr println : +


	}
    public static char caractereAleat(String chaine) {
    	return chaine.charAt(Aleatoire.aleatoire(chaine.length()-1));


    }
	public static char lettreAleat(String chaine) {
		//executer la fonction "caractereAleat" en lui transmettant
		//l'alphabet des majuscules et des minuscules
		String alphabet = "ABCDEFGHIJKLMNOPQRSTVUVWXYZ";
		return caractereAleat("alphabat + alphabet.toLowerCase()");


	}
	public static char chiffreAleat() {
		//executer la fonction "caractereAleat" en lui transmettant
		//une chaine contenant tous les chiffres de la base 10
		return caractereAleat("0123456789");
		// char chiffreAleat = chiffre.charAt(Aleatoire.aleatoire(chiffre.length()-1));


	}

   public static String genererMotDePasse(int longueur) {
	   String mdp = "";
	   //mdp = String.valueOf(lettreALeat());
	   //mdp = "" + lettreAleat();
	   //mdp += lettreAleat(); //mdp = "" + 'z' = "z"
	   //mdp += lettreAleat(); //mdp = "z" + 'P' = "ZP"
	   //mdp += lettreAleat(); //mdp = "ZP" + 'B' = "ZPB"
	   //mdp += lettreAleat();

	   for (int i = 1; i <= longueur; i = i + 1) { //for = boucle qui sert a répéter autant de fois qu on veut
		       if(Math.random() < 0.7) {
		    	   mdp += lettreAleat(""); // SI VRAI/OUI
		       } else {
		   	       mdp += chiffreAleat();// SI FAUX/NON
	 }

	   }
	   return mdp;

   }





}
