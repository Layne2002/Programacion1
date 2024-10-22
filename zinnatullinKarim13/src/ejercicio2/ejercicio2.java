/*Objetivo: crear un fichero de un equipo de fútbol
 * Autor: Karim Zinnatullin
 * Fecha: 28/09/2023
 */
package ejercicio2;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		//Creamos las variables
		String equipo;
		String estadio;
		int fundacion;
		String capitan;
		Scanner teclado = new Scanner(System.in);
		
		//pedimos los datos al usuario
		System.out.println("Hola! Vamos a crear el fichero de tu equipo! \nComo se llama?");
		equipo = teclado.nextLine();
		
		System.out.println("Perfecto, y como se llama el estadio?");
		estadio = teclado.nextLine();
		
		//limpiamos el buffer
		teclado.nextLine();
		
		//seguimos pidiendo los datos
		System.out.println("Y en que año se fundó?");
		fundacion = teclado.nextInt();
		
		//limpiamos el nextline
		teclado.nextLine();
		
		//otra vez a pedir datos
		System.out.println("Y el capitán? Cómo se llama?");
		capitan = teclado.nextLine();
		
		//Mostrás los datos
		System.err.println("************************************************************");
		System.out.println("************Nombre del equipo: " + equipo + "**************");
		System.out.println("************Nombre del estadio: " + estadio + "************");
		System.out.println("************Año de fundación: " + fundacion + "************************");
		System.out.println("************Capitán: " + capitan + "************************************");
		System.out.println("************************************************************");
	}

}
