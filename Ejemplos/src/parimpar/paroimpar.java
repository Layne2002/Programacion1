/*
 * Objetivo: un programa que diga si un numero es par o impar
 * Autor: Karim zinnatullin
 * Fecha: 5/10/2023
 */
package parimpar;
import java.util.Scanner;
public class paroimpar {

	public static void main(String[] args) {
		// Creamos la variable num y scanner
		int num;
		Scanner teclado = new Scanner(System.in);
		
		//pedimos un numero al usuario
		System.out.println("Dime un número entero");
		num = teclado.nextInt();
		
		//miramos si el numero es par o impar
		
		if(num%2==0) {
			System.out.println("El número " + num + " es par!");
		}
		else {
			System.out.println("El número " + num + " es impar!");
		}
		System.out.println("fin del programa");

	}

}
