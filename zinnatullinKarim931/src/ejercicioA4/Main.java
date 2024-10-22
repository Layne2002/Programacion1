// Autor: Karim Zinnatullin
package ejercicioA4;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		String rutaProyecto = System.getProperty("user.dir");
		File misCosas = new File(rutaProyecto,"Documentos\\Mis Cosas");
		boolean res = misCosas.mkdir();
		System.out.println("Se ha creado la carpeta Mis Cosas? "+res);
		File alfabeto = new File(rutaProyecto,"Documentos\\Alfabeto");
		res = alfabeto.mkdir();
		System.out.println("Se ha creado la carpeta alfabeto? "+res);
		
		File fotOrigen = new File(rutaProyecto,"Documentos\\Fotografias");
		File fotDestino = new File(rutaProyecto,"Documentos\\Mis Cosas\\Fotografias");
		res = fotOrigen.renameTo(fotDestino);
		System.out.println("Se ha movido Fotografias a Mis Cosas?"+res);
		File libOrigen = new File(rutaProyecto,"Documentos\\Libros");
		File libDestino = new File(rutaProyecto,"Documentos\\Mis Cosas\\Libros");
		res = libOrigen.renameTo(libDestino);
		System.out.println("Se ha movido Libros a Mis Cosas?"+res);
		
		for(int i = 65; i<=90;i++) {
			 char letra = (char) i;
	            crearCarpeta(alfabeto.getAbsolutePath(), String.valueOf(letra));
		}
		
	}
    public static void crearCarpeta(String ruta, String nombreCarpeta) {
        File carpeta = new File(ruta, nombreCarpeta);
        if (!carpeta.exists()) {
            carpeta.mkdir();
            System.out.println("Carpeta '" + nombreCarpeta + "' creada en '" + ruta);
        } 
    }

}
