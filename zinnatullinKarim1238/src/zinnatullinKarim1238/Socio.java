package zinnatullinKarim1238;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import zinnatullinKarim1238.PartidoBaloncesto.Posicion;

/*Sobre los socios se recogerá la siguiente información: nombre, dni y teléfono. Cada 
socio tendrá un identificador único proporcionado por la aplicación y no puede 
cambiar.*/
public class Socio {
	private String nombre, telefono, dni;
	private final int ID;
	protected int cuota;

	private static int contadorSocios = 0;
	private static List<Socio> Socios = new ArrayList<>();
	private List<PartidoFutbol> PartidosFutbol = new ArrayList<>();
	private List<PartidoBaloncesto> PartidosBaloncesto = new ArrayList<>();

	public Socio(String nombre, String telefono, String dni) {
		if (comprobarDni(dni)) {
			throw new IllegalArgumentException("El DNI " + dni + " ya existe para otro socio.");
		}
		this.nombre = nombre;
		this.dni = dni;
		this.telefono = telefono;
		this.ID = generarId();
		Socios.add(this);
	}

	private static boolean comprobarSocio(int id) {
		for (Socio x : Socios) {
			if (x.getId() == id) {
				return true;
			}
		}
		return false;
	}

	public static Socio getSocio(int id) {
		if (!comprobarSocio(id)) {
			throw new IllegalArgumentException("No existe un socio con el id " + id);
		}
		Socio socio = null;
		for (Socio x : Socios) {
			if (x.getId() == id) {
				socio = x;
				return x;
			}
		}
		return socio;

	}

	public void agregarPartidoBaloncesto(PartidoBaloncesto partido) {
		this.PartidosBaloncesto.add(partido);
	}

	public void guardarPartidoBaloncesto(int id, LocalDate fecha, int minutos, int puntos, int asistencias, int tapones,
			Posicion posicion) {
		if (!comprobarSocio(id)) {
			throw new IllegalArgumentException("No existe un socio con el id " + id);
		}
		PartidoBaloncesto partido = new PartidoBaloncesto(id, fecha, minutos, puntos, asistencias, tapones, posicion);
		for (Socio x : Socios) {
			x.agregarPartidoBaloncesto(partido);
		}
	}

	public void agregarPartidoFutbol(PartidoFutbol partido) {
		this.PartidosFutbol.add(partido);
	}

	public static void guardarPartidoFutbol(int id, LocalDate fecha, int minutos, int goles, double km, String equipo) {
		if (!comprobarSocio(id)) {
			throw new IllegalArgumentException("No existe un socio con el id " + id);
		}
		PartidoFutbol partido = new PartidoFutbol(id, fecha, minutos, goles, km, equipo);
		for (Socio x : Socios) {
			if (x.getId() == id)
				x.agregarPartidoFutbol(partido);
		}
	}

	public int getId() {
		return ID;
	}

	public String getDni() {
		return dni;
	}

	public int calcularCuota() {
		int calculo = 30;
		if (this.PartidosBaloncesto.size() > 0) {
			calculo = calculo + (PartidosBaloncesto.size() * 5);
		}
		if (this.PartidosFutbol.size() > 0) {
			calculo = calculo + (PartidosFutbol.size() * 3);
		}
		this.cuota = calculo;
		return calculo;
	}

	private int generarId() {
		contadorSocios++;
		return contadorSocios;
	}

	private static boolean comprobarDni(String dni) {
		for (Socio x : Socios) {
			if (x.getDni() == dni) {
				return true;
			}
		}
		return false;
	}

	public String mostrarParticipaciones() {
		if (PartidosFutbol.size() > 0) {
			return "ID= " + ID + " Participaciones: " + participacionesFutbolString(PartidosFutbol);
		} else if (PartidosBaloncesto.size() > 0) {
			return "ID= " + ID + " Participaciones: " + participacionesBaloncestoString(PartidosBaloncesto);
		} else {
			return "El socio con el ID " + ID + " no tiene participaciones";
		}
	}
	
	private String participacionesBaloncestoString(List<PartidoBaloncesto> lista) {
		String cadena = "";
		if (lista.size() == 1) {
			cadena = lista.toString();
		} else {
			for (PartidoBaloncesto x : lista) {
				cadena = cadena + x.toString() + "\n";
			}
		}
		return cadena;
	}
	private String participacionesFutbolString(List<PartidoFutbol> lista) {
		String cadena = "";
		if (lista.size() == 1) {
			cadena = lista.toString();
		} else {
			for (PartidoFutbol x : lista) {
				cadena = cadena + x.toString() + "\n";
			}
		}
		return cadena;
	}

	@Override
	public String toString() {
		return "ID= " + ID + ", Nombre= " + nombre + ", telefono= " + telefono + ", dni= " + dni + ", cuota= "
				+ this.calcularCuota();
	}

}
