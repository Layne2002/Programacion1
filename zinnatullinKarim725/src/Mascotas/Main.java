// Autor: Karim Zinnatullin
package Mascotas;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		LocalDate fechaDefecto = LocalDate.of(2022, 2, 2);

		new Loro("Pepito", fechaDefecto, "ondulado", "Zimbabwe", "Hola! Hola!");
		new Canario("Pepito2", fechaDefecto, "Corto", "amarillo",
				"Todos los dias son así, nunca pude imaginarme cuando vine aquí...");
		new Perro("Firulais", fechaDefecto, "Bullterier", true);
		new Gato("Mimí", fechaDefecto, "Tricolor", true);
		boolean salir = false;
		do {
			System.out.println("Elije una opcion: " + "\n1-Mostrar la lista de animales"
					+ "\n2.-Mostrar informacion de una mascota por su nombre" + "\n3.-Mostrar todas las mascotas"
					+ "\n4.-Introducir una mascota nueva" + "\n5.-Eliminar una mascota por nombre"
					+ "\n6.-Vaciar inventario" + "\n0.- Salir");
			int opcion = input.nextInt();
			input.nextLine();
			switch (opcion) {
			case 1: {
				Inventario.mostrarMascotas();
				break;
			}
			case 2: {
				System.out.println("Introduce el nombre de la mascota:");
				String nombre = input.nextLine();
				Inventario.informacionMascota(nombre);
				break;
			}
			case 3: {
				Inventario.datosTodasMascotas();
				break;
			}
			case 4: {
				System.out.println("Que tipo de mascota quiere introducir:" + "\n1.-Perro 2.-Gato 3.-Loro 4.-Canario");
				int tipo = input.nextInt();
				if (tipo == 1 || tipo == 2 || tipo == 3 || tipo == 4) {
					System.out.println("Escriba el año que nació:");
					int anyo = input.nextInt();
					System.out.println("El número del mes:");
					int mes = input.nextInt();
					System.out.println("El dia del mes:");
					int dia = input.nextInt();
					input.nextLine();
					LocalDate fecha = LocalDate.of(anyo, mes, dia);
					System.out.println("Digame el nombre de la mascota:");
					String nombre = input.nextLine();
					input.nextLine();
					switch (tipo) {
					case 1: {
						System.out.println("Digame la raza del perro:");
						String raza = input.nextLine();
						System.out.println("Tiene pulgas? 0 = NO 1 = SI");
						int pulgas = input.nextInt();
						if (pulgas == 0) {
							try {
								new Perro(nombre, fecha, raza, false);
							} catch (IllegalArgumentException ex) {
								System.out.printf("%s\n", ex.getMessage());
							}
						} else {
							try {
								new Perro(nombre, fecha, raza, true);
							} catch (IllegalArgumentException ex) {
								System.out.printf("%s\n", ex.getMessage());
							}
						}
						break;
					}
					case 2: {
						System.out.println("Digame el color del gato:");
						String color = input.nextLine();
						System.out.println("Tiene el pelo largo? 0 = NO 1 = SI");
						int pelo = input.nextInt();
						if (pelo == 0) {
							try {
								new Gato(nombre, fecha, color, false);
							} catch (IllegalArgumentException ex) {
								System.out.printf("%s\n", ex.getMessage());
							}
						} else {
							try {
								new Gato(nombre, fecha, color, true);
							} catch (IllegalArgumentException ex) {
								System.out.printf("%s\n", ex.getMessage());
							}
						}
						break;
					}
					case 3: {
						System.out.println("Describa su pico:");
						String pico = input.nextLine();
						System.out.println("Cual es el pais de origen del loro?");
						String origen = input.nextLine();
						System.out.println("Que palabras suele decir?");
						String habla = input.nextLine();
						try {
							new Loro(nombre, fecha, pico, origen, habla);
						} catch (IllegalArgumentException ex) {
							System.out.printf("%s\n", ex.getMessage());
						}
						break;
					}
					case 4: {
						System.out.println("Describa su pico:");
						String pico = input.nextLine();
						System.out.println("De que color es?");
						String color = input.nextLine();
						System.out.println("Como canta este canario?");
						String canta = input.nextLine();
						try {
							new Canario(nombre, fecha, pico, color, canta);
						} catch (IllegalArgumentException ex) {
							System.out.printf("%s\n", ex.getMessage());
						}
						break;
					}
					}
				} else {
					System.out.println("Elige una opción correcta!");
				}
				break;
			}
			case 5: {
				String nombre;
				do {
					System.out.println(
							"Dime el nombre de la mascota que quieres eliminar, o escribe OPCIONES para mostrar la lista de mascotas antes de hacerlo:");
					nombre = input.nextLine();
					if (nombre.equalsIgnoreCase("OPCIONES")) {
						Inventario.mostrarMascotas();
					} else {
						Mascota mascota = Inventario.obtenerMascota(nombre);
						Inventario.eliminarMascota(mascota);
					}
				} while (nombre.equalsIgnoreCase("OPCIONES"));
				break;
			}
			case 6: {
				Inventario.vaciarInventario();
				System.out.println("Inventario vaciado!");
				break;
			}
			case 0: {
				salir = true;
				break;
			}
			default:{
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
