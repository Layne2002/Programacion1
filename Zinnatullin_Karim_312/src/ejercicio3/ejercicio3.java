/*
 * Objetivo: Un programa que crea una cadena de texto a partir de un nombre y dos apellidos
 * Autor: Karim Zinnatullin
 * Fecha: 21/11/2023
 */
package ejercicio3;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		String nombre, apellido1, apellido2, codigo; // se inicializa apellido2 por si el usuario no tiene segundo
														// apellido
		Scanner input = new Scanner(System.in);
		System.out.println("Dime tu nombre");
		nombre = input.nextLine().toUpperCase().substring(0, 3);

		System.out.println("Tu primer apellido");
		apellido1 = input.nextLine().toUpperCase().substring(0, 3);
		System.out.println("Y tu segundo apellido (Si tienes)");
		apellido2 = input.nextLine().toUpperCase();

		if (apellido2.length() >= 3) {
			apellido2.substring(0, 3);
			codigo = nombre.concat(apellido1).concat(apellido2);

		} else if (apellido2.length() > 0) {
			apellido2.substring(0, apellido2.length());
			codigo = nombre.concat(apellido1).concat(apellido2);

		} else {
			codigo = nombre.concat(apellido1);
		}
		System.out.println(codigo);

	}

}
