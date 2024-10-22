package zinnatullinKarim1238;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import zinnatullinKarim1238.PartidoBaloncesto.Posicion;

public class Programa {

	public static void main(String[] args) {

		// APARTADO 1
		List<Socio> listaSocios = crearSocios();
		System.out.println("AGREGANDO PARTICIPACIONES");
		listaSocios = agregarParticipaciones(listaSocios);
	}

	private static List<Socio> crearSocios() {
		String rutaProyecto = System.getProperty("user.dir");
		File sociosFile = new File(rutaProyecto, "\\crearSocios.txt");
		String linea, nombre, telefono, dni;
		List<Socio> Socios = new ArrayList<>();
		try {
			Scanner lector = new Scanner(sociosFile);
			while (lector.hasNextLine()) {
				linea = lector.nextLine();
				String[] arrayStrings = linea.split(";");
				nombre = arrayStrings[0];
				telefono = arrayStrings[1];
				dni = arrayStrings[2];
				try {
					Socio socio = new Socio(nombre, telefono, dni);
					System.out.printf("%s\n", socio.toString());
					Socios.add(socio);
				} catch (IllegalArgumentException ex) {
					System.out.printf("%s\n", ex.getMessage());
				}
			}
			lector.close();
		} catch (FileNotFoundException ex) {
			System.out.printf("%s\n", ex.getMessage());
		}
		return Socios;
	}

	private static List<Socio> agregarParticipaciones(List<Socio> Socios) {
		String rutaProyecto = System.getProperty("user.dir");
		File futbolFile = new File(rutaProyecto, "\\agregarParticipacionesFutbol.txt");
		String linea, equipo;
		int id, minutos, goles;
		double km;
		LocalDate fecha;
		List<Socio> Socios2 = new ArrayList<>();
		try {
			Scanner lector = new Scanner(futbolFile);
			while (lector.hasNextLine()) {
				linea = lector.nextLine();
				String[] arrayStrings = linea.split(";");
				id = Integer.parseInt(arrayStrings[0]);
				fecha = LocalDate.parse(arrayStrings[1]);
				minutos = Integer.parseInt(arrayStrings[2]);
				goles = Integer.parseInt(arrayStrings[3]);
				km = Double.parseDouble(arrayStrings[4]);
				equipo = arrayStrings[5];
				try {
					Socio.guardarPartidoFutbol(id, fecha, minutos, goles, km, equipo);
					Socio socio = Socio.getSocio(id);
					System.out.println(socio.mostrarParticipaciones());
				} catch (IllegalArgumentException ex) {
					System.out.printf("%s\n", ex.getMessage());
				}
			}
			lector.close();
		} catch (FileNotFoundException ex) {
			System.out.printf("%s\n", ex.getMessage());
		}
		File baloncestoFile = new File(rutaProyecto, "\\agregarParticipacionesBaloncesto.txt");
		int puntos,asistencias,tapones;
		Posicion posicion;

		try {
			Scanner lector = new Scanner(baloncestoFile);
			while (lector.hasNextLine()) {
				linea = lector.nextLine();
				String[] arrayStrings = linea.split(";");
				id = Integer.parseInt(arrayStrings[0]);
				fecha = LocalDate.parse(arrayStrings[1]);
				minutos = Integer.parseInt(arrayStrings[2]);
				puntos = Integer.parseInt(arrayStrings[3]);
				km = Double.parseDouble(arrayStrings[4]);
				equipo = arrayStrings[5];
				try {
					Socio.guardarPartidoBaloncesto(id, fecha, minutos, goles, km, equipo);
					Socio socio = Socio.getSocio(id);
					System.out.println(socio.mostrarParticipaciones());
				} catch (IllegalArgumentException ex) {
					System.out.printf("%s\n", ex.getMessage());
				}
			}
			lector.close();
		} catch (FileNotFoundException ex) {
			System.out.printf("%s\n", ex.getMessage());
		}
		
		return Socios2;

	}
	private Posicion parsePosicion(String pos) {
		
	}
}
