package arrays;

import java.util.Scanner;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int NUM_ALUMNOS = 10;
		int[] notas = new int[NUM_ALUMNOS];

		for (int i = 0; i < notas.length; i++) {
			notas[i] = (int) (Math.random() * 10);
		}

		double mediaTotal = 0, mediaAprobados = 0, mediaSuspensos = 0;
		int sumaAprobados = 0, sumaSuspensos = 0, sumaTotal = 0, acumuladorAprobados = 0, acumuladorSuspensos = 0;

		for (int i = 0; i < notas.length; i++) {
			System.out.println("Nota del " + (i + 1) + " alumno: " + notas[i]);
			if (notas[i] >= 5) {
				mediaAprobados += notas[i];
				acumuladorAprobados++;

			} else {
				mediaSuspensos += notas[i];
				acumuladorSuspensos++;
			}

			sumaTotal += notas[i];
		}
		mediaTotal = sumaTotal / notas.length;
		System.out.println("La media de las notas es: " + mediaTotal);
		if (acumuladorAprobados > 0) {
			mediaAprobados = sumaAprobados / acumuladorAprobados;
			System.out.println("Número de aprobados: " + acumuladorAprobados + " y la media: " + mediaAprobados);
		} else {
			System.out.println("No ha aprobado nadie!");
		}
		if (acumuladorSuspensos > 0) {
			mediaSuspensos = sumaSuspensos / acumuladorSuspensos;
			System.out.println("Número de SUSPENSOS: " + acumuladorSuspensos + " y la media: " + mediaSuspensos);
		} else {
			System.out.println("No ha suspendido nadie!");
		}
		int notaMayor = notas[0];
		
		for (int i = 1; i < notas.length; i++) {
			if (notas[i] > notaMayor) {
				notaMayor = notas[i];				
			}
		}
		System.out.println("Nota más alta: " + notaMayor);
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] == notaMayor) {
				System.out.println("El alumno " + (i + 1) + " tiene un " + notaMayor);
			}
		}
	}

}
