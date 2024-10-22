package ArchivosDeTexto;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		File fichero=new File("FicheroEjemplo.txt");
		ArrayList <Personas> personas=new ArrayList<>();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		int contador=0;
		
		try {
			Scanner lectorArchivo =new Scanner(fichero);
			while(lectorArchivo.hasNext()) {
				String[] linea=lectorArchivo.nextLine().split("; ");
				personas.add(new Personas(linea[0],LocalDate.parse(linea[1],formato),Double.valueOf(linea[2])));
				contador++;
			}
			lectorArchivo.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println(personas.toString());
		System.out.println(contador);

	}

}
