// Autor: Karim Zinnatullin
package Mascotas;

import java.time.LocalDate;

public class Loro extends Ave {
	private String origen;
	private String habla;

	public Loro(String nombre, LocalDate fechaNac, String pico, String origen, String habla) {
		super(nombre, fechaNac,pico);
		this.origen = origen;
		this.habla = habla;
		this.tipo = tipo.LORO;
		Inventario.agregarMascota(this);
	}
public String habla() {
	return this.habla;
}

public void volar() {
	super.volar();
}

@Override
public String muestra() {
	return "Tipo= Loro"+super.muestra()+", origen= " + origen + ", habla= " + habla + "]";
}

}
