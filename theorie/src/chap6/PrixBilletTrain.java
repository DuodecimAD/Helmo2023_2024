package chap6;

import io.Console;

public class PrixBilletTrain {

	public static void main(String[] args) {
		
		// Variables
		int age;
		double prixBilletStd, prixBilletAvecReduc, tauxReduc;
		
		// Acquisitios
		age = Console.lireInt("Age ? ");
		prixBilletStd = Console.lireDouble("Prix Billet ? ");
		
		
		// Traitement
		tauxReduc = tauxReduction(age);
		//prixBilletAvecReduc = prixBilletStd-(prixBilletStd*tauxReduc);
		prixBilletAvecReduc = prixBilletStd * (1 - tauxReduc);
		
		// Affichage
		if(prixBilletStd >= 0 && Double.isNaN(tauxReduc) == false) {
			System.out.println("Le prix du billet est " + prixBilletAvecReduc + " €, à la suite d'une réduction de " + tauxReduc*100 + " % basée sur votre âge.");
		} else {
			System.out.println("Données incorrectes !");
		}
		
	}

	public static double tauxReduction(int age) {
		double tauxReduc;
		if (age < 0 || age > 130) {
			tauxReduc = Double.NaN;
		} else if (age < 3) {
			tauxReduc = 1.0;
		} else if (age < 12 || age >= 65) {
			tauxReduc = 0.5;
		} else if (age < 26) {
			tauxReduc = 0.2;
		} else {
			tauxReduc = 0.0;
		}
		return tauxReduc;
	}

}
