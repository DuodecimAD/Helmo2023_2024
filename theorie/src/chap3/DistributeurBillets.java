package chap3;

import io.Console;

public class DistributeurBillets {
	
	public static void main(String[] args) {
		
		// Variables
		int montant;// = 790;
		int qte200, qte100, qte50, qte20, qte10;
		
		// Acquisition du montant
		//System.out.print("Montant en euros ? ");
		//montant = Console.lireInt();
		
		montant = Console.lireInt("Montant en euros ? ");
		
		// Traitement
		// 1. Déterminer le nombre de billets de 200
		qte200 = montant / 200; // permet d'obtenir le quotient (ici, 3)
		montant = montant % 200; // permet d'obtenir le reste (ici, 190)
		//montant = montant - qte200 * 200;
		//montant %= 200;
		
		// 2. Déterminer le nombre de billets de 100
		qte100 = montant / 100;
		montant = montant % 100;
		
		// 3. Déterminer le nombre de billets de 50
		qte50 = montant / 50;
		montant = montant % 50;
		
		// 4. Déterminer le nombre de billets de 20
		qte20 = montant / 20;
		montant = montant % 20;
		
		// 5. Déterminer le nombre de billets de 10
		qte10 = montant / 10;
		montant = montant % 10;
		
		// Affichage des résultats
		//System.out.print(qte200);
		//System.out.println(" fois 200");
		
		//System.out.println(qte200 + " fois 200");
		
		System.out.printf("%d fois 200\n", qte200);
		System.out.printf("%d fois 100\n", qte100);
		System.out.printf("%d fois  50\n", qte50);
		System.out.printf("%d fois  20\n", qte20);
		System.out.printf("%d fois  10\n", qte10);
	}
	
}