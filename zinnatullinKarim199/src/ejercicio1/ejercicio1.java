/*
 * Objetivo: Cálculo del volumen de un cilindro
 * Autor: Karim Zinnatullin
 * Fecha: 6/10/2023
 */
package ejercicio1;

//Importamos la biblioteca scanner para poder pedir datos al usuario
import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// Creamos las variables
		double rad, alt;
		final double PI = 3.1415927;
		Scanner teclado = new Scanner(System.in);
		
		//pedimos los datos al usuario
		System.out.println("Dime el radio de la base del cilindro:");
		rad = teclado.nextDouble();
		System.out.println("Dime la altura del cilindro:");
		alt = teclado.nextDouble();
		
		//Calculamos el volumen y lo enseñamos
		System.out.println("El volumen del cilindro es " + ((rad*rad)*alt*PI) + " unidades al cubo.");

	}

}