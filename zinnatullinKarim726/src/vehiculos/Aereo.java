package vehiculos;

public class Aereo extends Vehiculo {
	protected final int NUM_ASIENTOS;

	private final int MIN_ASIENTOS = 0;

	public Aereo(String matricula, String modelo, int numAsientos) {
		super(matricula, modelo);
		if (!checkAereo(matricula)) {
			throw new IllegalArgumentException("La matricula no coincide con el fomarto");
		} else if (numAsientos < MIN_ASIENTOS) {
			throw new IllegalArgumentException("El numero de asientos no puede ser negativo");
		}
		this.NUM_ASIENTOS = numAsientos;
	}

	private boolean checkAereo(String matricula) {
		return matricula.matches("^[A-Z]{4}[0-9]{6}$");
	}

	@Override
	public String toString() {
		return super.toString() + ", numero de asientos= " + NUM_ASIENTOS;
	}

}
