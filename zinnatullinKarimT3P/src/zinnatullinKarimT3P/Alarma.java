// Autor: Karim Zinnatullin
package zinnatullinKarimT3P;

import java.time.LocalDate;

public final class Alarma extends Servicio {
	private int numSensores;
	private String modeloAlarma;
	private double obra;

	public Alarma(String cliente, LocalDate fecha, int numSensores, String modeloAlarma) {
		super("Manuel Fernández", cliente, fecha);
		this.numSensores = numSensores;
		this.modeloAlarma = modeloAlarma;
		this.obra = calcularObra(numSensores);
		this.importe = obra;
	}

	private static double calcularObra(int numSensores) {
		double sensores = (double)numSensores;
		return  ((sensores / 3) * 40);
	}

	@Override
	public String toString() {
		return super.toString()+", Tipo= Alarma, numSensores= " + numSensores + ", modeloAlarma= " + modeloAlarma ;
	}
}
