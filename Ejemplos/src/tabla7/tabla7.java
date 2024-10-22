/*
 * Objetivo: hacer que java escriba la tabla del 7 usando el bucle while
 * Autor: Karim Zinnatullin
 * Fecha: 16/10/2023
 */
package tabla7;

public class tabla7 {

	public static void main(String[] args) {
		// creamos variables
		byte num;

		// creamos el bucle
		num = 1;
		while (num <= 10) {
			System.out.println("7 x " + num + " = " + (num * 7));
			num++;
		}

	}

}
