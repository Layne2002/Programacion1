/*
 * Objetivo: multiplicar con un metodo
 * Autor: Karim ZInnatullin
 * Fecha: 21/11/2023
 */
package ejercicio1;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Dime el primer numero");
		double x = input.nextDouble();
		System.out.println("Dime el segundo numero");
		double y = input.nextDouble();
		double resultado = multiplica(x, y);
		System.out.println(x + " * " + y + " = " + resultado);

	}

	public static double multiplica(double a, double b) {
		return a * b;
	}

}
