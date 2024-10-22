// Autor: Karim Zinnatullin
package zinnatullinKarimT3P;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Servicio {
	private String trabajador, cliente;
	private LocalDate fechaServicio;
	private final String id;
	protected double importe;
	private static int cantidadServicios = 0;
	protected static List<Servicio> Servicios = new ArrayList<>();

	protected Servicio(String trabajador, String cliente, LocalDate fecha) {
		this.trabajador = trabajador;
		this.cliente = cliente;
		this.fechaServicio = fecha;
		cantidadServicios++;
		this.id = generarCodigo(fecha.getYear());
		Servicios.add(this);
	}

	private static String generarCodigo(int ano) {
		String cad1 = String.valueOf(ano) + "-";
		String cad2 = String.valueOf(cantidadServicios);
		if (cad2.length() < 3) {
			int repeticiones = 3 - cad2.length();
			String espacios = "";
			for (int i = 0; i < repeticiones; i++) {
				espacios += " ";
			}
			espacios = espacios.replace(" ", "0");
			cad2 = espacios.concat(cad2);
		}
		String cadena = cad1.concat(cad2);
		return cadena;
	}

	public LocalDate getFecha() {
		return this.fechaServicio;
	}

	public double getImporte() {
		return this.importe;
	}

	public String getId() {
		return id;
	}

	public static void eliminarServicio(String identificador) {
		if (!comprobarId(identificador)) {
			throw new IllegalArgumentException("No existe un servicio con ese ID");
		}
		Servicio a = null;
		for (Servicio x : Servicios) {
			if (x.getId().equalsIgnoreCase(identificador)) {
				System.out.printf("Se ha borrado el siguiente servicio:\n%s\n", x.toString());
				a = x;
			}
		}
		Servicios.remove(a);

	}

	public static String serviciosInferior(double importe) {
		String cadena = "";
		for (Servicio x : Servicios) {
			if (x.getClass().getSimpleName().equals("Pintura")) {
				if (x.getImporte() < importe) {
					cadena = cadena + x.toString() + "\n";
				}
			}
		}
		return cadena;
	}

	public static String serviciosDia(LocalDate fecha) {
		String cadena = "";
		for (Servicio x : Servicios) {
			if (x.getFecha().equals(fecha)) {
				cadena = cadena + x.toString() + "\n";
			}
		}
		return cadena;
	}

	private static boolean comprobarId(String identificador) {
		boolean existe = false;
		for (Servicio x : Servicios) {
			if (x.getId().equalsIgnoreCase(identificador)) {
				existe = true;
			}
		}
		return existe;
	}

	@Override
	public String toString() {
		return "Servicio: ID=" + id + ", trabajador= " + trabajador + ", cliente= " + cliente + ", fechaServicio= "
				+ fechaServicio + ", importe total= " + importe;
	}
}
