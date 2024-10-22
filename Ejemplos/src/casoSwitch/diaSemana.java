package casoSwitch;

import java.util.Scanner;

public class diaSemana {

	public static void main(String[] args) {
		// Creamos variables
		byte dia;
		Scanner sc = new Scanner(System.in);

		// pedimos datos
		System.out.println(
				"Introduce un día de la semana y te diré si es un día laboral! (El número del día de la semana)");
		dia = sc.nextByte();

		// usamos ifs anidados

		if (dia <= 0 || dia > 7) {
			System.out.println("Error");
		} else if (dia <= 5) {
			System.out.println("Es un día laboral!");
		} else {
			System.out.println("NO es un día laboral");
		}

		// ahora lo hacemos con un switch
		switch (dia) {
		case 1: {
			System.out.println("Lunes es un día laboral");
			break;
		}
		case 2: {
			System.out.println("Martes es un día laboral");
			break;
		}
		case 3: {
			System.out.println("Miércoles es un día laboral");
			break;
		}
		case 4: {
			System.out.println("Jueves es un día laboral");
			break;
		}
		case 5: {
			System.out.println("Viernes es un día laboral");
			break;
		}
		case 6: {
			System.out.println("Sábado NO es un día laboral");
			break;
		}
		case 7: {
			System.out.println("Domingo NO es un día laboral");
			break;
		}
		default: {
			System.out.println("Error");
		}
		}
	}

}
