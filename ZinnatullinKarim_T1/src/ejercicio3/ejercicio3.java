/*
 * Objetivo: un programa para gestionar la lista de participantes en una competición de salto de longitud
 * Autor: Karim Zinnatullin
 * Fecha: 01/12/2023
 */
package ejercicio3;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int PLAZAS = 10;
		String[] nombres = new String[PLAZAS];
		double[][] datos = new double[PLAZAS][3]; // en la pripera parte almacenamos qué participante es
													// y en la segunda guardamos los datos de las mejores marcas de cada
													// año
		int opcion, contador = 0;
		boolean terminarPrograma = false;
		do {
			System.out.println("Slecciona una opción:");
			System.out.println("1. Inscribir participante");
			System.out.println("2. Mostrar el listado de datos");
			System.out.println("3. Mostrar el listado por marcas");
			System.out.println("4. Finalizar");
			opcion = input.nextInt();
			
			switch (opcion) {
			case 1: {
				if (contador >= PLAZAS) { // si el número de participantes ha llegado al máximo, no hacemos nada
					System.out.println("Ya no quedan más plazas");
				} else { // pedimos datos del participante
					input.nextLine();
					System.out.println("Introduce el nómbre del participante:");
					nombres[contador] = input.nextLine();
					input.nextLine();
					System.out.println("Introduce su mejor marca en 2022:");
					datos[contador][0] = input.nextDouble();
					System.out.println("Introduce su mejor marca en 2021:");
					datos[contador][1] = input.nextDouble();
					System.out.println("Introduce su mejor marca en 2020:");
					datos[contador][2] = input.nextDouble();
					contador++;
					System.out.println("----------------------------------");
				}
				break;
			}
			case 2: {
				for (int i = 0; i < contador; i++) { // bucle for mostrando todos los participantes con sus datos
					System.out.println("Participante: " + nombres[i]);
					System.out.println("Mejor marca 2022: " + datos[i][0]);
					System.out.println("Mejor marca 2021: " + datos[i][1]);
					System.out.println("Mejor marca 2020: " + datos[i][2]);
					System.out.println("-------------------------");
				}
				break;
			}
			case 3: { // no me da tiempo a hacer el orden por marcas
				System.out.println("progrmaa sin terminar");
				break;
			}
			case 4: {
				terminarPrograma = true; // terminamos el programa
				break;
			}
			}
		} while (terminarPrograma != true);
		input.close();
	}

}
