/*
 * objetivo: un programa que diga que el numero es par y mayor que 100
 * autor: Karim Zinnatullin
 * Fecha: 5/10/2023
 */
package mayorque100;
import java.util.Scanner;

public class mayorque100 {

	public static void main(String[] args) {
		// Creamos variables
		int num;
		Scanner teclado = new Scanner(System.in);
		
		//pedimos el numero
		System.out.println("Dime un numero");
		num = teclado.nextInt();
		
		//comprobamos que sea par y mayor que 100
		if(num%2==0&num>100) {
			System.out.println("Tu número es par y mayor que 100!");
		}

	}

}
