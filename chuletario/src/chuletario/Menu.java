package chuletario;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int opcion;
		boolean salir = false;

		do {
			System.out.println("Elige una opción:" 
					+ "1.-  "
					+ "2.-  "	 
					+ "3.-  "
					+ "4.- Salir");
			opcion = input.nextInt();
			switch (opcion) {
			case 1: {

				break;
			}
			case 2: {

				break;
			}
			case 3: {

				break;
			}
			case 4: {
				salir = true;
				break;
			}
			default: {
				System.out.println("Elige una opción válida!");
				break;
			}
			}
			System.out.println("Dale a Enter para continuar");
			input.nextLine();
		} while (salir == false);
		
		input.close();

	}

}
