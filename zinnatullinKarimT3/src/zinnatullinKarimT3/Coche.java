// Autor: Karim Zinnatullin
package zinnatullinKarimT3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Coche extends Vehiculo {
	public enum Estado {
		NUEVO, DAÑADO_PARCIAL, DAÑADO
	}

	private String modelo;
	private int km;
	private Estado estado;

	private static int contadorCoches = 0;

	private static List<Coche> Coches = new ArrayList<>();
	private static final int MAX_COCHES = 100;
	private static final int MIN_KM = 0;

	public Coche(String matricula, String dni, String telefono, String modelo, int km, Estado estado) {
		super(matricula, dni, telefono);
		if (contadorCoches == MAX_COCHES) {
			throw new IllegalArgumentException("No hay más plazas para coches");
		}
		if (km < MIN_KM) {
			throw new IllegalArgumentException("Los km recorridos no pueden ser negativos");
		}
		this.modelo = modelo;
		this.km = km;
		this.estado = estado;
		Coches.add(this);
		contadorCoches++;
	}

	public Estado getEstado() {
		return estado;
	}

	public static boolean dispCoche() {
		if (contadorCoches < MAX_COCHES) {
			return true;
		} else {
			return false;
		}
	}

	public static void eliminarCoche(String matricula) {
		Iterator<Coche> cocheIterator = Coches.iterator();
		while (cocheIterator.hasNext()) {
			Coche x = cocheIterator.next();
			if (x.getMatricula().equalsIgnoreCase(matricula)) {
				cocheIterator.remove();
				break;
			}
		}
	}

	public static void mostrarCochesNuevos() {
		for (Coche x : Coches) {
			if (x.getEstado() == Estado.NUEVO)
				System.out.printf("%s\n", x.toString());
		}

	}

	public static int calcularPlazasCoche() {
		return MAX_COCHES - contadorCoches;
	}

	@Override
	public String toString() {
		return "Coche: " + super.toString() + ", modelo= " + modelo + ", km= " + km + ", estado= " + estado;
	}

}
