/*
 * Objetivo: calcular salario semanal
 * Autor: Karim Zinnatullin
 * Fecha: 3/10/2023
 */
package ejercicio12;
import java.util.Scanner;
public class ejercicio12 {

	public static void main(String[] args) {
		//Creamos variables
		byte horas, dias;
		int salario;
		Scanner teclado = new Scanner(System.in);
		
		//pedimos datos
		System.out.println("Cuantas horas trabaja al día?");
		horas = teclado.nextByte();
		
		System.out.println("Cuantos días a la semana trabaja?");
		dias = teclado.nextByte();
		
		//Calculamos y mostramos
		salario = (horas*dias)*12;
		System.out.println("Su salario semanal bruto es de " + salario);

	}

}
