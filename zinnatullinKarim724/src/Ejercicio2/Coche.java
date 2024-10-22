package Ejercicio2;

import java.time.LocalDate;

public class Coche {
	protected String matricula;
	protected String propietario;
	protected LocalDate fechaMatriculacion;
	protected int cilindrada;
	protected int potencia;

	public Coche() {
		this.cilindrada = 2000;
		this.potencia = 150;
		this.matricula = "Sin matricula";
		this.propietario = "Sin dueño";
	}

	public Coche(int cilindrada, int potencia) {
		if (cilindrada < 0 || potencia < 0) {
			throw new IllegalArgumentException("La cilindrada o potencia no pueden ser negativos");
		} else {
			this.cilindrada = cilindrada;
			this.potencia = potencia;
			this.matricula = "Sin matricula";
			this.propietario = "Sin dueño";
		}
	}



	public void setMatricula(String matricula) {
		if (comprobarMatricula(matricula) == false) {
			throw new IllegalArgumentException("La matricula no coincide con el patron 9999AAA");
		} else {
			this.matricula = matricula;
			this.fechaMatriculacion = LocalDate.now();
		}
	}

	public String getMatricula() {
		return this.matricula;
	}

	public void setPropietario(String propietario) {
		if (propietario == null) {
			throw new NullPointerException("El propietario no puede ser nulo");
		} else if (propietario.isEmpty()) {
			throw new IllegalArgumentException("El propietario no puede ser vacío");
		} else {
			this.propietario = propietario;
		}
	}

	public String getPropietario() {
		return this.propietario;
	}

	public void setCilindrada(int cilindrada) {
		if (cilindrada < 0) {
			throw new IllegalArgumentException("La cilindrada no pueden ser negativos");
		} else {
			this.cilindrada = cilindrada;
		}
	}

	public int getCilindrada() {
		return this.cilindrada;
	}

	public void setPotencia(int potencia) {
		if (potencia < 0) {
			throw new IllegalArgumentException("La potencia no pueden ser negativos");
		} else {
			this.potencia = potencia;
		}
	}

	public int getPotencia() {
		return this.potencia;
	}

	public LocalDate getFechaMatriculacion() {
		return this.fechaMatriculacion;
	}

	private boolean comprobarMatricula(String matricula) {
		return matricula.matches("^[0-9]{4}[A-Z]{3}$");
	}

	public String toString() {
		return "Coche [matricula= " + matricula + ", propietario= " + propietario + ", fechaMatriculacion= "
				+ fechaMatriculacion + ", cilindrada= " + cilindrada + ", potencia= " + potencia + "]";
	}

}
