package mobiliario;

public class Asiento extends Mueble {
	public final int NUM_PLAZAS;
	public final String TAPICERIA;;
	public final String COLOR;

	// atributos privados
	protected static final int MIN_PLAZAS = 1;
	protected static final int MAX_PLAZAS = 9;

	protected Asiento(double precio, String descripcion, int numPlazas, String tapiceria, String color) {
		super(precio, descripcion);
		if (numPlazas < MIN_PLAZAS || numPlazas > MAX_PLAZAS) {
			String cadena = String.format("El número de plazas no está en el rango permitido: %d", numPlazas);
			throw new IllegalArgumentException(cadena);
		} else {
			this.NUM_PLAZAS = numPlazas;
			this.TAPICERIA = tapiceria;
			this.COLOR = color;
		}
	}

	// GETTERS
	public int getNumPlazas() {
		return NUM_PLAZAS;
	}

	public String getTapiceria() {
		return TAPICERIA;
	}

	public String getColor() {
		return COLOR;
	}

	public String toString() {
		return super.toString() + " Tapicería: " + TAPICERIA + " Color: " + COLOR + " Número de plazas: " + NUM_PLAZAS;
	}

}
