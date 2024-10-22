/*
 * Objetivo: acceso beca
 * Autor. Karim Zinnatullin
 * Fecha: 15/12/2023
 */
package ejercicio4;



public class ejercicio4 {
	
	public static String accesoBecaUsa(int edad, double nota, double renta, boolean idioma) {
		if (idioma == false || edad > 30)
			return "No apto";
		else if (nota > 9)
			return "Apto";
		else if (nota < 5)
			return "No apto";
		else if (renta < 20000)
			return "Apto";
		else
			return "No apto";

	}

}
