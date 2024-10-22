/*
 * Objetivo: contador de vocales
 * Autor: Karim Zinnatullin
 * Fecha: 21/11/2023
 */
package ejercicio4;
import java.util.Scanner;
public class ejercicio4 {

	public static void main(String[] args) {
		int contA=0, contE=0, contI=0, contO=0, contU=0;
		Scanner input=new Scanner(System.in);
		String cadena;
		System.out.println("Dime una cadena de caracteres");
		cadena =input.nextLine().toLowerCase();
		
		for(char caracter : cadena.toCharArray()) {
			switch(caracter) {
			case 'a':{
				contA++;
				break;
			}
			case 'e':{
				contE++;
				break;
			}
			case 'i':{
				contI++;
				break;
			}
			case 'o':{
				contO++;
				break;
			}
			case 'u':{
				contU++;
				break;
			}
				
			}
		}
		System.out.println("Número de As: "+contA);
		System.out.println("Número de Es: "+contE);
		System.out.println("Número de Is: "+contI);
		System.out.println("Número de Os: "+contO);
		System.out.println("Número de Us: "+contU);
		
		
	}

}
