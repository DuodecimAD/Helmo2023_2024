package util;

public class TableauEntiers {

	/**
	 * Retourne la somme des éléments d'un tableau d'entiers
	 * @param tableau à une dimension
	 * @return somme des éléments
	 */
	public static int sommer(int[] t) {
		int somme = 0;
		
		if(t.length == 0) {
			return 0;
		}
		
		for (int i = 0; i < t.length; i++) {
			somme += t[i];
		}
		
		return somme;
	}
	
	

}
