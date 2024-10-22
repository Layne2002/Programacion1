/*
 * muestre los números pares comprendidos entre el 1 y el 200 sumando el contador de 1 en 1
 * Autor: Karim Zinnatullin
 * Fecha: 23/10/2023
 */
package ejercicio3;

public class ejercicio3 {

	public static void main(String[] args) {
		// creamos bucle for
		for (int i = 2; i <= 200; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

	}

}
