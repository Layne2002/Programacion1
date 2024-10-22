/*
 * Objetivo: Escribe un programa Java que muestre los números desde el 1 hasta un número N que se
introducirá por teclado.
 * Autor: Karim Zinnatullin
 * Fecha: 23/10/2023
 */
package ejercicio4;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		// creamos variables
		int num, contador;
		Scanner sc = new Scanner(System.in);

		// pedimos el número
		System.out.println("Dime un número y te mostraré todos los números dsde el 1 hasta él");
		num = sc.nextInt();
		sc.close();
		// creamos bucle
		contador = 1;
		while (contador <= num) {
			System.out.println(contador);
			contador++;
		}

	}

}
