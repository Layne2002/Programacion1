/*Objetivo:Obtener datos y hacer calculos
 * Autor: Karim Zinnatullin
 * Fecha: 2/10/2023
 */
package ejercicio5;

import java.util.Scanner;
import java.lang.Math;
public class ejercicio5 {

	public static void main(String[] args) {
		// creamos variables
		int a,b;
		Scanner teclado = new Scanner(System.in);
		
		//pedimos los numeros
		System.out.println("dame el primer numero: ");
		a = teclado.nextInt();
		
		//pedimos el segundo numero
		System.out.println("Dame el segundo numero: ");
		b = teclado.nextInt();
		
		//mostramos los calculos
		System.out.println("El número que es menor de los dos es " + Math.min(a, b));
		System.out.println("El valor del primer número elevado al segundo es " + Math.pow(a, b));
		System.out.println("La raíz cuadrada del primer número es " + Math.sqrt(a));
		double valorAleatorio = (double) (Math.random() * b);
		System.out.println("Un valor aleatorio (random) del segundo número: " + valorAleatorio);
	}

}
