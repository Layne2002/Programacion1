/*
 * Alumno: Adrián González García
 * Curso: 1ºDAM
 * Fecha: 04/11/2023
 * 
 * Ejercicio: 
 * Hago un programa que cree un array de enteros e introduzca la siguiente secuencia de
 * valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10 diez veces, y luego la
 * muestre por pantalla. En esta ocasión has de utilizar Arrays.fill().
 * 
 */
package ej16;

import java.util.Arrays;

public class ej16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaro un contador para la capacidad y constantes para indicar el inicio y el final de la secuencia
				int capacidadArray = 0;
				final int INICIO_SECUENCIA = 1;
				final int FINAL_SECUENCIA = 10;
				
				
				
				// Creo un bucle para probar la secuencia que tendria el array e incrementar el contador, de esta manera se la capacidad del array
				for(int i = INICIO_SECUENCIA;i<=FINAL_SECUENCIA;i++) {
					for(int j = 1;j<=i;j++) {
						capacidadArray++;
					}
				}
				
				
				// Declaro el array y 2 contadores que usare a modo de lector del array. El primero indicara la posicion dentro del array para el inicio de una determinada secuencia, y el segundo, la posicion final para dicha secuencia
				int[] array = new int[capacidadArray];
				int contador1 = 0;
				int contador2 = 0;
				
				
				// Inicio bucle para almacenar datos en el array y mostrarlos
				for(int i = INICIO_SECUENCIA;i<=FINAL_SECUENCIA;i++) {
					// En cada inicio de secuencia, el contador 1 se iguala a contador 2 para reescribir la posicion del array en cada secuencia
					// De esta manera, la posicion inicial de la secuencia del 2, sera distinta a la del 3
					contador1 = contador2;
					
					// Realizo un bucle para determinar la longitud de numeros de la secuencia que debo almacenar en el array, incremento el contador2 hasta dicha posicion
					for(int j = 1;j<=i;j++) {
						contador2++;
					}
					
					// Uso el metodo Arrays.fill con los parámetros del objeto array del que se va a hacer un fill, posicion inicial que es el contador1, posicion final que es el contador2 y el valor a rellenar que seria i
					Arrays.fill(array, contador1, contador2, i);
				}
				
				
				
				System.out.print("La secuencia es:");
				
				// Bucle para hacer print del array
				for(int i = 0;i<capacidadArray;i++) {
					System.out.print(" " + array[i]);
				}
	}

}
