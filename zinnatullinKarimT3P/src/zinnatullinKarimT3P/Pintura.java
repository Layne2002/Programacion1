// Autor: Karim Zinnatullin
package zinnatullinKarimT3P;

import java.time.LocalDate;

public final class Pintura extends Servicio {
	private double superficie, material, obra;
	private final double MIN_SUPERFICIE = 1;

	public Pintura(String trabajador, String cliente, LocalDate fecha, double superficie, double precioPintura) {
		super(trabajador, cliente, fecha);
		if (superficie < MIN_SUPERFICIE) {
			throw new IllegalArgumentException("La superficie no puede ser 0 o menos");
		}
		this.superficie = superficie;
		this.material = calcularMaterial(superficie, precioPintura);
		this.obra = calcularObra(superficie);
		this.importe = this.material + this.obra;
	}

	private double calcularMaterial(double superficie, double precioPintura) {
		double resultado;
		resultado = superficie * 7.8 * precioPintura;
		return resultado;
	}

	private double calcularObra(double superficie) {
		double resultado;
		if (superficie >= 50) {
			resultado = (superficie / 10) * 7.5;
		} else {
			resultado = (superficie / 10) * 7.5;
			resultado = resultado * 1.15;
		}
		return resultado;
	}

	@Override
	public String toString() {
		return super.toString()+", tipo= Pintura, superficie= " + superficie;
	}
}
