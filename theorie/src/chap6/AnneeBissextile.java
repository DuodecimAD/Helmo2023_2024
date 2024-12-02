package chap6;

import io.Console;

public class AnneeBissextile {

	public static void main(String[] args) {
		
		//int annee = estBissextile(Console.lireInt("check quel année ? "));

		System.out.println(estBissextile(1996));
		System.out.println(estBissextile(2000));
		System.out.println(estBissextile(2004));
		System.out.println(estBissextile(2024));
		System.out.println(estBissextile(2400));
		System.out.println(estBissextile(2021));
		System.out.println(estBissextile(2022));
		System.out.println(estBissextile(2100));
		System.out.println(estBissextile(2200));
		System.out.println(estBissextile(2700));
		
	}

	public static boolean estBissextile(int annee) {
		return ((annee % 4 == 0 && annee % 100 != 0) || annee % 400 == 0);

	}
}
