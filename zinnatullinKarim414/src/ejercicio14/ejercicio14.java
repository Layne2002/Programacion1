/*
 * Objetivo: Escribe una función que muestre por pantalla un triángulo como el del ejemplo. Deberá recibir
dos parámetros: el carácter que se desea imprimir y el número de líneas del triángulo.
 * Autor: Karim Zinnatullin
 * Fecha: 11/11/2023
 */
package ejercicio14;

import java.util.Scanner;

public class ejercicio14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Dime un caracter y haré una piramide con él");
		String caracter = input.nextLine();
		char car = caracter.charAt(0);
		System.out.println("Dime cuantas líneas de piramide quieres");
		int lineas = input.nextInt();
		imprimirPiramide(car, lineas);
	}

	public static void imprimirPiramide(char caracter, int lineas) {
		for (int altura = 1; altura <= lineas; altura++) {

			for (int i = 1; i <= lineas - altura; i++) {
				System.out.print(" ");
			}

			for (int i = 1; i <= (altura * 2) - 1; i++) {
				System.out.print(caracter);
			}
			System.out.println();
		}
	}
}
