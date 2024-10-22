/*Objetivo: Pedir y mostrar los datos de una persona
 * Autor: Karim Zinnatullin
 * Fecha: 28/09/2023
 */
package ejercicio1;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		//asignamos las variables correspondietes
		String nombre;
		String apellidos;
		String sexo;
		char letrainicial;
		String direccion;
		byte edad;
		int altura;
		float peso;
		Scanner teclado = new Scanner(System.in);
		
		//pedimos los datos al usuario
		System.out.println("Bienvenido al creador de tu fichero de datos personales! \nDime tu nombre para comenzar!");
		nombre = teclado.nextLine();
		
		System.out.println(nombre +"! Que nombre tan bonito! \n¿Y cuales son tus apellidos?");
		apellidos = teclado.nextLine();
		
		System.out.println(nombre + " " + apellidos + ", entonces? Perfecto, \nY dime, cual es tu género? Masculino o Femenino?");
		sexo = teclado.nextLine();
		
		letrainicial = sexo.charAt(0);
		
		System.out.println("Genial! y bueno, cual es tu dirección?");
		direccion = teclado.nextLine();

		
		System.out.println("Okay, y cuantos años tienes?");
		edad = teclado.nextByte();

		
		System.out.println("Cuanto mides? En centímetros.");
		altura = teclado.nextInt();

		
		System.out.println("cuanto pesas? En kilogramos");
		peso = teclado.nextFloat();
		
		//Enseñamos el fichero
		System.out.println("Genial! aquí tienes tu fichero personal!");
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("Sexo: " + letrainicial);
		System.out.println("Dirección: " + direccion);
		System.out.println("Edad: " + edad + " años");
		System.out.println("Altura: " + altura + "cm");
		System.out.println("Peso: " + peso + "Kg");
		
		}

}
