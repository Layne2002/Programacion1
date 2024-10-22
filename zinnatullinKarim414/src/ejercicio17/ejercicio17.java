/*
 * Objetivo: Realiza un programa que nos pida número enteros hasta que se introduzca el 0, diciéndonos,
para cada número introducido si es primo o no. Hay que recordar que un número es primo si es
divisible por si mismo y por 1. El 1 no es primo por convenio. Se debe crear una función que
pasándole un número entero devuelva si es primo o no.
 * Autor: Karim Zinnatullin
 * Fecha: 12/12/2023
 */
package ejercicio17;

import java.util.Scanner;

public class ejercicio17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		do {
			System.out.println("Dime un numero y te dire si es primo o 0 para parar");
			num = input.nextInt();
			if (num != 0) {
				System.out.println(primo(num));
				System.out.println("---------------------------------------------------");
				System.out.println("");
			}
		} while (num != 0);
		input.close();
	}

	public static boolean primo(int num) {

		if (num == 1) {
			return false;
		} else {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					return false;
				}
			}
		}
		return true;
	}
}
