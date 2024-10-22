/*
 * Objetivo: comprobar si una frase es un políndromo
 * Autor: Karim Zinnatullin
 * Fecha: 21/11/2023
 */
package ejercicio5;
import java.util.Scanner;
public class ejercicio5 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String cadena;
		System.out.println("Dime una frase y te dire si es un políndromo");
		cadena=input.nextLine().replaceAll(" ", "");
		
		
		char[]array=new char[cadena.length()];
		for(int i = 0; i<cadena.length();i++) {
			array[i]=cadena.charAt(i);
		}
		String cadenaInvertida="";
		for(int i = cadena.length()-1; i>=0;i--) {
			cadenaInvertida=cadenaInvertida + array[i];
		}
		
		if(cadenaInvertida.equalsIgnoreCase(cadena)) {
			System.out.println("Es un políndromo");
		}else {
			System.out.println("NO es un políndromo");
		}

	}

}
