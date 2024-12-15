package chap5;

public class Aleatoire {

public static int aleatoire() {

		return aleatoire(0, Integer.MAX_VALUE);
	}

	public static int aleatoire(int max) {
		return aleatoire(0, max);
	}

	/**
	 *  Permet de choisir aleatoirement unentiercompris dans l'intervalle [0;max]
	 * @param max : La borne supérieure inclusive de l'intervalle.
	 * @return : un entier compris entre 0 et max
	 */
	public static int aleatoire(int min, int max) {
		int tailleIntervalle = max - min + 1;
		return (int)(Math.random() * tailleIntervalle) + min;
	}

}
