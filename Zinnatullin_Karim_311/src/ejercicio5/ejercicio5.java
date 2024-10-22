/*
 * Objetivo: programa para registrar sueldos de hombres y mujeres de una empresa y detectar si existe brecha salarial entre ambos.
 * Autor: Karim Zinnatullin
 * Fecha: 13/11/2023
 */
package ejercicio5;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		int num, contadorMujeres = 0, contadorHombres = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("introduce el número de empleados:");
		num = input.nextInt();
		double[][] empleados = new double[num][2];
		double[] sueldos = new double[2];

		for (int i = 0; i < num; i++) {
			System.out.println("Introduce el género del empleado número " + (i + 1) + " (0 = Hombre, 1 = Mujer):");
			empleados[i][0] = input.nextDouble();
			System.out.println("Introduce el salario del empleado:");
			empleados[i][1] = input.nextDouble();

			if (empleados[i][0] == 1) {
				sueldos[1] = sueldos[1] + empleados[i][1];
				contadorMujeres++;
			} else {
				sueldos[0] = sueldos[0] + empleados[i][1];
				contadorHombres++;
			}

		}
		input.close();
		if (contadorMujeres == 0) {
			System.out.println("No hay mujeres en la empresa.");
		} else {
			double mediaMujeres = (sueldos[1] / contadorMujeres);
			System.out.println("Media de sueldos de mujeres: " + mediaMujeres);
		}
		if (contadorHombres == 0) {
			System.out.println("No hay hombres en la empresa.");
		} else {
			double mediaHombres = (sueldos[0] / contadorHombres);
			System.out.println("Media de sueldos de hombres: " + mediaHombres);
		}

	}

}
