/*
 * Objetivo: Realizar un juego para adivinar un número
 * Autor: Karim Zinnatullin
 * Fecha: 19/10/2023
 */
package ejercicio7;

import java.util.Scanner;
import java.lang.Math;

public class ejercicio7 {

	public static void main(String[] args) {
		// creamos variables
		byte num;
		Scanner sc = new Scanner(System.in);
		byte N = (byte) (Math.random() * 10 + 1); // creamos el número aleatorio

		do {
			System.out.println("adivina el númerop (del 1 al 10)");
			num = sc.nextByte();
			if (num < N) {
				System.out.println("Demasiado bajo!");
			} else if (num > N) {
				System.out.println("Te has pasado!");
			}

		} while (N != num);
		sc.close();
		System.out.println("Por fin aciertas!");
	}

}
