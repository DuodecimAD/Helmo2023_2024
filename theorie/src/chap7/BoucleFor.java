package chap7;

public class BoucleFor {

	public static void main(String[] args) {
		// Afficher les 20 premiers nombres impairs
		// 1, 3, 5, 7, ..., 37, 39
		
		for (int i = 1; i <= 20; i++) {
			System.out.println(i * 2 -1);
		}
		
		int n = 1;
		for (int i = 1; i <= 20; i++) {
			System.out.println(n);
			n+=2;
		}
		
		for (int i = 1; i <= 39; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
		
		for (int i = 1; i <= 39; i+=2) {
			System.out.println(i);
		}

	}

}
