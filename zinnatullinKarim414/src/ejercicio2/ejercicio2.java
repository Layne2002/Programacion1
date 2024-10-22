/*
 * Objetivo: ver si eres mayor de edad
 * Autor: Karim Zinnatullin
 * Fecha: 21/11/2023
 */
package ejercicio2;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Dime tu edad");
		int edad = input.nextInt();
		if (mayorDeEdad(edad))
			System.out.println("Eres mayor de edad");
		else
			System.out.println("Eres menor de edad");

	}

	public static boolean mayorDeEdad(int a) {
		if (a >= 18)
			return true;
		else
			return false;
	}

}
