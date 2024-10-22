package ejercicio4;

import java.util.Scanner;

import ejercicio4.Persona.Estado;
import ejercicio4.Persona.Sexo;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		new Persona("alfonso", Sexo.HOMBRE, Estado.DIVORCIADO, 35);
		new Persona("Alberto", Sexo.HOMBRE, Estado.CASADO, 25);
		new Persona("Paula", Sexo.MUJER, Estado.VIUDO, 75);
		new Persona("alfonso", Sexo.HOMBRE, Estado.DIVORCIADO, 55);
		new Persona("Roberto", Sexo.HOMBRE, Estado.SOLTERO, 15);
		new Persona("maria", Sexo.MUJER, Estado.SOLTERO, 5);
		new Persona("Ricardo", Sexo.HOMBRE, Estado.DIVORCIADO, 35);
		new Persona("Rodrigo", Sexo.HOMBRE, Estado.DIVORCIADO, 35);
		new Persona("Pablo", Sexo.HOMBRE, Estado.DIVORCIADO, 35);
		new Persona("Laura", Sexo.MUJER, Estado.VIUDO, 65);
		new Persona("Miriam", Sexo.MUJER, Estado.SOLTERO, 25);
		new Persona("Olga", Sexo.MUJER, Estado.CASADO, 55);
		new Persona("Diana", Sexo.MUJER, Estado.DIVORCIADO, 25);
		new Persona("Marta", Sexo.MUJER, Estado.SOLTERO, 35);
		new Persona("Andrea", Sexo.MUJER, Estado.DIVORCIADO, 35);
		
		System.out.println("APARTADO A");
		sexoSolicitado(input);
		System.out.println("APARTADO B");
		estadoSolicitado(input);
		System.out.println("APARTADO C");
		rangoEdadSolicitado(input);
		System.out.println("APARTADO D");
		sexoEstadoSolicitado(input);
	}

	private static void sexoEstadoSolicitado(Scanner input) {
		System.out.println("Dime el sexo: 1.- HOMBRE, 2.-MUJER");
		int opcionSexo = input.nextInt();
		System.out.println("Dime el estado:  1.- SOLTERO, 2.-CASADO, 3.-DIVORCIADO,4.-VIUDO");
		int opcionEstado = input.nextInt();
		Sexo sexo;
		Estado estado;
		if (opcionSexo == 1) {
			sexo = Sexo.HOMBRE;
		} else {
			sexo = Sexo.MUJER;
		}
		switch (opcionEstado) {
		case 1: {
			estado = Estado.SOLTERO;
			break;
		}
		case 2: {
			estado = Estado.CASADO;
			break;
		}
		case 3: {
			estado = Estado.DIVORCIADO;
			break;
		}
		case 4: {
			estado = Estado.VIUDO;
			break;
		}
		default: {
			System.out.println("Te has equivocado al introducir el estado, ha´re como que has dicho SOLTERO");
			estado = Estado.SOLTERO;
		}
		}
		System.out.printf("El total es: %d",Persona.cantidadSexoEstado(sexo, estado));

	}

	private static void rangoEdadSolicitado(Scanner input) {
		System.out.println("\nDime un rango de edad, por ejemplo, para el rango de 20 a 29, introduce el numero 20");
		int rango = input.nextInt();
		System.out.printf("Cantidad de personas en el rango de edad de %d : %s\n", rango, Persona.contidadEdad(rango));
	}

	private static void estadoSolicitado(Scanner input) {
		System.out.println("\nDime que estado quieres consultar: 1.- SOLTERO, 2.-CASADO, 3.-DIVORCIADO,4.-VIUDO");
		int opcion = input.nextInt();
		switch (opcion) {
		case 1: {
			System.out.printf("Cantidad de Solteros: %s\n", Persona.cantidadEstado(Estado.SOLTERO));
			break;
		}
		case 2: {
			System.out.printf("Cantidad de casados: %s\n", Persona.cantidadEstado(Estado.CASADO));
			break;
		}
		case 3: {
			System.out.printf("Cantidad de divorciados: %s\n", Persona.cantidadEstado(Estado.DIVORCIADO));
			break;
		}
		case 4: {
			System.out.printf("Cantidad de viudos: %s\n", Persona.cantidadEstado(Estado.VIUDO));
			break;
		}
		}
	}

	private static void sexoSolicitado(Scanner input) {
		System.out.println("Dime el sexo: 1- Hombre, 2.- Mujer");
		int opcion = input.nextInt();
		if (opcion == 1) {
			System.out.printf("La cantidad de HOMBRES es: %s\n", Persona.cantidadSexo(Sexo.HOMBRE));
		} else {
			System.out.printf("La cantidad de MUJERES es: %s\n", Persona.cantidadSexo(Sexo.MUJER));

		}
	}
}
