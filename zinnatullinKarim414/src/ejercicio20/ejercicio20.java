/*
 * Objetivo: UN programa que pida un número y muestre en pantalla su tabla de multiplicacion
 * Autor: Karim Zinnatullin
 * Fecha: 12/12/2023
 */
package ejercicio20;

import java.util.Scanner;

public class ejercicio20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Dime un numero y te mostraré su tabla de multiplicar");
		int num = input.nextInt();
		tablaMultiplicar(num);

	}

	public static void tablaMultiplicar(int a) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(a + " * " + i + " = " + a * i);
		}
	}

}
