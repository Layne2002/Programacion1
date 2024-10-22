package Ejercicio3;

import java.time.LocalDate;

public class PAS extends Personal {
	public enum nivelIdioma {
		NULO, BASICO, INTERMEDIO, NATIVO
	}

	protected nivelIdioma aleman;
	protected nivelIdioma chino;
	protected nivelIdioma ingles;
	protected String areaAtencion;

	public PAS(String dni, String nombre, String apellidos, LocalDate fechaNac, Genero genero, double salario,
			String telefono, String email, nivelIdioma aleman, nivelIdioma chino, nivelIdioma ingles,
			String areaAtencion) {
		super();
		this.aleman = aleman;
		this.chino = chino;
		this.ingles = ingles;
		this.areaAtencion = areaAtencion;

	}

	public nivelIdioma getAleman() {
		return aleman;
	}

	public void setAleman(nivelIdioma aleman) {
		this.aleman = aleman;
	}

	public nivelIdioma getChino() {
		return chino;
	}

	public void setChino(nivelIdioma chino) {
		this.chino = chino;
	}

	public nivelIdioma getIngles() {
		return ingles;
	}

	public void setIngles(nivelIdioma ingles) {
		this.ingles = ingles;
	}

	public String getAreaAtencion() {
		return areaAtencion;
	}

	public void setAreaAtencion(String areaAtencion) {
		this.areaAtencion = areaAtencion;
	}

	public int numIdiomas() {
		int contador = 0;
		if (this.aleman != nivelIdioma.NULO)
			contador++;
		if (this.chino != nivelIdioma.NULO)
			contador++;
		if (this.ingles != nivelIdioma.NULO)
			contador++;
		return contador;
	}

	
	public String toString() {
		return "PAS [alemán= " + aleman + ", chino= " + chino + ", ingles= " + ingles + ", área de atencion= "
				+ areaAtencion + ", DNI= " + dni + ", \nnombre= " + nombre + ", apellidos= " + apellidos
				+ ", fecha de nacimiento= " + fechaNac + ", género= " + genero + ", \nsalario= " + salario + ", teléfono= "
				+ telefono + ", email= " + email + "]";
	}

}
