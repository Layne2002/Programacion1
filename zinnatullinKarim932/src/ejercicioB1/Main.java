// Autor: Karim Zinnatullin
package ejercicioB1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String rutaProyecto = System.getProperty("user.dir");
		File numeros = new File(rutaProyecto,"\\Documentos\\numeros.txt");
		try {
			Scanner lector = new Scanner(numeros);
			ArrayList<Integer> array = new ArrayList<>();
			while (lector.hasNext()) {
				array.add(lector.nextInt());
			}
			lector.close();
			Collections.sort(array);
			System.out.printf("El minimo es: %d\n", array.get(0));
			System.out.printf("El maximo es: %d", array.get(array.size() - 1));
		} catch (FileNotFoundException ex) {
			System.out.printf("%s\n", ex.getMessage());
		}
	}

}
