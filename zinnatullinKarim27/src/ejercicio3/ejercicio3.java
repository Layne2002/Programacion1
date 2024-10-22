/*
 * Objetivo: perdir la nota académica y expresar su valor haciendo uso de switch
 * Autor: Karim Zinnatullin
 * Fecha: 10/10/2023
 */
package ejercicio3;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		// creamos las variables
		byte nota;
		Scanner sc = new Scanner(System.in);

		// pedimos la nota al usuario
		System.out.println("Dime la nota: ");
		nota = sc.nextByte();

		// hacemos el switch
		switch (nota) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("La nota es " + nota + " (INSUFICIENTE)");
			break;
		case 5: {
			System.out.println("La nota es 5 (SUFICIENTE");
			break;
		}
		case 6: {
			System.out.println("La nota es 6 (BIEN)");
			break;
		}
		case 7:
		case 8:
			System.out.println("La nota es " + nota + " (NOTABLE)");
			break;
		case 9:
		case 10:
			System.out.println("La nota es " + nota + " (SOBRESALIENTE)");
			break;
		default: {
			System.out.println("La nota introducida es incorrecta!!!!!");
		}
		}

	}

}
