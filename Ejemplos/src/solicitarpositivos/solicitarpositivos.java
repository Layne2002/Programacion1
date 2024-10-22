package solicitarpositivos;

import java.util.Scanner;

public class solicitarpositivos {

	public static void main(String[] args) {
		// creamos variables
		Scanner sc = new Scanner(System.in);
		int contador1, contador2, num, total;

		// creamos el bucle
		contador1 = 0;
		contador2 = 0;
		total = 0;
		do {
			System.out.println("Dime un número positivo(para parar introduce 0)");
			num = sc.nextInt();
			if (num >= 0) {
				if (num != 0 && num % 2 == 0) {
					contador1++;
					total = total + num;
				} else if (num % 2 != 0) {
					System.out.println("Has introducido un número impar!");
					contador2++;
				}
			} else {
				System.out.println("Has introducido un número negativo!");

			}
		} while (num != 0);
		sc.close();
		System.out.println(
				"Cantidad de números pares introducidos: " + contador1 + "\r\nSuma total de los números pares: " + total
						+ "\r\nCantidad de números IMPARES introducidos: " + contador2);
	}

}
