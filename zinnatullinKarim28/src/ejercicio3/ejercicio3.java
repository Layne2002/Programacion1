/*
 * Objetivo: enseñar los numeros del 100 al 1 con el bucle do-while
 * Autor:Karim Zinantullin
 * Fecha: 19/10/2023
 */

package ejercicio3;

public class ejercicio3 {

	public static void main(String[] args) {
		// creamos la variable numero
		byte num;

		// inicializamos la variable
		num = 100;
		// hacemos el bucle
		do {
			System.out.println(num); // mostramos el numero
			num -= 1; // disminuir el numero en 1 cada bucle
		} while (num > 0); // la condicion del bucle

	}

}
