package exercice;

public class Decompose {

	public static void main(String[] args) {

		//Scanner scanner = new Scanner(system.in);
		//int saisie = scanner.nextInt();



		//int montant = 790;
		int montant;
		int deuxcent, cent, cinquante, vingt, cinq, result;

		//System.out.println("Montant ?");
		//montant = Console.lireInt();

		montant = Console.lireInt("Montant ?");


		deuxcent = montant / 200;
		result = montant % 200;
		System.out.println("pour " + montant + " = " );
		System.out.println(deuxcent + " billets de 200 ");

		cent = result / 100;
		result = result % 100;
		System.out.println(cent + " billets de 100 ");

		cinquante = result / 50;
		result = result % 50;
		System.out.println(cinquante + " billets de 50 ");

		vingt = result / 20;
		result = result % 20;
		System.out.println(vingt + " billets de 20 ");

		cinq = result / 5;
		result = result % 5;
		System.out.println(cinq + " billets de 5 ");

	}

}