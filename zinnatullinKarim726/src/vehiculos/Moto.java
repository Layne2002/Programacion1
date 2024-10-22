package vehiculos;

public final class Moto extends Terrestre {
	private String color;

	public Moto(String matricula, String modelo, int numRuedas, String color) {
		super(matricula, modelo, numRuedas);
		this.color = color;
	}

	@Override
	public String toString() {
		return super.toString() + ", color= " + color;
	}

}
