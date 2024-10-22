package Ej2;

public class Cafetera {

	private int capacidadMax;
	private int capacidadActual;

	public Cafetera() {
		this.capacidadActual = 0;
		this.capacidadMax = 1000;
	}

	public Cafetera(int capacidadMax) {
		this.capacidadActual = 0;
		this.capacidadMax = capacidadMax;
	}

	public Cafetera(int capacidadMax, int capacidadActual) {
		if (capacidadActual > capacidadMax) {
			int sobra = capacidadActual - capacidadMax;
			throw new IllegalArgumentException("Se ha intentado vertir " + sobra + " c.c. demás.");
		} else {
			this.capacidadActual = capacidadActual;
			this.capacidadMax = capacidadMax;
		}
	}

	public void llenarCafetera(int cantidad) {
		if ((cantidad) > capacidadMax) {
			double sobra = (cantidad) - capacidadMax;
			throw new IllegalArgumentException("Se ha intentado vertir " + sobra + " c.c. demás.");
		} else if (cantidad < 0) {
			throw new IllegalArgumentException("No se puede vertir cantidades negativas.");
		} else {
			this.capacidadActual = cantidad;
		}
	}

	public void servirTaza(int cantidad) {
		if (cantidad > this.capacidadActual) {
			int habia = this.capacidadActual;
			this.capacidadActual = 0;
			throw new IllegalArgumentException("No hubo cantidad de café suficiente. Se sirvió " + habia + " c.c.");
		} else {
			this.capacidadActual -= cantidad;
		}
	}

	public void vaciarCafetera() {
		this.capacidadActual = 0;
	}

	public void agregarCafe(int cantidad) {
		if ((cantidad + this.capacidadActual) > capacidadMax) {
			double sobra = (cantidad + this.capacidadActual) - capacidadMax;
			throw new IllegalArgumentException("Se ha intentado vertir " + sobra + " c.c. demás.");
		} else if (cantidad < 0) {
			throw new IllegalArgumentException("No se puede vertir cantidades negativas.");
		} else {
			this.capacidadActual *= cantidad;
		}
	}

	public void setCapacidadActual(int x) {
		if (x > this.capacidadMax) {
			throw new IllegalArgumentException(x + " supera el límit máximo de la cafetera");
		} else {
			this.capacidadActual = x;
		}
	}

	public void setCapacidadMax(int x) {
		if (x < this.capacidadActual) {
			this.capacidadActual = x;
			this.capacidadMax = x;
			throw new IllegalArgumentException(
					"No hubo suficiente capacidad máxima. Nueva capacidad máxima y actual: " + x);
		}
	}

	public int getCapacidadMax() {
		return this.capacidadMax;
	}

	public int getCapacidadActual() {
		return this.capacidadActual;
	}

	
	public String toString() {
		return "Cafetera [capacidadMax = " + this.capacidadMax + ", capacidadActual = " + this.capacidadActual + "]";
	}

}
