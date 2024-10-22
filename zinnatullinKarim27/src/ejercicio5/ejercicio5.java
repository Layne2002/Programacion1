/*
 * Objetivo: hacer una calculadora
 * Autor: Karim Zinnatullin
 * Fecha: 13/10/2023
 */
package ejercicio5;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		// creamos las variables
		double num1, num2;
		byte op;
		Scanner sc = new Scanner(System.in);

		// pedimos los numeros
		System.out.println("Dime un número: ");
		num1 = sc.nextDouble();
		System.out.println("Dime otro número: ");
		num2 = sc.nextDouble();

		sc.nextLine();
		// preguntamos que operación queire hacer
		System.out.println(
				"Que operación deseas realizar (introduce un valor): \n1. Suma \n2. Resta \n3. Multiplicar \n4.Division");
		op = sc.nextByte();
		System.out.println("-------------------------------------------------");
		// creamos la calculadora
		switch (op) {
		case 1: {
			System.out.println("La suma de los dos números es " + (num1 + num2));
			break;
		}
		case 2: {
			System.out.println("La resta de " + num1 + " menos " + num2 + " es " + (num1 - num2));
			break;
		}
		case 3: {
			System.out.println("La multiplicación de los dos números es " + (num1 * num2));
			break;
		}
		case 4: {
			System.out.println("La división de " + num1 + " y " + num2 + " es " + (num1 / num2));
			break;
		}
		default: {
			System.out.println("Has introducio mal el número de la operación");
		}
		}

	}

}
