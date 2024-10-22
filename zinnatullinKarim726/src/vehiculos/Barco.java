package vehiculos;

public final class Barco extends Acuatico {
	private boolean motor;

	public Barco(String matricula, String modelo, int eslora, boolean motor) {
		super(matricula, modelo, eslora);
		this.motor = motor;
	}

	@Override
	public String toString() {
		if (motor == false)
			return super.toString() + ", motor= NO";
		else
			return super.toString() + ", motor= SI";
	}

}
