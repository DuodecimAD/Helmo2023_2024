package labo3;

/**
 * Permet de calculer la température de chaque planète de notre système solaire
 * dépendament de sa ditance par rapport au soleil et son albedo.
 */
public class TemperaturesSystemeSolaire {

	public static void main(String[] args) {

		//Variables
		final double DIST_MERCURE 	= 0.38, 	ALBEDO_MERCURE 	= 0.068;
		final double DIST_VENUS 	= 0.72, 	ALBEDO_VENUS 	= 0.770;
		final double DIST_TERRE 	= 1.00, 	ALBEDO_TERRE 	= 0.294;
		final double DIST_MARS 		= 1.52, 	ALBEDO_MARS 	= 0.250;
		final double DIST_JUPITER 	= 5.21, 	ALBEDO_JUPITER 	= 0.343;
		final double DIST_SATURNE 	= 9.54, 	ALBEDO_SATURNE 	= 0.342;
		final double DIST_URANUS 	= 19.18, 	ALBEDO_URANUS 	= 0.300;
		final double DIST_NEPTUNE 	= 30.11, 	ALBEDO_NEPTUNE 	= 0.290;

		// Acquisition

		// Traitement

		// Affichage
		System.out.printf("\n%-7s = %6.1f°C", "Mercure", enCelsius(temperatureTheorique(DIST_MERCURE, ALBEDO_MERCURE)));
		System.out.printf("\n%-7s = %6.1f°C", "Venus", enCelsius(temperatureTheorique(DIST_VENUS, ALBEDO_VENUS)));
		System.out.printf("\n%-7s = %6.1f°C", "Terre", enCelsius(temperatureTheorique(DIST_TERRE, ALBEDO_TERRE)));
		System.out.printf("\n%-7s = %6.1f°C", "Mars", enCelsius(temperatureTheorique(DIST_MARS, ALBEDO_MARS)));
		System.out.printf("\n%-7s = %6.1f°C", "Jupiter", enCelsius(temperatureTheorique(DIST_JUPITER, ALBEDO_JUPITER)));
		System.out.printf("\n%-7s = %6.1f°C", "Saturne", enCelsius(temperatureTheorique(DIST_SATURNE, ALBEDO_SATURNE)));
		System.out.printf("\n%-7s = %6.1f°C", "Uranus", enCelsius(temperatureTheorique(DIST_URANUS, ALBEDO_URANUS)));
		System.out.printf("\n%-7s = %6.1f°C", "Neptune", enCelsius(temperatureTheorique(DIST_NEPTUNE, ALBEDO_NEPTUNE)));

	}


/**
 *
 * @param distanceAU distance de la planète par rapport au soleil en "au" (astronomical unit)
 * @param albedo réflection des rayoins du soleil par la planète
 * @return température en Kalvin
 */
	public static double temperatureTheorique(double distanceAU, double albedo) {
		return 280 * Math.pow((1 - albedo) / (Math.pow(distanceAU,2)), 0.25);
	}
	/**
	 *
	 * @param tKalvin température de la planète en Kalvin
	 * @return température de la planète en Celcius
	 */
	public static double enCelsius(double tKalvin) {
		return tKalvin - 273.15;
	}

}
