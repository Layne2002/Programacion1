// Autor: Karim Zinnatullin
package zinnatullinKarim899;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Ruta {
	private String nombreRuta;
	private LocalDate fecha;
	private int km, tiempo;
	private List<Ciclista> CiclistasRealizado = new ArrayList<>();
	
	private static List<Ruta> Rutas = new ArrayList<>();

	private static boolean comprobarNombreRuta(String nombreRuta) {
		boolean existe = false;
		for (Ruta x : Rutas) {
			if (x.getNombreRuta().equalsIgnoreCase(nombreRuta)) {
				existe = true;
			}
		}
		return existe;
	}
	
	public Ruta(String nombre, LocalDate fecha, int km, int tiempo) {
		if (comprobarNombreRuta(nombre)) {
			throw new IllegalArgumentException("Ya existe una ruta con ese nombre");
		}
		this.nombreRuta = nombre;
		this.fecha = fecha;
		this.km = km;
		this.tiempo = tiempo;
		Rutas.add(this);
	}

	public String getNombreRuta() {
		return this.nombreRuta;
	}

	public static Ruta getRuta(String nombre) {
		if (!comprobarNombreRuta(nombre)) {
			throw new IllegalArgumentException("No hay un ciclista con el nombre " + nombre);
		}
		Ruta ruta = null;
		for (Ruta x : Rutas) {
			if (x.getNombreRuta().equalsIgnoreCase(nombre)) {
				ruta = x;
			}
		}
		return ruta;
	}

	public void agregarCiclista(Ciclista ciclista) {
		this.CiclistasRealizado.add(ciclista);
		ciclista.realizarRuta(this);
	}

	public static void anyadirCiclista(String dni, String nombreRuta) {
		Ciclista ciclista = Ciclista.getCiclista(dni);
		Ruta ruta = Ruta.getRuta(nombreRuta);
		ruta.agregarCiclista(ciclista);
	}

	@Override
	public String toString() {
		return "Ruta: nombre= " + nombreRuta + ", fecha= " + fecha + ", km= " + km + ", tiempo= " + tiempo;
	}

}
