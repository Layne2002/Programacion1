/*
 * Objetivo: programa que te dice si eres menor de edad
 * Autor: Karim Zinnatullin
 * Fecha: 5/10/2023
 */
package mayordeedad;
import java.util.Scanner;

public class mayordeedad {

	public static void main(String[] args) {
		//Creamos la variable edad y scanner
		byte edad;
		Scanner teclado = new Scanner(System.in);
		
		//pedimos la edad al usuario
		System.out.println("Dime tu edad");
		edad = teclado.nextByte();
		
		if(edad<0) {
			System.out.println("Tu edad no puede ser negativa, mentiroso!");
		}
		else {
			if(edad<18) {
			System.out.println("Eres menor de edad!");
		}
			else {
			System.out.println("Eres mayor de edad!");
		}
		}
		System.out.println("Fin del programa.");
		

	}

}
