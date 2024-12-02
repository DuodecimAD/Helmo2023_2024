package labo5;

import io.Console;

public class MatchDeTennis {

	public static void main(String[] args) {
		// Variables
		String name1, name2;
		int point1 = 0, point2 = 0, point;
		boolean maCondition1, maCondition2;


		// Acquisitions
		name1 = Console.lireString("Joueur 1 ? ");
		name2 = Console.lireString("Joueur 2 ? ");

		System.out.printf("%s \t %s\n", name1, getScore(point1));
		System.out.printf("%s \t %s\n", name2, getScore(point2));

		do {
			point = Console.lireInt("\nQuel joueur gagne le point (1 ou 2) ? ");

			if(point == 1) {
				point1++;
			} else {
				point2++;
			}

			point = Math.abs(point1-point2);
			maCondition1 = !(point1 >= 4 && point >= 2);
			maCondition2 = !(point2 >= 4 && point >= 2);

			if(maCondition1 && maCondition2) {
				System.out.printf("%s \t %s\n", name1, getScore(point1));
				System.out.printf("%s \t %s\n", name2, getScore(point2));
			} else {

				if(point1 > point2) {
					System.out.println(name1 + " remporte le jeu !");
				} else {
					System.out.println(name2 + " remporte le jeu !");
				}
			}

		} while (maCondition1 && maCondition2);





	}

	static String getScore(int points) {
		String strReturned;
		switch (points) {
		case 0 -> strReturned = " 0";
		case 1 -> strReturned = "15";
		case 2 -> strReturned = "30";
		case 3 -> strReturned = "40";
		case 4 -> strReturned = " A";
		default -> strReturned = " ?";
		}
		return strReturned;
	}
}
