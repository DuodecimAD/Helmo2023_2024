package labo4;

import io.Console;

public class Meteo {

	public static void main(String[] args) {

		// Variables
		int temp;
		String pleuvoir, soleil;

		// Acquisition
		temp = Console.lireInt("Température en °C ? ");

		// Traitement
		if (temp < 16 && temp >= -30) {
			pleuvoir = Console.lireString("Est-il en train de pleuvoir (o/n) ? ").toLowerCase();

			switch (pleuvoir) {
				case "o" -> System.out.println("Vous devriez prendre un parapluie.");
				case "n" -> System.out.println("Vous devriez porter un manteau.");

				default -> 	System.out.println("Cette réponse est incorrecte !");
			}
		} else if (temp > 16 && temp < 40){
			soleil = Console.lireString("Fait-il ensoleillé (o/n) ? ").toLowerCase();

			switch (soleil) {
				case "o" -> System.out.println("Vous devriez porter un t-shirt.");
				case "n" -> System.out.println("Vous devriez porter un pull.");

				default -> 	System.out.println("Cette réponse est incorrecte !");
			}
		} else {
			System.out.println("Cette température est incorrecte !");
		}
	}
}
