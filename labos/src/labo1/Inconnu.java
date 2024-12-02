package labo1;

public class Inconnu {

	public static void main(String[] args) {
		int nombre = 7805;
		int somme = 0;
		int chiffre;

		chiffre = nombre % 10;
		somme = somme + chiffre;
		nombre = nombre / 10;
		System.out.println("nombre="+nombre+ ", chiffre="+chiffre+ ", somme="+somme);
		chiffre = nombre % 10;
		somme = somme + chiffre;
		nombre = nombre / 10;
		System.out.println("nombre="+nombre+ ", chiffre="+chiffre+ ", somme="+somme);
		chiffre = nombre % 10;
		somme = somme + chiffre;
		nombre = nombre / 10;
		System.out.println("nombre="+nombre+ ", chiffre="+chiffre+ ", somme="+somme);
		chiffre = nombre % 10;
		somme = somme + chiffre;
		nombre = nombre / 10;
		System.out.println("nombre="+nombre+ ", chiffre="+chiffre+ ", somme="+somme);
		System.out.printf("nombre=%3d, chiffre=%3d, somme=%3d\n", nombre, chiffre, somme);
	}

}