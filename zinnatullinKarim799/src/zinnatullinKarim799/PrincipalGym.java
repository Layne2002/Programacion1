/*
 * Autor: Karim Zinnatullin
 */
package zinnatullinKarim799;

import java.util.Scanner;

import zinnatullinKarim799.Socio.tipoCliente;

public class PrincipalGym {

	public static void main(String[] args) {
		new Socio("12344555T", "Alberto Alvarez", tipoCliente.NORMAL, null);
		new Socio("12234455F", "Fernando García", tipoCliente.JUBILADO, null);
		new Socio("12999999H", "Paula Rodriguez", tipoCliente.NORMAL, null);
		new Curso("Aquarobic","Ejercicios dentro del agua",25,20);
		new Curso("Cardio-Bike","Cardio montado en bici de gimnasio",30,15);
		Scanner input = new Scanner(System.in);
		boolean cerrarBucle = false;
		int opcion;
		do {
			System.out.println("Seleccione una opción: \n1. Dar de alta un socio\n2. Crear un curso nuevo"
					+ "\n3. Matricular socios en cursos\n4. Informe de socios\n0. Salir de la aplicación");
			opcion = input.nextInt();

			switch (opcion) {
			case 0: {
				cerrarBucle = true;
				break;
			}
			case 1: {
				String DNIasociado = "";
				input.nextLine();
				System.out.println("Teclee el DNI del socio nuevo");
				String dni = input.nextLine();
				System.out.println("Teclee el nombre y apellidos del socio");
				String nombre = input.nextLine();
				input.nextLine();
				System.out.println("Que tipo de socio es? (1. NORMAL 2. JUBILADO 3. INFANTIL)");
				int tipo = input.nextInt();
				input.nextLine();
				if (tipo == 3) {
					System.out.println("Diga el DNI del asociado");
					DNIasociado = input.nextLine();
				}
				if (tipo == 1) {
					try {
						new Socio(dni, nombre, tipoCliente.NORMAL, null);
					} catch (IllegalArgumentException ex) {
						System.err.printf("%s\n", ex.getMessage());
					}
				} else if (tipo == 2) {
					try {
						new Socio(dni, nombre, tipoCliente.JUBILADO, null);
					} catch (IllegalArgumentException ex) {
						System.err.printf("%s\n", ex.getMessage());
					}
				} else if (tipo == 3) {
					try {
						new Socio(dni, nombre, tipoCliente.INFANTIL, DNIasociado);
					} catch (IllegalArgumentException ex) {
						System.err.printf("%s\n", ex.getMessage());
					}
				}
				break;
			}
			case 2: {
				input.nextLine();
				System.out.println("Teclee el nombre del curso nuevo");
				String nombreCurso = input.nextLine();
				System.out.println("Teclee la descripción del curso");
				String descripcion = input.nextLine();
				input.nextLine();
				System.out.println("Cual es el maximo de alumnos que se permitirá?");
				int max = input.nextInt();
				System.out.println("Cual será el precio mensual?");
				double precio = input.nextDouble();
				input.nextLine();
				try {
					new Curso(nombreCurso, descripcion, max, precio);
				} catch (IllegalArgumentException ex) {
					System.err.printf("%s\n", ex.getMessage());
				}
				break;
			}
			case 3: {
				input.nextLine();
				System.out.println("Diga el dni del socio que va a matricular");
				String dni = input.nextLine();
				System.out.println("Diga el nombre del curso al que matricularlo");
				String nombre = input.nextLine();
				try {
					// matricularSocio(dni,nombre); lo meto en un comentario porque no me sale el metodo
				} catch (Exception ex) {
					System.err.printf("%s\n", ex.getMessage());
				}
				break;
			}
			case 4: {
				Socio.informeSocios();
			}
			}
		} while (cerrarBucle == false);

	}

}
