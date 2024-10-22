// Autor: Karim Zinnatullin
package ejercicioA2;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean salir = false;
		boolean info;
		do {
			System.out.println("Introduce una ruta:");
			String ruta = input.nextLine();
			if (ruta == "") {
				System.out.println("Adioss");
				salir = true;
			} else {
				System.out.println("Quieres infomración detallada?(true/false)");
				info = input.nextBoolean();
				input.nextLine();
				File fichero = new File(ruta);
				try {
					muestraInfoRuta(fichero, info);
				} catch (FileNotFoundException ex) {
					System.out.printf("%s\n", ex.getMessage());
				}
			}

		} while (salir == false);
		input.close();
	}

	private static void muestraInfoRuta(File fichero, boolean info) throws FileNotFoundException {
		if (!fichero.exists()) {
			throw new FileNotFoundException("La ruta no existe!");
		}
		if (fichero.isFile()) {
			if (info == false) {
				System.out.printf("El nombre del archivo es: %s\n", fichero.getName());
			} else {
				System.out.printf("\n[A] %s, Tamaño = %d bytes, Última modificación: %s", fichero.getName(),
						fichero.length(), fechaMod(fichero));
			}
		} else if (fichero.isDirectory()) {
			String[] lista = fichero.list();
			Arrays.sort(lista);
			for (String x : lista) {
				if (!x.contains(".")) {
					if (info == false) {
						System.out.printf("\n[*] %s", x);
					} else {
						File archivo = new File(fichero.getAbsolutePath() + File.separator + x);
						System.out.printf("\n[*] %s, Tamaño = %d bytes, Última modificación: %s", x, archivo.length(),
								fechaMod(archivo));
					}
				}
			}
			for (String x : lista) {
				if (x.contains(".")) {
					if (info == false) {
						System.out.printf("\n[A] %s", x);
					} else {
						File archivo = new File(fichero.getAbsolutePath() + File.separator + x);
						System.out.printf("\n[A] %s, Tamaño = %d bytes, Última modificación: %s", x, archivo.length(),
								fechaMod(archivo));
					}
				}
			}
		}
		System.out.println();
	}

	private static LocalDate fechaMod(File archivo) {
		Instant fecha = Instant.ofEpochMilli(archivo.lastModified());
		LocalDate fechaMod = LocalDate.ofInstant(fecha, ZoneId.systemDefault());
		return fechaMod;
	}

}
