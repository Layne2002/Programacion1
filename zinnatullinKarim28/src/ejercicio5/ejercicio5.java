/*
 * Objetivo: Pedir 10 números. Mostrar la media de los números positivos, la media de los números 
negativos y la cantidad de ceros
 * Autor: Karim Zinnatullin
 * Fecha: 19/10/2023
 */
package ejercicio5;

import java.util.Scanner;

public class ejercicio5 {
	public static void main(String[] args) {
		// creamos variables
		int num, totalPositivo, totalNegativo, contadorPositivo, contadorNegativo;
		byte ceros;
		Scanner sc = new Scanner(System.in);

		// inicializamos los contadores

		contadorPositivo = 0;
		contadorNegativo = 0;
		totalPositivo = 0;
		totalNegativo = 0;
		ceros = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.println("Dame un número");
			num = sc.nextInt();
			if (num > 0) {
				totalPositivo += num;
				contadorPositivo++;
			} else if (num < 0) {
				totalNegativo += num;
				contadorNegativo++;
			} else {
				ceros++;
			}

		}
		sc.close();// cerramos el Scanner
		// mostramos en pantalla los calculos
		if (contadorPositivo > 0) {
			System.out.println("Media de números positivos: " + (double) (totalPositivo / contadorPositivo));
		} else {
			System.out.println("No se puede hacer la media de los números positivos");
		}
		if (contadorNegativo > 0) {
			System.out.println("Media de números negativos: " + (double) (totalNegativo / contadorNegativo));
		} else {
			System.out.println("No se puede hacer la media de los números negativos");
		}
		System.out.println("Ceros introducidos en total: " + ceros);

	}
}
