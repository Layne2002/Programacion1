/*
 * Objetivo: enseñar los numeros del 1 al 100 con el bucle do-while
 * Autor:Karim Zinantullin
 * Fecha: 19/10/2023
 */

package ejercicio2;

public class ejercicio2 {

	public static void main(String[] args) {
		// creamos la variable numero
		byte num;

		// inicializamos la variable
		num = 1;
		// hacemos el bucle
		do {
			System.out.println(num); // mostramos el numero
			num++; // aumentamos el numero en 1 cada bucle
		} while (num <= 100); // la condicion del bucle

	}

}
