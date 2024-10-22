/*
 * Objetivo: mostrar la declaración, inicialización y asignación de valores en variables de tipos primitivos
 * con propósitos didácticos.
 * 
 * Autor: Rafael Pérez
 * 
 * Fecha: 18/09/2023
 */


package EjemplosVariables;

public class EjemplosVariables {

	public static void main(String[] args) {
		
		// Variables de tipo byte
		byte edad1, edad2;
		
		edad1 = 10;
		edad2 = 20;
		
		System.out.println("el valor de la variable byte edad1 es: " + edad1);
		System.out.println("el valor de la variable byte edad2 es: " + edad2);
		
		// Asignamos el valor de la variable edad1 a la variable edad2
		edad2 = edad1;
		
		System.out.println("Después de la asignación, el valor de la variable byte edad1 es: " + edad1);
		System.out.println("Después de la asignación, el valor de la variable byte edad2 es: " + edad2);
		System.out.println();
		
		// Variables de tipo short
		short numeroPasosAlDia1 = 0, numeroPasosAlDia2;
		
		numeroPasosAlDia2 = 15000;
		
		System.out.println("El valor de la variable short numeroPasosAlDia1 es: " + numeroPasosAlDia1);
		System.out.println("El valor de la variable short numeroPasosAlDia2 es: " + numeroPasosAlDia2);
		
		numeroPasosAlDia1 = numeroPasosAlDia2;
		
		System.out.println("Después de la asignación, el valor de la variable short numeroPasosAlDia1 es: " + numeroPasosAlDia1);
		System.out.println("Después de la asignación, el valor de la variable short numeroPasosAlDia2 es: " + numeroPasosAlDia2);
		System.out.println();
		
		// Variables de tipo entero
		
		//Varialbes de tipo long
		
		//Variables de tipo float
		float peso1, peso2;
		
		peso1 = 0.0f;
		peso2 = 0.5f;
		
		System.out.println("El valor de la variables float peso1 es: " + peso1);
		System.out.println("El valor de la variables float peso2 es: " + peso2);
		
		peso1 = peso2;
		
		System.out.println("Después de la asignación, el valor de la variables float peso1 es: " + peso1);
		System.out.println("Después de la asignación, el valor de la variables float peso2 es: " + peso2);
		System.out.println();
		
		//Variables de tipo double
		
		// Variables de tipo char
		char letraDni1, letraDni2;
		
		letraDni1 = 'A';
		letraDni2 = 'Z';
		
		System.out.println("El valor de la variable char letraDni1 es: " + letraDni1);
		System.out.println("El valor de la variable char letraDni2 es: " + letraDni2);
		
		letraDni2 = letraDni1;
		
		System.out.println("Después de la asignación, el valor de la variable char letraDni1 es: " + letraDni1);
		System.out.println("Después de la asignación, el valor de la variable char letraDni2 es: " + letraDni2);
		System.out.println();
		
		//Variables de tipo booblean
		boolean mayorEdad1, mayorEdad2;
		
		mayorEdad1 = true;
		mayorEdad2 = false;
		
		System.out.println("El valor de la variable boolean mayorEdad1 es: " + mayorEdad1);
		System.out.println("El valor de la variable boolean mayorEdad2 es: " + mayorEdad2);
		
		mayorEdad2 = mayorEdad1;
		System.out.println("Después de la asignación, el valor de la variable boolean mayorEdad1 es: " + mayorEdad1);
		System.out.println("Después de la asignación, el valor de la variable boolean mayorEdad2 es: " + mayorEdad2);
		System.out.println();			

	}

}
