// Autor: Karim Zinnatullin
package zinnatullinKarimT3P;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		boolean salir = false;

		new Pintura("Alberto Gonzalez", "Maria Rosario", LocalDate.of(2023, 3, 14), 5, 3);
		new Pintura("Roberto Garcia", "Pablo Rosario", LocalDate.of(2021, 5, 24), 15, 6);
		new Pintura("paula Moreno", "Maria Benito", LocalDate.of(2023, 2, 4), 9, 7);
		new Pintura("Rafael Garcia", "isabel Gomez", LocalDate.of(2022, 3, 14), 10, 13);
		new Pintura("Federico Gonzalez", "Alfonso Prado", LocalDate.of(2022, 3, 4), 2, 30);
		new Alarma("Alfonso rivero", LocalDate.of(2022, 3, 4), 3, "AlarmaMAX");
		new Alarma("David Revuelta", LocalDate.of(2023, 1, 3), 5, "Malarma");
		new Alarma("Elena Durante", LocalDate.of(2021, 6, 6), 17, "AlarmaMIN");
		new Alarma("Paco Fiestas", LocalDate.of(2020, 5, 14), 1, "AlarmaMAX2");
		new Alarma("Fernando Tejero", LocalDate.of(2022, 7, 1), 7, "AlarmaMAX4");
		do {
			Scanner input = new Scanner(System.in);
			System.out.println("Elige una opción:" + "\n1.-  Almacenar un servicio de PINTURA"
					+ "\n2.-  Almacenar un servicio de REVISION DE ALARMA"
					+ "\n3.-  Mostrar los servicios realizados un determinado dia"
					+ "\n4.-  Mostrar todos servicios de pintura con importe total inferior a una cantidad solicitada "
					+ "\n5.-  Eliminar un servicio a partir de su identificador"
					+ "\n6.-  Exportar todos los servicios a servicios.txt" + "\n7.-  Salir");
			int opcion = input.nextInt();
			input.nextLine();
			switch (opcion) {
			case 1: {
				crearPintura(input);
				break;
			}
			case 2: {
				crearAlarma(input);
				break;
			}
			case 3: {
				mostrarServiciosDia(input);
				break;
			}
			case 4: {
				mostrarPinturaInferior(input);
				break;
			}
			case 5: {
				eliminarUnServicio(input);
				break;
			}
			case 6: {
				exportarFichero(input);
				break;
			}
			case 7: {
				salir = true;
				break;
			}
			default: {
				System.out.println("Elige una opción válida!");
				break;
			}
			}
			System.out.println("dale a enter para continuar");
			input.nextLine();
		} while (salir == false);

	}

	private static void exportarFichero(Scanner input) {
		System.out.println("Disculpa, esta opción está en matenimiento :(");
	}

	private static void eliminarUnServicio(Scanner input) {
		System.out.println("Dime el ID del servicio que quieres eliminar:");
		String id = input.nextLine();
		try {
			Servicio.eliminarServicio(id);
		} catch (IllegalArgumentException ex) {
			System.out.printf("%s\n", ex.getMessage());
		}
	}

	private static void mostrarPinturaInferior(Scanner input) {
		System.out.println("Dime el importe:");
		double importe = input.nextDouble();
		System.out.printf("%s\n", Servicio.serviciosInferior(importe));
	}

	private static void mostrarServiciosDia(Scanner input) {
		System.out.println("Dime el año: ");
		int anyo = input.nextInt();
		System.out.println("Dime el mes:");
		int mes = input.nextInt();
		System.out.println("Dime el dia");
		int dia = input.nextInt();
		LocalDate fecha = LocalDate.of(anyo, mes, dia);
		System.out.printf("%s\n", Servicio.serviciosDia(fecha));

	}

	private static void crearAlarma(Scanner sc) {
		System.out.println("Dime el nombre del cliente: ");
		String cliente = sc.nextLine();
		sc.nextLine();
		System.out.println("Dime el año: ");
		int anyo = sc.nextInt();
		System.out.println("Dime el mes:");
		int mes = sc.nextInt();
		System.out.println("Dime el dia");
		int dia = sc.nextInt();
		sc.nextLine();
		LocalDate fecha = LocalDate.of(anyo, mes, dia);
		System.out.println("Que modelo de alarma se instaló?");
		String modeloAlarma = sc.nextLine();
		sc.nextLine();
		System.out.println("Dime el número de sensores:");
		int numSensores = sc.nextInt();
		try {
			Alarma x = new Alarma(cliente, fecha, numSensores, modeloAlarma);
			System.out.printf("%s\n", x.toString());
		} catch (IllegalArgumentException ex) {
			System.out.printf("%s\n", ex.getMessage());
		}

	}

	private static void crearPintura(Scanner a) {
		System.out.println("Dime el nombre del trabajador:");
		String trabajador = a.nextLine();
		System.out.println("Dime el nombre del cliente: ");
		String cliente = a.nextLine();
		a.nextLine();
		System.out.println("Dime el año: ");
		int anyo = a.nextInt();
		System.out.println("Dime el mes:");
		int mes = a.nextInt();
		System.out.println("Dime el dia");
		int dia = a.nextInt();
		a.nextLine();
		LocalDate fecha = LocalDate.of(anyo, mes, dia);
		System.out.println("Dime la superficie que se pintó:");
		double superficie = a.nextDouble();
		System.out.println("Cuanto costó cada litro de pintura?");
		double precioPintura = a.nextDouble();
		try {
			Pintura x = new Pintura(trabajador, cliente, fecha, superficie, precioPintura);
			System.out.printf("%s\n", x.toString());
		} catch (IllegalArgumentException ex) {
			System.out.printf("%s\n", ex.getMessage());
		}

	}
}
