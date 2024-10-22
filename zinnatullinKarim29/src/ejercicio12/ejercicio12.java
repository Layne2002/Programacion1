/*
 * Objetivo:  calcule el valor A elevado a B (A^B) sin hacer uso del operador de
potencia (^), siendo A y B valores introducidos por teclado, y luego muestre el resultado por
pantalla.
 * Autor: Karim Zinnatullin
 * Fecha: 24/10/2023
 */
package ejercicio12;

import java.util.Scanner;

public class ejercicio12 {

	public static void main(String[] args) {
		// Creamos variables
		int A, B, resultado;
		Scanner input = new Scanner(System.in);

		System.out.println("Te pediré un numero A y otro B, elevaré A a potencia de B");
		System.out.println("Dime el valor de A: ");
		A = input.nextInt();
		System.out.println("Dime el valor de B: ");
		B = input.nextInt();
		resultado = A;
		for (int i = 2; i <= B; i++) {
			resultado = resultado * A;
		}
		input.close();
		System.out.println(A + " elevado a " + B + " vale: " + resultado);

	}

}
