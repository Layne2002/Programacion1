/*
 * Objetivo: solicitar numeros positivos y enseñar calculos sobre ellos
 * Autor: Karim Zinnatullin
 * Fecha: 19/10/2023
 */
package ejercicio4;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		// creamos variables
		Scanner sc = new Scanner(System.in);
		int contador, num, total;

		// inicializamos las variables
		contador = 1;

		// pedimos el primer número
		System.out.println("Dame el primer número positivo");
		num = sc.nextInt();
		total = num; // inicializamos la variable total

		// creamos el bucle
		while (num != 0) {
			System.out.println("Dime un número positivo (para parar introduce 0)");
			num = sc.nextInt();
			if (num > 0) {
				contador++;
				total = total + num;

			} else if (num < 0) {
				System.out.println("Has introducido un número negativo!");
			}
		}
		sc.close();
		System.out.println(
				"Cantidad de números positivos introducidos: " + contador + "\r\nSuma total de los números positivos: "
						+ total + "\r\nMedia de los números positivos: " + (total / contador));

	}
}
