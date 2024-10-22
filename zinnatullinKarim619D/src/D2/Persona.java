package D2;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Persona {
	private String dni;
	private String nombre;
	private String apellidos;
	private int edad;

	public String getDNI() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setDNI(String dni) {
		Pattern pattern = Pattern.compile("^[0-9]{8}[a-zA-Z]$");
		Matcher matcher = pattern.matcher(dni);
		if (matcher.matches())
			this.dni = dni;
		else {
			throw new IllegalArgumentException("El formato del DNI es incorrecto");
		}
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Persona(String dni, String nombre, String apellidos, int edad) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}

	public Persona() {
		this("12345678A", "NOMBRE", "APELLIDOS", 0);
	}

	public void imprime() {
		System.out.printf("DNI: %s - Nombre: %s - Apellidos: %s - Edad: %d\n", this.dni, this.nombre, this.apellidos,
				this.edad);
	}

	public boolean esMayorEdad() {
		if (this.edad >= 18)
			return true;
		else
			return false;
	}

	public boolean esJubilado() {
		if (this.edad >= 65)
			return true;
		else
			return false;
	}

	public int diferenciaEdad(Persona p) {
		int diferencia;
		if (this.edad > p.edad) {
			diferencia = this.edad - p.edad;
		} else {
			diferencia = p.edad - this.edad;
		}
		return diferencia;
	}
}
