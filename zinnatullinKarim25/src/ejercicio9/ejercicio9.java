/*Objetivo: calcular el área de un rectángulo
 * Autor: Karim Zinnatullin
 * Fecha: 3/10/2023
 */

package ejercicio9;

import java.util.Scanner;

public class ejercicio9 {

	public static void main(String[] args) {
		//Creamos variables
		double altura, longitud;
		Scanner teclado = new Scanner(System.in);
		
		//pedimos los datos
		System.out.println("Cual es la altura del rectángulo?");
		altura = teclado.nextDouble();
		
		System.out.println("Cual es la longitud del rectángulo?");
		longitud = teclado.nextDouble();
		
		//decimos el área
		System.out.println("El área del rectángulo es "+ (altura*longitud)+ " unidades al cuadrado");
		
	}

}
