package chap9;

import java.util.Arrays;

import io.Console;

public class LectureDate {

	public static void main(String[] args) {
		
		// Tableaux
		
		
		// Variables
		
		
		// Acquisition
		int[] dateJM = lireDate("Date de naissance (j/m/a) ? ");
		int[] dateJMA = lireDate("Date de ton anniversaire (j/m) ? ");
		
		// Affichage
		/*System.out.print("[");
		int counter = 0;
		for (int i : dateJMA) {
			if(counter < dateJMA.length-1) {
				System.out.print(i + ", ");
			}else {
				System.out.print(i);
			}
			counter++;
		}
		System.out.print("]");
		*/
		System.out.println(Arrays.toString(dateJM));
		System.out.println(Arrays.toString(dateJMA));
		
		

	}
	
	public static int[] lireDate(String message) {
		
		String dateSaisie;
		do {
		dateSaisie = Console.lireString(message).trim();
		} while (!dateSaisie.matches("\\d{1,2}\\/\\d{1,2}(\\/\\d{4})?"));
		
		String[] jmaEnStr = dateSaisie.split("/");
		
		int[] dateSplitted = new int[jmaEnStr.length];
		
		for (int i = 0; i < dateSplitted.length; i++) {
			dateSplitted[i] = Integer.parseInt(jmaEnStr[i]);
		}
		
		return dateSplitted;
	}

}
