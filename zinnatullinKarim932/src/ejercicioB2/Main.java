// Autor: Karim Zinnatullin
package ejercicioB2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String rutaProyecto = System.getProperty("user.dir");
		File fichero = new File(rutaProyecto, "\\Documentos\\alumnos_notas.txt");
		ArrayList<Alumno> Alumnos = new ArrayList<>();
		try {
			Scanner lector = new Scanner(fichero);
			while (lector.hasNext()) {
				String cadena = lector.nextLine();
				String nombre = cadena.replaceAll("[0-9]", "").trim();
				String notas[] = cadena.replaceAll("[a-zA-Z]", "").split(" ");
				Alumno alumno = new Alumno(nombre);
				for (int i = 2; i < notas.length; i++) {
					alumno.anyadirNota(Double.parseDouble(notas[i]));
				}
				alumno.calcularMedia();
				Alumnos.add(alumno);
			}
			Collections.sort(Alumnos);
			Collections.reverse(Alumnos);
			for (Alumno x : Alumnos) {
				System.out.printf("%s\n", x.toString());
			}
			lector.close();
		} catch (FileNotFoundException ex) {
			System.out.printf("%s\n", ex.getMessage());
		}
	}

}
