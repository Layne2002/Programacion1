package mobiliario;

public final class Estanteria extends Almacenaje implements Personalizable {
	private String tipoEstanteria;

	public Estanteria(double precio, String descripcion, double anchura, double altura, int MAX_MODULOS_ANYADIR,
			String tipoEstanteria) {
		super(precio, descripcion, anchura, altura, MAX_MODULOS_ANYADIR);
		this.tipoEstanteria = tipoEstanteria;
	}

	public String getTipo() {
		return tipoEstanteria;
	}

	public String toStreing() {
		return super.toString() + " Tipo: " + this.tipoEstanteria;
	}

	public void anyadirModulo(Modulo modulo) {
		if (modulo != Modulo.BALDA) {
			throw new IllegalArgumentException("Error: Para una estantería solo se admiten BALDAS");
		} else if (modulo == null) {
			throw new IllegalArgumentException("Error: el modulo no puede ser nulo");
		} else {
			super.anyadirModulo(modulo);
		}
	}
}
