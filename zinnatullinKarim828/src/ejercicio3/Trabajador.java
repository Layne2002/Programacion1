package ejercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Trabajador implements Comparable<Trabajador> {
	public enum Sexo {
		HOMBRE, MUJER
	}

	public enum Estado {
		SOLTERO, CASADO, DIVORCIADO
	}

	private String nombre;
	private int edad, salario;
	private Sexo sexo;
	private Estado estado;

	private static List<Trabajador> Trabajadores = new ArrayList<>();

	public Trabajador(String nombre, int edad, Sexo sexo, Estado estado, int salario) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.estado = estado;
		this.salario = salario;
		Trabajadores.add(this);

	}

	// sobreescribimos el compareTo especificamente para este objeto para que lo
	// haga de la manera que nosotros queremos
	@Override
	public int compareTo(Trabajador otro) {

		// esto compara por sexo
		int comparacionSexo = this.sexo.compareTo(otro.sexo);

		if (comparacionSexo == 0) { // esto ocurre solo si los sexos son iguales
			return this.estado.compareTo(otro.estado);
		} else { // si no son iguales, termina la comparacion
			return comparacionSexo;
		}
	}

	public static void mostrarTrabajadores() {
		Collections.sort(Trabajadores);
		for (Trabajador x : Trabajadores) {
			System.out.printf("%s\n", x.toString());
		}
	}

	public static int cantidadHombres() {
		int contador = 0;
		for (Trabajador x : Trabajadores) {
			if (x.getSexo().equals(Sexo.HOMBRE))
				contador++;
		}
		return contador;
	}

	public static int cantidadMujeresCasadas() {
		int contador = 0;
		for (Trabajador x : Trabajadores) {
			if (x.getSexo() == Sexo.MUJER) {
				if (x.getEstado() == Estado.CASADO) {
					contador++;
				}
			}
		}
		return contador;
	}

	public static int sumaSueldos() {
		int suma = 0;
		for (Trabajador x : Trabajadores) {
			suma += x.getSalario();
		}
		return suma;
	}

	public Estado getEstado() {
		return this.estado;
	}

	public Sexo getSexo() {
		return this.sexo;
	}

	public int getSalario() {
		return this.salario;
	}

	@Override
	public String toString() {
		return "Trabajador: nombre= " + nombre + ", edad= " + edad + ", salario= " + salario + ", sexo= " + sexo
				+ ", estado= " + estado;
	}

}
