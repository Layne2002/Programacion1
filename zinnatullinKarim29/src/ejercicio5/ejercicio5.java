/*
 * Objetivo: Escribe un programa Java que lea un número positivo N y calcule y visualice su factorial N!
 * Autor: Karim Zinnatullin
 * Fecha: 23/10/2023
 */
package ejercicio5;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		// variablessssssssss
		byte num, inicial;
		long resultado;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el número del que quieres un factorial (Máximo 20)");
		num = sc.nextByte();
		sc.close();
		inicial = num;
		resultado = 1;

		while (num >= 2) {
			resultado = resultado * num;
			num--;
		}

		System.out.println(inicial + "! = " + resultado);

	}

}
