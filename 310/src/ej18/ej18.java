/*
 * Alumno: Adrián González García
 * Curso: 1ºDAM
 * Fecha: 04/11/2023
 * 
 * Ejercicio: 
 * Hago un programa que cree un array de tamaño 30 y lo rellene con valores aleatorios entre 0
 * y 9 (utiliza Math.random()*10). Luego ordena los valores del array y los mostrará por
 * pantalla
 * 
 */
package ej18;

import java.util.Arrays;

public class ej18 {

	public static void main(String[] args) {
		// constante con el tamaño del array
				final int TAMANO_ARRAY = 30;
				
				// declaro array de tipo double
				double[] array = new double[TAMANO_ARRAY];
				
				// Bucle para rellenar el array con valores aleatorios entre 0 y 9
				for(int i=0; i<TAMANO_ARRAY; i++) {
					array[i] = Math.random()*10;
				}
				
				// Metodo para ordenar el array
				Arrays.sort(array);
				
				// Bucle para salida de datos de cada posicion del array
				System.out.print("El array ordenado es: ");
				for(int i=0; i<TAMANO_ARRAY;i++) {
					System.out.print(" " + array[i]);
				}
				

	}

}
