package karimInmobiliaria;

import java.time.LocalDate;

abstract class Inmueble {
	public final String Id;
	protected int superficie;
	protected String propietario;
	protected LocalDate fechaEntrada;
	protected String direccion;

	private static final int MIN_SUPERFICIE = 60, MAX_SUPERFICIE = 150;

	private String generarCodigo() {
		String codigo = "A";
		return codigo;
	}

	protected Inmueble() {
		this.Id = generarCodigo();
		this.superficie = 60;
		this.propietario = "Sin propietario";
		this.fechaEntrada = LocalDate.now();
		this.direccion = "Sin dirección";
	}

	protected Inmueble(int superficie, String propietario, LocalDate fechaEntrada, String direccion) {
		if (superficie > MAX_SUPERFICIE || superficie < MIN_SUPERFICIE) {
			throw new IllegalArgumentException("Error: superficie nó válida: " + superficie);
		} else if (fechaEntrada.isAfter(LocalDate.now())) {
			throw new IllegalArgumentException("Error: la fecha de entrada no puede ser posterior a hoy");
		} else {
			this.Id = generarCodigo();
			this.superficie = superficie;
			this.propietario = propietario;
			this.fechaEntrada = fechaEntrada;
			this.direccion = direccion;
		}
	}

	public String toString() {
		return "Id: " + Id + ", superficie: " + superficie + "; propietario: " + propietario + ", Fecha de entrada:"
				+ fechaEntrada + ", direccion: " + direccion;
	}

	public int getSuperficie() {
		return superficie;
	}

	public void setSuperficie(int superficie) {
		if (superficie > MAX_SUPERFICIE || superficie < MIN_SUPERFICIE) {
			throw new IllegalArgumentException("Error: superficie nó válida: " + superficie);
		} else {
			this.superficie = superficie;
		}
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public LocalDate getFechaEntrada() {
		return fechaEntrada;
	}

}
