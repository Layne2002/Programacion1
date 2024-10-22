/*
 * Objetivo: Realiza un programa que escriba la tabla de multiplicar de un número introducido por teclado.
Para ello implementa una función que reciba como parámetro un número entero y muestre por
pantalla la tabla de multiplicar de dicho número.
 * Autor: Karim Zinnatullin
 * Fecha: 11/12/2023
 */
package ejercicio11;

import java.util.Scanner;

public class ejercicio11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Dime un número y te diré la tabla de multiplicar");
		int num = input.nextInt();
		tablaMultiplicar(num);
	}

	public static void tablaMultiplicar(int num) {
		for (int i = 0; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + (num * i));
		}
	}

}
