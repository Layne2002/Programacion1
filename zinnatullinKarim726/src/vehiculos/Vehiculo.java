package vehiculos;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehiculo {
	protected final String MATRICULA, MODELO;

	private static List<Vehiculo> Vehiculos = new ArrayList<>();

	protected Vehiculo(String matricula, String modelo) {
		this.MATRICULA = matricula;
		this.MODELO = modelo;

		Vehiculos.add(this);
	}

	protected String getMatricula() {
		return this.MATRICULA;
	}

	public static String mostrarVehiculos() {
		String cadena = "";
		for (Vehiculo x : Vehiculos) {
			cadena = cadena + x.getClass().getSimpleName() + ": " + x.toString() + "\n";
		}
		return cadena;
	}

	@Override
	public String toString() {
		return " Matricula= " + MATRICULA + ", Modelo= " + MODELO;
	}
}
