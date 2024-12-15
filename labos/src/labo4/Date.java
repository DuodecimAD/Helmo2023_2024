package labo4;

public class Date {

	public static void main(String[] args) {

		// Variables
		String date;

		// Acquisition
		date = "28/2/2024";
				//Console.lireString("Date au format jj/mm/aaaa ? ");

		// Traitement


		// Affichage
		/*
		System.out.println(getJour(date));
		System.out.println(getMois(date));
		System.out.println(getAnnee(date));


		System.out.println(joursParMois(12, 2001));
		*/
		System.out.println(formaterDate(12,3,1984));

	}

	public static int getJour(String date) {
		return Integer.parseInt(date.substring(0, date.indexOf("/")));
	}

	public static int getMois(String date) {
		return Integer.parseInt(date.substring(date.indexOf("/")+1, date.indexOf("/", date.indexOf("/")+1)));
	}

	public static int getAnnee(String date) {
		return Integer.parseInt(date.substring(date.indexOf("/", date.indexOf("/")+1)+1));
	}

	public static boolean estBissextile(int annee) {

		return ((annee % 4 == 0 && annee % 100 != 0) || annee % 400 == 0);
	}

	public static int joursParMois(int mois, int annee) {
		int nbDays;

		switch (mois) {
			case 1 -> nbDays = 31;
			case 2 -> {
				if(estBissextile(annee)){
					nbDays = 29;
				}else {
					nbDays = 28;
				}
			}
			case 3 -> nbDays = 31;
			case 4 -> nbDays = 30;
			case 5 -> nbDays = 31;
			case 6 -> nbDays = 30;
			case 7 -> nbDays = 31;
			case 8 -> nbDays = 31;
			case 9 -> nbDays = 30;
			case 10 -> nbDays = 31;
			case 11 -> nbDays = 30;
			case 12 -> nbDays = 31;
			default -> nbDays = 0;
		}

		return nbDays;
	}

	public static String formaterDate(int jour, int mois, int annee) {
		/*
		String dateFormated = "";
		String sJour = Integer.toString(jour);
		String sMois = Integer.toString(mois);
		String sAnnee = Integer.toString(annee);

		if (sJour.length() == 2) {
			dateFormated += sJour+"/";
		} else {
			dateFormated += "0"+ sJour+"/";
		}

		if (sMois.length() == 2) {
			dateFormated += sMois+"/";
		} else {
			dateFormated += "0"+ sMois+"/";
		}

		dateFormated+= sAnnee;

		return dateFormated;
		*/
		return String.format("%02d/%02d/%04d",jour,mois,annee);
	}
	/*
	public static boolean estValide(int jour, int mois, int annee) {

	}
*/
}
