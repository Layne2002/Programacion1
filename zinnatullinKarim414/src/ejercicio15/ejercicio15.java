/*
 * Objetivo: Escribe un programa que cree un array de tamaño 50 con los números naturales comprendidos
entre 50 y 99. Luego muestra la suma total y la media. Implementa una función que calcule la
suma de un array y otra que calcule la media de un array
 * Autor: Karim Zinnatullin
 * Fecha: 11/12/2023
 */
package ejercicio15;

public class ejercicio15 {

	public static void main(String[] args) {
		int[] array = new int[50];

		for (int i = 0; i < 50; i++) {
			array[i] = i + 50;
		}

		System.out.println("El sumatorio del array es: " + sumaArray(array));
		System.out.println("La media del array es: " + mediaArray(array));
	}

	public static int sumaArray(int[] array) {
		int suma = 0;
		for (int i : array) {
			suma += i;
		}
		return suma;
	}

	public static double mediaArray(int[] array) {
		double media = 0;
		for (int i : array) {
			media += i;
		}
		return media / 50;
	}

}
