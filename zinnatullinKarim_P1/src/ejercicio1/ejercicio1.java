/*
 * Objetivo: Deducir la estación a partir de una fecha
 * Autor: Karim Zinnatullin
 * Fecha: 26/10/2023
 */
package ejercicio1;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// creamos las variables
		byte dia, mes;
		Scanner input = new Scanner(System.in);

		// pedimos el dia y el mes
		System.out.println("Introduce el día: ");
		dia = input.nextByte();
		System.out.println("Introduce el número del mes: ");
		mes = input.nextByte();
		input.close();

		switch (mes) { // creamos un switch con un caso para cada mes
		case 6: {
			if (dia >= 21) { // si el dia es mayor o igual que 21 es verano, sino, primavera
				System.out.println("Es Verano");
			} else {
				System.out.println("Es Primavera.");
			}
			break;
		}
		case 9: {
			if (dia < 23) { // si el dia es menor que 23 entonces verano, sino, otoño
				System.out.println("Es Verano.");
			} else {
				System.out.println("Es Otoño");
			}
			break;
		}
		case 12: {
			if (dia < 21) { // si el dia es menor que 21 entonces otoño, sino, invierno
				System.out.println("Es Otoño");
			} else {
				System.out.println("Es Invierno");
			}
			break;
		}
		case 3: {
			if (dia < 20) { // si el dia es menor que 20 entonces invierno, sino, primavera
				System.out.println("Es Invierno");
			} else {
				System.out.println("Es Primavera");
			}
			break;
		}
		// a partir de aqui declaramos los casos de los demás meses, diciendo la
		// estación correspondiente
		case 1, 2: {
			System.out.println("Es Invierno");
			break;
		}
		case 4, 5: {
			System.out.println("Es Primavera");
			break;
		}
		case 7, 8: {
			System.out.println("Es Verano");
			break;
		}
		case 10, 11: {
			System.out.println("Es Otoño");
			break;
		}
		default: {
			System.out.println("Error"); // un mes erroneo nos devuelve un error
		}

		}
	}
}
