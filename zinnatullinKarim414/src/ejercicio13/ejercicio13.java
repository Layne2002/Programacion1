/*
 * Objetivo:Realiza un programa que calcule el porcentaje de descuento que nos han hecho al comprar algo.
Se debe solicitar la cantidad sin descuento y la cantidad con el descuento aplicado. Se debe
crear una función a la que le pasemos ambos valores y nos devuelva el descuento (en %)
 * Autor: Karim ZInnatullin
 * Fecha:11/12/2023
 */
package ejercicio13;

import java.util.Scanner;

public class ejercicio13 {

	public static void main(String[] args) {
		double sinDes, conDes;
		Scanner input = new Scanner(System.in);
		System.out.println("Cuanto era el precio sin descuento?");
		sinDes = input.nextDouble();
		System.out.println("Y cuanto has pagado al final?");
		conDes = input.nextDouble();
		System.out.println("Te han hecho un " + calcularDesc(sinDes, conDes) + "% de descuento");

	}

	public static double calcularDesc(double sinDes, double conDes) {
		return ((sinDes - conDes) / sinDes) * 100;
	}

}
