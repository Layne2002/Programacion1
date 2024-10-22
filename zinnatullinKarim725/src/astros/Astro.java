// Autor: Karim Zinnatullin
package astros;

import java.util.ArrayList;
import java.util.List;

public abstract class Astro {
	protected String nombre;
	protected double masa1;
	protected int masa2, diametro2, distancia2, periodoTraslacion, periodoRotacion;
	protected double diametro1, distancia1, gravedad;
	// dos masas para expresar en notacion científica, en kilogramos
	// en m/s^2
	// si la masa2,diametro2 o distancia2 valen 0, no se usará la notacion cientifica
	protected static List<Astro> Astros = new ArrayList<>();
	

	protected Astro(String nombre, double masa1, int masa2, double diametro1, int diametro2, int periodoRotacion,
			int periodoTraslacion, double distancia1, int distancia2, double gravedad) throws IllegalArgumentException {
		if (masa1 < 0) {
			throw new IllegalArgumentException("No se puede tener masa negativa en un cuerpo");
		} else if (diametro1 < 0) {
			throw new IllegalArgumentException("Nomse puede tener duametro medio negativa en un cuerpo");
		} else if (periodoTraslacion < 0) {
			throw new IllegalArgumentException("No se puede tener un periodo de translación negativo en un cuerpo");
		} else if (distancia1 < 0) {
			throw new IllegalArgumentException("No se puede tener una distancia media negativa en un cuerpo");
		}

		this.nombre = nombre;
		this.masa1 = masa1;
		this.masa2 = masa2;
		this.diametro1 = diametro1;
		this.diametro2 = diametro2;
		this.periodoRotacion = periodoRotacion;
		this.periodoTraslacion = periodoTraslacion;
		this.distancia1 = distancia1;
		this.distancia2 = distancia2;
		this.gravedad = gravedad;

	}

public  String getNombre() {
	return this.nombre;
}

// estos 3 metodos se usarán para el toString de la clase, mostrando notacion cientifica si se usa
private String calcularMasa() {
	if(this.masa2 == 0) {
		return String.format("%.2f",this.masa1);
	}else {
		return String.format("%.2f x 10^%d",this.masa1,this.masa2);
	}
}
private String calcularDiametro() {
	if(this.diametro2 == 0) {
		return String.format("%.2f",this.diametro1);
	}else {
		return String.format("%.2f x 10^%d",this.diametro1,this.diametro2);
	}
}
private String calcularDistancia() {
	if(this.distancia2 == 0) {
		return String.format("%.2f",this.distancia1);
	}else {
		return String.format("%.2f x 10^%d",this.distancia1,this.distancia2);
	}
}
public static String getAllAstros() {
	String cadena="";
	for (Astro astro : Astros) {
		cadena=cadena+String.format("  "+astro.getNombre());
	}
	cadena += "\n";
	return cadena;
}
public static String getInfoAstros() {
	String cadena="";
	for (Astro astro : Astros) {
		cadena=cadena+String.format("  "+astro.muestra()+"\n");
	}
	cadena += "\n";
	return cadena;
}
public String muestra() {
	return "Nombre= " + nombre + ", masa= " + this.calcularMasa() + " kg, diametroMedio= "  + this.calcularDiametro() + "km, periodoRotacion= "
			+ periodoRotacion + " horas, \nperiodoTraslacion= " + periodoTraslacion + " dias, distanciaMedia= " + this.calcularDistancia()
			+ "km, \ngravedad= "+ gravedad + "m/s^2.";
}
}

