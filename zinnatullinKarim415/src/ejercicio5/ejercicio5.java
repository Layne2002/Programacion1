/*
 * Objetivo:
 * Autor: Karim Zinnatullin
 * Fecha:15/12/2023
 */
package ejercicio5;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Cómo se llama el jugador?");
		String nombre = input.nextLine();
		input.nextLine();
		System.out.println("Cuál es el dorsal del jugador?");
		int dorsal=input.nextInt();
		if(posicionJugador(dorsal).equals("error")) {
			System.out.println("Dorsal incorrecto");
		}else
		System.out.println(nombre+", con el dorsal "+dorsal+" juega el próximo partido como "+posicionJugador(dorsal));

	}
	public static String posicionJugador(int dorsal) {
		if(dorsal<1||dorsal>16)
			return "error";
		else {
			if(dorsal==1)
				return "portero";
			else if(dorsal<=5)
				return "defensa";
			else if(dorsal<=8)
				return "centrocampista";
			else if(dorsal<=11)
				return "delantero";
			else
				return "suplente";
		}
	}
}
