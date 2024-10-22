package chuletario;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;


public class MoverDir {
	//Le das una ruta y crea un directorio ahi
	public static void mkDir(String ruta) {
		boolean exito = new File(ruta).mkdir();
		if (exito) {
			System.out.println("Se a creado el fichero con exito");
		} else {
			throw new IllegalArgumentException("No se puedo crear el directorio...");
		}
	}
	// le das la ruta del directorio y otra ruta donde quieres que se mueva
	public static void moverDir(String ruta, String mover) throws IOException, IllegalArgumentException {
		String ruta1[] = ruta.split("/");
		if (new File(ruta).exists()) {
			if (!new File(mover + "/" + ruta1[ruta1.length - 1]).exists()) {
				mkDir(mover + "/" + ruta1[ruta1.length - 1]);
			}
			for (File i : new File(ruta).listFiles()) {
				if (i.isFile()) {
					Files.move(Paths.get(i.getPath()), Paths.get(new File(mover + "/" + i.getPath()).getPath()),
							StandardCopyOption.REPLACE_EXISTING);
				} else {
					if (Files.list(i.toPath()).count() != 0) {
						moverDir(i.getPath(), mover);
					} else {
						Files.move(Paths.get(i.getPath()), Paths.get(new File(mover + "/" + i.getPath()).getPath()),
								StandardCopyOption.REPLACE_EXISTING);
					}
				}
			}
			System.out.println("Se a podido mover con exito.");
			(new File(ruta)).delete();
		} else {
			throw new IOException("No se puede crear el directorio...");
		}

	}
}