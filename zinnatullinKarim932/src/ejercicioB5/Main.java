// Autor: Karim Zinnatullin
package ejercicioB5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String rutaProyecto = System.getProperty("user.dir");
		File diccionario = new File(rutaProyecto, "Diccionario");
		diccionario.mkdir();
		ArrayList<String> palabras = new ArrayList<>();
		String rutaPalabras = (rutaProyecto + File.separator + "Documentos\\diccionario.txt");
		Scanner lector;
		try {
			lector = new Scanner(new File(rutaPalabras));

			while (lector.hasNextLine()) {
				palabras.add(lector.nextLine());
			}
			lector.close();
			for (int i = 65; i <= 90; i++) {
				char letra = (char) i;
				crearFichero(diccionario.getAbsolutePath(), letra, palabras);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void crearFichero(String ruta, char letra, ArrayList<String> array) {
		String cadena = "" + letra;
		String nombreFichero = cadena.concat(".txt");
		File fichero = new File(ruta + File.separator + nombreFichero);
		Collections.sort(array);
		try {
			FileWriter writer = new FileWriter(fichero);
			for (String x : array) {
				if (x.toUpperCase().charAt(0) == letra) {
					writer.write(String.format("%s\n", x));
				}
			}
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
