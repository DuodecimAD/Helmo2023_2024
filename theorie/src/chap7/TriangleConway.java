package chap7;

import io.Console;

public class TriangleConway {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int max = 3;

		//max = Console.lireInt("Nombre lignes ? ");
		
		for (int i = 1; i <= max; i++) {
			System.out.print(i);
			if(!(i % 2 == 0)) {
				System.out.println();
				for (int j = 1; j <= i+1; j++) {
					System.out.printf(j+""+i);
					if(j % 3 == 0) {
						System.out.println();
						for (int y = 0; y < 2 ; y++) {
							System.out.print(j);
							System.out.println();
						}
					}
				}
			}
			
		}
	}

}
