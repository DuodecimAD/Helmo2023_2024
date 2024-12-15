package chap5;

import io.Console;

public class Geometrie {
	public static void main(String[] args) {
		double rayon;

		rayon = Console.lireDouble("Rayon du cercle ?");

		System.out.printf("Périmètre = %.2f\n", Cercle.perimetre(rayon));
		System.out.printf("Aire = %.2f\n", Cercle.aire(rayon));
	}
}