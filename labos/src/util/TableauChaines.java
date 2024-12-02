package util;

public class TableauChaines {

	public static void permuter(String[] tableau, int i, int j) {
		String temp;

		temp = tableau[i];
		tableau[i] = tableau[j];
		tableau[j] = temp;
	}

	public static void melanger(String[] tableau) {
		for (int i = 0; i < tableau.length; i++) {
			tableau[i] = tableau[Aleatoire.aleatoire(tableau.length-1)];
		}
	}

	public static String toString(String[] tableau, int nbElements) {
		String stuff = "";
		for (int i = 0; i < nbElements; i++) {
			if(i > 0) {
				stuff+= ", " + tableau[i].toString();
			} else {
				stuff += tableau[i].toString();
			}
		}

		return stuff;
	}

}
