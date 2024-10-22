/*
 * Objetivo: Crea un programa con una clase llamada persona
 * Autor: Karim Zinnatullin
 */
package D2;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Persona persona1 = new Persona();
		System.out.println("Introduce el nombre de la primera persona:");
		String nombre1 = input.nextLine();
		System.out.println("Introduce sus apellidos:");
		String apellidos1 = input.nextLine();
		boolean validado = false;
		do {
			try {
				System.out.println("Introduce su DNI:");
				String dni1 = input.nextLine();
				input.nextLine();
				persona1.setDNI(dni1);
				validado = true;
			} catch (IllegalArgumentException ex) {
				System.err.printf("Error: ", ex.getMessage());
			}
		} while (validado == false);
		input.nextLine();
		System.out.println("Introduce su edad:");
		int edad1 = input.nextInt();
		input.nextLine();

		persona1.setNombre(nombre1);
		persona1.setApellidos(apellidos1);
		persona1.setEdad(edad1);

		System.out.println("--------------------");

		Persona persona2 = new Persona();
		System.out.println("Introduce el nombre de la persona 2:");
		String nombre2 = input.nextLine();
		System.out.println("introduce sus apellidos:");
		String apellidos2 = input.nextLine();

		validado = false;
		do {
			try {
				System.out.println("Introduce su DNI:");
				String dni2 = input.nextLine();
				input.nextLine();
				persona2.setDNI(dni2);
				validado = true;
			} catch (IllegalArgumentException ex) {
				System.err.printf("Error: ", ex.getMessage());
			}
		} while (validado == false);

		System.out.println("\nIntroduce su edad:");
		int edad2 = input.nextInt();
		input.close();

		persona2.setNombre(nombre2);
		persona2.setApellidos(apellidos2);
		persona2.setEdad(edad2);

		/*
		 * if (persona1.getEdad() >= 18)
		 * System.out.printf("%s %s con DNI %s es MAYOR de edad\n",
		 * persona1.getNombre(), persona1.getApellidos(), persona1.getDNI()); else
		 * System.out.printf("%s %s con DNI %s es MENOR de edad\n",
		 * persona1.getNombre(), persona1.getApellidos(), persona1.getDNI());
		 * 
		 * if (persona2.getEdad() >= 18)
		 * System.out.printf("%s %s con DNI %s es MAYOR de edad\n",
		 * persona2.getNombre(), persona2.getApellidos(), persona2.getDNI()); else
		 * System.out.printf("%s %s con DNI %s es MENOR de edad\n",
		 * persona2.getNombre(), persona2.getApellidos(), persona2.getDNI());
		 */
		System.out.println("Probando metodos nuevos:");
		persona1.imprime();
		if (persona1.esMayorEdad())
			System.out.println("Persona 1 es mayor de edad");
		else
			System.out.println("Persona 1 NO es mayor de edad");

		if (persona1.esJubilado())
			System.out.println("Persona 1 esta jubilada");
		else
			System.out.println("Persona 1 NO esta jubilada");
		System.out.printf("Diferencia de edad entre persona 1 y 2: %d", persona1.diferenciaEdad(persona2));
	}

}
