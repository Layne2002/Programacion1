package chuletario;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LeerFichero {

	public static void main(String[] args) {
		// 1.
		ArrayList<Alumno> lista = null;
		try {
			lista = leerArchivo("notas1.txt");
		} catch (FileNotFoundException ex) {
			System.out.printf("Error: %s\n", ex.getMessage());
		}

		// 2.
		imprimirLista(lista);

		// 3.
		Collections.sort(lista);

		// 4.
		insertarLinea(lista, "1º ESO D;López Muro, Rosario;3;3;4;4;3", lista.size());

		// 5.
		int pos = (int) (lista.size() / 2);
		insertarLinea(lista, "1º ESO B;Duarte Durán, Alba;2;3;4;1;3", pos);

		// 6.
		System.out.printf("Posicion: %d %s\n", pos, lista.get(pos).toString());

		// 7.
		ArrayList<Alumno> listaAuxiliar = null;
		try {
			listaAuxiliar = leerArchivo("notas2.txt");
		} catch (FileNotFoundException ex) {
			System.out.printf("Error: %s\n", ex.getMessage());
		}

		lista.addAll(listaAuxiliar);

		// 8.
		buscarEImprimir(lista, "Cordero Benítez, Alejandro");

		// 9.
		buscarEImprimir(lista, "Zoodsma Villalón, Natali");

		// 10.
		borrarRegistro(lista, lista.size() / 2 + 1);

		// 11.
		for (int i = 0; i < 10; i++)
			borrarRegistro(lista, 0);

		// 12.
		System.out.printf("BORRAMOS LOS REGISTROS CON UN 2 EN MATEMÁTICAS\n");
		ArrayList<Alumno> pendientesPorBorrar = new ArrayList<>();
		for (Alumno al : lista) {
			if (al.getMatematicas() == 2)
				pendientesPorBorrar.add(al);
		}
		System.out.printf("Hay %d registros con un 2 en matemáticas\n", pendientesPorBorrar.size());
		for (int i = 0; i < pendientesPorBorrar.size(); i++)
			lista.remove(pendientesPorBorrar.get(i));
		System.out.printf("Registros borrados\n");

	}

	private static ArrayList<Alumno> leerArchivo(String path) throws FileNotFoundException {
		File archivo = new File(path);

		ArrayList<Alumno> lista = new ArrayList<>();

		Scanner input = new Scanner(archivo);

		while (input.hasNextLine()) {
			String linea = input.nextLine();
			insertarLinea(lista, linea, lista.size());
		}
		return lista;
	}

	private static void insertarLinea(ArrayList<Alumno> lista, String linea, int pos) {
		System.out.printf("INSERTANDO LINEA '%s' EN LA POSICIÓN %d\n", linea, pos);
		String partesLinea[] = linea.split(";");
		String gr = partesLinea[0];
		String nom = partesLinea[1];

		int mat = Integer.parseInt(partesLinea[2]);
		int len = Integer.parseInt(partesLinea[3]);
		;
		int fis = Integer.parseInt(partesLinea[4]);
		;
		int qui = Integer.parseInt(partesLinea[5]);
		;
		int ing = Integer.parseInt(partesLinea[6]);
		;

		Alumno alumno = new Alumno(gr, nom, mat, len, fis, qui, ing);
		lista.add(pos, alumno);
	}

	private static void imprimirLista(ArrayList<Alumno> lista) {
		System.out.printf("IMPRIMIENDO LISTA\n");
		for (Alumno al : lista)
			System.out.printf("%s\n", al.toString());
	}

	// Devuelve -1 si no encuentra el registro, o su posicion si lo encuentra
	private static int buscarRegistro(ArrayList<Alumno> lista, String nom) {
		int i = 0, pos = -1;

		for (Alumno al : lista) {
			if (al.getNombre().equalsIgnoreCase(nom))
				pos = i;
			i++;
		}
		return pos;
	}

	private static void buscarEImprimir(ArrayList<Alumno> lista, String nom) {
		System.out.printf("BUSCANDO REGISTRO '%s'\n", nom);
		int pos = buscarRegistro(lista, "Cordero Benítez, Alejandro");
		if (pos == -1)
			System.out.printf("Registro no encontrado.\n");
		else
			System.out.printf("%s\n", lista.get(pos));
	}

	private static void borrarRegistro(ArrayList<Alumno> lista, int pos) {
		System.out.printf("BORRAR REGISTRO NÚMERO %d\n", pos);
		try {
			System.out.printf("%s\n", lista.get(pos).toString());
			lista.remove(pos);
			System.out.printf("Registro borrado.\n");
		} catch (IndexOutOfBoundsException ex) {
			System.out.printf("Registro no encontrado.\n");
		}
	}

}