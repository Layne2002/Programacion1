package chuletario;

import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.List;

public class LEERFICHER {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File fichero = new File("src/fichero/fichero_leer.txt");
		Scanner s = null;

		List<Empleado> empleados = new ArrayList<>();

		try (Scanner scanner = new Scanner(fichero)) {
			while (scanner.hasNextLine()) {
				String linea = scanner.nextLine();
				String[] partes = linea.split("\t"); // Usar el tabulador como delimitador

				// Asumir que cada línea tiene el formato esperado y dividirla directamente
				String nombre = partes[0].trim();
				String fechaNacimiento = partes[1].trim();
				double sueldo = Double.parseDouble(partes[2].replaceAll("\\$", "").trim()); // Eliminar el símbolo $ y
																							// convertir a double

				Empleado empleado = new Empleado(nombre, fechaNacimiento, sueldo);
				empleados.add(empleado);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		for (Empleado empleado : empleados) {
			System.out.println(empleado);
		}

	}

}