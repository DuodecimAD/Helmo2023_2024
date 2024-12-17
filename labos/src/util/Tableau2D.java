package util;

public class Tableau2D {
	
	public static void afficher(char[][] t) {
		
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {
				if (j == 0) {
					System.out.print(t[i][j]);
				} else {
					System.out.print(" " + t[i][j]);
				}
				
			}
			System.out.println();
		}
	}
}
