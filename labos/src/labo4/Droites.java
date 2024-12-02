package labo4;

import io.Console;

public class Droites {

	public static void main(String[] args) {
		// Variables
		String pointA, pointB, pointC, pointD;
		double coefA, coefB;

		// Acquisition
		pointA = Console.lireString("Coordonnées du point A ? ");
		pointB = Console.lireString("Coordonnées du point B ? ");
		pointC = Console.lireString("Coordonnées du point C ? ");
		pointD = Console.lireString("Coordonnées du point D ? ");

		// Traitement
		coefA = coefficientDirecteur(lireCoordX(pointA), lireCoordY(pointA), lireCoordX(pointB), lireCoordY(pointB));
		coefB = coefficientDirecteur(lireCoordX(pointC), lireCoordY(pointC), lireCoordX(pointD), lireCoordY(pointD));

		// Affichage
		System.out.println("Coefficient directeur de la droite AB = " + coefA);
		System.out.println("Coefficient directeur de la droite CD = " + coefB);

		System.out.print("Les droites sont ");

		if(coefA == coefB) {
			System.out.print("parallèles.");
		} else if (coefA * coefB == -1) {
			System.out.print("perpendiculaires.");
		} else {
			System.out.print("sécantes.");
		}
	}


	public static double lireCoordX(String coordPoint) {
		return Double.parseDouble(coordPoint.substring(0,coordPoint.indexOf(" ")));
	}

	public static double lireCoordY(String coordPoint) {
		return Double.parseDouble(coordPoint.substring(coordPoint.indexOf(" ")));
	}

	public static double coefficientDirecteur(double xA, double yA, double xB, double yB) {
		if(xA == xB && yA == yB) {
			return Double.NaN;
		} else if (xA == xB){
			return Double.POSITIVE_INFINITY;
		} else {
			return (yB-yA) / (xB-xA);
		}

	}

}
