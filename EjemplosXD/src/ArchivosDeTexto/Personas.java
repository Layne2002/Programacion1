package ArchivosDeTexto;

import java.time.LocalDate;

public class Personas {
	private String nombre;
	private double salario;
	private LocalDate fechaNacimiento;
	
	public Personas(String nombre, LocalDate fechaNacimiento, double salario) {
		this.nombre = nombre;
		this.salario = salario;
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Personas [nombre=" + nombre + ", salario=" + salario + ", fechaNacimiento=" + fechaNacimiento + "]\n\n";
	}
	
	
}
