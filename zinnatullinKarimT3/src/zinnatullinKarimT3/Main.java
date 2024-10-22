// Autor: Karim Zinnatullin
package zinnatullinKarimT3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

import zinnatullinKarimT3.Coche.Estado;

public class Main {

	public static void main(String[] args) {
		int opcion;
		new Coche("123ABC", "12345678A", "111111111", "Seat Leon", 200000, Estado.NUEVO);
		new Coche("123ABD", "12345678B", "111111111", "Seat Ibiza", 124000, Estado.DAÑADO);
		new Coche("123ABB", "12345678C", "111331111", "Lamborghini Gallardo", 230000, Estado.DAÑADO);
		new Coche("123ABY", "12345678D", "111241111", "Toyota Prius", 340000, Estado.NUEVO);
		new Coche("123ABJ", "12345678H", "111131111", "Seat Ibiza", 640000, Estado.DAÑADO_PARCIAL);
		new Coche("123ABU", "12345678I", "111111661", "Seat Centauria", 10000, Estado.DAÑADO_PARCIAL);
		// String matricula, String dni, String telefono, String modelo, int espejos,
		// boolean casco
		new Moto("321ABC", "87654321A", "22222222", "Ducatti 1111", 2, true);
		new Moto("231ABC", "87654321B", "222123222", "Ducatti 2", 1, true);
		new Moto("111ABC", "87654321C", "2555222", "Ducatti 13", 1, true);
		new Moto("441ABC", "87654321D", "2266622", "Ducatti 77", 2, false);
		new Moto("881ABC", "87654321E", "22222888", "Ducatti 88", 21, false);

		do {
			System.out.println(
					"Elige una opción:\n" + "1.- Estacionar vehiculo\n" + "2.- Exportar vehiculos estacionados\n"
							+ "3.- Mostar coches NUEVOS\n" + "4.- Buscar vehiculo estacinado por matricula\n"
							+ "5.- Calcular precio estacionamiento\n" + "6.- Eliminar vehiculo por matricula\n"
							+ "7.- Calcular numero de coches y motos estacionados\n" + "8.- Salir");
			opcion = ES.leeEntero();
			switch (opcion) {
			case 1: {
				estacionarVehiculo();
				break;
			}
			case 2: {
				exportarVehiculos();
				break;
			}
			case 3: {
				Coche.mostrarCochesNuevos();
				break;
			}
			case 4: {
				mostrarVehiculoMatricula();
				break;
			}
			case 5: {
				calcularImporte();
				break;
			}
			case 6: {
				eliminarVehiculo();
				break;
			}
			case 7:{
				calcularPlazas();
				break;
			}
			case 8: {
				System.out.println("Hasta luego!");
				break;
			}
			default: {
				System.out.println("Elige una opción válida!");
				break;
			}
			}
			System.out.println("Dale a ENTER para continuar!");
			ES.leeCadena();
		} while (opcion != 8);
	}

	private static Estado parseEstado() {
		System.out.println("En que estado esta el coche: 1- NUEVO 2-DAÑADO PARCIAL 3-DAÑADO");
		int opcion = ES.leeEntero();
		if (opcion == 1) {
			return Estado.NUEVO;
		} else if (opcion == 2) {
			return Estado.DAÑADO_PARCIAL;
		} else if (opcion == 3) {
			return Estado.DAÑADO;
		} else {
			return null;
		}
	}

	private static void estacionarVehiculo() {
		System.out.println("Es un coche (1) o una moto (2)???");
		int opcion = ES.leeEntero();
		if (opcion == 1) {
			if (Coche.dispCoche()) {
				System.out.println("introduce su matricula:");
				String matricula = ES.leeCadena();
				System.out.println("introduce el dni del propietario:");
				String dni = ES.leeCadena();
				System.out.println("introduce un telefono de contacto: ");
				String tel = ES.leeCadena();
				System.out.println("introduce el modelo del coche:");
				String modelo = ES.leeCadena();
				System.out.println("Introduce los km recorridos (entero)");
				int km = ES.leeEntero();
				Estado estado = parseEstado();
				try {
					Coche coche = new Coche(matricula, dni, tel, modelo, km, estado);
					System.out.printf("%s\n", coche.toString());
				} catch (IllegalArgumentException ex) {
					System.out.printf("%s\n", ex.getMessage());
				}
			} else {
				System.out.println("No hay plazas para coches en estos momentos!");
			}
		} else if (opcion == 2) {
			if (Moto.dispMoto()) {
				System.out.println("introduce su matricula:");
				String matricula = ES.leeCadena();
				System.out.println("introduce el dni del propietario:");
				String dni = ES.leeCadena();
				System.out.println("introduce un telefono de contacto: ");
				String tel = ES.leeCadena();
				System.out.println("introduce el modelo de la moto:");
				String modelo = ES.leeCadena();
				System.out.println("Introduce cuentos espejos retrovisores tiene");
				int espejos = ES.leeEntero();
				System.out.println("Incluye casco? 1-SI 2-NO");
				int casco = ES.leeEntero();
				try {
					Moto moto = null;
					if (casco == 1) {
						moto = new Moto(matricula, dni, tel, modelo, espejos, true);
					} else if (casco == 2) {
						moto = new Moto(matricula, dni, tel, modelo, espejos, false);
					} else {
						System.out.println("No has introducido bien el casco!");
					}
					System.out.printf("%s\n", moto.toString());
				} catch (IllegalArgumentException ex) {
					System.out.printf("%s\n", ex.getMessage());
				}
			} else {
				System.out.println("No hay plazas para coches en estos momentos!");
			}
		}
	}

	private static void exportarVehiculos() {
		String rutaProyecto = System.getProperty("user.dir");
		File rutaFichero = new File(rutaProyecto, "\\VehiculosEstacionados.txt");
		List<Vehiculo> lista = Vehiculo.getListVehiculos();
		Collections.sort(lista);
		try {
			FileWriter writer = new FileWriter(rutaFichero);
			for (Vehiculo x : lista) {
				System.out.println(x.toString());
				writer.write(String.format("%s\n", x.toString()));
			}
			writer.close();
		} catch (IOException ex) {
			System.out.printf("%s\n", ex.getMessage());
		}
	}

	private static void mostrarVehiculoMatricula() {
		System.out.println("Introduce una matricula que quieras consultar:");
		String matricula = ES.leeCadena();
		System.out.printf("%s\n", Vehiculo.buscarVehiculoMatricula(matricula));
	}

	private static void calcularImporte() {
		System.out.println("introduce la matricula del vehículo:");
		String matricula = ES.leeCadena();
		Vehiculo vehiculo = Vehiculo.getVehiculo(matricula);
		System.out.println("Introduce el número de días que va a estar estacionado:");
		double dias = Double.parseDouble(ES.leeCadena());
		vehiculo.calcularAlquiler(dias);
		System.out.printf("%s", vehiculo.toString());
	}

	private static void eliminarVehiculo() {
		System.out.println("Introduce la matrícula del vehiculo que quieres eliminar:");
		String matricula = ES.leeCadena();
		Vehiculo.eliminarVehiculoMatricula(matricula);
	}

	private static void calcularPlazas() {
		System.out.printf("Plazas de coches disponibles= %d\n", Coche.calcularPlazasCoche());
		System.out.printf("Plazas de motos disponibles= %d\n", Moto.calcularPlazasMoto());
	}
}
