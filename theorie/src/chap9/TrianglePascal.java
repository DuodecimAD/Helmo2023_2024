package chap9;

import java.util.Arrays;

import io.Console;

public class TrianglePascal {

	public static void main(String[] args) {
		
		int  nbLignes = Console.lireInt("Nombre de lignes ? ");

		int[][] triangle = new int[nbLignes][];
		
		for (int i = 0; i < triangle.length; i++) {
			
			triangle [i] = new int[i+1];
			
			triangle[i][0] = 1;
			triangle[i][i] = 1;
			for (int j = 1; j < i; j++) {
				
				triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
				
			}
			 //System.out.println(Arrays.toString(triangle[i]));
		}
		//System.out.println(Arrays.deepToString(triangle));
		afficher(triangle);
	}
	
	
	public static void afficher(int[][] t) {
		
		for (int[] ligne : t) {
			for (int element : ligne) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
	}

}
