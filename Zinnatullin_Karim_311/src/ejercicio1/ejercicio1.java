/*
 * Objetivo: Crea un programa que cree una matriz de tamaño 5x5 que almacene los números del 1 al 25
y luego muestre la matriz por pantalla.
 * Autor: Karim Zinnatullin
 * Fecha:13/11/2023
 */
package ejercicio1;

public class ejercicio1 {

	public static void main(String[] args) {
		

		int[][] matriz = new int[5][5];
		int contador = 1;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				matriz[i][j] = contador;
				contador++;
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println("Array " + i + " posicion " + j + ": " + matriz[i][j]);
			}
		}
	}

}
