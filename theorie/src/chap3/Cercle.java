package chap3;

import io.Console;

public class Cercle {

	//public static double perimetre;
	//public static double aire;

	public static void main(String[] args) {

		//double rayon = 9.8;
		double rayon = Console.lireDouble("\nRayon ?\n");
		double perimetre = 2*Math.PI*rayon;
		double aire = Math.PI * Math.pow(rayon, 2);

		System.out.println();
		System.out.printf("perimetre = %.1f cm", perimetre);
		System.out.println();
		System.out.printf("aire = %.2f cm²", aire);
		System.out.println();

	}

}