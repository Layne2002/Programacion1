/*Objetivo: cambiar dos variables de valor
 * Autor: Karim Zinnatullin
 * Fecha 2/10/2023
 */
package ejercicio3;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		// Creamos variables
		byte a;
		byte b;
		byte c;
		Scanner teclado = new Scanner(System.in);
		
		//pedimos los valores al usuario
		System.out.println("Dame un valor a la variable a:");
		a = teclado.nextByte();
		
		System.out.println("Dame un valor para la variable b");
		b = teclado.nextByte();
		
		//reasignamos las variables
		c = a;
		a = b;
		b = c;
		
		//mostramos las variables reasignadas
		System.out.println("El valor de la variable a despues de reasignar es " + a + " y el de la variable b " + b);
	}

}
