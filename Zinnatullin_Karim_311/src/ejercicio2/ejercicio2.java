/*
 * Objetivo: Crea un programa que cree una matriz de 10x10 e introduzca los valores de las tablas de
multiplicar del 1 al 10 (cada tabla en una fila). Luego mostrará la matriz por pantalla
 * Autor: Karim Zinnatullin
 * Fecha: 13/11/2023
 */
package ejercicio2;

public class ejercicio2 {

	public static void main(String[] args) {

		int[][] matriz = new int[10][10];
		

		for (int i = 0; i < 10; i++) {
			System.out.println("Tabla del " + (i + 1) + ":");
			for (int j = 0; j < 10; j++) {
				matriz[i][j] = ((i+1) * (j + 1));

				System.out.println((i + 1) + " x " + (j + 1) + " = " + matriz[i][j]);
			}

		}

	}

}
