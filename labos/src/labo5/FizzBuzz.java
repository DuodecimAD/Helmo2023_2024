package labo5;

import io.Console;

public class FizzBuzz {

	public static void main(String[] args) {

		// Variables
		int lastNumber;

		// Acquisitions
		lastNumber = Console.lireInt("Dernier nombre ? ");

		// Traitement


		// Affichage
		for (int i = 1; i <= lastNumber; i++) {

			if (i % 3 == 0 && i % 5 == 0) {
				System.out.print("fizzbuzz");
			} else if (i % 3 == 0) {
				System.out.print("fizz");
			} else if (i % 5 == 0) {
				System.out.print("buzz");
			} else {
				System.out.print(i);
			}

			if(i != lastNumber) {
				System.out.print(", ");
			}
		}

	}
}
