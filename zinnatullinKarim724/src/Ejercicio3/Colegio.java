package Ejercicio3;

import java.time.LocalDate;

import Ejercicio3.Personal.Genero;

public class Colegio {

	public static void main(String[] args) {

		// personal1
		System.out.println("Creando una persona sin parámetros");
		Personal personal1 = new Personal();
		System.out.printf("%s\n", personal1.toString());
		System.out.println("Aumentando su salario un 7%");
		personal1.aumentoSalario(7);
		System.out.printf("%s\n", personal1.toString());

		// personal2
		Personal personal2;
		System.out.println("Intentando crear una persona con DNI incorrecto");
		try {
			personal2 = new Personal("12345678999", "Alvaro", "Perez Mártinez", LocalDate.of(1999, 2, 15),
					Genero.MASCULINO, 30000, "711718641", "alvaro123@gmail.com");
		} catch (IllegalArgumentException ex) {
			System.err.printf("%s\n", ex.getMessage());
		}
		System.out.println("Intentando crear una persona con fecha de nacimiento incorrecto");
		try {
			personal2 = new Personal("12345678A", "Alvaro", "Perez Mártinez", LocalDate.of(2027, 2, 15),
					Genero.MASCULINO, 30000, "711718641", "alvaro123@gmail.com");
		} catch (IllegalArgumentException ex) {
			System.err.printf("%s\n", ex.getMessage());
		}

		System.out.println("\nCreando un personal con parámetros válidos");
		try {
			personal2 = new Personal("12345678A", "Alvaro", "Perez Mártinez", LocalDate.of(1997, 2, 15),
					Genero.MASCULINO, 30000, "711718641", "alvaro123@gmail.com");
			System.out.printf("%s\n", personal2.toString());
			System.out.println("Comprobando cuántos años le quedan hasta la jubilación");
			System.out.printf("le quedan %d años\n", personal2.anyosJubilacion());
		} catch (IllegalArgumentException ex) {
			System.err.printf("%s\n", ex.getMessage());
		}

		// Profesor1
		System.out.println("Creando un profesor sin parámetros");
		Profesor profesor1 = new Profesor();
		System.out.println("Aumentando su sueldo por años de experiencia (no tiene experiencia)");
		try {
			profesor1.aumentarSalario();
		} catch (IllegalArgumentException ex) {
			System.err.printf("%s\n", ex.getMessage());
		}
		System.out.println("creando un profesor con años de experiencia negativos");
		Profesor profesor2 = new Profesor(); // lo inicializamos para que no aparezca un error
		try {
			profesor2 = new Profesor("12345678S", "Alberto", "Chicote", LocalDate.of(1969, 4, 25), Genero.MASCULINO,
					24000, "123456724", "albertoChicote@gmail.com", "grado superior", "Física cuántica",
					"Física aplicada", "2 de Física", -6);
		} catch (IllegalArgumentException ex) {
			System.err.printf("%s\n", ex.getMessage());
		}

		System.out.println("\ncreando un profesor con parámetros válidos");
		try {
			profesor2 = new Profesor("12345678S", "Alberto", "Chicote", LocalDate.of(1969, 4, 25), Genero.MASCULINO,
					24000, "123456724", "albertoChicote@gmail.com", "grado superior", "Física cuántica",
					"Física aplicada", "2 de Física", 6);
		} catch (IllegalArgumentException ex) {
			System.err.printf("%s\n", ex.getMessage());
		}
		System.out.printf("%s\n", profesor2.toString());

	}

}
