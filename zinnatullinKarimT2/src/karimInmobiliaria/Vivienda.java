package karimInmobiliaria;

import java.time.LocalDate;

public class Vivienda extends Inmueble {
	public static enum tipoVivienda {
		CASA,APARTAMENTO
	}

	private int numHabitaciones, numBanyos;
	private LocalDate fechaConstruccion;
	private double valorM2, valorVenta;
	private tipoVivienda tipoVivienda;

	public Vivienda(int superficie, String propietario, LocalDate fechaEntrada, String direccion, tipoVivienda tipo,
			int numHabitaciones, int numBanyos, LocalDate fechaContruccion, double valorM2) {
		super(superficie, propietario, fechaEntrada, direccion);
		if (numHabitaciones < 0 || numBanyos < 0) {
			throw new IllegalArgumentException("Error: no puede haber habitaciones o baños negativos");
		} else if (tipo == null) {
			throw new IllegalArgumentException("Error: hay que asignar el tipo de vivienda");
		} else if (fechaConstruccion.isAfter(LocalDate.now())) {
			throw new IllegalArgumentException("Error: la fecha de construccion no puede ser posterior a hoy");
		} else if (fechaContruccion.isBefore(LocalDate.of(2000, 1, 1))) {
			this.valorM2 = valorM2;
			this.tipoVivienda = tipo;
			this.numHabitaciones = numHabitaciones;
			this.numBanyos = numBanyos;
			this.fechaConstruccion = fechaConstruccion;
			this.valorVenta = (double) (valorM2 * superficie * 0.6);
		} else {
			this.valorM2 = valorM2;
			this.tipoVivienda = tipo;
			this.numHabitaciones = numHabitaciones;
			this.numBanyos = numBanyos;
			this.fechaConstruccion = fechaConstruccion;
			this.valorVenta = (double) (valorM2 * superficie);
		}
	}

	public Vivienda() {
		super();
		this.valorM2 = 1500;
		this.tipoVivienda = tipoVivienda.APARTAMENTO;
		this.numHabitaciones = 1;
		this.numBanyos = 1;
		this.fechaConstruccion = LocalDate.now();
		this.valorVenta = (double) (this.valorM2 * this.superficie);
	}
	public Vivienda(tipoVivienda tipo) {
		super();
		if(tipo == tipoVivienda.CASA) {
			this.tipoVivienda = tipoVivienda.CASA;
		}else {
			this.tipoVivienda = tipoVivienda.APARTAMENTO;
		}
		this.valorM2 = 1500;
		this.numHabitaciones = 1;
		this.numBanyos = 1;
		this.fechaConstruccion = LocalDate.now();
		this.valorVenta = (double) (this.valorM2 * this.superficie);
		
	}
	public int getNumHabitaciones() {
		return numHabitaciones;
	}

	public void setNumHabitaciones(int numHabitaciones) {
		if (numHabitaciones < 0) {
			throw new IllegalArgumentException("Error: no puede haber habitaciones o baños negativos");
		} else {
			this.numHabitaciones = numHabitaciones;
		}
	}

	public int getNumBanyos() {
		return numBanyos;
	}

	public void setNumBanyos(int numBanyos) {
		if (numHabitaciones < 0) {
			throw new IllegalArgumentException("Error: no puede haber habitaciones o baños negativos");
		} else {
			this.numBanyos = numBanyos;
		}
	}

	public double getValorM2() {
		return valorM2;
	}

	public void setValorM2(double valorM2) {
		this.valorM2 = valorM2;
	}

	public LocalDate getFechaConstruccion() {
		return fechaConstruccion;
	}

	public double getValorVenta() {
		return valorVenta;
	}

	public tipoVivienda getTipoVivienda() {
		return tipoVivienda;
	}

	public String toString() {
		return super.toString() + " \nNumero de habitaciones=" + numHabitaciones + ", numero de Baños=" + numBanyos
				+ ", fechaConstruccion=" + fechaConstruccion + ", valor de venta:" + valorVenta + ", tipo de vivienda: "
				+ tipoVivienda;
	}

}
