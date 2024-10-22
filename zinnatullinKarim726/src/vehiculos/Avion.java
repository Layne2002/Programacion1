package vehiculos;

public final class Avion extends Aereo {
	private int tiempoVueloMax;
	private final int MIN_VUELO = 0;

	public Avion(String matricula, String modelo, int numAsientos, int tiempo) {
		super(matricula, modelo, numAsientos);
		if (tiempo < MIN_VUELO) {
			throw new IllegalArgumentException("El tiempo de vuelo no puede ser negativo");
		}
		this.tiempoVueloMax = tiempo;
	}

	@Override
	public String toString() {
		return super.toString() + ", tiempod de vuelo maximo= " + tiempoVueloMax + " horas";
	}

}
