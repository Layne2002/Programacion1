// Autor: Karim Zinnatullin
package zinnatullinKarim798;

import java.time.LocalDate;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean salir = false;
		do {
			int opcion;
			System.out.println(
					"\nElija opción: 1.-Insertar una sanción 2.-Buscar sanciones a partir de una matricula 3.-Mostrar todas la sanciones 0.-Salir");
			opcion = input.nextInt();
			input.nextLine();
			switch (opcion) {
			case 1: {
				System.out.println("Escriba la matrícula del coche:");
				String matricula = input.nextLine();
				System.out.println("Escriba el lugar donde sucedió");
				String lugar = input.nextLine();
				input.nextLine();
				System.out.println("Escriba el año que pasó:");
				int anyo = input.nextInt();
				System.out.println("El número del mes que ocurrió:");
				int mes = input.nextInt();
				System.out.println("El dia del mes en el que tuvo lugar:");
				int dia = input.nextInt();
				System.out.println("Defina el tipo de sancion: 1-APARCAMIENTO 2-VELOCIDAD 3-ALCOHOLEMIA");
				int tipo = input.nextInt();
				input.nextLine();
				boolean grua = false;
				int velocidadSobrepasada = 0;
				double alcohol = 0;
				if (tipo == 1) {
					System.out.println("Se tuvo que utilizar la grua? SI/NO");
					String respuesta = input.nextLine();
					if (respuesta.equals("SI")) {
						grua = true;
					} else {
						grua = false;
					}
				} else if (tipo == 2) {
					System.out.println("Cuantos Km/h sobrepasó el delincuente por el límite de velcidad?");
					velocidadSobrepasada = input.nextInt();
				} else {
					System.out.println(
							"Cuantas décimas supera el límite legal que es 0,5 g/l de alcohol en sangre?(número decimal)");
					double decimas = input.nextDouble();
					alcohol = decimas * 10;
				}
				LocalDate fechaHora = LocalDate.of(anyo, mes, dia);
				Sancion sancion;
				if (tipo == 1) {
					sancion = new Sancion(matricula, lugar, fechaHora, Sancion.tipo.APARCAMIENTO, grua,
							velocidadSobrepasada, alcohol);
				} else if (tipo == 2) {
					sancion = new Sancion(matricula, lugar, fechaHora, Sancion.tipo.VELOCIDAD, grua,
							velocidadSobrepasada, alcohol);
				} else {
					sancion = new Sancion(matricula, lugar, fechaHora, Sancion.tipo.ALCOHOLEMIA, grua,
							velocidadSobrepasada, alcohol);
				}
				System.out.println("Mostrando información por pantalla:");
				System.out.printf("%s\n", sancion.toString());
				break;
			}
			case 2: {
				input.nextLine();
				System.out.println("Digame la matriucla del coche:");
				String matricula = input.nextLine();
				System.out.printf("para la matricula esa hay estas infracciones:\n%s",
						Sancion.mostrarSancionesMatricula(matricula));

				break;
			}
			case 3: {
				System.out.printf("%S\n", Sancion.mostrarSanciones());
				break;
			}
			case 0: {
				salir = true;
				break;
			}
			default: {
				System.out.println("Error: elija una opción válida");
				break;
			}

			}
		} while (salir == false);
		input.close();
	}

}
