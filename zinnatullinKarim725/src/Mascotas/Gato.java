// Autor: Karim Zinnatullin
package Mascotas;

import java.time.LocalDate;

public class Gato extends Mascota {
	private String color;
	private boolean peloLargo;

	public Gato(String nombre,  LocalDate fechaNac, String color, boolean peloLargo) {
		super(nombre, fechaNac);
		this.color = color;
		this.peloLargo = peloLargo;
		this.tipo = tipo.GATO;
		Inventario.agregarMascota(this);
	}

	public String getColor() {
		return color;
	}

	public boolean isPeloLargo() {
		return peloLargo;
	}

	@Override
	public String muestra() {
		if (this.peloLargo == true)
			return "Tipo= Gato" + super.muestra() + ", color= " + color + ", peloLargo= SI";
		else
			return "Tipo= Gato" + super.muestra() + ", color= " + color + ", peloLargo= NO";

	}

}
