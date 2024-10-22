package mobiliario;

public final class Silla extends Asiento implements Ajustable {
	private int posicionRespaldo;

	// Atributos constantes
	public static final int MIN_POSICION = 1;
	public static final int MAX_POSICION = 4;

	public Silla(double precio, String descripcion, String tapiceria, String color) {
		super(precio, descripcion, Asiento.MIN_PLAZAS, tapiceria, color);
		if (posicionRespaldo < MIN_POSICION || posicionRespaldo > MAX_POSICION) {
			String cadena = String.format("La posicion del respaldo no está en el rango permitido: %d",
					posicionRespaldo);
			throw new IllegalArgumentException(cadena);
		} else
			this.posicionRespaldo = MIN_POSICION;
	}

	public String toString() {
		return super.toString() + "Psición actal del respaldo: " + this.posicionRespaldo;
	}

	public int obtenerPosicion() {
		return this.posicionRespaldo;
	}

	public int subirPosicion() {
		if (this.posicionRespaldo < MAX_POSICION) {
			this.posicionRespaldo++;
			return this.posicionRespaldo;
		} else {
			throw new IllegalStateException("Error: no se puede subir a la posición " + (this.obtenerPosicion() + 1)
					+ ", ya que la posición máxima es " + MAX_POSICION);
		}
	}

	public int bajarPosicion() {
		if (this.posicionRespaldo > MIN_POSICION) {
			this.posicionRespaldo--;
			return this.posicionRespaldo;
		} else {
			throw new IllegalStateException("Error: no se puede bajar a la posición " + (this.obtenerPosicion() - 1)
					+ ",  ya que la posición mínima es " + MIN_POSICION);
		}
	}
}
