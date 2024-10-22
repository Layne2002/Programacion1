package Ejercicio2;

public class Deportivo extends Coche {
	protected int traccion;
	// Traccion 0 = total
	// Traccion 1 = delantera

	public Deportivo(int traccion) {
		super();
		if (traccion == 0 || traccion == 1) {
			this.traccion = traccion;
		} else {
			throw new IllegalArgumentException("La traccion debe ser un 0 (total) o 1 (delantera)");
		}
	}

	public int getTraccion() {
		return traccion;
	}

	public void setTraccion(int traccion) {
		if (traccion == 0 || traccion == 1) {
			this.traccion = traccion;
		} else {
			throw new IllegalArgumentException("La traccion debe ser un 0 (total) o 1 (delantera)");
		}
	}

	@Override
	public String toString() {
		return "Deportivo [traccion= " + traccion + ", matricula= " + matricula + ", propietario= " + propietario
				+ ", fechaMatriculacion= " + fechaMatriculacion + ", cilindrada= " + cilindrada + ", potencia= "
				+ potencia + "]";
	}

}
