/*
 * Objetivo: un programa que controle el nivel de agua
 * Autor: Karim Zinnatullin
 * Fecha: 20/10/2023
 */
package ejercicio1;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// creamos las variables necesarias
		final int CAPACIDAD = 2000;
		int embalse;
		double falta, porcentaje;
		Scanner sc = new Scanner(System.in);

		System.out.println("Ejercicio 1. Gestión de recursos hídricos.");
		System.out.println("-----------------------------------------");
		System.out.println("Introduce el volúmen de agua almacenada en el embalse (hectómetros cúbicos): ");
		embalse = sc.nextInt();
		sc.close();
		falta = CAPACIDAD - embalse; // declaramos la variable que define la cantidad que falta para llenar el embalse
		System.out.println("Faltan " + falta + " hectómetros cúbicos para llenar completamente el embalse.");
		
		porcentaje = (embalse * 100) / 2000; // calculamos el porcentaje mediante la regla de 3
		System.out.println("El embalse está a un " + porcentaje + "% de su capacidad máxima.");

		System.out.println("RESULTADO \n---------");
		if (porcentaje < 95) { // si el porcentaje es menor que 95
			System.out.println("No es necesario considerar una descarga de agua.");
		} else { // si es mayor que 95
			int queda = (embalse - (embalse / 10)); // embalse/10 representa el 10% que vertemos, y la variable queda,
													// lo que queda despues de vaciarlo
			System.out.println("Se ha realizado una liberación del 10.0% vaciando un total de " + (embalse / 10)
					+ " hectómetros cúbicos");
			System.out.println("En el embalse quedan ahora " + queda + " hectómetros cúbicos, que representan un "
					+ (queda * 100) / 2000 + "% " + "de su capacidad máxima"); // (queda*100)/2000 aplicamos otra vez la
																				// regla de 3 para calcular el
																				// porcentaje que queda
			
		}

	}

}
