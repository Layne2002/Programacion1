// Autor: Karim Zinnatullin
package ejercicioA1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean salir = false;
		do {
			System.out.println("Introduce una ruta:");
			String ruta = input.nextLine();
			if (ruta == "") {
				System.out.println("Adioss");
				salir = true;
			} else {
				File fichero = new File(ruta);
				try {
					muestraInfoRuta(fichero);
				} catch (FileNotFoundException ex) {
					System.out.printf("%s\n", ex.getMessage());
				}
			}
		} while (salir == false);
		input.close();
	}

	private static void muestraInfoRuta(File fichero) throws FileNotFoundException {
		if (!fichero.exists()) {
			throw new FileNotFoundException("La ruta no existe!");
		}
		if (fichero.isFile()) {
			System.out.printf("El nombre del archivo es: %s\n", fichero.getName());
		} else if (fichero.isDirectory()) {
			for (String x : fichero.list()) {
				if (!x.contains(".")) {
					System.out.printf("\n[*] %s", x);
				}
			}
			for (String x : fichero.list()) {
				if (x.contains(".")) {
					System.out.printf("\n[A] %s", x);
				}
			}
		}
		System.out.println();
	}

}
