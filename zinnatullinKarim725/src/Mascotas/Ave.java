// Autor: Karim Zinnatullin
package Mascotas;

import java.time.LocalDate;

public abstract class Ave extends Mascota {
	protected String pico;
	protected boolean vuela;

	protected Ave(String nombre,  LocalDate fechaNac, String pico) {
		super(nombre, fechaNac);
		this.pico = pico;
		this.vuela = false;
	}

	public void volar() {
		if (this.vuela == false)
			this.vuela = true;
		else
			this.vuela = true;
	}
	public boolean getVuela() {
		return this.vuela;
	}
}
