/*
 * Objetivo: contador de billetes
 * Autor: Karim Zinnatullin
 * Fecha: 26/10/2023
 */
package ejercicio14;

import java.util.Scanner;

public class ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int dinero;
		int contador500 = 0;
		int contador200 = 0;
		int contador100 = 0;
		int contador50 = 0;
		int contador20 = 0;
		int contador10 = 0;
		int contador5 = 0;

		System.out.println("Dime cuanto dinero necesitas (múltiplo de 5):");
		dinero = input.nextInt();
		input.close();
		int dineroRestante = dinero;

		do {
			if (dineroRestante >= 500) {
				dineroRestante = dineroRestante - 500;
				contador500++;
			} else if (dineroRestante >= 200) {
				dineroRestante = dineroRestante - 200;
				contador200++;
			} else if (dineroRestante >= 100) {
				dineroRestante = dineroRestante - 100;
				contador100++;
			} else if (dineroRestante >= 50) {
				dineroRestante = dineroRestante - 50;
				contador50++;
			} else if (dineroRestante >= 20) {
				dineroRestante = dineroRestante - 20;
				contador20++;
			} else if (dineroRestante >= 10) {
				dineroRestante = dineroRestante - 10;
				contador10++;
			} else if (dineroRestante >= 5) {
				dineroRestante = dineroRestante - 5;
				contador5++;
			}
		} while (dineroRestante != 0);
		System.out.println("Si necesitas " + dinero + " euros, te daré:");
		if (contador500 > 0) {
			System.out.println(contador500 + " billetes de 500");
		}
		if (contador200 > 0) {
			System.out.println(contador200 + " billetes de 200");
		}
		if (contador100 > 0) {
			System.out.println(contador100 + " billetes de 100");
		}
		if (contador50 > 0) {
			System.out.println(contador50 + " billetes de 50");
		}
		if (contador20 > 0) {
			System.out.println(contador20 + " billetes de 20");
		}
		if (contador10 > 0) {
			System.out.println(contador10 + " billetes de 10");
		}
		if (contador5 > 0) {
			System.out.println(contador5 + " billetes de 5");
		}
	}

}
