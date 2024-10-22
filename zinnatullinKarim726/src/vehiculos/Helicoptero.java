package vehiculos;

public final class Helicoptero extends Aereo {
	private int numHelices;
	private final int MIN_HELICES = 2;

	public Helicoptero(String matricula, String modelo, int numAsientos, int numHelices) {
		super(matricula, modelo, numAsientos);
		if (numHelices < MIN_HELICES) {
			throw new IllegalArgumentException("El número de helices no puede ser menor que 2");
		}
	}

	@Override
	public String toString() {
		return super.toString() + ", numero de helices= " + numHelices;
	}

}
