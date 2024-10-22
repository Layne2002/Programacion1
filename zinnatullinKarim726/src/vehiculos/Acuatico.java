package vehiculos;

public class Acuatico extends Vehiculo {
	protected final int ESLORA;

	private final int MIN_ESLORA = 1;

	public Acuatico(String matricula, String modelo, int eslora) {
		super(matricula, modelo);
		if (!checkAcuatico(matricula)) {
			throw new IllegalArgumentException("La matricula no coincide con el fomarto");
		} else if (eslora < MIN_ESLORA) {
			throw new IllegalArgumentException("La eslora no puede medir 0 o menos");
		}

		this.ESLORA = eslora;
	}

	private boolean checkAcuatico(String matricula) {
		return matricula.matches("^[A-Z]{3,10}$");
	}

	@Override
	public String toString() {
		return super.toString() + ", eslora= " + ESLORA + " m";
	}
}
