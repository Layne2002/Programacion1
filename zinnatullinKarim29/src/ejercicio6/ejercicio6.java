/*
 * Objetivo: Escribe un programa Java que lea 100 números no nulos y luego muestre un mensaje de si ha
leído algún número negativo o no
 * Autor: Karim Zinnatullin
 * Fecha: 23/10/2023
 */
package ejercicio6;

import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
		// Creamos variables
		Scanner sc = new Scanner(System.in);
		int num;
		boolean negativo;
		negativo = false;
		for (int i = 1; i <= 100; i++) {
			System.out.println("introduce un número que no sea el 0:");
			num = sc.nextInt();
			if (num == 0) {
				System.out.println("No introduzcas el 0!");
				i = i - 1; // con esto hacemos que el bucle no cuente el 0 introducido por el usuario
			}
			if (num < 0 && negativo == false) { // comprobamos si el numero es negativo y 
				negativo = true;				// que previamente no se haya detectado ningun numero negativo
			}

		}
		sc.close();
		if(negativo == true) {
			System.out.println("He encontrado números negativos");
		} else {
			System.out.println("No se han encontrado números negativos");
		}
	}

}
