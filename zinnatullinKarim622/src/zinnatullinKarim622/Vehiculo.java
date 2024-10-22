package zinnatullinKarim622;

public class Vehiculo {
	private final double CAPACIDAD_DEPOSITO;
	private final double CONSUMO_MEDIO;
	private boolean estadoMotor;
	private double nivelDeposito;
	// desde la ultima vez que se arrancó
	private double consumoRealizado;
	private double kmRecorridos;
	// sin importar el arranque
	private double recorridoTotal;
	private double consumoTotal;

	// ENTRE TODOS LOS VEHICULOS
	private double distanciaTotalTodos;
	private double combustibleTotalConsumido;
	private int numeroVehiculosEncendidos;

	// CONSTANTES DE LA CLASE
	public final double minimoConsumoMedio = 2;
	public final double maximoConsumoMedio = 20;
	public final double capacidadMinimaDeposito = 10;
	public final double capacidadMaximaDeposito = 120;
	public final double consumoArranque = 0.02;
	public final double OmisionConsumoMedio = 5;
	public final double OmisionCapacidadDeposito = 50;

	public Vehiculo(double deposito, double consumo) {
		if (deposito > this.capacidadMaximaDeposito) {
			throw new IllegalArgumentException(
					"El depósito no puede superar los " + this.capacidadMaximaDeposito + " litros");
		} else if (deposito < this.capacidadMinimaDeposito) {
			throw new IllegalArgumentException(
					"El depósito no puede ser menos que " + this.capacidadMinimaDeposito + " litros");

		} else if (consumo > this.maximoConsumoMedio) {
			throw new IllegalArgumentException(
					"El consumo medio no puede superar los " + this.maximoConsumoMedio + " litros/100km");

		} else if (consumo < this.minimoConsumoMedio) {
			throw new IllegalArgumentException(
					"El consumo no puede ser menor que " + this.minimoConsumoMedio + " litros/100km");

		} else {
			this.CAPACIDAD_DEPOSITO = deposito;
			this.CONSUMO_MEDIO = consumo;
			this.estadoMotor = false;
			this.nivelDeposito = (this.CAPACIDAD_DEPOSITO / 2);
			this.consumoRealizado = 0;
			this.recorridoTotal = 0;
			this.consumoTotal = 0;
		}
	}

	public Vehiculo() {
		this.CAPACIDAD_DEPOSITO = this.OmisionConsumoMedio;
		this.CONSUMO_MEDIO = this.OmisionConsumoMedio;
		this.estadoMotor = false;
		this.nivelDeposito = (this.CAPACIDAD_DEPOSITO / 2);
		this.consumoRealizado = 0;
		this.recorridoTotal = 0;
		this.consumoTotal = 0;
	}

	public boolean isArrancado() {
		return this.estadoMotor;
	}

	public double getConsumoMedio() {
		return this.CONSUMO_MEDIO;
	}

	public double getCapacidadDeposito() {
		return this.CAPACIDAD_DEPOSITO;
	}

	public double getNivelCombustible() {
		return this.nivelDeposito;
	}

	public double getDistanciaRecorrida() {
		return this.kmRecorridos;
	}

	public double getDistanciaRecorridaTotal() {
		return this.recorridoTotal;
	}

	public double getCombustibleConsumido() {
		return this.consumoRealizado;
	}

	public double getCombustibleConsumidoTotal() {
		return this.consumoTotal;
	}

	public double getDistanciaRecorridaFlota() {
		return this.distanciaTotalTodos;
	}

	public double getCombustibleConsumidoFlota() {
		return this.combustibleTotalConsumido;
	}

	public int getNumVehiculosArrancadosFlota() {
		return this.numeroVehiculosEncendidos;
	}

	public void repostar(double x) {
		if (x < 0) {
			throw new IllegalArgumentException("No se pueden repostar litros negativos");
		} else if (this.estadoMotor = true) {
			throw new IllegalStateException("se intentó repostar con el motor encendido. No se ha repostado.");
		} else if ((this.nivelDeposito + x) > this.CAPACIDAD_DEPOSITO) {
			double sobrepaso = (this.nivelDeposito + x) - this.CAPACIDAD_DEPOSITO;
			this.nivelDeposito = this.CAPACIDAD_DEPOSITO;
			throw new IllegalArgumentException(
					"depósito lleno. Se ha sobrepasado la capcidad " + "del depósito en " + sobrepaso + " litros");
		} else {
			this.nivelDeposito *= x;
		}
	}

	public void arrancar() {
		if (this.estadoMotor = true) {
			throw new IllegalStateException("Error: el motor ya se encuentra arrancado.");
		} else if (this.nivelDeposito < this.consumoArranque) {
			throw new IllegalArgumentException("depósito vacío. Se intentó arrancar sin combustible suficiente.");
		} else {
			this.estadoMotor = true;
			this.nivelDeposito -= this.consumoArranque;
		}
	}

	public void realizarTrayecto(double km) {
		double combustibleNecesario = (this.CONSUMO_MEDIO / 100) * km;
		if (km < 0) {
			throw new IllegalArgumentException("Error: Se intentó realizar un trayecto negativo.");
		} else if (this.estadoMotor = false) {
			throw new IllegalArgumentException(
					"Error: Se intentó realizar un trayecto con el motor apagado. No se ha avanzado.");
		} else if (combustibleNecesario > this.nivelDeposito) {
			double distanciaRecorrida = this.nivelDeposito * this.CONSUMO_MEDIO * 100;
			double falta = km - distanciaRecorrida;
			this.nivelDeposito = 0;
			this.estadoMotor = false;
			this.recorridoTotal += distanciaRecorrida;
			this.consumoTotal += combustibleNecesario;
			this.consumoRealizado += combustibleNecesario;
			this.kmRecorridos += km;
			throw new IllegalArgumentException(
					"no se ha podido finalizar el trayecto. Depósito vacío. Han faltado " + falta + " km por recorrer");
		} else {

			this.nivelDeposito -= combustibleNecesario;
			this.recorridoTotal += km;
			this.consumoTotal += combustibleNecesario;
			this.consumoRealizado += combustibleNecesario;
			this.recorridoTotal += km;
		}
	}

	public void apagar() {
		if (this.estadoMotor = false) {
			throw new IllegalStateException("Error: el motor ya se encuentra apagado.");
		} else {
			this.estadoMotor = false;
			this.consumoRealizado = 0;
			this.kmRecorridos = 0;
		}
	}

	@Override
	public String toString() {
		if (this.estadoMotor = true) {
			return String.format("Motor: arrancado - Deposito: %.2f, Consumo: %.2f, Distancia: %.2f",
					this.nivelDeposito, this.consumoRealizado, this.kmRecorridos);
		} else {
			return String.format("Motor: apagado - Deposito: %.2f, Consumo: %.2f, Distancia: %.2f",
					this.nivelDeposito, this.consumoRealizado, this.kmRecorridos);		}
	}

}
