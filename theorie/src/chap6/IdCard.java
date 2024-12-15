package chap6;

import io.Console;

public class IdCard {

	public static void main(String[] args) {
		//04.09.23-164.01

		// 1) extraire les 9 premiers chiffres sous la formed'un entier

		// 40923164

		// 2) Ajout 2.000.000.000 si né dans ce siècle

		// 2 040 923 164

		// 3) 97 - (2 040 923 164 % 97) = 97 - 96 = 1

		// 4) Extraire les 2 derniers chiffres sous la forme d'un entier

		// 5) vérifier si c'est correcte

		// 01 = 1 ok

		//84.03.12-367.88

		int number = 840312367;

		// Variable
		String regNat, siecle;

		// Acquisition
		regNat = Console.lireString("Numéro de registre nationnal (xx.xx.xx-xxx.xx) ? ");
		siecle = Console.lireString("Etes-vous après 2000 ? oui/non ");

		// Traitement
		//int calcul = 97 - (number % 97);


		// Affichage

		if (verifierRegistreNational(regNat, siecle)) {
			System.out.println("Numéro valide.");
		}else{
			System.out.println("Numéro incorrect.");
		}


	}



	public static boolean verifierRegistreNational(String regNat, String siecle) {

		String neufChiffres = regNat.substring(0, regNat.length() - 3);
		long chiffres = 0;
		neufChiffres = neufChiffres.replace(".", "").replace("-", "");

		if (siecle.equals("oui")) {
			chiffres = Long.parseLong(neufChiffres) + 2000000000;
		} else if (siecle.equals("non")) {
			chiffres = Long.parseLong(neufChiffres);
		}else {
			System.out.println("Information incorrecte !");
		}


		long modulo = 97 - (chiffres % 97);

		if(modulo == Long.parseLong(regNat.substring(regNat.length()-2))) {
			return true;
		}else {
		}

		return false;

	}

}
