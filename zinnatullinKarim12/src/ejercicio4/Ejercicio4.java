/*
 * Objetivo: Definir variables y tipos de variables
 * 
 * Autor: Karim Zinnatullin
 * 
 * Fecha: 25/09/2023
 */
package ejercicio4;

public class Ejercicio4 {

	public static void main(String[] args) {
		//Crear un programa en el que definamos e inicialicemos variables de los siguientes tipos.
		byte mes = 11;
		short precio = 14999;
		int poblacion = 3500000;
		char letra = 'G';
		double pi = 3.141592;
		String nombre = "Karim";
		
		//A continuación mostraremos por pantalla un mensaje indicando el tipo de variable que es y el 
		//valor con el que lo hemos inicializado
		System.out.println("El valor de la variable de tipo byte (mes) es: " + mes);
		System.out.println("El valor de la variable de tipo short (precio) es: " + precio);
		System.out.println("El valor de la variable de tipo entero (poblacion) es: " + poblacion);
		System.out.println("El valor de la variable de tipo caracter (letra) es: " + letra);
		System.out.println("El valor de la variable de tipo número decimal (pi) es: " + pi);
		System.out.println("El valor de la variable de una cadena de caracteres (nombre) es: " + nombre);
	}

}
