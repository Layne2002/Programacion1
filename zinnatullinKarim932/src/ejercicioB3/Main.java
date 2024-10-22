// Autor: Karim Zinnatullin
package ejercicioB3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Dime la ruta del archivo que debo leer:");
		String origen = input.nextLine();

		System.out.println("Dime la ruta de destino donde crear eel archivo nuevo:");
		String destino = input.nextLine();

		File rutaOrigen = new File(origen);
		File rutaDestino = new File(destino);
		try {
			Scanner lector = new Scanner(rutaOrigen);

			ArrayList<String> array = new ArrayList<>();
			while (lector.hasNext()) {
				array.add(lector.nextLine());
			}
			lector.close();
			Collections.sort(array);
			try {
				FileWriter writer = new FileWriter(rutaDestino);
				for (String x : array) {
					writer.write(String.format("%s\n", x));
				}
				writer.close();
			} catch (IOException ex) {
				System.out.printf("%s\n", ex.getMessage());
			}

		} catch (FileNotFoundException ex) {
			System.out.println("No existe la ruta de origen");
		}
		input.close();
	}

}
