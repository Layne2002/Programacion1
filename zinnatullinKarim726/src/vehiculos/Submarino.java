package vehiculos;

public final class Submarino extends Acuatico {
	private int profundidadMax;

	private final int PROFUNDIDAD_NEGATIVA = 0;

	public Submarino(String matricula, String modelo, int eslora, int profundidadMax) {
		super(matricula, modelo, eslora);
		if (profundidadMax < PROFUNDIDAD_NEGATIVA) {
			throw new IllegalArgumentException("La profundidad negativa es un número positivo");
		}
		this.profundidadMax = profundidadMax;
	}

	@Override
	public String toString() {
		return super.toString() + ", profundidadMax= " + profundidadMax;
	}

}
