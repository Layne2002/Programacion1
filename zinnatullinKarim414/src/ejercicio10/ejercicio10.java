/*
 * Objetivo: un programa que lea una fecha introduciendo el día, mes y año por separado y nos diga
si la fecha es correcta o no. Se debe crear una función donde le pasemos los datos y devuelva si
es correcta o no
 * Autor: Karim Zinnatullin
 * Fecha: 28/11/2023
 */
package ejercicio10;

import java.util.Scanner;

public class ejercicio10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int dia, mes, ano;
		System.out.println("Dime el día:");
		dia = input.nextInt();
		System.out.println("Dime el mes:");
		mes = input.nextInt();
		System.out.println("Dime el año:");
		ano = input.nextInt();

		if(fechaValida(dia,mes,ano)==true) {
			System.out.println("La fecha es válida");
		}else {
			System.out.println("La fecha no es valida");
		}
	}

	public static boolean fechaValida(int dia, int mes, int ano) {
		if (dia < 1 || dia > 31 || mes < 1 || mes > 12) {
			return false;
		} else {
			if (dia == 31) {
				switch (mes) {
				case 1, 3, 5, 7, 8, 10, 12: {
					return true;
				}
				default: {
					return false;
				}
				}
			} else if (dia == 30) {
				switch (mes) {
				case 2:
					return false;
				default:
					return true;
				}

			} else if (dia == 29) {
				if (mes == 2) {
					if (ano % 4 == 0 && ano % 100 != 0) {
						return true;
					} else {
						return false;
					}
				} else {
					return true;
				}
			} else {
				return true;
			}
		}

	}
}
