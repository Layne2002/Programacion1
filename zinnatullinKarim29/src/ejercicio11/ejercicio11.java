/*
 * Objetivo: Escribe un programa Java que suma independientemente los pares y los impares de los números
comprendidos entre 100 y 200, y luego muestra por pantalla ambas sumas
 * Autor: Karim Zinnatullin
 * Fecha: 24/10/2023
 */
package ejercicio11;

public class ejercicio11 {

	public static void main(String[] args) {
		// creamos variables
		int sumaPares, sumaImpares;

		// las inizializamos a 0
		sumaPares = 0;
		sumaImpares = 0;

		// creamos un bucle
		for (int i = 100; i <= 200; i++) {
			if (i % 2 == 0) {
				sumaPares = sumaPares + i;
			} else {
				sumaImpares = sumaImpares + i;
			}
		}
		System.out.println("Suma de los números pares entre 100 y 200: " + sumaPares);
		System.out.println("Suma de los números impares entre 100 y 200: " + sumaImpares);

	}

}
