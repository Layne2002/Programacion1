package Ejercicio1;

public class Ciudadano extends Humano {
	protected String Documento;

	public Ciudadano(String nombre, String apellido, String documento) {
		super.nombre = nombre;
		super.apellido = apellido;
		this.Documento = documento;
	}

	public String Identificacion() {
		return (super.getNombreCompleto() + " , "+this.Documento);
	}
}
