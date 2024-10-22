/*
 * Objetivo: pedir nota al usuario en 4 asignaturas, hacer la media.
 * Autor: Karim Zinnatullin
 * Fecha: 10/10/2023
 */
package ejercicio4;

import java.util.Scanner;
import java.lang.Math;

public class ejercicio4 {

	public static void main(String[] args) {
		// creamos variables
		double nota1, nota2, nota3, nota4;
		Scanner sc = new Scanner(System.in);

		// pedimos los datos al usuario
		System.out.println("Introduce la primera nota:");
		nota1 = sc.nextDouble();

		System.out.println("Introduce la segunda nota:");
		nota2 = sc.nextDouble();

		System.out.println("Introduce la tercera nota:");
		nota3 = sc.nextDouble();

		System.out.println("Introduce la cuarta nota:");
		nota4 = sc.nextDouble();

		// calculamos la media
		double media = (nota1 + nota2 + nota3 + nota4) / 4;

		// mostramos los redondeos en pantalla
		System.out.println("Tu nota media es " + media);
		System.out.println("La nota media redondeada hacia arriba es: " + (int) Math.ceil(media));
		System.out.println("La nota redondeada hacia abajo es: " + (int) Math.floor(media));

		// comprobamos con un IF si la nota media es superior a 8
		if (media > 8) {
			System.out.println("Enhorabuena! Puedes acceder a estudios deseados!");
		} else {
			System.out.println("Lo sentimos. No puedes acceder a los estudios deseeados.");
		}
	}

}
