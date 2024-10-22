/*
 * Objetivo: Almacenar el tiempo de cada dia de cada mes en un año entero
 * Autor; Karim Zinnatullin
 * Fecha: 31/10/2023
 */
package elTiempo;

public class elTiempo {

	public static void main(String[] args) {
		final int NUM_MESES = 12;
		final int NUM_DIAS = 31;

		int[][] temp = new int[NUM_MESES][NUM_DIAS];

		for (int mes = 0; mes < NUM_MESES; mes++) {
			for (int dia = 0; dia < NUM_DIAS; dia++) {
				temp[mes][dia] = (int) (Math.random() * 40);
			}
		}

		for (int mes = 0; mes < NUM_MESES; mes++) {
			System.out.println("Temperaturas del mes " + mes + ": ");
			for (int dia = 0; dia < NUM_DIAS; dia++) {
				System.out.print(temp[mes][dia]+" ");
			}
			System.out.println();
		}

	}

}
