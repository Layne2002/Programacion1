/*
 * Objetivo: calcular múltiplos de 5 o 9 entre 100 y 400
 * Autor: Karim Zinnatullin
 * Fecha: 26/10/2023
 */
package ejercicio2;

public class ejercicio2 {

	public static void main(String[] args) {
		
		// creamos un bucle de 100 a 400
		for (int i = 100; i <= 400; i++) {
			if (i % 5 == 0 && i % 9 != 0) { 	// si el resto de divir i entre 5 es 0 entonces es múltiplo de 5
												// y si entre 9, entonces es múltiplo de 9 asi que no lo enseñamos
				if (i % 15 == 0) {				// si es múltiplo de 15	
					System.out.println(i + " es múltiplo de 5 y de 15");
				} else {
					System.out.println(i + " es múltiplo de 5");
				}
			} else if (i % 9 == 0 && i % 5 != 0) {		// lo mismo aquí pero para múltiplos de 9
				System.out.println(i + " es múltiplo de 9");
			}
		}

	}

}
