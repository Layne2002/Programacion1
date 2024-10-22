// Autor: Karim Zinnatullin
package zinnatullinKarim899;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Ciclista {
	private final String DNI;
	private String nombre;
	private LocalDate fechaNac;
	private String modeloBici;

	private static List<Ciclista> Ciclistas = new ArrayList<>();
	private List<Ruta> RutasRealizadas = new ArrayList<>();

	private static boolean comprobarDni(String dni) {
		boolean existe = false;
		for (Ciclista x : Ciclistas) {
			if (x.getDni().equalsIgnoreCase(dni)) {
				existe = true;
			}
		}
		return existe;
	}

	public Ciclista(String dni, String nombre, LocalDate fechaNac, String modeloBici) {
		if (comprobarDni(dni)) {
			throw new IllegalArgumentException("Ese DNI ya está asignado a otro ciclista");
		}
		this.DNI = dni;
		this.nombre = nombre;
		this.fechaNac = fechaNac;
		this.modeloBici = modeloBici;
		Ciclistas.add(this);
	}

	public String getDni() {
		return this.DNI;
	}

	public void realizarRuta(Ruta ruta) {
		this.RutasRealizadas.add(ruta);
	}

	public void agregarRuta(String nombre) {
		Ruta ruta = Ruta.getRuta(nombre);
		this.RutasRealizadas.add(ruta);
	}

	public static Ciclista getCiclista(String dni) {
		if (!comprobarDni(dni)) {
			throw new IllegalArgumentException("No hay un ciclista con el dni " + dni);
		}
		Ciclista a = null;
		for (Ciclista x : Ciclistas) {
			if (x.getDni().equalsIgnoreCase(dni)) {
				a = x;
			}
		}
		return a;
	}

	public static void eliminarCiclista(String dni) {
		if (!comprobarDni(dni)) {
			throw new IllegalArgumentException("No hay un ciclista con el dni " + dni);
		}
		for (Ciclista x : Ciclistas) {
			if (x.getDni().equalsIgnoreCase(dni)) {
				System.out.printf("%s\n", x.toString());
				Ciclistas.remove(x);
			}
		}
	}

	public String mostrarRutasRealizadas() {
		return this.RutasRealizadas.toString();
	}

	private void setModelo(String modelo) {
		this.modeloBici = modelo;
	}

	public static void modificarModelo(String dni, String modeloBici) {
		if (!comprobarDni(dni)) {
			throw new IllegalArgumentException("No hay un ciclista con el dni " + dni);
		}
		for (Ciclista x : Ciclistas) {
			if (x.getDni().equalsIgnoreCase(dni)) {
				x.setModelo(modeloBici);
			}
		}
	}

	public static void imprimirTodosCiclistas() {
		for (Ciclista x : Ciclistas) {
			System.out.println(x.toString());
		}
	}

	@Override
	public String toString() {
		if (this.RutasRealizadas.isEmpty()) {
			return "Ciclista: DNI= " + DNI + ", nombre= " + nombre + ", fechaNac= " + fechaNac + ", modeloBici= "
					+ modeloBici;
		} else {
			return "Ciclista: DNI= " + DNI + ", nombre= " + nombre + ", fechaNac= " + fechaNac + ", modeloBici= "
					+ modeloBici + "\nRutas realizadas: " + this.mostrarRutasRealizadas();
		}
	}

}
