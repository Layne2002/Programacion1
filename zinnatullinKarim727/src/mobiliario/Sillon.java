package mobiliario;

public final class Sillon extends Asiento implements Ajustable {
	private int posicionPies; // 0 - bajado , 1 -subido
	private final static int POS_BAJADO = 0, POS_SUBIDO = 1;

	public Sillon(double precio, String descripcion, String tapiceria, String color) {
		super(precio, descripcion, Asiento.MIN_PLAZAS, tapiceria, color);
		this.posicionPies = POS_BAJADO;
	}

	public String toString() {
		if (this.posicionPies == POS_BAJADO)
			return super.toString() + "Psición actal de los pies: : bajada";
		else
			return super.toString() + "Psición actal de los pies: : subida";
	}

	public int obtenerPosicion() {
		return this.posicionPies;
	}

	public int subirPosicion() {
		if (this.posicionPies == POS_SUBIDO)
			throw new IllegalStateException("Error: no se pueden subir los pies del sillón. Ya están subidos");
		else {
			this.posicionPies = POS_SUBIDO;
			return this.posicionPies;
		}
	}

	public int bajarPosicion() {
		if (this.posicionPies == POS_BAJADO)
			throw new IllegalStateException("Error: no se pueden bajar los pies del sillón. Ya están bajados");
		else {
			this.posicionPies = POS_BAJADO;
			return this.posicionPies;
		}
	}
}
