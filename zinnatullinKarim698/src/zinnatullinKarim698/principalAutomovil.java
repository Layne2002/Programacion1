/*
 * Autor: Karim Zinnatullin
 * Fecha: 20/02/2024
 */
package zinnatullinKarim698;

import java.util.Random;
import java.util.Scanner;

public class principalAutomovil {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Apartado 1
		System.out.println("Apartado 1: creando un automovil1 por defecto");
		Automovil automovil1 = new Automovil();
		System.out.printf("%s\n", automovil1.toString());

		// Apartado 2
		System.out.println("\nApartado 2: aumentando la velocidad 80 km/h");
		try {
			automovil1.aumentarVelocidad(80);
			System.out.printf("velocidad actual del automovil1: %d km/h\n", automovil1.getVelocidadActual());
		} catch (IllegalArgumentException ex) {
			System.err.printf("%s\n", ex.getMessage());
		}

		// Apartado 3
		System.out.println("\nApartado 3: bajando la velocidad 30 km/h");
		try {
			automovil1.bajarVelocidad(30);
			System.out.printf("velocidad actual del automovil1: %d km/h\n", automovil1.getVelocidadActual());
		} catch (IllegalArgumentException ex) {
			System.err.printf("%s\n", ex.getMessage());
		}
		// Apartado 4
		System.out.println("\nApartado 4: aumentando la velocidad máxima 20 km/h sobre la velocidad máxima");
		try {
			automovil1.aumentarVelocidad(automovil1.getVelocidadMaxima() + 20);
			System.out.printf("velocidad actual del automovil1: %d km/h\n", automovil1.getVelocidadActual());
		} catch (IllegalArgumentException ex) {
			System.err.printf("%s\n", ex.getMessage());
		}

		// Apartado 5
		System.out.println("\nApartado 5: Creando un automóvil2 con características del usuario");
		System.out.println("Introduce el año de abricacion");
		int ano = input.nextInt();

		System.out.println("introduce la velocidad maxima");
		int velocidadMax = input.nextInt();

		System.out.println("introduce tipo de motor (1-combustion 2-electrico)");
		int tipoMotor = input.nextInt();
		input.nextLine();

		System.out.println("Introduce el nombre del modelo");
		String modelo = input.nextLine();

		try {
			Automovil automovi2 = new Automovil(ano, velocidadMax, tipoMotor, modelo);
		} catch (Exception ex) {
			System.err.printf("%s\n", ex.getMessage());
		}

		
		// Apartado 6 -- No se porque pero creo que no funciona
		System.out.println("Apartado 6: Creando 50 automóviles con velocidad maxima aleatoria entre 230 y 250 km/h");
		int contador = 0;
		do {
			int a = velocidadAleatoria();
			try {
				Automovil automovil3 = new Automovil(2000, a, 1, "Ibiza");
				System.out.println("+");
				contador++;
			} catch (IllegalArgumentException ex) {
				
				System.err.printf("%s\n", ex.getMessage());
			}

		}while(contador!=50);
		
		// Apartado 7 -- he cambiado el contador de total de co
		System.out.println("\nApartado 7: mostrando cantidades de coches");
		System.out.printf("Total de automóviles: %s\n",automovil1.getTotalAutomoviles());
		System.out.printf("Total de automóviles eléctricos: %s\n",automovil1.getTotalElectricos());

	}

	public static int velocidadAleatoria() {
		Random random = new Random();
		return random.nextInt(20) + 230;
	}

}
