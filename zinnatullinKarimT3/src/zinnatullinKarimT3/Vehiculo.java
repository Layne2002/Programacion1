// Autor: Karim Zinnatullin
package zinnatullinKarimT3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Vehiculo implements Comparable<Vehiculo> {
	protected String matricula, dni, telefono;
	protected double alquiler;
	private static List<Vehiculo> Vehiculos = new ArrayList<>();

	protected Vehiculo(String matricula, String dni, String telefono) {
		this.matricula = matricula;
		this.dni = dni;
		this.telefono = telefono;
		Vehiculos.add(this);
	}

	public static List<Vehiculo> getListVehiculos() {
		return Vehiculos;
	}

	@Override
	public int compareTo(Vehiculo otro) {
		int comparacionMatricula = this.matricula.compareTo(otro.matricula);
		if (comparacionMatricula == 0) {
			return this.matricula.compareTo(otro.matricula);
		} else {
			return comparacionMatricula;
		}
	}

	public String getMatricula() {
		return matricula;
	}

	public static String buscarVehiculoMatricula(String matricula) {
		String cadena = "No hay un vehículo estacionado con la matricula " + matricula;
		for (Vehiculo x : Vehiculos) {
			if (x.getMatricula().equalsIgnoreCase(matricula)) {
				cadena = x.toString();
			}
		}
		return cadena;

	}

	public void calcularAlquiler(double dias) {
		if (this.getClass().getSimpleName().equals("Coche")) {
			double calculo;
			if (dias < 30) {
				calculo = 3 * dias;
			} else if (dias < 60) {
				calculo = 2.5 * dias;
			} else {
				calculo = 2 * dias;
			}
			this.alquiler = calculo;
		} else {
			double calculo;
			if (dias < 30) {
				calculo = 1.5 * dias;
			} else if (dias < 90) {
				calculo = 1 * dias;
			} else {
				calculo = 0.5 * dias;
			}
			this.alquiler = calculo;
		}
	}

	private static boolean comprobarMatricula(String matricula) {
		boolean bool = false;
		for (Vehiculo x : Vehiculos) {
			if (x.getMatricula().equalsIgnoreCase(matricula)) {
				bool = true;
			}
		}
		return bool;
	}

	public static Vehiculo getVehiculo(String matricula) {
		if (!comprobarMatricula(matricula)) {
			throw new IllegalArgumentException("no hay un vehiculo con la matricula " + matricula);
		}
		Vehiculo vehiculo = null;
		for (Vehiculo x : Vehiculos) {
			if (x.getMatricula().equalsIgnoreCase(matricula)) {
				vehiculo = x;
			}
		}
		return vehiculo;
	}

	public static void eliminarVehiculoMatricula(String matricula) {
		if (!comprobarMatricula(matricula)) {
			throw new IllegalArgumentException("no hay un vehiculo con la matricula " + matricula);
		}
		Vehiculo vehiculo = null;
		boolean esCoche=false;
		
		Iterator<Vehiculo> vehiculoIterator = Vehiculos.iterator();
        while (vehiculoIterator.hasNext()) {
            Vehiculo x = vehiculoIterator.next();
            if (x.getMatricula().equalsIgnoreCase(matricula)) {
                if (x.getClass().getSimpleName().equals("Coche")) {
                    esCoche = true;
                }
                vehiculo = x;
                System.out.printf("%s\n",vehiculo.toString());
                vehiculoIterator.remove(); 
                break; 
            }
        }
		if(esCoche==true) {
		Coche.eliminarCoche(matricula);
		}
	}

	@Override
	public String toString() {
		return " Alquiler= " + alquiler + ", matricula= " + matricula + ", dni= " + dni + ", telefono= " + telefono;
	}

}
