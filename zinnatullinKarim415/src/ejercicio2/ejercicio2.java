/*
 * Objetivo:
 * Autor: Karim Zinnatullin
 * Fecha: 14/12/2023
 */
package ejercicio2;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Que cantidad de Cocacolas (0,95 euros/unidad) ha comprado?");
		int cantidad = input.nextInt();
		double precio = 0.93;
		int descuento = 20;
		double precioSinDesc = precio * cantidad;
		System.out.println("Usted ha adquirido " + cantidad + " de productos Cocacola, a un precio de " + precio
				+ " euros la unidad.");
		System.out.println("El precio a pagar es " + precioSinDesc + ", pero al aplicarle el descuento del 20% el precio "
						+ "final a pagar es: " + productoDescuento(precio, cantidad, descuento) + ".");
	}

	public static double productoDescuento(double precio, int cantidad, int descuento) {
		return (double) precio * cantidad * ((double) (100-descuento) / 100);

	}
}
