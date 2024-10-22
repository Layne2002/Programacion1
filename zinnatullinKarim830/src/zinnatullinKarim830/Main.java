package zinnatullinKarim830;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * 1. Importar la información contenida en el documento notas1.txt, donde la
		 * información tiene el siguiente formato:
		 * grupo;nombre,matemáticas;lengua;física;química;inglés
		 */
		List<Alumno> Alumnos = new ArrayList<>();
		File fichero1 = new File("Notas1.txt");
		Alumnos.addAll(anyadirAlumnos(fichero1));
		/*2. Mostrar el número de registros que contiene.*/
		System.out.printf("Número de registros: %d\n",Alumnos.size());
	}

	private static List<Alumno> anyadirAlumnos(File fichero) {
		List<Alumno> Alumnos = new ArrayList<>();

		Scanner lector;
		try {
			lector = new Scanner(fichero);
			while (lector.hasNext()) {
				String linea = lector.nextLine();
				String[] array = linea.split(";");
				String grupo = array[0];
				String nombre = array[1];
				int mat = Integer.valueOf(array[2]);
				int leng = Integer.valueOf(array[3]);
				int fis = Integer.valueOf(array[4]);
				int quim = Integer.valueOf(array[5]);
				int ing = Integer.valueOf(array[6]);
				Alumnos.add(new Alumno(grupo, nombre, mat, leng, fis, quim, ing));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return Alumnos;

	}

}
