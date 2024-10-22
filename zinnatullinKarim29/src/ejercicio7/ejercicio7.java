/*
 * Objetivo: Escribe un programa Java que lea 100 números no nulos y luego muestre un mensaje indicando
cuántos son positivos y cuantos negativos.
 * Autor: Karim zinnatullin
 * Fecha: 23/10/2023
 */
package ejercicio7;

import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		// creamos variables
		int num;
		Scanner sc = new Scanner(System.in);
		byte contadorNegativos, contadorPositivos;
		contadorNegativos = 0;
		contadorPositivos = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.println("introduce un número que no sea el 0:");
			num = sc.nextInt();

			if (num < 0) {
				contadorNegativos++;
			} else if (num > 0) {
				contadorPositivos++;
			} else {
				System.out.println("No introduzcas el 0!");
				i = i - 1; // con esto hacemos que el bucle no cuente el 0 introducido por el usuario
			}
		}
		sc.close();
		System.out.println("Números POSITIVOS introducidos: " + contadorPositivos);
		System.out.println("números NEGATIVOS introducidos: " + contadorNegativos);
	}

}
