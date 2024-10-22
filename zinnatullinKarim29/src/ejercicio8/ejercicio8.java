/*
 * Objetivo: Escribe un programa Java que lea una secuencia de números no nulos hasta que se introduzca
un 0, y luego muestre si ha leído algún número negativo, cuantos positivos y cuantos negativos.
 * Autor: Karim Zinnatullin
 * Fecha: 23/10/2023
 */
package ejercicio8;

import java.util.Scanner;

public class ejercicio8 {

	public static void main(String[] args) {
		// Creamos variables
		Scanner sc = new Scanner(System.in);
		int num;
		byte contadorNegativos, contadorPositivos;
		boolean banderaNegativos;
		// inicializamos variables
		contadorNegativos = 0;
		contadorPositivos = 0;

		System.out.println("introduce otro número (o el 0 para parar):");
		num = sc.nextInt();
		banderaNegativos = false;
		// creamos bucle
		while (num != 0) {
			System.out.println("introduce otro número (o el 0 para parar):");
			num = sc.nextInt();

			if (num < 0) {
				contadorNegativos++;
				banderaNegativos = true;
			} else {
				contadorPositivos++;
			}
		}
		sc.close();
		if (banderaNegativos == true) {
			System.out.println("He encontrado números negativos, un total de " + contadorNegativos + "!");
		} else {
			System.out.println("No he enctroado ningún número negativos!");
		}
		System.out.println("Números POSITIVOS introducidos: " + contadorPositivos);

	}

}
