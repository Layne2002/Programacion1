/*
 * Objetivo: almacenar las notas de 4 alumnos (llamados “Alumno
1”, “Alumno 2”, etc.) y 5 asignaturas. El usuario introducirá las notas por teclado y luego el
programa mostrará la nota mínima, máxima y media de cada alumno.
 * Autor: Karim Zinnatullin
 * Fecha: 13/11/2023
 */
package ejercicio4;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		double[][] alumnos = new double[4][5];
		double media, max, min, suma;
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < 4; i++) {
			System.out.println("Alumno " + (i + 1));
			for (int j = 0; j < 5; j++) {
				System.out.println("Introduce la nota " + (j + 1));
				alumnos[i][j] = input.nextDouble();
			}

		}
		input.close();
		System.out.println("-----------------------");
		System.out.println("         NOTAS");
		System.out.println("-----------------------");

		for (int i = 0; i < 4; i++) {
			max = alumnos[i][0];
			min = alumnos[i][0];
			suma = 0;
			for (int j = 0; j < 5; j++) {
				if (alumnos[i][j] < min) {
					min = alumnos[i][j];
				} else if (alumnos[i][j] > max) {
					max = alumnos[i][j];
				}
				suma += alumnos[i][j];
			}
			media = suma / 5;
			System.out.println("Alumno " + (i + 1) + ":");
			System.out.println("Nota máxima: " + max);
			System.out.println("Nota mínima: " + min);
			System.out.println("Media del alumno: " + media);
			System.out.println(" ");
		}

	}

}
