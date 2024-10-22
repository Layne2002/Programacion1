// Autor: Karim Zinnatullin
package ejercicioB4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		String rutaProyecto = System.getProperty("user.dir");
		File nombres = new File(rutaProyecto, "\\Documentos\\usa_nombres.txt");
		ArrayList<String> arrayNombres = leerPalabras(nombres);
		File apellidos = new File(rutaProyecto, "\\Documentos\\usa_apellidos.txt");
		ArrayList<String> arrayApellidos = leerPalabras(apellidos);
		System.out.println("Cuantos nombres aleatorios quieres crear?");
		int num = input.nextInt();
		input.nextLine();
		ArrayList<String> nombresCompletos = new ArrayList<>();
		for (int i = 0; i < num; i++) {
			int randNombre = rand.nextInt(arrayNombres.size());
			int randApellido = rand.nextInt(arrayApellidos.size());
			String nombre = arrayNombres.get(randNombre).toString();
			String apellido = arrayNombres.get(randApellido).toString();
			String resultado = nombre.concat(" ").concat(apellido);
			nombresCompletos.add(resultado);
		}
		System.out.println("Dime el directorio del archivo donde escribir los nombres nuevos:");
		String destino = input.nextLine();
		File rutaDestino = new File(destino);
		try {
			FileWriter writer = new FileWriter(rutaDestino);
			for (String x : nombresCompletos) {
				System.out.println(x);
				writer.write(String.format("%s\n", x));
			}
			writer.close();
		} catch (IOException ex) {
			System.out.printf("%s\n", ex.getMessage());
		}
		input.close();
	}

	private static ArrayList<String> leerPalabras(File archivo) {
		Scanner lector = null;
		try {
			lector = new Scanner(archivo);
		} catch (FileNotFoundException ex) {
			System.out.printf("%s\n", ex.getMessage());
		}
		ArrayList<String> array = new ArrayList<>();

		while (lector.hasNext()) {
			array.add(lector.nextLine());
		}
		lector.close();
		return array;
	}
}