package labo1;

public class ConversionsTemperature {

	public static void main(String[] args) {
		double tCelsius;
		double tKelvin;
		double tFarhenheit = 0;

		tCelsius =  tFarhenheit - 32 / 1.8;
		tKelvin = tCelsius + 273.15;
		//tCelsius = tKelvin - 273.15;
		//tFarhenheit = (double)9 / 5 * tCelsius) + 32;


		System.out.print(tCelsius);
		System.out.println("C");
		System.out.print(tKelvin);
		System.out.println("K");
		//System.out.print(tFarhenheit);
		//System.out.println("°F");

		double c1 = 19, k1 = 292.15, f1 = 66.20;
		System.out.printf("%8.2f %8.2f %8.2f\n", c1, k1, f1);
		double c2 = 20, k2 = 293.15, f2 = 68.00;
		System.out.printf("%8.2f %8.2f %8.2f\n", c2, k2, f2);
		double c3 = 21, k3 = 294.15, f3 = 69.80;
		System.out.printf("%8.2f %8.2f %8.2f\n", c3, k3, f3);
		double c4 = -173.15, k4 = 100.00, f4 = -279.67;
		System.out.printf("%8.2f %8.2f %8.2f\n", c4, k4, f4);
		double c5 = -17.77, k5 = 255.37, f5 = 0;
		System.out.printf("%8.2f %8.2f %8.2f\n", c5, k5, f5);
	}
}

