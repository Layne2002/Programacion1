/*
 * programa que compara dos nombres
 * Autor: Karim Zinnatullin
 * Fecha: 14/12/2023
 */
package ejercicio1;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Dime un nombre");
		String nombre1 = input.nextLine();
		System.out.println("Dime el segundo nombre");
		String nombre2 = input.nextLine();
		if (comparaNombres(nombre1, nombre2))
			System.out.println("Los dos nombres son iguales");
		else
			System.out.println("Esos dos nombres no son iguales");

	}

	public static boolean comparaNombres(String nombre1, String nombre2) {
		if (nombre1.equalsIgnoreCase(nombre2))
			return true;
		else
			return false;
	}

}
