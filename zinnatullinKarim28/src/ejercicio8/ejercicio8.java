/*
 * Objetivo: Crear un fichero sobre senderismo usando bucle for
 * Autor: Karim Zinnatullin
 * Fecha: 20/10/2023
 */
package ejercicio8;

import java.util.Scanner;

public class ejercicio8 {

	public static void main(String[] args) {
		String nombre, apellidos, ciudad;
		byte edad;
		int ultimaRuta, participantes, rutas, distancia, distanciaTotal;
		Scanner sc = new Scanner(System.in);

		System.out.println("Dime tu nombre:");
		nombre = sc.nextLine();
		System.out.println("Dime tus apellidos:");
		apellidos = sc.next();
		sc.nextLine();

		do {
			System.out.println("Dime tu edad");
			edad = sc.nextByte();
			if (edad < 17 || edad > 45) {
				System.out.println("Esa edad no es correcta");
			}
		} while (edad < 17 || edad > 45);
		sc.nextLine();
		System.out.println("Número de rutas realizadas:");
		rutas = sc.nextInt();
		System.out.println("Distancia última ruta:");
		ultimaRuta = sc.nextInt();

		System.out.println("Ahora te voy a pedir datos de tus últimas 5 caminatas");
		distancia = 0;
		distanciaTotal = 0;
		int distanciaMaxima = 0;
		String ciudadRuta = "valor";
		ciudad = "Málaga";
		byte contador = 0;
		for (int i = 1; i <= 5; i++) {
			if (i > rutas) {
				System.out.println(
						"Bueno, como solo has realizado " + rutas + " rutas, no puedo pedirte 5 últimas rutas.");
				i = 5;
			} else {
				System.out.println("Distancia recorrida ruta " + i);
				distancia = sc.nextInt();

				distanciaTotal += distancia;
				System.out.println("Número de participantes en la ruta " + i);
				participantes = sc.nextInt();
				sc.nextLine();
				System.out.println("Nombre de la ciudad de la ruta " + i);
				ciudad = sc.nextLine();
				sc.nextLine();
				if (distancia > distanciaMaxima) {
					distanciaMaxima = distancia;
					ciudadRuta = ciudad;
				}
				contador++;
			}
			
			}
			sc.close();
			System.out.println("------------------------------------------");
			System.out.println("Nombre: " + nombre);
			System.out.println("Apellidos: " + apellidos);
			System.out.println("Número de rutas realizadas: " + rutas);
			System.out.println();
			System.out.println("Distancia media (5 últimas rutas): " + (distanciaTotal / contador));
			System.out.println("Distancia más larga de las últimas 5 rutas: " + distanciaMaxima);
			System.out.println("Ciudad de la ruta más larga: " + ciudadRuta);
			System.out.println("------------------------------------------");
		}
	}

