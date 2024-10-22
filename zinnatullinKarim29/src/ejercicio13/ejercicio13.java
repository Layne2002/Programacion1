/*
 * Objetivo: programa que adivina tu numero
 * Autor: Karim Zinnatullin
 * Fecha: 24/10/2023
 */
package ejercicio13;

import java.util.Scanner;
import java.lang.Math;

public class ejercicio13 {

	public static void main(String[] args) {
		// Creamos variables;
		int numero, min, max;
		Scanner input = new Scanner(System.in);
		String respuesta;
		min = 1;
		max = 100;
		numero = (int) (Math.random() * (max - min + 1) + min);
		System.out.println("Piensa en un número del 1 al 100, lo intentaré adivinar.\nCuando estés listo presiona Enter.");

		input.nextLine();

		do {
			System.out.println("es " + numero + " el numero en el que piensas? di si es menor, mayor, o igual");
			respuesta = input.nextLine();
			if (respuesta.equals("menor")) {
				max = numero - 1;
			} else if (respuesta.equals("mayor")) {
				min = numero + 1;
			}
			numero = (int) (Math.random() * (max - min + 1) + min);
			System.out.println("min: "+min+" max: "+max);
		} while (!respuesta.equals("igual"));
		input.close();
		System.out.println("Yupi! lo he acertado! tu número era " + numero + "!");
	}

}
