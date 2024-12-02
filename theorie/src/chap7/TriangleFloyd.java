package chap7;

import io.Console;

public class TriangleFloyd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int c=1, max;
		
		max = Console.lireInt("Nombre lignes ? ");
		
		for (int i = 1; i <= max; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.printf("%3d ",c);
				c++;
			}
			System.out.println();
		}
	}

}
