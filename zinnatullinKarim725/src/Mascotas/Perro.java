// Autor: Karim Zinnatullin
package Mascotas;

import java.time.LocalDate;

public class Perro extends Mascota{
private String raza;
private boolean pulgas;
public Perro(String nombre, LocalDate fechaNac,String raza,boolean pulgas) {
	super(nombre,  fechaNac);
	this.raza = raza;
	this.pulgas = pulgas;
	this.tipo = tipo.PERRO;
	Inventario.agregarMascota(this);
}

public void lavarPulgas() {
	if(this.pulgas == false)
		throw new IllegalArgumentException(this.getNombre()+" no tiene pulgas");
	else
		this.pulgas = false;
}
public String getRaza() {
	return this.raza;
}
public boolean tienePulgas() {
	return this.pulgas;
}
public String habla() {
	return "GUAU GUAU GUAU";
}

@Override
public String muestra() {
	if(this.pulgas == true)
	return "Tipo= Perro,"+super.muestra()+", raza= " + raza + ", pulgas= SI";
	else
		return "Tipo= Perro,"+super.muestra()+", raza= " + raza + ", pulgas= NO";
}

}
