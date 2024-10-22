/*
 * Objetivo: Realiza un programa que dado un valor en kilómetros nos lo traduce a millas. El programa debe
tener una función que reciba como parámetro una cantidad en kilómetros y nos la devuelva en
millas
 * Autor: Karim Zinnatullin
 * Fecha: 11/12/2023
 */
package ejercicio12;

import java.util.Scanner;

public class ejercicio12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Dame la cantidad en kilómetros y te lo traduciré a millas");
		double km = input.nextDouble();
		System.out.println(km + " km son " + kmAmillas(km) + " millas");
	}

	public static double kmAmillas(double km) {
		return km * 0.62137119;
	}

}
