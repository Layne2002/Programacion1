/*Objetivo: hacer ceil, floor y round a una variable tipo double
 * Autor: Karim Zinnatullin
 * Fecha 2/10/2023
 */
package ejercicio4;

import java.util.Scanner;
import java.lang.Math;

public class ejercicio4 {

	public static void main(String[] args) {
		// Creamos las variables
		double a;
		Scanner teclado = new Scanner(System.in);
		
		//pedimos el valor de a
		System.out.println("Dame el valor para la variable");
		a = teclado.nextDouble();

		//aplicamos ceil, Floor y round
		System.out.println("Aplicando ceil a la variable a sale: " + Math.ceil(a));
		System.out.println("Aplicando floor a la variable a sale: " + Math.floor(a));
		System.out.println("Aplicando round a la variable a sale: " + Math.round(a));
		
	}

}
