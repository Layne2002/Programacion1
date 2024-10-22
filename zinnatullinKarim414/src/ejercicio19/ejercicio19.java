/*
 * Objetivo: comprobar tres valores si son compatibles con el teorema de pitagoras
 * Autor: Karim ZInnatullin
 * Fecha: 13/12/2023
 */
package ejercicio19;
import java.util.Scanner;
public class ejercicio19 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Dime el primer número");
		int a=input.nextInt();
		System.out.println("Dime el segundo número");
		int b = input.nextInt();
		System.out.println("Dimme el tercer número");
		int c=input.nextInt();
		if(pitagoras(a,b,c)) {
			System.out.println("Los valores indicados SI se pueden ajustar al teorema de pitágoras");
		}else {
			System.out.println("Los valores indicados NO se pueden ajustar al teorema de pitágoras");
		}

	}
	public static boolean pitagoras(int a, int b, int c) {
		if((a*a+b*b)==(c*c)) {
			return true;
		}else {
			return false;
		}
	}

}
