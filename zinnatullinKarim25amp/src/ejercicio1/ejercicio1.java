/*
 * Objetivo un programa que pida por teclado un día de la semana y que diga qué asignatura 
toca a primera hora ese día
 * Autor: Karim Zinnatullin
 * Fecha: 09/10/2023
 */
package ejercicio1;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// Creamos variables
		String dia;
		Scanner sc = new Scanner(System.in);

		// pedimos el día al usuario,
		System.out.println("Que día de la semana quierse consultar? (En minúsculas y con tilde)");
		dia = sc.nextLine();

		// comprobamos que día es y lo decimos
		switch (dia) {
		case ("lunes"): {
			System.out.println("El lunes a primera hora toca matemáticas");
			break;
		}
		case ("martes"): {
			System.out.println("EL martes a primera hora hay historia");
			break;
		}
		case ("miércoles"): {
			System.out.println("El miércoles a primera hora toca economía");
			break;
		}
		case ("jueves"): {
			System.out.println("El jueves a primera hora hay matemáticas");
			break;
		}
		case ("viernes"): {
			System.out.println("El viernes a primera hora hay lengua");
			break;
		}
		case ("sábado"):
		case ("domingo"):
			System.out.println("El " + dia + " no hay clase.");
			break;
		default:
			System.out.println("Error!!!");
		}
		sc.close();
	}

}
