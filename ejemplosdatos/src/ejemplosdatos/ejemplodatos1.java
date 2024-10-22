/*Objetivo: mostrar la entrada de datos
 *Autor: karim Zinnatullin
 * Fecha: 26/09/2023
 */
package ejemplosdatos;

import java.util.Scanner;

public class ejemplodatos1 {

	public static void main(String[] args) {
		int edad;
		String resultado;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Dame tu edad:");
		
		edad = teclado.nextInt();
		System.out.println("Tu edad es " + edad + "!");
		resultado = (edad >= 18)?"mayor":"menor";
		System.out.println("Eres " + resultado + " de edad!");
		
		teclado.nextLine();
		// vamos a decir la inicial de su nombre
		String nombre;
		System.out.println("Dime tu nombre!");
		nombre = teclado.nextLine();
		
		System.out.println("Tu nombre es " + nombre + "! Que bonito!");
		
		char letrainicial;
		
		letrainicial = nombre.charAt(0);
		
		System.out.println("La inicial de tu nombre es: " + letrainicial);
		
		int numCaracteres;
		
		numCaracteres = nombre.length();
		
		System.out.println("Tu nombre tiene " + numCaracteres + " letras!");
	}

}
