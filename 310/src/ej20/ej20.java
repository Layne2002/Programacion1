/*
 * Alumno: Adrián González García
 * Curso: 1ºDAM
 * Fecha: 04/11/2023
 * 
 * Ejercicio: 
 * Hago un programa que cree un array de tamaño 1000 y lo rellene con valores enteros
 * aleatorios entre 0 y 99 (utiliza Math.random()*100). Luego pedirá por teclado un valor N y se
 * mostrará por pantalla si N existe en el array, además de cuantas veces.
 * 
 */
package ej20;

import java.util.Arrays;
import java.util.Scanner;

public class ej20 {

	public static void main(String[] args) {
		
				Scanner teclado = new Scanner(System.in);
				final int TAMANO_ARRAY = 1000;
				
				int[] array = new int[TAMANO_ARRAY];
				
				
				for(int i = 0; i<TAMANO_ARRAY; i++) {
					array[i] = (int)(Math.random()*100);
				}
				
				// Metodo para ordenar el array
				Arrays.sort(array);
				
				// Entrada de datos, pido un numero
				System.out.println("Dame un número");
				int numeroPedido = teclado.nextInt();
				
				// Calculo la posicion del numero pedido con el metodo binarySearch()
				int posicionArray = Arrays.binarySearch(array, numeroPedido);
				
				// Si el metodo no encuentra el numero en el array, da un valor negativo de retorno, por lo que calculo si se ha encontrado o no el numero si posicionArray es positivo o negativo
				if(posicionArray>=0) {
					
					// En caso de encontrarse el numero en el array, creo 2 contadores, uno para almacenar el numero de veces que el numero se repite y otro para la posicion del array
					int contadorNumeroRepetido = 0;
					int contadorPosicion = 0;
					
					// Bucle para incrementar el contadorNumeroRepetido cada vez que se encuentre el numeroPedido
					//
					// El bucle tiene esa expresion logica ya que el array esta ordenado y cuando el valor de array[contadorPosicion] sea mayor que el numeroPedido, no habra mas numeros iguales que numeroPedido
					while(array[contadorPosicion]<=numeroPedido && contadorPosicion<(TAMANO_ARRAY-1)) {
						
						// If para incrementar el contadorNumeroRepetido cada vez que se encuentr el numeroPedido
						if(array[contadorPosicion] == numeroPedido) contadorNumeroRepetido++;
						
						// el contadorPosicion, que determina la posicion del array del que se hara comprobacion de su valor, incrementa en cada intento del bucle
						contadorPosicion++;
					}
					
					// Salida de datos
					System.out.println("El número se ha encontrado en el array en " + contadorNumeroRepetido + " posiciones");
				}else {
					// Salida de datos alterna
					System.out.println("El número no se ha encontrado en el array");
				}

	}

}
