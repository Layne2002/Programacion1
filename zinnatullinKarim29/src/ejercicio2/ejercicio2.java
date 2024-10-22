/*
 * Objetivo: muestre los números pares comprendidos entre el 1 y el 200 sumando el contador de 2 en 2
 * Autor: Karim Zinnatullin
 * Fecha: 23/10/2023
 */
package ejercicio2;

public class ejercicio2 {

	public static void main(String[] args) {
		// creamos bucle
		int contador = 2;
		do {
			System.out.println(contador);
			contador += 2;
		} while (contador <= 200);

	}

}
