/*
 * Objetivo: introducir números de 1 a 100 y calcular la media de cada decena y cantidad de numeros por decena
 * Autor: Karim Zinnatullin
 * Fecha: 26/10/2023
 */
package ejercicio3;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		// creamos la variable y los contadores para cada decena y los inicializamos a
		// 0, y las sumas totales de cada decena
		Scanner input = new Scanner(System.in);
		int num;
		int contador0 = 0, suma0 = 0;
		int contador10 = 0, suma10 = 0;
		int contador20 = 0, suma20 = 0;
		int contador30 = 0, suma30 = 0;
		int contador40 = 0, suma40 = 0;
		int contador50 = 0, suma50 = 0;
		int contador60 = 0, suma60 = 0;
		int contador70 = 0, suma70 = 0;
		int contador80 = 0, suma80 = 0;
		int contador90 = 0, suma90 = 0;

		// creamos bucle do - while
		do {
			System.out.println("Introduce un número del 1 al 100 (o el 0 para parar)");
			num = input.nextInt();

			// comprobamos en que decena se encuentra el número introducido
			if (num != 0) {
				if (num > 0 && num < 10) {
					suma0 += num;
					contador0++;
				} else if (num < 20) {
					suma10 += num;
					contador10++;
				} else if (num < 30) {
					suma20 += num;
					contador20++;
				} else if (num < 40) {
					suma30 += num;
					contador30++;
				} else if (num < 50) {
					suma40 += num;
					contador40++;
				} else if (num < 60) {
					suma50 += num;
					contador50++;
				} else if (num < 70) {
					suma60 += num;
					contador60++;
				} else if (num < 80) {
					suma70 += num;
					contador70++;
				} else if (num < 90) {
					suma80 += num;
					contador80++;
				} else if (num < 100) {
					suma90 += num;
					contador90++;
				}
			}
		} while (num != 0);

		input.close();
		System.out.println("----------RESULTADO----------");
		double media; // creamos la variable media

		// comprobamos en cada decena si hubo o no hubo numeros introducidos,
		// en caso de que haya numeros, mostrar los calculos para la decena
		// en caso de no haber numeros, decirlo
		if (contador0 > 0) {
			media = (double) suma0 / contador0;
			System.out.println("Cantidad de números entre 1-9: " + contador0 + " y su media: " + media);
		} else {
			System.out.println("No huno números entre 1 y 9");
		}
		if (contador10 > 0) {
			media = (double) suma10 / contador10;
			System.out.println("Cantidad de números entre 10-19: " + contador10 + " y su media: " + media);
		} else {
			System.out.println("No hubo números entre 10 y 19");
		}
		if (contador20 > 0) {
			media = (double) suma20 / contador20;
			System.out.println("Cantidad de números entre 20-29: " + contador20 + " y su media: " + media);
		} else {
			System.out.println("No hubo números entre 20 y 29");
		}
		if (contador30 > 0) {
			media = (double) suma30 / contador30;
			System.out.println("Cantidad de números entre 30-39: " + contador30 + " y su media: " + media);
		} else {
			System.out.println("No hubo números entre 30 y 39");
		}
		if (contador40 > 0) {
			media = (double) suma40 / contador40;
			System.out.println("Cantidad de números entre 40-49: " + contador40 + " y su media: " + media);
		} else {
			System.out.println("No hubo números entre 40 y 49");
		}
		if (contador50 > 0) {
			media = (double) suma50 / contador50;
			System.out.println("Cantidad de números entre 50-59: " + contador50 + " y su media: " + media);
		} else {
			System.out.println("No hubo números entre 50 y 59");
		}
		if (contador60 > 0) {
			media = (double) suma60 / contador60;
			System.out.println("Cantidad de números entre 60-69: " + contador60 + " y su media: " + media);
		} else {
			System.out.println("No hubo números entre 60 y 69");
		}
		if (contador70 > 0) {
			media = (double) suma70 / contador70;
			System.out.println("Cantidad de números entre 70-79: " + contador70 + " y su media: " + media);
		} else {
			System.out.println("No hubo números entre 70 y 79");
		}
		if (contador80 > 0) {
			media = (double) suma80 / contador80;
			System.out.println("Cantidad de números entre 80-89: " + contador80 + " y su media: " + media);
		} else {
			System.out.println("No hubo números entre 80 y 89");
		}
		if (contador90 > 0) {
			media = (double) suma90 / contador90;
			System.out.println("Cantidad de números entre 90-100: " + contador90 + " y su media: " + media);
		} else {
			System.out.println("No hubo números entre 90 y 100");
		}
	}

}
