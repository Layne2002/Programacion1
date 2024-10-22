/*
 * Objetivo: Crea un método llamado indicaMesDias que devolverá una cadena de texto.
 * Autor: Karim Zinnatullin
 * Fecha: 15/12/2023
 */
package ejercicio3;

import java.util.Scanner;

public class ejercicio3 {

	public static void indicaMesDias(int x) {
		if (x < 1 || x > 12) {
			System.out.println("error.");
		} else {
			String[] mes = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
					"Octubre", "Noviembre", "Diciembre" };
			int[] dias = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
			System.out.println(mes[x - 1] + " tiene " + dias[x - 1] + " dias");
		}
	}

}
