package karimInmobiliaria;

import java.time.LocalDate;

public class Local extends Inmueble {
	public static enum tipoLocal {
		COMERCIAL, OFICINAS
	}

	private double distancia;
	private boolean alquilado;
	private double valor;

	public Local(int superficie, String propietario, LocalDate fechaEntrada, String direccion, double distancia,
			boolean alquilado, double valor) {
		super(superficie, propietario, fechaEntrada, direccion);
		if (distancia < 0) {
			throw new IllegalArgumentException("La distancia al centro no puede ser negativa");
		} else {
			this.distancia = distancia;
			this.alquilado = alquilado;
			if (alquilado == true) {
				if (distancia > 2) {
					this.valor = valor * 1.2 * 0.8;
				} else {
					this.valor = valor * 1.2;
				}
			} else {
				if (distancia > 2) {
					this.valor = valor * 0.8;
				} else {
					this.valor = valor;
				}
			}
		}
	}

	public Local() {
		super();
		this.distancia = 1.5;
		this.alquilado = false;
		this.valor = 200000;
	}

	public boolean isAlquilado() {
		return alquilado;
	}

	public void setAlquilado(boolean alquilado) {
		this.alquilado = alquilado;
	}

	public double getDistancia() {
		return distancia;
	}

	public double getValor() {
		return valor;
	}


	public String toString() {
		if (this.alquilado == true)
			return super.toString() + " distanciadel centro: " + distancia + "km, está alquilado, valor: " + valor
					+ " euros";
		else
			return super.toString() + " distanciadel centro: " + distancia + "km, no está alquilado, valor:" + valor
					+ " euros";
	}

}
