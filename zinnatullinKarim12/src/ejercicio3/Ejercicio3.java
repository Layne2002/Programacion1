/*
 * Objetivo: Mostrar dos datos a la vez en la misma frase
 * 
 * Autor: Karim Zinnatullin
 * 
 * Fecha: 25/09/2023
 */
package ejercicio3;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Crea dos variables de tipo int, num1 y num2, inicializa ambas variables a 0
		int num1 = 0 ;
		int num2 = 0;
		
		// Crea dos variables de tipo double, val1 y val2, no las inicialices.
		double val1;
		double val2;
		
		// Crea dos variables de tipo String nombre y apellidos, inicialízalas con tu nombre 
		//y apellido.
		String nombre = "Karim";
		String apellido = "Zinnatullin";
		
		//Muestra por pantalla el valor de las variables num1 y num2 con un texto que lo 
		//acompañe.
		System.out.println("El valor de la variable num1 es " + num1 + " y el de num2 es " + num2);
		
		//Asigna un valor cualquiera acorde a su tipo a val1 y val2.
		val1 = 834.234;
		val2 = 690.4343;
		System.out.println("El valor de val1 es " + val1 + " y el de val2 es " + val2);
		//Muestra por pantalla el siguiente mensaje, haciendo uso de las variables nombre
		//y apellidos
		System.out.println("Mi nombre es " + nombre + " y mi apellido es " + apellido);
	}

}
