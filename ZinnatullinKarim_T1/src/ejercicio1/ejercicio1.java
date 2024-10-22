/*
 * Objetivo: un progrmaa que muestrre multiplos de 7 y 9 entre 1 y N
 * Autor: Karim Zinnatullin
 * Fecha:01/12/2023
 */
package ejercicio1;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// creamos las variables necesarias
		Scanner input = new Scanner(System.in);
		int N;
		int contador7 = 0;
		int contador9 = 0;
		int contador79 = 0;
		int contadorNegativos = 0;

		// el bucle do while que parará cuando N sea 0 o el contador de negativos llegue
		// a 3
		do {
			System.out.println("Introduce un número entero o 0 para parar el programa:");
			N = input.nextInt();
			if (N < 0) { // Comprobamos si el número introducido es negativo
				System.out.println("Introduce un número positivo!");
				System.out.println("------------------------------------");
				contadorNegativos++; // contamos cuantas veces se ha introducido un número negativo
			} else {
				contadorNegativos = 0; // reestablecemos el contador de negativos ya que se acaba de introducir un
										// número positivo
				for (int i = 1; i <= N; i++) {
					if (i % 7 == 0) { // comprobamos si es múltiplo de 7
						contador7++;
						if (i % 9 == 0) { // comprobamos si es a la vez múltiplo de 9
							contador79++;
						}
					} else if (i % 9 == 0) { // comprobamos si es múltiplo de 9 pero no de 7
						contador9++;
					}
				}
				// mostramos los resultados
				System.out.println("Resultados:");
				System.out.println("Múltiplos de 7 entre 1 y " + N + ": " + contador7);
				System.out.println("Múltiplos de 9 entre 1 y " + N + ": " + contador9);
				System.out.println("Múltiplos tanto de 7 como de 9 entre 1 y " + N + ": " + contador79);
				System.out.println("------------------------------------");
			}
		} while (N != 0 && contadorNegativos < 3);
		input.close();

	}

}
