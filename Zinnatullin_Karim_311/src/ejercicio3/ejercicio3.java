/*
 * Objetivo: matriz de tamaño NxM (tamaño introducido por teclado) e
introduzca en ella NxM valores (también introducidos por teclado). Luego deberá recorrer la
matriz y al final mostrar por pantalla cuántos valores son mayores que cero, cuántos son
menores que cero y cuántos son igual a cero.
 * Autor: Karim Zinnatullin
 * Fecha: 13/11/2023
 */
package ejercicio3;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		int contadorPositivo = 0, contadorNegativo = 0, contador0 = 0;
		Scanner input = new Scanner(System.in);
		int N, M;
		System.out.println("Dime el valor de N:");
		N = input.nextInt();
		System.out.println("Dime el valor de M:");
		M = input.nextInt();

		int[][] matriz = new int[N][M];
		for (int i = 0; i < N; i++) {
			System.out.println("Fila " + (i + 1) + ":");
			for (int j = 0; j < M; j++) {
				System.out.println("Introduce el valor de la tabla " + (j + 1) + ":");
				matriz[i][j] = input.nextInt();
				if (matriz[i][j] > 0) {
					contadorPositivo++;
				} else if (matriz[i][j] < 0) {
					contadorNegativo++;
				} else {
					contador0++;
				}
			}
		}
		input.close();
		System.out.println("He encontado " + contadorPositivo + " números positivos");
		System.out.println("He encontrado " + contadorNegativo + " números negativos");
		System.out.println("he encontado " + contador0 + " ceros");

	}

}
