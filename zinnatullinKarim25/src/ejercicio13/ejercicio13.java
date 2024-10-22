/*
 * Objetivo: hacer un conversor de Mb a Kb
 * Autor: Karim Zinnatullin
 * Fecha: 3/10/2023
 */
package ejercicio13;
import java.util.Scanner;

public class ejercicio13 {

	public static void main(String[] args) {
		//Creamos variables
		int megas;
		Scanner teclado = new Scanner(System.in);
		
		//pedimos datos
		System.out.println("Cuantos megabytes son?");
		megas = teclado.nextInt();
		
		//mostramos los Kilobytes
		System.out.println(megas + " equivalen a " + (megas*1000)+ " Kilobytes");

	}

}
