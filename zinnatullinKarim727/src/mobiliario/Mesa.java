package mobiliario;

public final class Mesa extends Mueble {
	private String forma;
	private int numComensales;

	public static final int MIN_COMENSALES = 4, MAX_COMENSALES = 16;

	public Mesa(double precio, String descripcion, String forma, int numComensales) {
		super(precio, descripcion);
		if (numComensales < MIN_COMENSALES || numComensales > MAX_COMENSALES) {
			throw new IllegalArgumentException("Error: número de comensales no válido: " + numComensales);
		} else {
			this.forma = forma;
			this.numComensales = numComensales;
		}
	}

	public String getForma() {
		return this.forma;
	}

	public int getComensales() {
		return this.numComensales;
	}

	public String toString() {
		return super.toString() + " Forma: " + this.forma + " N.Comensales: " + this.numComensales;
	}
}
