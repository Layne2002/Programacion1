// Autor: Karim Zinnatullin
package astros;

import astros.Satelite.Orbita;

public class Main {

	public static void main(String[] args) {
		System.out.println("Creando el Planeta Tierra y la luna...\n");
		/*
		 * String nombre, double masa1, int masa2, double diametro1, int diametro2, int
		 * periodoRotacion, int periodoTraslacion, double distancia1, int distancia2,
		 * double gravedad, double distanciaSol1, int distanciaSol2, boolean orbitaSol,
		 * boolean tieneSatelite
		 */
		Planeta tierra = new Planeta("Tierra", 5.972, 24, 12756, 0, 24, 365, 0, 0, 9.8, 1.5, 8, true, true);
		/*
		 * String nombre, double masa1, int masa2, double diametro1, int diametro2, int
		 * periodoRotacion, int periodoTraslacion, double distancia1, int distancia2,
		 * double gravedad, double distanciaPlaneta1, int distanciaPlaneta2, Orbita
		 * orbita, String pertenecePlaneta, String nombreSatelite
		 */
		Satelite luna = new Satelite("Luna", 7.4, 22, 3476, 0, 27, 27, 384000, 0, 1.62, 384000, 0, Orbita.ELIPTICA,
				"Tierra");
		System.out.printf("%s\n", tierra.muestra());
		System.out.printf("%s\n", luna.muestra());
		System.out.println("Mostrando el nombre de todos los astros a la vez:");
		System.out.printf("%s\n\n", Astro.getAllAstros());

		System.out.println("Mostrando la información de todos los astros:");
		System.out.printf("%s\n", Astro.getInfoAstros());
	}

}
