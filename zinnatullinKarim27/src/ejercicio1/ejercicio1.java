/*
 * Objetivo: programa para ayudar a recursos humanos a decidir a quin contratar
 * Autor: Karim Zinnatullin
 * Fecha:10/10/2023
 */
package ejercicio1;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// creamos las variables
		String nombre, apellidos;
		byte edad;
		int salario;
		Scanner sc = new Scanner(System.in);

		// pedimos datos
		System.out.println("Díganos su nombre: ");
		nombre = sc.nextLine();
		System.out.println("Y ahora sus apellidos: ");
		apellidos = sc.nextLine();

		sc.nextLine();
		System.out.println("Cuántos años tiene? ");
		edad = sc.nextByte();

		sc.nextLine();
		System.out.println("Cual es su salario anual deseado?");
		salario = sc.nextInt();

		// comprobamos los requisitos de edad y salario deseado
		if (edad > 45 || salario > 30000 || edad < 18) {
			System.out.println("Lo sentimos pero no cumple nuestro perfil");
		} else {
			byte anos, proyectos;
			System.out.println("Perfecto, y cuantos años de experiencia tiene?");
			anos = sc.nextByte();
			System.out.println("Y en cuántos proyectos ha trabajado?");
			proyectos = sc.nextByte();

			// comprobamos los requisitos de años de experiencia y proyectos
			if (anos >= 2 && proyectos > 3) {
				System.out.println("Enhorabuena. Ha sido contratado");
			} else
				System.out.println("Lo sentimos pero no cumple nuestro perfil");
		}

	}

}
