/*
 * Objetivo: programa que asigna letra a un dni
 * Autor: Karim Zinnatullin
 * Fecha: 12/12/2023
 */
package ejercicio18;
import java.util.Scanner;
public class ejercicio18 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Dime el numero del DNI");
		int numeroDNI = input.nextInt();
		System.out.println("Para el DNI "+numeroDNI+" el NIF es '"+letraDNI(numeroDNI)+"'.");

	}
	public static char letraDNI(int numero) {
		char[]letras = {'T','R','W','A','G','M','Y','F','P','D',
				'X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
	return letras[numero%23];
	}

}
