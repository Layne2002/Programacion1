/*
 * objetivo: pedir datos académicos al usuario y decir si es aceptado
 * Autor: Karim Zinnatullin
 * Fecha: 5/10/2023
 */
package ejercicio2;
import java.util.Scanner;
public class ejercicio2 {

	public static void main(String[] args) {
		// creamos variables
		byte edad;
		double nota;
		Scanner teclado = new Scanner(System.in);
		
		//pedimos datos al usuario
		System.out.println("Cual es tu edad?");
		edad = teclado.nextByte();
		
		teclado.nextLine();

		System.out.println("Cual es tu nota académica exacta?");
		nota = teclado.nextDouble();
		
		//comprobamos requisitos
		if(edad>=18&nota>7) {
			System.out.println("Usted ha sido admitido en el curso, cumple las condiciones requeridas");
		}
		else {
			System.out.println("Lo sentimos, no ha sido admitido en el curso ya que no cumple los requisitos mínimos");
		}

	}

}
