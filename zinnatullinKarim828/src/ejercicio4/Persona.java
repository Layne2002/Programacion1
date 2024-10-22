package ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Persona {
	public enum Sexo {
		HOMBRE, MUJER
	}

	public enum Estado {
		SOLTERO, CASADO, DIVORCIADO, VIUDO
	}

	private String nombre;
	private int edad;
	private Sexo sexo;
	private Estado estado;
	private static List<Persona> Censo = new ArrayList<>();

	public Persona(String nombre, Sexo sexo, Estado estado, int edad) {
		this.nombre = nombre;
		this.sexo = sexo;
		this.estado = estado;
		this.edad = edad;
		Censo.add(this);
	}

	public Sexo getSexo() {
		return this.sexo;
	}

	public int getEdad() {
		return edad;
	}

	public static int cantidadSexoEstado(Sexo sexo, Estado estado) {
		int contador = 0;
		for (Persona x : Censo) {
			if (x.getEstado() == estado) {
				if (x.getSexo() == sexo) {

					contador++;
				}
			}
		}
		return contador;
	}

	public static int contidadEdad(int rango) {
		if (rango % 10 != 0 && rango != 0) {
			throw new IllegalArgumentException("El rango de edad debe ser multiplo de 10 o 0");
		} else if (rango < 0) {
			throw new IllegalArgumentException("El rango de edad no puede ser negativo");
		}
		int contador = 0;
		for (Persona x : Censo) {
			if (x.getEdad() >= rango && x.getEdad() < (rango + 10)) {
				contador++;
			}
		}
		return contador;
	}

	public static int cantidadEstado(Estado estado) {
		int contador = 0;
		for (Persona x : Censo) {
			if (x.getEstado() == estado) {
				contador++;
			}
		}
		return contador;
	}

	private Estado getEstado() {
		return this.estado;
	}

	public static int cantidadSexo(Sexo sexo1) {
		int contador = 0;
		for (Persona x : Censo) {
			if (x.getSexo() ==sexo1) {
				contador++;
			}
		}
		return contador;
	}
}
