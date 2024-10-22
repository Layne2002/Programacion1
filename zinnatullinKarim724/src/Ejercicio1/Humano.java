package Ejercicio1;

public class Humano {
	protected String nombre;
	protected String apellido;

	public Humano() {
		this.nombre = "Juan";
		this.apellido = "García";
	}

	public Humano(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getNombreCompleto() {
		return (this.apellido + " , " + this.nombre);
	}
}
