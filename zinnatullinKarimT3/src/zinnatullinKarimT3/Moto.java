// Autor: Karim Zinnatullin
package zinnatullinKarimT3;

public class Moto extends Vehiculo {
	private String modelo;
	private int espejos;
	private boolean casco;

	private static int contadorMotos = 0;
	private static final int MAX_MOTOS = 25;

	public Moto(String matricula, String dni, String telefono, String modelo, int espejos, boolean casco) {
		super(matricula, dni, telefono);
		if (contadorMotos == MAX_MOTOS) {
			throw new IllegalArgumentException("No hay más plazas para motos");
		}
		this.modelo = modelo;
		this.espejos = espejos;
		this.casco = casco;
		contadorMotos++;
	}

	public static boolean dispMoto() {
		if (contadorMotos < MAX_MOTOS) {
			return true;
		} else {
			return false;
		}
	}

	public static int calcularPlazasMoto() {
		return MAX_MOTOS - contadorMotos;
	}

	@Override
	public String toString() {
		if (casco == true) {
			return "Moto: " + super.toString() + " modelo= " + modelo + ", espejos= " + espejos + ", casco= SI";
		} else {
			return "Moto: " + super.toString() + " modelo= " + modelo + ", espejos= " + espejos + ", casco= NO";
		}
	}
}
