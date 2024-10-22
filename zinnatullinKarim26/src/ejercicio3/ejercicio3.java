/*
 * Objetivo: Programa de matriculacion
 * Autor: Karim Zinnatullin
 * Fecha: 5/10/2023
 */
package ejercicio3;
import java.util.Scanner;
public class ejercicio3 {

	public static void main(String[] args) {
		//creamos variables
		byte edad;
		String fecha, nombre, apellidos;
		Scanner teclado = new Scanner(System.in);
		
		//pedimos edad al usuario
		System.out.println("Cuantos años tiene?");
		edad = teclado.nextByte();
		
		//limpiamos la variable teclado
		teclado.nextLine();
		
		//usamos if y else
		if (edad<18) {
			System.out.println("No tiene la edad requerida para realizar estos estudios.");
		}
		//creamos el creador de fichero
		else {
			System.out.println("Perfecto, diganos su nombre");
			nombre = teclado.nextLine();
			System.out.println("Ahora sus apellidos.");
			apellidos = teclado.nextLine();
			System.out.println("Y por último, su fecha de nacimiento");
			fecha = teclado.nextLine();
			
			System.out.println("Nombre: " + nombre);
			System.out.println("Apellidos: " + apellidos);
			System.out.println("Fecha de nacimiento: " + fecha);
			
			System.out.println("Usted ha sido admitido");
		}
	}

}
