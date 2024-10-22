package Listas;

public class Persona {
	private String nombre;
	private int edad;
	private String DNI;

	public Persona(String nombre,int edad,String DNI) {
		this.nombre=nombre;
		this.edad=edad;
		this.DNI=DNI;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + "]";
	}
}
