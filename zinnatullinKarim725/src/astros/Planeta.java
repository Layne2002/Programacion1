// Autor: Karim Zinnatullin
package astros;

import java.util.ArrayList;
import java.util.List;

public class Planeta extends Astro {
	private double distanciaSol1;
	private int distanciaSol2;
	private boolean orbitaSol;
	private boolean tieneSatelite;
	private static List<Planeta> Planetas = new ArrayList<>();

	public Planeta(String nombre, double masa1, int masa2, double diametro1, int diametro2, int periodoRotacion,
			int periodoTraslacion, double distancia1, int distancia2, double gravedad, double distanciaSol1,
			int distanciaSol2, boolean orbitaSol, boolean tieneSatelite) {
		super(nombre, masa1, masa2, diametro1, diametro2, periodoRotacion, periodoTraslacion, distancia1, distancia2,
				gravedad);
		this.distanciaSol1 = distanciaSol1;
		this.distanciaSol2 = distanciaSol2;
		this.orbitaSol = orbitaSol;
		this.tieneSatelite = tieneSatelite;

		Planetas.add(this);
		Astros.add(this);
	}

	public boolean isTieneSatelite() {
		return this.tieneSatelite;
	}

	public String getNombre() {
		return this.nombre;
	}

	public static String getAllPlanetas() {
		String cadena = "";
		for (Planeta nombre : Planetas) {
			cadena = cadena + String.format(" " + nombre.getNombre());
		}
		cadena += "\n";
		return cadena;
	}

	private String calcularDistanciaSol() {
		if (this.distanciaSol2 == 0) {
			return String.format("%.2f", this.distanciaSol1);
		} else {
			return String.format("%.2f x 10^%d", this.distanciaSol1, this.distanciaSol2);
		}
	}

	public String muestra() {
		if (this.orbitaSol == true) {
			return super.muestra() + ", orbitaSol= SI, distanciaSol= " + this.calcularDistanciaSol()
					+ " km, satelites: " + Satelite.getNombreSatelites();
		} else {
			return super.muestra() + ", orbitaSol=NO, satelites: " + Satelite.getNombreSatelites();
		}
	}
}
