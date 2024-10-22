/*
 * Objetivo: enseñar los numeros del 1 al 100 con el bucle while
 * Autor:Karim Zinantullin
 * Fecha: 19/10/2023
 */

package ejercicio1;

public class ejercicio1 {

	public static void main(String[] args) {
		// creamos la variable numero
		byte num;

		// inicializamos la variable
		num = 1;
		// hacemos el bucle
		while (num <= 100) {
			System.out.println(num); // mostramos el numero
			num++; // aumentamos el numero en 1 cada bucle
		}

	}

}
