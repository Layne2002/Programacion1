/*
 * Objetivo: un programa que realiza operaciones aritméticas con tres números
 * Autor: Karim Zinnatullin
 * Fecha: 6/10/2023
 */
package ejercicio2;

//Importamos la biblioteca scanner para pedir datos al usuario
import java.util.Scanner;

public class ejercicio2 {
	public static void main(String[] args) {
		//Creamos las variables
		int a, b ,c;
		Scanner teclado = new Scanner(System.in);
		boolean par;
		//Pedimos los tres números al usuario
		System.out.println("Dame el primer número:");
		a = teclado.nextInt();
		System.out.println("Dame el segundo número:");
		b = teclado.nextInt();
		System.out.println("Dame el tercer número:");
		c = teclado.nextInt();
		
		//Hacemos los cálculos y exponemos
		double res1 = (double)((a/3)+(b/2));
		System.out.println("Un tercio del primer número más la mitad del tercer número: " + res1);
		
		double res2 = (double)((b+c)/2);
		System.out.println("el cuadrado de la mitad de la suma del segundo número más el tercero: " + (res2*res2) );
		
		int res3 = b+c-a;
		par=(res3%2==0);
		System.out.println("El triple de la suma del segundo más el tercer número menos el primero es " + par);
		
		double res4 = ((a+b)*(c-a))/b;
		System.out.println("la suma del primero más el segundo, multiplicado "
				+ "por la diferencia del tercero menos el primero y todo ello partido por el segundo número: " + res4);
		
		
	}
}
