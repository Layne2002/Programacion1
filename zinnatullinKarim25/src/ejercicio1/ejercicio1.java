/*Objetivo: preguntar nombre y mostrarlo
 * Autor:Karim Zinnatullin
 * Fecha: 03/10/2023
 */

package ejercicio1;
import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		//creamos variable nombre
		String nombre;
		Scanner teclado = new Scanner(System.in);
		
		//pedimos el nombre
		System.out.println("Como te llamas? ");
		nombre = teclado.nextLine();
		
		//mostramos el nombre
		System.out.println("Hola " + nombre + ".");

	}

}
