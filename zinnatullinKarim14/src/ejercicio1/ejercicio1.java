/*Objetivo: Calcular sueldo neto de una persona
 * Autor: Karim Zinnatullin
 * Fecha: 2/10/2023
 */
package ejercicio1;

import java.util.Scanner;
public class ejercicio1 {

	public static void main(String[] args) {
		//Realizar un programa en Java que solicite al usuario los datos
		Scanner teclado = new Scanner(System.in);
		String nombre;
		String apellidos;
		String fecha;
		double bruto;
		byte anos;
		byte hijos;
		double neto;
		double aumento;
		double netoaumentado;
		//pedimos los datos
		System.out.println("Dime tu nombre");
		nombre = teclado.nextLine();
		
		System.out.println("Dime tus apellidos");
		apellidos = teclado.nextLine();
		
		System.out.println("Cual es tu fecha de nacimiento?");
		fecha = teclado.nextLine();
		
		teclado.nextLine();
		System.out.println("Cual es tu salario bruto anual?");
		bruto = teclado.nextDouble();
		
		teclado.nextLine();
		System.out.println("Cuantos años has trabajado en la empresa?");
		anos = teclado.nextByte();
		
		teclado.nextLine();
		System.out.println("Cuantos hijos tiene?");
		hijos = teclado.nextByte();
		
		//calculamos el salario neto con 15% IRPF y el aumento
		neto = bruto*0.85;
		aumento = anos*0.01+1;
		netoaumentado = neto*aumento;
		//Mostramos la ficha
		System.out.println("Estimad@ " + nombre + " " + apellidos + ", sus salario bruto anual es " + bruto + ", teniendo");
		System.out.println("en cuenta un IRPF del 15%, su salario anual neto es de " + neto);
		
		System.out.println("Debido a sus " + anos + " años trabajando en la empresa");
		System.out.println("su salario se incrementará 1% por cada año. El aumento es de");
		System.out.println(aumento +" y el salario total es de " + netoaumentado);
	}

}
