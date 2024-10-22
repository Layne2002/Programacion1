/*
 * Objetivo: Escribe un programa Java que lee una secuencia de notas (con valores que van de 0 a 10) que
termina con el valor -1 y nos dice si hubo o no alguna nota con valor 10.
 * Autor: Karim Zinnatullin
 * Fecha: 24/10/2023
 */
package ejercicio10;

import java.util.Scanner;

public class ejercicio10 {

	public static void main(String[] args) {
		// creamos variables
		Scanner input = new Scanner(System.in);
		byte num;
		boolean sobresaliente;
		System.out.println("Te voy a pedir las notas de los alumnos (de 0 a 10). "
				+ "\r\nTe diré si has introducido algún 10. \nUna vez que termines, introduce un -1");

		sobresaliente = false;

		// creamos bucle
		do {
			System.out.println("Introduce una nota (o un -1 para parar):");
			num = input.nextByte();
			if (num > 10 || num < -1) {
				System.out.println("Error, nota incorrecta");
			} else if (num == 10 && sobresaliente == false) {
				sobresaliente = true;
			}
		} while (num != -1);
		input.close();
		if (sobresaliente == true) {
			System.out.println("Has introducido al menos un 10!");
		} else {
			System.out.println("No he encontrado ningún 10");
		}
	}

}
