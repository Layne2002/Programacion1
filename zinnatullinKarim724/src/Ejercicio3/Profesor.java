package Ejercicio3;

import java.time.LocalDate;

public class Profesor extends Personal {
	protected String titulacion, asignatura1, asignatura2, tutor;
	protected int anyosExperiencia;

	public Profesor() {
		super();
		this.titulacion = "Carrera universitaria";
		this.asignatura1 = "matematicas";
		this.asignatura2 = "Lengua";
		this.tutor = "No";
		this.anyosExperiencia = 0;
	}

	public Profesor(String dni, String nombre, String apellidos, LocalDate fechaNac, Genero genero, double salario,
			String telefono, String email, String titulacion, String asignatura1, String asignatura2, String tutor,
			int anyosExperiencia) {
		super();
		if (anyosExperiencia < 0) {
			throw new IllegalArgumentException("Los años de experiencia no pueden ser menor que 0");
		} else {
			this.titulacion = titulacion;
			this.asignatura1 = asignatura1;
			this.asignatura2 = asignatura2;
			this.tutor = tutor;
			this.anyosExperiencia = anyosExperiencia;
		}

	}

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public String getAsignatura1() {
		return asignatura1;
	}

	public void setAsignatura1(String asignatura1) {
		this.asignatura1 = asignatura1;
	}

	public String getAsignatura2() {
		return asignatura2;
	}

	public void setAsignatura2(String asignatura2) {
		this.asignatura2 = asignatura2;
	}

	public String getTutor() {
		return tutor;
	}

	public void setTutor(String tutor) {
		this.tutor = tutor;
	}

	public int getAnyosExperiencia() {
		return anyosExperiencia;
	}

	public void setAnyosExperiencia(int anyosExperiencia) {
		if (anyosExperiencia < 0) {
			throw new IllegalArgumentException("Los años de experiencia no pueden ser menor que 0");
		} else {
			this.anyosExperiencia = anyosExperiencia;
		}
	}

	public String toString() {
		return "Profesor [titulacion= " + titulacion + ", asignatura 1= " + asignatura1 + ", asignatura 2= " + asignatura2
				+ ", tutor= " + tutor + ", \naños de experiencia= " + anyosExperiencia + ", DNI= " + dni + ", nombre= "
				+ nombre + ", apellidos= " + apellidos + ", \nfecha de nacimiento= " + fechaNac + ", género= " + genero
				+ ", salario= " + salario + ", teléfono= " + telefono + ", email= " + email + "]";
	}

	public void aumentarSalario() {
		if (this.anyosExperiencia >= 5) {
			this.salario *= 1.05;
		} else if (this.anyosExperiencia >= 3) {
			this.salario *= 1.02;
		} else if (this.anyosExperiencia >= 1) {
			this.salario *= 1.01;
		} else {
			throw new IllegalArgumentException("los años de experiencia no son suficientes para un aumento de salario");
		}
	}

}
