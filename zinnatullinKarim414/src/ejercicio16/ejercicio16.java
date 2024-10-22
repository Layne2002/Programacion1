/*
 * Objetivo: Escribe un programa que cree un array del tamaño indicado por teclado y luego lo rellene con
valores aleatorios (utiliza Math.random()). Implementa la función que rellena un array con
valores aleatorios.
 * Autor: Karim Zinnatullin
 * Fecha: 11/12/2023
 */
package ejercicio16;

import java.util.Scanner;
import java.lang.Math;

public class ejercicio16 {

	public static void main(String[] args) {
		System.out.println("Dime de que longitud deseas el array:");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int[] array = new int[num];
		rellenarAleatorio(array);
		System.out.println("");
		System.out.println("Array aleatorio:");
		for (int i = 0; i < num; i++) {
			System.out.println(array[i]);
		}

	}

	public static void rellenarAleatorio(int[] array) {
		for (int i=0;i<array.length; i++) {
			array[i] = (int) (Math.random() * 11);
		}
	}

}
