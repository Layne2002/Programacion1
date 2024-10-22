// Autor: Karim Zinnatullin
package ejercicioA5;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) {
		String rutaProyecto = System.getProperty("user.dir");
		File rutaDoc = new File(rutaProyecto, "Documentos");
		try {
			borrarTodo(rutaDoc);
		} catch (FileNotFoundException ex) {
			System.out.printf("%s\n", ex.getMessage());
		}
	}

	public static boolean borrarTodo(File ruta) throws FileNotFoundException {
		if (!ruta.exists()) {
			throw new FileNotFoundException("La ruta no existe");
		}
		if (ruta.isFile()) {
			System.out.printf("Borrando %s\n",ruta.getName());
			return ruta.delete();
		} else {
			for (File x : ruta.listFiles()) {
				borrarTodo(x);
			}
			return ruta.delete();
		}

	}
}
