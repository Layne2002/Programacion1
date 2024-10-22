package vehiculos;

public class Terrestre extends Vehiculo {
	protected int NUM_RUEDAS;

	private final int MIN_RUEDAS = 1;

	public Terrestre(String matricula, String modelo, int numRuedas) {
		super(matricula, modelo);
		if (!checkTerrestre(matricula)) {
			throw new IllegalArgumentException("La matricula no coincide con el fomarto");
		} else if (numRuedas < MIN_RUEDAS) {
			throw new IllegalArgumentException("El número de ruedes debe ser al menos 1");
		}
		
		this.NUM_RUEDAS = numRuedas;
	}

	private boolean checkTerrestre(String matricula) {
		return matricula.matches("^[0-9]{4}[A-Z]{3}$");
	}
	public int getnumRuedas() {
		return this.NUM_RUEDAS;
	}
	@Override
	public String toString() {
		return super.toString()+", numero de ruedas:= " + NUM_RUEDAS;
	}
	
}
