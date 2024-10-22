/*
 * Objetivo: Crear un identificador para una persona
 * Autor: Karim Zinnatullin
 * Fecha: 6/10/2023
 */
package ejercicio3;

//importamos la biblioteca Scanner para pedir daots del usuario
import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		// creamos variables
		String nombre, apellido, genero;
		byte dia, mes;
		int ano;
		Scanner teclado = new Scanner(System.in);
		
		//pedimos datos
		System.out.println("Dime tu nombre:");
		nombre = teclado.nextLine();
		System.out.println("Dime tu primer apellido:");
		apellido = teclado.nextLine();
		
		//limpiamos nextline
		teclado.nextLine();
		
		System.out.println("Dime el día de tu nacimiento:");
		dia = teclado.nextByte();
		System.out.println("Dime el mes de tu nacimiento:");
		mes = teclado.nextByte();
		
		//limpiamos nextline
		teclado.nextLine();
		
		System.out.println("Dime el año de tu nacimiento:");
		ano = teclado.nextInt();
		
		//limpiamos nextline
		teclado.nextLine();
		
		System.out.println("Dime tu género (M/F)");
		genero = teclado.nextLine();
		
		//creamos el identificador
		
		char letra1;
		letra1 = nombre.charAt(0);
		char letra2;
		letra2 = nombre.charAt(1);
		char letra3;
		letra3 = apellido.charAt(0);
		char letra4;
		letra4 = apellido.charAt(1);

		System.out.println("Tu identificador de usuario es: " + letra1 + letra2 + letra3 + letra4 + dia);

	}

}
