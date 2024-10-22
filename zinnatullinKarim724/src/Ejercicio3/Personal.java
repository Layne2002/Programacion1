package Ejercicio3;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Personal {

	public enum Genero {
		MASCULINO, FEMENINO, OTRO
	}

	protected String dni;
	protected String nombre;
	protected String apellidos;
	protected LocalDate fechaNac;
	protected Genero genero = Genero.FEMENINO;
	protected double salario;
	protected String telefono;
	protected String email;

	public Personal() {
		this.dni = "12345678A";
		this.nombre = "Pedro";
		this.apellidos = "Sánchez Pérez";
		this.fechaNac = LocalDate.of(2000, 1, 1);
		this.genero = Genero.MASCULINO;
		this.salario = 14000;
		this.telefono = "sin teléfono";
		this.email = "emailEjemplo@email.com";
	}

	public Personal(String dni, String nombre, String apellidos, LocalDate fechaNac, Genero genero, double salario,
			String telefono, String email) {
		if (ComprobarDNI(dni) == false) {
			throw new IllegalArgumentException("El formato del DNI es incorrecto");
		} else if (fechaNac.isAfter(LocalDate.now()) || fechaNac.isEqual(LocalDate.now())) {
			throw new IllegalArgumentException("La fecha de nacimiento no puede ser la de hoy o posterior a hoy");
		} else {
			this.dni = dni;
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.fechaNac = fechaNac;
			this.genero = genero;
			this.salario = salario;
			this.telefono = telefono;
			this.email = email;
		}
	}

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}

	public Genero getGenero() {
		return genero;
	}

	public double getSalario() {
		return salario;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getEmail() {
		return email;
	}

	// ##########################################
	private boolean ComprobarDNI(String dni) {
		Pattern pattern = Pattern.compile("^[0-9]{8}[a-zA-Z]$");
		Matcher matcher = pattern.matcher(dni);
		if (matcher.matches())
			return true;
		else {
			return false;
		}
	}

	public void setDNI(String dni) {
		if (ComprobarDNI(dni))
			this.dni = dni;
		else 
			throw new IllegalArgumentException("El formato del DNI es incorrecto");
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void setFechaNac(LocalDate fechaNac) {
		if (fechaNac.isAfter(LocalDate.now()) || fechaNac.isEqual(LocalDate.now())) {
			throw new IllegalArgumentException("La fecha de nacimiento no puede ser la de hoy o posterior a hoy");
		} else {
			this.fechaNac = fechaNac;
		}
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		return "Personal [DNI = " + dni + ", nombre = " + nombre + ", apellidos = " + apellidos + ", fecha de nacimiento = "
				+ fechaNac + ", \ngénero = " + genero + ", salario = " + salario + ", teléfono = " + telefono
				+ ", email = " + email + "]";
	}

	public void aumentoSalario(double porcentaje) {
		this.salario = this.salario * (1 + (porcentaje / 100));
	}

	public int anyosJubilacion() {
		int resultado, calculo;
		calculo = LocalDate.now().getYear() - this.fechaNac.getYear();
		resultado = 65 - calculo;
		return resultado;
	}

}
