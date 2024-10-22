package Listas;

import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		//Creamos el LinkedList de personas
		LinkedList<Persona> listaPersonas = new LinkedList<>();
		
		//Creamos los objetos personas
		Persona persona1= new Persona("Manolo",30,"252525");
		Persona persona2= new Persona("Polo",20,"252525");
		Persona persona3= new Persona("Mercedes",40,"252525");
		
		//Añadimos los objetos persona
		listaPersonas.add(persona1);
		listaPersonas.add(persona2);
		listaPersonas.add(persona3);
		
		//Dime el contenido de todo es listado de personas
		for (Persona indice : listaPersonas) {
			System.out.println(indice.toString());
		}
		
		System.out.println("La lista contine:"+listaPersonas.size()+" personas."+"\n");
		
		persona1.setNombre("Manolo1");
		
		for (Persona indice : listaPersonas) {
			System.out.println(indice.toString()+"\n");
		}
		
		listaPersonas.getFirst().setNombre("Manolo2");
		
		for (Persona indice : listaPersonas) {
			System.out.println(indice.toString()+"\n");
		}
		
		Persona persona5 = listaPersonas.remove(1);
		
		for (Persona indice : listaPersonas) {
			System.out.println(indice.toString());
		}
	}

}
