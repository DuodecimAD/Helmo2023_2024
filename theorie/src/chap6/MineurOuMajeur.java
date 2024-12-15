package chap6;

import io.Console;

public class MineurOuMajeur {

	public static void main(String[] args) {

		final double TAUX_REDUCTION = 0.15;

		int agePersonne = Console.lireInt("Quel est ton âge ? ");
		double prixBillet = 12.95;

		if (agePersonne > 17) {
			System.out.println("Tu es majeur.");
		} else {
			System.out.println("Tu es mineur.");
		}

		if (agePersonne < 18) {
			prixBillet = prixBillet * (1 - TAUX_REDUCTION);
		}

		System.out.printf("Prix du billet = %.2f EUR\n", prixBillet);

	}

}
