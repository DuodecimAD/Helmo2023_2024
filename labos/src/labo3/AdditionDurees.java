package labo3;

import io.Console;

/**
 * Addition de 2 durées à partir d'une string sous la forme : hh:mm:ss
 */
public class AdditionDurees {
	public static void main(String[] args) {

		// Variables
		String duree1EnStr;// = "6h 21min 30s";
		String duree2EnStr;// = "3h 38min 45s";
		int hT, mT, sT;
		int h, m, s;
		int h1, m1, s1, h2, m2, s2;
		int d1, d2, dT;

		// Acquisition
		duree1EnStr = Console.lireString("Durée 1 ? ");
		duree2EnStr = Console.lireString("Durée 2 ? ");
		h = duree1EnStr.indexOf("h");
		m = duree1EnStr.indexOf("min");
		s = duree1EnStr.indexOf("s");
		h1 = Integer.parseInt(duree1EnStr.substring(0, h).trim());
		m1 = Integer.parseInt(duree1EnStr.substring(h + 1, m).trim());
		s1 = Integer.parseInt(duree1EnStr.substring(m + 3, s).trim());
		h = duree2EnStr.indexOf("h");
		m = duree2EnStr.indexOf("min");
		s = duree2EnStr.indexOf("s");
		h2 = Integer.parseInt(duree2EnStr.substring(0, h).trim());
		m2 = Integer.parseInt(duree2EnStr.substring(h + 1, m).trim());
		s2 = Integer.parseInt(duree2EnStr.substring(m + 3, s).trim());

		// Traitement
		d1 = h1 * 3600 + m1 * 60 + s1;
		d2 = h2 * 3600 + m2 * 60 + s2;
		dT = d1 + d2;
		hT = dT / 3600;
		dT %= 3600;
		mT = dT / 60;
		sT = dT % 60;

		// Affichage
		System.out.printf("%dh %dmin %ds\n", hT, mT, sT);
	}
}