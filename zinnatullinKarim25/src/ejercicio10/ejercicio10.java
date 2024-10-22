/*Objetivo: Calcular el área de un triángulo
 * Autor: Karim Zinnatullin
 * Fecha: 3/10/2023
 */
package ejercicio10;
import java.util.Scanner;

public class ejercicio10 {

	public static void main(String[] args) {
		//Creamos variables
		double altura, anchura;
		Scanner teclado = new Scanner(System.in);
		
		//Pedimos datos
		System.out.println("Cuanto mide de ancho?");
		anchura = teclado.nextDouble();
		
		System.out.println("Cuanto mied de alto?");
		altura = teclado.nextDouble();
		
		//decimos el área
		System.out.println("El área del triángulo es " + ((altura*anchura)/2) + " unidades cuadradas");
		
	}

}
