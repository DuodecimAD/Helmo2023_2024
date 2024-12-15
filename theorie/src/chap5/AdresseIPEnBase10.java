package chap5;

public class AdresseIPEnBase10 {
	public static void main(String[] args) {

		// Variables pour l'entrée
		String ip = "11000000.10101000.00000001.00000101";
		//           01234567890123456789012345678901234
		//                     1         2         3

		// Variables pour la sortie
		String octet1Str, octet2Str, octet3Str, octet4Str;

		// Traitement
		// () Extraire les 4 octets de l'adresse IP
		octet1Str = ip.substring(0,8);
		octet2Str = ip.substring(9,17);
		octet3Str = ip.substring(18,26);
		octet4Str = ip.substring(27,35);

		// (2) Convertir en base 10 chaque octet
		//octet1 (octet1Str.charAt(0) - '0') * 128;
		String readableIp = String.format("%d.%d.%d.%d", calcul(octet1Str), calcul(octet2Str), calcul(octet3Str), calcul(octet4Str));

		// Affichage
		System.out.println(readableIp);
	}

	public static int calcul(String param){
		int result=0;
		int temp;

		for (int i=0; i<8; i++) {
			temp=128;
			if((param.charAt(i)-'0') == 1){
				for (int j=0; j<i; j++) {
					temp -= temp/2;
				}
				result += temp;
			}
		}
		return result;
	}
}