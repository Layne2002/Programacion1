// Autor: Karim Zinnatullin
package Mascotas;

import java.time.LocalDate;
import java.time.Period;

public abstract class Mascota {
	public enum tipo{PERRO,GATO,LORO,CANARIO}
	protected tipo tipo;
	private String nombre;
	private int edad;
	private String estado;
	private LocalDate fechaNac;
	

	protected Mascota(String nombre, LocalDate fechaNac) {
		if (edad < 0) {
			throw new IllegalArgumentException("La edad no puede ser negativa");
		}
		if (fechaNac.isAfter(LocalDate.now())) {
			throw new IllegalArgumentException("La fecha de nacimiento no puede ser posterior a hoy");
		}
		this.nombre = nombre;
		this.estado = estado;
		this.fechaNac = fechaNac;
		this.estado = "Vivo";
		this.edad = calcularEdad();
	}
	public void morir() {
		if(this.estado.equals("Muerto")) {
			throw new IllegalStateException("La mascota ya está muerta");
		}
		this.estado = "Muerto";
	}
	public String getNombre() {
		return this.nombre;
	}
	public int getEdad() {
		this.edad = calcularEdad();
		return edad;
	}
	private int calcularEdad() {
		int calculo;
		Period periodo = Period.between(this.fechaNac, LocalDate.now());
        calculo = periodo.getYears();
		return calculo;
	}
	

	public String getEstado() {
		return estado;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}
	
	public String muestra() {
		return " Nombre= " + nombre + ", edad= " + getEdad() + " años, estado= " + estado + ", fechaNacimiento= " + fechaNac;
	}
	public String habla() {
		return "*sonido de animal*";
	}
	
}
