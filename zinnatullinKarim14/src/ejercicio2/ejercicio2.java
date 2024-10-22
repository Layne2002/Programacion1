/*Objetivo pasar euros a pesetas y viceversa
 * Autor: Karim Zinnatullin
 * Fecha: 2/10/2023
 */

package ejercicio2;

import java.util.Scanner;

public class ejercicio2 {
	public static void main(String[] args){
		//asignamos variables
		double pesetas;
		double euros;
		Scanner teclado = new Scanner(System.in);
		
		//pedimos euros al usuario
		System.out.println("Cuantos euros quieres pasar a pesetas?");
		euros = teclado.nextDouble();
		pesetas = euros*166.386;
		System.out.println(euros + " equivalen a " + pesetas + " pesetas!");
		
		teclado.nextLine();
		//pedimos pesetas al usuario
		System.out.println("Cuantas pesetas quieres pasar a euros?");
		pesetas = teclado.nextDouble();
		euros = pesetas/166.386;
		System.out.println(pesetas + " pesetas son " + euros + " euros!");
		
		
		}
	}
