/*
 * Objetivo: decir buenos dias, tardes o noches dependiendo de la hora que diga el usuario
 * Autor: Karim Zinnatullin
 * Fecha: 13/10/2023
 */
package ejercicio2;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// creamos variables
		byte hora;
		Scanner sc = new Scanner(System.in);

		// pedimos la hora al usuario
		System.out.println("Qué hora es?");
		hora = sc.nextByte();

		// comprobamos a que franja del dia corresponde y lo decimos

		if (hora > 24 || hora < 1) {
			System.out.println("Error");
		} else if (hora >= 6 && hora<=12) {
			System.out.println("Buenos días!!");
		} else if (hora >= 13 && hora < 20) {
			System.out.println("Buenas tardes!!");
		} else {
			System.out.println("Buenas noches!!");
		}
		sc.close();
	}

}
