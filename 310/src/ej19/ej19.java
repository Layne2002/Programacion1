/*
 * Alumno: Adrián González García
 * Curso: 1ºDAM
 * Fecha: 04/11/2023
 * 
 * Ejercicio: 
 * Hago un programa que muestre el ranking de puntuacion de 8 jugadores de un torneo de ajedrez de forma descendente.
 * El programa pedira al usuario la puntuacion
 * 
 */
package ej19;

import java.util.Arrays;
import java.util.Scanner;

public class ej19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaro scanner y constante con el total de jugadores
				Scanner teclado = new Scanner(System.in);
				final int TOTAL_JUGADORES = 8;
				
				// Creo un array del tamaño de la cantidad de jugadores
				int[] puntuacionesJugadores = new int[TOTAL_JUGADORES];
				
				
				// Creo un bucle para pedirte puntuaciones para almacenarlas en el array
				for(int i = 0;i<TOTAL_JUGADORES;i++) {
					System.out.println("Dame la puntuacion del jugador registrado nº" + (i+1));
					puntuacionesJugadores[i] = teclado.nextInt();
				}
				
				
				// Metodo de la clase Array para ordenar el array de manera ascendente
				Arrays.sort(puntuacionesJugadores);
				
				// Bucle para la salida de datos
				System.out.println("|- Mostrando ranking -|");
				for(int i = 0;i<TOTAL_JUGADORES;i++) {
					
					// Esta variable calculara la posicion de manera descendente del array. De esta manera, puedo mostrar el ranking del 1º al 8º tal y como me lo pide el ejercicio
					int posicion = TOTAL_JUGADORES - i - 1;
					System.out.println((i+1) + "º - " + puntuacionesJugadores[posicion]);
				}

	}

}
