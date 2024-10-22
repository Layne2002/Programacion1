/*
 * Alumno: Adrián González García
 * Curso: 1ºDAM
 * Fecha: 04/11/2023
 * 
 * Ejercicio: 
 * Hago un programa que pida al usuario 20 valores enteros e introduzca los 10 primeros en un
 * array y los 10 últimos en otro array. Por último, comparará ambos arrays y le dirá al usuario
 * si son iguales o no.
 * 
 */
package ej17;

import java.util.Arrays;
import java.util.Scanner;

public class ej17 {

	public static void main(String[] args) {
		// Declaro Scanner
				Scanner teclado = new Scanner(System.in);
				
				// Constante con el tamaño de los arrays a comparar
				final int TAMANO_ARRAYS = 10;
				
				// Declaro los arrays
				int[] array1 = new int[TAMANO_ARRAYS];
				int[] array2 = new int[TAMANO_ARRAYS];
				
				
				// Bucle para pedir los valores de los 2 arrays en conjunto
				for(int i=0;i<TAMANO_ARRAYS*2;i++) {
					
					// Entrada de datos
					System.out.println("Dame un numero entero");
					int numeroPedido = teclado.nextInt();
					
					// Condicional donde verifico si el bucle ha llegado a la mitad o no, en cuyo caso, mandaria los datos al segundo array
					if (i<TAMANO_ARRAYS) {
						array1[i] = numeroPedido;
					}else {
						
						// La posicion es i-TAMANO_ARRAYS ya que el tamaño de este array seria de 10, mientras que los casos de ejecucion de esta condicion son del 10 al 19
						array2[i-TAMANO_ARRAYS] = numeroPedido;
					}
				}
				
				// Condicional para mandar un mensaje de si es igual o no en base al valor booleano de retorno del metodo Arrays.equals para comparar los 2 arrays previamente creados
				if(Arrays.equals(array1, array2)) {
					System.out.println("Los 2 arrays son iguales");
				}else {
					System.out.println("Los 2 arrays son diferentes");
				}

			}

	

}
