package exercice;

public class StringEx {

	public static void main(String[] args) {

		String prenom;
		prenom = Console.lireString("\nPrenom ? ");
		System.out.println("longueur prenom : " + prenom.length());
		System.out.println("premiere lettre : " + prenom.charAt(0));
		System.out.println("derniere lettre : " + prenom.charAt(prenom.length()-1));
		System.out.println(prenom.substring(0,1).toUpperCase() + prenom.substring(1).toLowerCase());
	}

}