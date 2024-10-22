/*Objetivo: pedir datos para mostrar una ficha
 * Autor: karim zinnatullin
 * Fecha: 3/10/2023
 * 
 */
package ejercicio2;
import java.util.Scanner;
public class ejercicio2 {
	public static void main(String[] args) {
		//creamos las variables
		String nombre, direccion, telefono;
		Scanner teclado = new Scanner(System.in);
		
		//pedimos los datos al usuario
		System.out.println("Cual es tu nombre?");
		nombre = teclado.nextLine();
		
		System.out.println("Cual es tu dirección?");
		direccion = teclado.nextLine();
		
		System.out.println("Cual es tu número de teléfono?");
		telefono = teclado.nextLine();
		
		//hacemos la ficha
		System.out.println("Aqui tienes tu ficha personal: \nNombre: " + nombre);
		System.out.println("Dirección: " + direccion);
		System.out.println("Número de telélfo: " + telefono);
		
	}
}
