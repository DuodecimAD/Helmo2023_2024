package util;

public class TableauEntiers {

	
	public static boolean contient(int[] tableau, int a) {
		
		for (int i = 0; i < tableau.length; i++) {
			if(tableau[i] == a) {
				return true;
			}
		}
		
		return false;
	}
	/**
	 * 
	 * @param tableau tableau d'entiers complet
	 * @param i element a permuté
	 * @param j nouvelle position de element i
	 */
	public static void permuter(int[] tableau, int i, int j) {
		int temp = tableau[i];
		tableau[i] = tableau[j];
		tableau[j] = temp;
	}
	
	public static String toString(int[] tableau) {
		String str = "";
		for (int i = 0; i < tableau.length; i++) {
			if (i > 0) {
				str += ", ";
			}
			str += tableau[i];
		}
		
		return str;
	}

}
