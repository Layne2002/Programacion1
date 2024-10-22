/* Objetivo: mostrar entrada de datos */

package Ejemplo;
import java.util.Scanner;

public class consultas
{

	public static void main(String[] args) 
	{
	//Decalrar variables
	int edad;
		
	Scanner teclado = new Scanner(System.in);
		
	System.out.println("Dame tu edad:");
		
	edad = teclado.nextInt();
		
	System.out.println("Tu edad es: " + edad);
		
	//Permitir una segunda inserccion de datos
	teclado.nextLine();
	
	//Pedir una cadena de caracteres
		
	String nombre;	
		
	System.out.println("Dame tu nombre: ");	
	nombre = teclado.nextLine();
		
	System.out.println("Tu nombre es: " + nombre);
		
	char letraInicial;
		
	letraInicial = nombre.charAt(0);
		
	System.out.println("La inicial de tu nombre es:" + letraInicial);
	
	int numCaracteres;
	numCaracteres = nombre.length();
	
	System.out.println("Tu nombre tiene: " + numCaracteres);
	
	
	}

}

