/*En este ejercicio realizaremo consultas al usuario, la consultas
 * seran tu edad y te diran si eres mayor o menor de edad*/

package EjercicioConsultas;

import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {
		
		//Declaromos variables
		int edad;
		
		//Declaramos el scanner
		Scanner teclado = new Scanner(System.in);
		
		//Imprimiremos la pregunta
		System.out.println("Cual es tu edad??");
		
		//Pedimos que inserte el número
		edad = teclado.nextInt();
		
		//Solución con condicionales
		String mensage = edad >= 18 ? "eres mayor" : "eres menor";
		
		
		System.out.println(mensage);
		
		//Solución con if
		if (edad >= 18){
			System.out.println("Bieeeen eres mayor de edad");
			
		}
		else {
				System.out.println("Menor nooooooooo");
			}
		
		
	}

}
