/*
 * Objetivo: . Crea un programa que pida dos cadenas de texto por teclado y luego indique si son iguales,
además de si son iguales sin diferenciar entre mayúsculas y minúsculas.
 * Autor: Karim Zinnatullin
 * Fecha: 21/11/2023
 */
package ejercicio2;
import java.util.Scanner;
public class ejercicio2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String cadena1;
		String cadena2;
		
		System.out.println("Dime la primera cadena de caracteres");
		cadena1 = input.nextLine();
		System.out.println("Dime la segunda cadena de caracteres");
		cadena2 = input.nextLine();
		if(cadena1.equals(cadena2)) {
			System.out.println("Las dos cadenas son exactamente iguales");
		}else if(cadena1.equalsIgnoreCase(cadena2)) {
			System.out.println("Las dos cadenas son iguales si se ignoran las mayusculas");
		}else {
			System.out.println("Las dos cadenas son diferentes");
		}
		

	}

}
