// Autor: Karim Zinnatullin
package Mascotas;

import java.time.LocalDate;

public class Canario extends Ave {
	private String color;
	private String canta;
	

	public Canario(String nombre, LocalDate fechaNac, String pico, String color, String canta) {
		super(nombre, fechaNac, pico);
		this.color = color;
		this.canta = canta;
		this.tipo = tipo.CANARIO;
		Inventario.agregarMascota(this);
	}
public String habla() {
	return this.canta;
}
public void volar() {
	super.volar();
}
 
@Override
public String muestra() {
	return "Tipo= Canario,"+super.muestra()+", color= " + color + ", canta= " + canta + "]";
}


}