/*
 * Tarea evaluable 599
 * Fecha: 12/01/2024
 * Autor: Karim Zinnatullin
 */
package ejercicio;

import libtarea3.Bombilla;

public class ejercicio {

	public static void main(String[] args) {
		// APARTADO 1
		Bombilla bombilla1;
		Bombilla bombilla2;
		Bombilla bombilla3;

		// APARTADO 2
		System.out.println("1. CONSULTA INICIAL");
		System.out.printf("Número de bombillas creadas hasta el momento: %d", Bombilla.getBombillasCreadas());
		System.out.printf("\nNúmero de bombillas encendidas ahora mismo: %d", Bombilla.getBombillasEncendidas());

		// APARTADO 3
		System.out.println("\n2. CREACIÓN Y USO DE BOMBILLAS");
		System.out.println("------------------------------");

		// 3.1
		try {
			System.out.println("\nIntentando crear una bombilla con potencia demasiado alta...");
			bombilla1 = new Bombilla(true, 250);
		} catch (Exception ex) {
			System.err.println("\nError: " + ex.getMessage());
		}

		// 3.2
		try {
			System.out.println("\nIntentando crear una bombilla con potencia demasiado baja...");
			bombilla1 = new Bombilla(5);
		} catch (Exception ex) {
			System.err.println("Error: " + ex.getMessage());
		}
		// 3.3
		System.out.println("\nCreando una bombilla válida...");
		bombilla1 = new Bombilla(true, 100);
		// 3.4
		System.out.println("Creando una segunda bombilla...");
		bombilla2 = new Bombilla(true);
		// 3.5
		System.out.println("Creando la tercera bombilla...");
		bombilla3 = new Bombilla();

		// APARTADO 4

		// 4.1
		try {
			System.out.println("\nIntentando encender la primera bombilla (ya está encendida)...");
			bombilla1.encender();
		} catch (Exception ex) {
			System.err.println("\nError: " + ex.getMessage());
		}

		// 4.2
		System.out.println("\nIntentando conmutar la primera bombilla seis veces...");
		try {
			for (int i = 0; i < 6; i++) {
				System.out.println("Conmutando el estado de la bombilla 1...");
				bombilla1.conmutar();
			}
		} catch (Exception ex) {
			System.err.println("\nError: " + ex.getMessage());
		}
		// 4.3
		try {
			System.out.println("Apagando la segunda bombilla...");
			bombilla2.apagar();
		} catch (Exception ex) {
			System.err.println("\nError: " + ex.getMessage());
		}
		// 4.4
		try {
			System.out.println("Encendiendo la tercera bombilla...\n");
			bombilla3.encender();
		} catch (Exception ex) {
			System.err.println("\nError: " + ex.getMessage());
		}
		// APARTADO 5
		System.out.println("Obtendiendo información de la primera bombilla");
		System.out.print("----------------------------------------------");
		System.out.printf("\nLa potencia: %.2f", bombilla1.getPotencia());
		System.out.printf("\nEl estado(encendida?): %b", bombilla1.getEstado());
		// System.out.printf("\nÚltima vez que se encendió la bombilla: "); no sabía
		// hacerlo
		System.out.printf("\nNúmero de veces encendida: %d", bombilla1.getVecesEncendida());
		System.out.printf("\nTiempo que lleva encendida: %.2f", bombilla1.getTiempoEncendida());
		System.out.printf("\nPotencia que lleva consumida: %.2f", bombilla1.getPotenciaConsumida());

		// APARTADO 6
		System.out.println("\n\n3. CONSULTA FINAL");
		System.out.printf("Número de bombillas creadas hasta el momento: %d", Bombilla.getBombillasCreadas());
		System.out.printf("\nNúmero de bombillas encendidas ahora mismo: %d", Bombilla.getBombillasEncendidas());
	}

}
