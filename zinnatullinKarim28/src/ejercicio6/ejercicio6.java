/*
 * Objetivo: Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un 
número negativo.
 * Autor: Karim Zinnatullin
 * fecha: 19/10/2023
 */
package ejercicio6;

import java.util.Scanner;
import java.lang.Math;

public class ejercicio6 {

	public static void main(String[] args) {
		// creamos variables
		double num;
		Scanner sc = new Scanner(System.in);

		num = 0;// inicializamos la variable num
		double raiz = Math.sqrt(num); // declaramos la variable raiz
		while (num >= 0) {
			System.out.println("dame un número positivo (o negativo para parar)");
			num = sc.nextInt();
			if (num >= 0) {
				System.out.println("La raíz cuadrada de " + num + " es " + raiz);
			}
		}
		sc.close(); // cerramos el Scanner
	}

}
