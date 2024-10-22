package vehiculos;

public final class Coche extends Terrestre {
	private boolean aire;

	public Coche(String matricula, String modelo, int numRuedas, boolean aire) {
		super(matricula, modelo, numRuedas);
		this.aire = aire;
	}

	@Override
	public String toString() {
		if (this.aire == true)
			return super.toString() + ", aire acondicionado= SI";
		else
			return super.toString() + ", aire acondicionado= NO";
	}

}
