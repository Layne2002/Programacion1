/*
 * Objetivo:
 * Autor: Karim Zinnatullin
 * Fecha: 8/1/2024
 */
package ejercicio3;
import java.time.LocalTime;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ejercicio3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		LocalTime tiempo =  LocalTime.of(8,0);
		int hora;
		do {
			hora = -1;
			try {
			System.out.println("Introduce la hora");
			hora = input.nextInt();
			}catch(InputMismatchException ex) {
				System.err.println("Error: Introduce un número entero");
				input.nextLine();
			}
		}while(hora<0 || hora>23);
		int minuto;
		do {
			minuto = -1;
			try {
			System.out.println("Introduce el minuto");
			minuto = input.nextInt();
			}catch(InputMismatchException ex) {
				System.err.println("Error: Introduce un número entero");
				input.nextLine();
			}
		}while(minuto<0 || hora>59);
		LocalTime tiempo2 =  LocalTime.of(hora,minuto);
	}

}
