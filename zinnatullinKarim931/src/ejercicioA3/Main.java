// Autor: Karim Zinnatullin
package ejercicioA3;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) {
		String rutaProyecto = System.getProperty("user.dir");
		File docOrigen = new File("Documentos");
		File docOrigenAbsoluta = new File(rutaProyecto, docOrigen.getPath());

		File docNuevo = new File("DOC");
		File docNuevoAbsoluta = new File(rutaProyecto, docNuevo.getPath());

		boolean res = docOrigenAbsoluta.renameTo(docNuevoAbsoluta);
		System.out.println("Se ha cambiado Documentos a DOC? " + res);

		File fotOrigen = new File("DOC\\Fotografias");
		File fotOrigenAbsoluta = new File(rutaProyecto, fotOrigen.getPath());

		File fotNuevo = new File("DOC\\FOTOS");
		File fotNuevoAbsoluta = new File(rutaProyecto, fotNuevo.getPath());

		res = fotOrigenAbsoluta.renameTo(fotNuevoAbsoluta);
		System.out.println("Se ha cambiado Fotografias a FOTOS? " + res);

		File libOrigen = new File("DOC\\Libros");
		File libOrigenAbsoluta = new File(rutaProyecto, libOrigen.getPath());

		File libNuevo = new File("DOC\\LECTURAS");
		File libNuevoAbsoluta = new File(rutaProyecto, libNuevo.getPath());

		res = libOrigenAbsoluta.renameTo(libNuevoAbsoluta);
		System.out.println("Se ha cambiado Libros a Libros? " + res);
		try {
			quitarExtensiones(libNuevoAbsoluta);
			quitarExtensiones(fotNuevoAbsoluta);
		} catch (FileNotFoundException ex) {
			System.out.printf("%s\n", ex.getMessage());
		}
	}

	public static void quitarExtensiones(File ruta) throws FileNotFoundException {
		if (!ruta.exists()) {
			throw new FileNotFoundException("La ruta no existe!");
		}
		File[] archivos = ruta.listFiles();
		for (File x : archivos) {
			if (x.isFile()) {
				String nombre = x.getName();
				int posicionPunto = nombre.lastIndexOf(".");
				if (posicionPunto != -1) {
					String nuevoNombre = nombre.substring(0, posicionPunto);
					File nuevoArchivo = new File(ruta.getPath() + File.separator + nuevoNombre);

					boolean renombrado = x.renameTo(nuevoArchivo);
					System.out
							.println("Se ha renombrado el archivo " + nombre + " a " + nuevoNombre + ": " + renombrado);
				}
			}
		}
	}

}
