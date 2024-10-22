package numerosprimos;

import java.util.Scanner;

public class numerosprimos {

	public static void main(String[] args) {
		// variables
		int num, contador;
		Scanner sc = new Scanner(System.in);

		System.out.println("Dime un número y te diré que si es primo o no");
		num = sc.nextInt();
		contador = 2;
		boolean primo = true;
		
			do {
				if (num % contador == 0&&num!=2) {
					primo = false;
					System.out.println("He encontrado un divisor");
					contador = num;
				}
				contador++;
			} while (contador < num && primo == true);
			System.out.println(primo);
		
	}

}
