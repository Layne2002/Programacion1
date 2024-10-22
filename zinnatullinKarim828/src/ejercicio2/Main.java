package ejercicio2;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean salir = false;
		// String nombre, String direccion, String telefono, String email, LocalDate
		// fechaNac
		new Contacto("Paula", "Calle 1", "12345678", "email,@email.com", LocalDate.of(2000, 1, 2));
		new Contacto("Roberto", "Calle 2", "123423478", "email2,@email.com", LocalDate.of(2000, 2, 4));
		new Contacto("Ricardo", "Calle 3", "123456444", "email3,@email.com", LocalDate.of(2000, 3, 5));
		new Contacto("Alberto", "Calle 4", "123452348", "email5,@email.com", LocalDate.of(2000, 6, 12));
		new Contacto("Fernando", "Calle 5", "12345338", "email6,@email.com", LocalDate.of(2000, 2, 2));

		do {
			System.out.println(
					"Elije una opcion: " + "\n1-Ingresar datos" + "\n2.-Buscar informacion de un contacto por su nombre"
							+ "\n3.-Mostrar Datos de todos los Contactos ordenador por nombre:"
							+ "\n4.-Comprobar fecha de nacimiento" + "\n0.- Salir");
			try {
				int opcion = input.nextInt();

				input.nextLine();
				switch (opcion) {
				case 1: {
					// String nombre, String direccion, String telefono, String email, LocalDate
					// fechaNac
					System.out.println("Dime un nombre:");
					String nombre = input.nextLine();
					System.out.println("Dime su direccion");
					String direccion = input.nextLine();
					System.out.println("Dime su telefono");
					String telefono = input.nextLine();
					System.out.println("Dime su email");
					String email = input.nextLine();
					input.nextLine();
					System.out.println("Dime el año de su nacimiento:");
					int anyo = input.nextInt();
					System.out.println("El mes");
					int mes = input.nextInt();
					System.out.println("El dia");
					int dia = input.nextInt();
					LocalDate fechaNac = LocalDate.of(anyo, mes, dia);

					new Contacto(nombre, direccion, telefono, email, fechaNac);
					System.out.println("Listo");
					break;
				}
				case 2: {
					System.out.println("Dime el nombre:");
					String nombre = input.nextLine();
					System.out.printf("%s\n", Contacto.getInfoContacto(nombre));
					break;
				}
				case 3: {
					List<Contacto> Lista = Contacto.getAgenda();
					Lista.sort((o1, o2) -> o1.getNombre().compareTo(o2.getNombre()));
					Contacto.imprimirAgenda();
					break;
				}
				case 4: {
					System.out.println("Dime el año");
					int anyo = input.nextInt();
					System.out.println("El mes");
					int mes = input.nextInt();
					System.out.println("El dia");
					int dia = input.nextInt();
					LocalDate fecha = LocalDate.of(anyo, mes, dia);
					System.out.printf("%s\n", Contacto.getCumpleanyos(fecha));
					break;
				}
				default: {
					System.out.println("Elige una opcion correcta!");
					break;
				}
				}
			} catch (InputMismatchException ex) {
				System.out.printf("%s\n", ex.getMessage());
			}
			System.out.println("\nDale a enter para continuar");
			input.nextLine();
		} while (salir == false);
		input.close();

	}

}
