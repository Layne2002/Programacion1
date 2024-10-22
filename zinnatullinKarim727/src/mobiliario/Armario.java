package mobiliario;

public final class Armario extends Almacenaje implements Personalizable {
	private int numPuertas;
	public static final int MIN_PUERTAS = 1, MAX_PUERTAS = 6;

	public Armario(double precio, String descripcion, double anchura, double altura, int MAX_MODULOS_ANYADIR,
			int numeroPuertas) {
		super(precio, descripcion, anchura, altura, MAX_MODULOS_ANYADIR);
		if (numeroPuertas < MIN_PUERTAS || numeroPuertas > MAX_PUERTAS) {
			throw new IllegalArgumentException(
					"No se puede crear el Armario. El número de puertas no está en el rango permitido: "
							+ numeroPuertas);
		} else {
			this.numPuertas = numeroPuertas;
		}
	}

	public int getNumPuertas() {
		return this.numPuertas;
	}

	public String toString() {
		return super.toString() + " Número de puertas: " + this.numPuertas;
	}
}
