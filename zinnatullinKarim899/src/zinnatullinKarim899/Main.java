// Autor: Karim Zinnatullin
package zinnatullinKarim899;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean salir = false;
		LocalDate fechaPorDefecto1 = LocalDate.of(2000, 2, 22);
		new Ciclista("12345678A", "Alberto Fernandez", fechaPorDefecto1, "mount bike 300");
		new Ciclista("12345678B", "Antonio Menendez", fechaPorDefecto1, "mount bike 200");
		new Ciclista("12345678C", "Paula Perez", fechaPorDefecto1, "mount bike 600");
		new Ciclista("12345678D", "Juan García", fechaPorDefecto1, "mount bike 300x");
		new Ciclista("12345678F", "Olga García", fechaPorDefecto1, "mount bike 100c");
		new Ciclista("12345678G", "Juan cuesta", fechaPorDefecto1, "mount bike 500 pro");

		do {
			System.out.println("Elije una opcion: " + "\n1-Incluir un ciclista" + "\n2.-Eliminar un ciclista"
					+ "\n3.- Modificar el modelo de bicicleta de un determinado ciclista."
					+ "\n4.-Añadir una ruta ciclista a un determinado ciclista"
					+ "\n5.-Para cada uno de los ciclistas, mostrar las rutas recorridas ordenadas por kms"
					+ "\n6.-Introducir una ruta y asignarla a varios ciclistas" + "\n0.- Salir");
			int opcion = input.nextInt();
			input.nextLine();
			switch (opcion) {
			case 1: {
				System.out.println("Dime el DNI del ciclista:");
				String dni = input.nextLine();
				System.out.println("Dime su nombre:");
				String nombre = input.nextLine();
				System.out.println("Dime su modelo de bicicleta:");
				String modeloBici = input.nextLine();
				input.nextLine();
				System.out.println("Dime su año de nacimiento");
				int anyo = input.nextInt();
				System.out.println("Dime el mes");
				int mes = input.nextInt();
				System.out.println("Dime el dia");
				int dia = input.nextInt();
				LocalDate fecha = LocalDate.of(anyo, mes, dia);
				try {
					new Ciclista(dni, nombre, fecha, modeloBici);
					System.out.println("Listo!");
				} catch (IllegalArgumentException ex) {
					System.out.printf("%s\n", ex.getMessage());
				}
				break;
			}
			case 2: {
				System.out.println("Dime el DNI del ciclista que quieres eliminar:");
				String dni = input.nextLine();
				try {
					Ciclista.eliminarCiclista(dni);
					System.out.println("Listo!");
				} catch (IllegalArgumentException ex) {
					System.out.printf("%s\n", ex.getMessage());
				}
				break;
			}
			case 3: {
				System.out.println("Dime el dni del ciclista:");
				String dni = input.nextLine();
				System.out.println("Qué modelo de bici tiene ahora?");
				String modeloBici = input.nextLine();
				try {
					Ciclista.modificarModelo(dni, modeloBici);
					System.out.println("Listo!");
				} catch (IllegalArgumentException ex) {
					System.out.printf("%s\n", ex.getMessage());
				}
				break;
			}
			case 4: {
				System.out.println("Dime el dni del ciclista:");
				String dni = input.nextLine();
				System.out.println("Dime el nombre de la ruta:");
				String nombreRuta = input.nextLine();
				input.nextLine();
				System.out.println("Dime el año que se hizo la Ruta");
				int anyo = input.nextInt();
				System.out.println("Dime el mes");
				int mes = input.nextInt();
				System.out.println("Dime el dia");
				int dia = input.nextInt();
				System.out.println("Dime de cuantos km fue la ruta");
				int km = input.nextInt();
				System.out.println("Cuantos minutos tardó en realizarla?");
				int minutos = input.nextInt();
				LocalDate fecha = LocalDate.of(anyo, mes, dia);
				try {
					Ruta ruta = new Ruta(nombreRuta, fecha, km, minutos);
					ruta.agregarCiclista(Ciclista.getCiclista(dni));
					System.out.printf("%s\n", Ciclista.getCiclista(dni).toString());
				} catch (IllegalArgumentException ex) {
					System.out.printf("%s\n", ex.getMessage());
				}
				break;
			}
			case 5: {
				Ciclista.imprimirTodosCiclistas();
				break;
			}
			case 6: {
				System.out.println("En estos momentos no podemos ayudarle en esto");
				break;
			}

			case 0: {
				salir = true;
				break;
			}
			default: {
				System.out.println("Elige una opción correcta!");
				break;
			}
			}
			System.out.println("\nDale a enter para continuar");
			input.nextLine();
		} while (salir == false);
		input.close();

	}

}
