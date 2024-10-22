package ejercicio2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contacto {
	private String nombre;
	private String direccion, telefono, email;
	private final LocalDate fechaNac;
	public static List<Contacto> Agenda = new ArrayList<>();

	public Contacto(String nombre, String direccion, String telefono, String email, LocalDate fechaNac) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
		this.fechaNac = fechaNac;
		Agenda.add(this);
	}

	public static String getInfoContacto(String nombre) {
		for (Contacto x : Agenda) {
			if (x.getNombre().equalsIgnoreCase(nombre)) {
				return x.toString();
			}
		}
		return "No existe ningun contacto con el nombre: " + nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}

	public static void imprimirAgenda() {
		for (Contacto x : Agenda) {
			System.out.println(x.toString());
		}
	}

	public static String getCumpleanyos(LocalDate fecha) {
		String cadena = "Los que cumplen años ese dia son:\n";
		for (Contacto x : Agenda) {
			if (x.getFechaNac().equals(fecha))
				cadena = cadena + x.getNombre() + "\n";
		}
		if (cadena.equals("Los que cumplen años ese dia son:\n"))
			return "Nadie cumple años ese dia";
		else
			return cadena;
	}

	@Override
	public String toString() {
		return "Contacto: nombre= " + nombre + ", direccion= " + direccion + ", telefono= " + telefono + ", email= "
				+ email + ", fechaNac= " + fechaNac;
	}

	public static List<Contacto> getAgenda() {
		return Agenda;
	}
}
