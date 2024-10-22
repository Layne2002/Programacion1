/*
 * Objetivo: Calculadora de precio de entradas de un parque acuático
 * Autor: Karim ZInnatullin
 * Fecha: 20/10/2023
 */
package ejercicio2;

import java.util.Scanner;
import java.lang.Math;

public class ejercicio2 {

	public static void main(String[] args) {
		// Creamos las primeras variables
		byte adulto, infantil;
		Scanner sc = new Scanner(System.in);

		// pedimos los datos de las entradas
		System.out.println("Ejercicio 2. Vamos al parque acuático! \n--------------------------------------");
		System.out.println("Introduce la cantidad de entradas de ADULTO que deseas adquirir: ");
		adulto = sc.nextByte();
		System.out.println("Introduce la cantidad de entradas INFANTILES que deseas adquirir: ");
		infantil = sc.nextByte();
		sc.close();

		double total; // creamos la variable para el precio total
		total = (double) adulto * 15 + infantil * 10; // definimos el precio total

		// mostramos en pantalla el precio total
		System.out.println("Se comprarán " + infantil + " entradas INFANTILES y " + adulto + " entradas de ADULTO");
		System.out.println("El coste total de las entradas antes de aplicar posible descuento es de " + total + "€");

		double descuento = total; // creamos la variable del precio total con descuento aplicado y la definimos
		if (total >= 100) {
			descuento = total * 0.85; // precio total con el 15% de descuento aplicado
			System.out.println("Se aplicará el descuento del 15.0%");
			System.out.println("El importe total despues de aplicar el descuento (SIN EL IVA) es de " + descuento + "€");
		} else if (total >= 50) {
			descuento = total * 0.95; // precio total con el 5% de descuento aplicado
			System.out.println("Se aplicará el descuento del 5.0%");
			System.out.println("El importe total despues de aplicar el descuento (SIN EL IVA) es de " + descuento + "€");
		} else {
			System.out.println("No procede descuento en esta compra, el importe total es de " + descuento);
		}
		double iva = descuento * 1.21; // precio total con descuento aplicando el IVA
		System.out.println("El importe con el IVA incluido es de " + iva);

		int Final = (int) Math.floor(iva); // El precio final es el precio con IVA redondeado abajo con la función Math.floor
		System.out.println("El importe final a pagar por el cliente es de " + Final + "€");

	}

}
