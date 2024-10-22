/*
 * Autor: Karim Zinnatullin
 */
package zinnatullinKarim799;

import java.util.HashSet;
import java.util.Set;

public class Socio {
	public static enum tipoCliente {
		NORMAL, JUBILADO, INFANTIL
	}

	private String dni;
	private tipoCliente tipo;
	private double cuota;
	private String nombre;
	private String DNIasociado;
	protected static Set<String> DNIs = new HashSet<>();

	public Socio(String dni, String nombre, tipoCliente tipo, String DNIasociado)  {
		if (DNIs.contains(dni)) {
			throw new IllegalArgumentException("El DNI  " + dni + " pertenece a otro socio existente");
		} else if (tipo == tipoCliente.INFANTIL) {
			if (DNIs.contains(DNIasociado)) {
				this.cuota = asignarCuotaBase();
				this.nombre = nombre;
				this.tipo = tipo;
				this.dni = dni;
				DNIs.add(dni);
				this.DNIasociado = DNIasociado;
			} else {
				throw new IllegalArgumentException(
						"No se puede registrar un socio infantil sin asociar otro socio ya existente");
			}
		} else {
			this.cuota = asignarCuotaBase();
			this.nombre = nombre;
			this.tipo = tipo;
			this.dni = dni;
			DNIs.add(dni);
		}
	}
	public String getDni() {
		return this.dni;
	}

	public String getNombre() {
		return this.nombre;
	}
	public double getCuota() {
		return this.cuota;
	}
	
	public void subirCuota(double x) {
		this.cuota +=x;
	}
	public static void informeSocios() {
			System.out.printf("DNIs de los Socios:\n%s\n",DNIs.toString());	
	}
	
	private int asignarCuotaBase() {
		if (this.tipo != tipoCliente.INFANTIL) {
			return 50;
		} else {
			return 25;
		}
	}
}
