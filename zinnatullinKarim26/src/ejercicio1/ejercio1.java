/*
 * Objetivo: comprobar si ods numeros son iguales o mayor o menor que otro
 * Autor: Karim Zinnatullin
 * Fecha:5/10/2023
 */
package ejercicio1;
import java.util.Scanner;
public class ejercio1 {

	public static void main(String[] args) {
		// Creamos variables
		Scanner teclado = new Scanner(System.in);
		int a,b;
		
		//pedimos los numeros
		System.out.println("Dame un número");
		a = teclado.nextInt();
		System.out.println("Dame el otro número");
		b = teclado.nextInt();
		
		//comprobamos y mostramos
		if(a<b) {
			System.out.println(a + " es menor que " + b + "!");
		}
		else {
			if(a==b) {
				System.out.println("Los dos números son iguales!");
			}
		
			else {
			System.out.println(a + " es mayor que " + b + "!");
			}
		}
	}
}


